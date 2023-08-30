package movies;

import entities.Actor;
import entities.Director;
import entities.Movie;
import genres.Action;

import java.util.ArrayList;

public class Adventure extends Movie implements Action {


    public Adventure(String title, int releaseYear, Director director, ArrayList<Actor> actor, double rating, int length, String genre) {
        super(title, releaseYear, director, actor, rating, length, genre);
    }
}
