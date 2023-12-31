package entity;

public class Wilder {

    String firstname;
    boolean present;

    public Wilder(String firstname, boolean present) {
        this.firstname = firstname;
        this.present = present;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isPresent() {
        return this.present;
    }

    public String whoAmI() {
        if (this.present)
            return "My name is " + this.firstname + " and I am present";
        else return "My name is " + this.firstname + " and I am not present";
    }
}
