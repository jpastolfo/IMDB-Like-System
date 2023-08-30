import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        IMDB system = new IMDB();

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            printMenu();
            String command = scanner.nextLine();
            switch (command) {
                case "1" -> registerActor(system,"");
                case "2" -> registerDirector(system,"");
                case "3" -> registerMovie(system);
                case "4" -> searchMovie(system);
                case "0" -> isRunning = false;
                default -> System.out.println("There's no command such as " +
                        command + ". Try again.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("--- IMDB-Like System Menu ---");
        System.out.println("1. Register an Actor.");
        System.out.println("2. Register a Director.");
        System.out.println("3. Register a Movie.");
        System.out.println("4. Search a Movie.");
        System.out.println("0. Exit.");
        System.out.println("Command number: ");
    }

    public static Actor registerActor(IMDB system,String spacer) {
        String[] attributes = {"Name","Age","Nationality","Height","Gender"};
        String[] values = new String[attributes.length];

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"+spacer+"=== Actor Registration ===");

        for (int i = 0; i < attributes.length; i++) {
            System.out.print(spacer+attributes[i] + ": ");
            values[i] = scanner.nextLine();
            System.out.println(values[i]);
        }

        System.out.println(spacer+"==========================\n");

        String name = values[0];
        int age = Integer.parseInt(values[1]);
        String nationality = values[2];
        double height = Double.parseDouble(values[3]);
        String gender = values[4];

        Actor actor = new Actor(name,age,nationality,height,gender);
        system.registerActor(actor);
        return actor;
    }

    public static Director registerDirector(IMDB system,String spacer) {
        String[] attributes = {"Name","Age","Nationality","Height","Gender"};
        String[] values = new String[attributes.length];

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"+spacer+"=== Director Registration ===");

        for (int i = 0; i < attributes.length; i++) {
            System.out.print(spacer+attributes[i] + ": ");
            values[i] = scanner.nextLine();
        }
        System.out.println(spacer+"=============================\n");

        String name = values[0];
        int age = Integer.parseInt(values[1]);
        String nationality = values[2];
        double height = Double.parseDouble(values[3]);
        String gender = values[4];

        Director director = new Director(name,age,nationality,height,gender);
        system.registerDirector(director);
        return director;
    }

    public static void registerMovie(IMDB system) {
        String[] attributes = {"Title","Release Year","Director","Actors","Rating","Length","Genre"};
        String[] values = new String[attributes.length];

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Movie Registration ===");

        Director directorToAdd = null;
        ArrayList<Actor> actors = new ArrayList<>();

        for (int i = 0; i < attributes.length; i++) {
            if  (attributes[i].equals("Director")) {
                System.out.print("Director Name: ");
                String directorName = scanner.nextLine();

                if (!system.getDirectors().isEmpty()) {
                    directorToAdd = searchDirector(system,directorName);
                } else {
                    System.out.println("Director not found. Please register the Director!");
                    directorToAdd = registerDirector(system,"\t");
                }

            } else if (attributes[i].equals("Actors")) {
                System.out.print("How many Actors? ");
                int numActors = Integer.parseInt(scanner.nextLine());

                for (int j = 0; j < numActors; j++) {
                    System.out.print("Actor " + j + " name: ");
                    String actorName = scanner.nextLine();

                    if (!system.getActors().isEmpty()) {
                        Actor actorToAdd = searchActor(system,actorName);
                        actors.add(actorToAdd);
                    } else {
                        System.out.println("Actor not found. Please register the Actor!");
                        registerActor(system,"\t");
                    }
                }

            } else {
                System.out.print(attributes[i] + ": ");
                values[i] = scanner.nextLine();
            }
        }
        System.out.println("==========================");
        String title = values[0];
        int releaseYear = Integer.parseInt(values[1]);
        double rating = Double.parseDouble(values[4]);
        int length = Integer.parseInt(values[5]);
        String genre = values[6];

        Movie movie = new Movie(title,releaseYear,directorToAdd,actors,rating,length,genre);
        system.registerMovie(movie);
    }

    public static Director searchDirector(IMDB system,String directorName) {
        for (Director director: system.getDirectors()) {
            if (director.getName().equals(directorName)) return director;
        } return registerDirector(system,"\t");
    }

    public static Actor searchActor(IMDB system,String actorName) {
        for (Actor actor: system.getActors()) {
            if (actor.getName().equals(actorName)) return actor;
        }
        System.out.println("Actor not found. Please register the Actor!");
        return registerActor(system,"\t");
    }

    public static void searchMovie(IMDB system) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert movie title to search: ");
        String movieTitle = scanner.nextLine().toLowerCase();

        boolean movieFound = false;
        for (Movie movie: system.getMovies()) {
            if (movie.getTitle().toLowerCase().equals(movieTitle)) {
                System.out.println(movie);
                movieFound = true;
            }
        }
        if (!movieFound) {
            System.out.print("Movie not found.\nDo you want to register it? (y/n)");
            String choice = scanner.nextLine();
            if (choice.equals("y")) registerMovie(system);
        }
    }
}