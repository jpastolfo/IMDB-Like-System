package entities;

public class Actor extends Person {
    private String[] famousRoles;

    public Actor(String name, int age, String nationality, double height, String gender) {
        super(name, age, nationality, height, gender);
    }

    @Override
    public String toString() {
        return getName();
    }
}
