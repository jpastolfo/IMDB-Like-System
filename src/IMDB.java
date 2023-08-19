import java.util.ArrayList;

public class IMDB {

    private ArrayList<Movie> movies = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<>();
    private ArrayList<Director> directors = new ArrayList<>();

    public void registerMovie() {
        Movie movie = new Movie();
        movies.add(movie);
    }

    public void registerActor() {
        Actor actor = new Actor();
        actors.add(actor);
    }

    public void registerDirector() {
        Director director = new Director();
        directors.add(director);
    }

    public void searchMovie(String name) {
        for (Movie movie : movies) {
            //if (movie.getName() == name) {
            //    return movie;
            // }
        }
    }
}
