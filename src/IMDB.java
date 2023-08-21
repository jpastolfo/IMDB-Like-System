import java.util.ArrayList;

public class IMDB {

    private ArrayList<Movie> movies = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<>();
    private ArrayList<Director> directors = new ArrayList<>();

    public void registerMovie(String title,long releaseYear,Director director,Actor actor,float rating,long length,String genre) {
        //new Movie(title,releaseYear,director,actor,rating,length,genre);
        // the above line is commented until the Movie class is fully implemented.
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
