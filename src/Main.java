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
            System.out.println(system.getActors());
            System.out.println(system.getDirectors());
            System.out.println(system.getMovies());
            String command = scanner.nextLine();
            switch (command) {
                case "1" : {
                    registerActor(system);
                } break;
                case "2" : {
                    registerDirector(system);
                } break;
                case "3" : registerMovie(system); break;
                case "4" : isRunning = false; break;
                default :
                    System.out.println("There's no command such as " +
                            command + ". Try again.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Choose your action: ");
        System.out.println("1. Register an Actor.");
        System.out.println("2. Register a Director.");
        System.out.println("3. Register a Movie.");
        System.out.println("4. Exit.");
    }

    public static Actor registerActor(IMDB system) {
        String[] attributes = {"Name","Age","Nationality","Height","Gender"};
        String[] values = new String[attributes.length];

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Actor Registration ===");

        for (int i = 0; i < attributes.length; i++) {
            System.out.print(attributes[i] + ": ");
            values[i] = scanner.nextLine();
        }

        String name = values[0];
        int age = Integer.parseInt(values[1]);
        String nationality = values[2];
        double height = Double.parseDouble(values[3]);
        String gender = values[4];

        Actor actor = new Actor(name,age,nationality,height,gender);
        system.registerActor(actor);
        return actor;
    }

    public static Director registerDirector(IMDB system) {
        String[] attributes = {"Name","Age","Nationality","Height","Gender"};
        String[] values = new String[attributes.length];

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Director Registration ===");

        for (int i = 0; i < attributes.length; i++) {
            System.out.print(attributes[i] + ": ");
            values[i] = scanner.nextLine();
        }

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

        System.out.println("=== Movie Registration ===");

        Director directorToAdd = null;
        ArrayList<Actor> actors = new ArrayList<>();

        for (int i = 0; i < attributes.length; i++) {
            if  (attributes[i].equals("Director")) {
                System.out.print("Director Name: ");
                String directorName = scanner.nextLine();

                if (!system.getDirectors().isEmpty()) {
                    directorToAdd = searchDirector(system,directorName);
                } else registerDirector(system);

            } else if (attributes[i].equals("Actors")) {
                System.out.print("How many Actors? ");
                int numActors = scanner.nextInt();

                for (int j = 0; j < numActors; j++) {
                    System.out.println("Actor " + j + " name: ");
                    String actorName = scanner.nextLine();

                    if (!system.getActors().isEmpty()) {
                        actors.add(searchActor(system,actorName));
                        System.out.println(actors);
                    } else {
                        System.out.println("Actor not found.");
                        registerActor(system);
                    }
                }

            } else {
                System.out.print(attributes[i] + ": ");
                values[i] = scanner.nextLine();
            }
        }

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
        } return registerDirector(system);
    }

    public static Actor searchActor(IMDB system,String actorName) {
        for (Actor actor: system.getActors()) {
            if (actor.getName().equals(actorName)) return actor;
        } return registerActor(system);
    }
}