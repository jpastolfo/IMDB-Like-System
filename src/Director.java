public class Director extends Person {
    private String[] directedMovies;

    public Director(String name, int age, String nationality, double height, String gender) {
        super(name, age, nationality, height, gender);
    }

    @Override
    public String toString() {
        return "Director: " + getName();
    }
}