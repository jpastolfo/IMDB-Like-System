import java.lang.String;
public class Person {
    private String name;
    private int age;
    private String nationality;
    private double height;
    private String gender;

    public Person(String name, int age, String nationality, double height, String gender) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.height = height;
        this.gender = gender;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public static void showMovies(String[] args) {
        System.out.println("listaFilmes");
    }
}
