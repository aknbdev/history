import java.security.PublicKey;

// |- Constructors -|
// class Constructor {
// int id;
// String name;

// Constructor(int i, String n) {
// this.id = i;
// this.name = n;
// }

// void display() {
// System.out.println("Id: " + id + " Name: " + name);
// }
// }
// public class App {
// public static void main(String[] args) throws Exception {
// Constructor C1 = new Constructor(25, "Begin");
// Constructor C2 = new Constructor(52, "End");
// C1.display();
// C2.display();
// }
// }
class Student {
    int id;
    String name;
    int age;

    Student(int i, String n) {
        this.id = i;
        this.name = n;
    }

    Student(int i, String n, int a) {
        this.id = i;
        this.name = n;
        this.age = a;
    }

    void display() {
        System.out.println("Id: " + id + "   Name: " + name + "   Age: " + age);
    }
}

public class App {
    public static void main(String[] args) {
        Student S1 = new Student(18, "Jamshid");
        Student S2 = new Student(17, "John", 21);
        S1.display();
        S2.display();
    }
}