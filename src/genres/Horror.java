package genres;

public interface Horror {

    default void showGenre() {
        System.out.println("Horror!");
    }

}
