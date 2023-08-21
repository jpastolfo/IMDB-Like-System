import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        IMDB system = new IMDB();

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            printMenu();
            String command = scanner.nextLine();
            switch (command) {
                case "1" : registerActor(system); break;
                case "2" : registerDirector(system); break;
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

    public static void registerActor(IMDB system) {
        String[] attributes = {"Name","Age","Nationality","Height","Gender"};
        String[] attributesValues = new String[attributes.length];

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Actor Registration ===");

        for (int i = 0; i < attributes.length; i++) {
            System.out.print(attributes[i] + ": ");
            attributesValues[i] = scanner.nextLine();
        }
        // Call registerActor from IMBD system (after its implemented)
        // system.registerActor();
    }

    public static void registerDirector(IMDB system) {
        String[] attributes = {"Name","Age","Nationality","Height","Gender"};
        String[] attributesValues = new String[attributes.length];

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Director Registration ===");

        for (int i = 0; i < attributes.length; i++) {
            System.out.print(attributes[i] + ": ");
            attributesValues[i] = scanner.nextLine();
        }
        // Call registerActor from IMBD system (after its implemented)
        // system.registerDirector();
    }

    public static void registerMovie(IMDB system) {
        String[] attributes = {"Title","Release Year","Director","Actors","Rating","Length","Genre"};
        String[] attributesValues = new String[attributes.length];

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Movie Registration ===");

        for (int i = 0; i < attributes.length; i++) {
            if (attributes[i].equals("Actors")) {
                System.out.println("How many Actors?");
                System.out.println("Bla bla IMPLEMENT HERE");
            } else {
                System.out.print(attributes[i] + ": ");
                attributesValues[i] = scanner.nextLine();
            }
        }
        // Call registerActor from IMBD system (after its implemented)
        // system.registerMovie();
    }
}