import java.util.ArrayList;

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

    public void registerMovie(Movie movie) {
        movies.add(movie);
    }

    public void registerActor(Actor actor) {
        actors.add(actor);
    }

    public void registerDirector(Director director) {
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
