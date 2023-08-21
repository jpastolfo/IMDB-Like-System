public class Actor extends Person {
    private String[] famousRoles;

    public Actor(String name, int age, String nationality, double height, String gender, String[] famousRoles) {
        super(name, age, nationality, height, gender);
        this.famousRoles = famousRoles;
    }

    public String[] getFamousRoles() {
        return famousRoles;
    }

    public void setFamousRoles(String[] famousRoles) {
        this.famousRoles = famousRoles;
    }

    @Override
    public String toString() {
        return "Actor: " + getName();
    }
}
