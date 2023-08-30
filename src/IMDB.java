import java.util.ArrayList;
import java.util.Scanner;

public class IMDB {

    private ArrayList<Movie> movies = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<>();
    private ArrayList<Director> directors = new ArrayList<>();

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public ArrayList<Director> getDirectors() {
        return directors;
    }


    public void searchMovie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert movie title to search: ");
        String movieTitle = scanner.nextLine().toLowerCase();

        boolean movieFound = false;
        for (Movie movie: getMovies()) {
            if (movie.getTitle().toLowerCase().equals(movieTitle)) {
                System.out.println(movie);
                movieFound = true;
            }
        }
        if (!movieFound) {
            System.out.print("Movie not found.\nDo you want to register it? (y/n) ");
            String choice = scanner.nextLine();
            if (choice.equals("y")) registerMovie();
        }
    }

    public Director searchDirector() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Director Name: ");
        String directorName = scanner.nextLine();
        if (!getDirectors().isEmpty()) {
            for (Director director : getDirectors()) {
                if (director.getName().equals(directorName)) return director;
            }
        }
        System.out.print("Director not found. \nDo you want to register a new Director? (y/n) ");
        return (scanner.nextLine().equals("y")) ? registerDirector("\t") : null;
    }

    public Actor searchActor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Actor name: ");
        String actorName = scanner.nextLine();
        if (!getActors().isEmpty()) {
            for (Actor actor : getActors()) {
                if (actor.getName().equals(actorName)) return actor;
            }
        }
        System.out.print("Actor not found. \nDo you want to register a new Actor? (y/n) ");
        return (scanner.nextLine().equals("y")) ? registerActor("\t") : null;
    }

    public Actor registerActor(String spacer) {
        String[] attributes = {"Name","Age","Nationality","Height","Gender"};
        String[] values = new String[attributes.length];

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"+spacer+"=== Actor Registration ===");

        for (int i = 0; i < attributes.length; i++) {
            System.out.print(spacer+attributes[i] + ": ");
            values[i] = scanner.nextLine();
        }
        System.out.println(spacer+"==========================\n");

        String name = values[0];
        int age = Integer.parseInt(values[1]);
        String nationality = values[2];
        double height = Double.parseDouble(values[3]);
        String gender = values[4];

        Actor actor = new Actor(name,age,nationality,height,gender);
        actors.add(actor);
        return actor;
    }

    public Director registerDirector(String spacer) {
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
        directors.add(director);
        return director;
    }

    public void registerMovie() {
        String[] attributes = {"Title","Release Year","Director","Actors","Rating","Length","Genre"};
        String[] values = new String[attributes.length];

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Movie Registration ===");

        Director directorToAdd = null;
        ArrayList<Actor> actors = new ArrayList<>();

        for (int i = 0; i < attributes.length; i++) {
            if  (attributes[i].equals("Director")) {
                directorToAdd = searchDirector();

            } else if (attributes[i].equals("Actors")) {
                do {
                    Actor actorToAdd = searchActor();
                    actors.add(actorToAdd);
                    System.out.print("Do you want to add another Actor? (y/n) ");
                } while (scanner.nextLine().equals("y"));
            } else {
                System.out.print(attributes[i]+": ");
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
        movies.add(movie);
    }

    public void registerActor() {
        registerActor("");
    }

    public void registerDirector() {
        registerDirector("");
    }
}
