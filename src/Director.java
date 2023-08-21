public class Director extends Person {
    private String[] directedMovies;

    public Director(String name, int age, String nationality, double height, String gender, String[] directedMovies) {
        super(name, age, nationality, height, gender);
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