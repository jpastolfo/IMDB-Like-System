import java.lang.String;
public class Person {
    private String name;
    private int age;
    private String nationality;
    private String officialSite;
    private double height;
    private String movies;

    public Person(String name, int age, String nationality, String officialSite, double height, String movies) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.officialSite = officialSite;
        this.height = height;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }
}


