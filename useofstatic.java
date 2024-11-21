class Credentail {
    String name;
    public static String password;

    public static void changePassowrd() {
        password = "ABC";
    }

    public static void printcredentails(String name , String password){
        System.out.println("Student name " + name + " , Student Password " + password);
    }

    static {
        password = "xyz";
    }
}

public class useofstatic {
    public static void main(String[] args) {
        // Credentail.password = "ABC";
        Credentail.changePassowrd();
        Credentail c1 = new Credentail();
        c1.name = "Tony";

        System.out.println("Student name " + c1.name + " Student Password " + c1.password);

        // Optionally, demonstrate the static method to print credentials
        Credentail.printcredentails(c1.name, Credentail.password);
    }
}
