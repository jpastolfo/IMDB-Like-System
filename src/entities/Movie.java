package entities;

import entities.Actor;

import java.util.ArrayList;

public class Movie {
    private final String title;
    private final int releaseYear;
    private final Director director;

    private final ArrayList<Actor> actor;
    private final double rating;
    private final int length;
    private final String genre;

    public Movie(String title, int releaseYear, Director director, ArrayList<Actor> actor, double rating, int length, String genre) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = director;
        this.actor = actor;
        this.rating = rating;
        this.length = length;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "\n" + title + " (" + releaseYear + "). " + "Directed by: " + director + "\n" +
                "Starring: " + actor + "\n" +
                "Rating: " + rating + "\n" +
                "Length: " + length + "min." + "\n" +
                "genres.Genre: " + genre + "\n";
    }
}

