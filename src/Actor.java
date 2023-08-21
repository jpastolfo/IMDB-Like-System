public class Actor extends Person {
    private String[] famousRoles;

    public Actor(String name, int age, String nationality, String officialSite, double height, String movies, String[] famousRoles) {
        super(name, age, nationality, officialSite, height, movies);
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
