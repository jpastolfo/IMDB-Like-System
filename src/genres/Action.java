package genres;

public interface Action {
    default void showGenre() {
        System.out.println("Action!");
    }
}
