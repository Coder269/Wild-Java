import entity.Wilder;

public class Classroom {

    public static void main(String[] args) {

        Wilder wilder1 = new Wilder("Mouhammad", true);
        Wilder wilder2 = new Wilder("Majdi", true);
        Wilder wilder3 = new Wilder("Marco", false);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
    }
}


