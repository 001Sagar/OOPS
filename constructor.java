class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("The name of of student " + this.name);
        System.out.println("The age of the Student " + this.age);
    }

    // Non Parameterized constructor
    Student() {

    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sagar";
        s1.age = 23;

        s1.printInfo();

        Student s2 = new Student("Prince", 21);
        s2.printInfo();

        Student s3 = new Student(s1);
        s3.printInfo();
    }
}