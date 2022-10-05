// |- Constructor orqsali nusxalash -|
// class Student {
//     int id;
//     String name;

//     Student(int i, String n) {
//         this.id = i;
//         this.name = n;
//     }

//     Student(Student s) {
//         this.id = s.id;
//         this.name = s.name;
//     }

//     void display() {
//         System.out.println("Id: " + id + " Name: " + name);
//     }
// }

// public class App {
//     public static void main(String[] args) throws Exception {
//         Student S1 = new Student(25, "John");
//         Student S2 = new Student(S1);
//         S1.display();
//         S2.display();
//     }
// }

// |- Obyektlarning qiymatlarini o'zlashtirish orqali nusxalash -|
class Student {
    int id;
    String name;

    Student(int i, String n) {
        this.id = i;
        this.name = n;
    }

    Student() {

    }

    void display() {
        System.out.println("Id: " + id + " Name: " + name);
    }
}

public class App {
    public static void main(String[] args) {
        Student S1 = new Student(26, "John");
        Student S2 = new Student();
        S2.id = S1.id;
        S2.name = S1.name;
        S1.display();
        S2.display();
    }
}
