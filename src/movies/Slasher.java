package movies;
import entities.Actor;
import entities.Director;
import entities.Movie;
import genres.Horror;

import java.util.ArrayList;

public class Slasher extends Movie implements Horror {

    public Slasher(String title, int releaseYear, Director director, ArrayList<Actor> actor, double rating, int length, String genre) {
        super(title, releaseYear, director, actor, rating, length, genre);
    }
}
