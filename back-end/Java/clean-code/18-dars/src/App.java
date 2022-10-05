// public class App {
//     static {
//         System.out.println("This is Static block");
//     }
//     public static void main(String[] args) throws Exception {
//         System.out.println("This is the main function");
//     }
// }

// |- This - kalit sozi -|
class Student {
    int id;
    String name;
    Float fee;

    Student(int id, String name, Float fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println("Id:" + id + " Name:" + name + " Fee:" + fee);
    }
}

public class App {
    public static void main(String[] args) {
        Student S1 = new Student(15, "Asadbek", 143f);
        Student S2 = new Student(32, "Jasur", 432f);
        S1.display();
        S2.display();
    }
}
