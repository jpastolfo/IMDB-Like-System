import java.util.ArrayList;

public class Movie {
    private String title;
    private int releaseYear;
    private Director director;

    private ArrayList<Actor> actor;
    private double rating;
    private int length;
    private String genre;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getActor() {
        return actor;
    }

    public void setActor(ArrayList actor) {
        this.actor = actor;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void addActor(ArrayList actor) {
        this.actor = actor;
    }

    public void addDirector(Director director) {
        this.director = director;
    }

}

