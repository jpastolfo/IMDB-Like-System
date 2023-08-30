package genres;

public interface Drama {
    default void showGenre() {
        System.out.println("Drama!");
    }
}
