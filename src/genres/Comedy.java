package genres;

public interface Comedy {
    default void showGenre() {
        System.out.println("Comedy!");
    }
}
