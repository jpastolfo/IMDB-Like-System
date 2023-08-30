import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        IMDB imdb = new IMDB();

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            printMenu();
            String command = scanner.nextLine();
            switch (command) {
                case "1" -> imdb.searchMovie();
                case "2" -> imdb.searchDirector();
                case "3" -> imdb.searchActor();
                case "4" -> imdb.registerMovie();
                case "5" -> imdb.registerDirector();
                case "6" -> imdb.registerActor();
                case "0" -> isRunning = false;
                default -> System.out.println("There's no command such as " +
                        command + ". Try again.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("--- IMDB-Like System Menu ---");
        System.out.println("1. Search a Movie.");
        System.out.println("2. Search a Director");
        System.out.println("3. Search an Actor.");
        System.out.println("4. Register a Movie.");
        System.out.println("5. Register a Director.");
        System.out.println("6. Register an Actor.");
        System.out.println("0. Exit.");
        System.out.println("Command number: ");
    }
}