class Credential {
    private String password;

    public String getter() {
        return this.password;
    }

    public void setter(String password) {
        this.password = password;
    }

}

public class getterandsetter {
    public static void main(String[] args) {
        Credential cd1 = new Credential();
        cd1.setter("ABC");
        String cd1Passwors = cd1.getter();
        System.out.println(cd1Passwors);
    }
}
