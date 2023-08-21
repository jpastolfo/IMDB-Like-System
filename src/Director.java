public class Director extends Person {
    private String[] directedMovies;

    public Director(String name, int age, String nationality, String officialSite, double height, String movies, String[] directedMovies) {
        super(name, age, nationality, officialSite, height, movies);
        this.directedMovies = directedMovies;
    }

    public String[] getDirectedMovies() {
        return directedMovies;
    }

    public void setDirectedMovies(String[] directedMovies) {
        this.directedMovies = directedMovies;
    }

    @Override
    public String toString() {
        return "Director: " + getName();
    }
}