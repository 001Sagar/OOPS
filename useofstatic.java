class Credentail {
    String name;
    static String password;

    public static void changePassowrd() {
        password = "ABC";
    }
}

public class useofstatic {
    public static void main(String[] args) {
        // Credentail.password = "ABC";
        Credentail.changePassowrd();
        Credentail c1 = new Credentail();
        c1.name = "Tony";

        System.out.println("Student name " + c1.name + " Student Password " + c1.password);
    }
}
