// |- Static -|

// class Students {
//     int id;
//     String name;
//     static String college = "TATU";

//     Students(int i, String n) {
//         this.id = i;
//         this.name = n;
//     }

//     void display() {
//         System.out.println("Id:" + id + " Name:" + name + " College:" + college);
//     }
// }

// public class App {
//     public static void main(String[] args) throws Exception {
//         Students S1 = new Students(13, "Elbek");
//         Students S2 = new Students(17, "Tohir");
//         S1.display();
//         S2.display();

//     }
// }

// |- Counter -|
// class Counter {
//     static int counter = 0;

//     Counter() {
//         counter++;
//         System.out.println("Counter:" + counter);
//     }
// }
// public class App {
//     public static void main(String[] args) {
//         Counter C1 = new Counter();
//         Counter C2 = new Counter();
//         Counter C3 = new Counter();
//     }
// }

// |- Coder -|
class Coder {
    int age;
    String name;
    static String maktab = "TATU";

    static void change() {
        maktab = "TUIT";
    }

    Coder(int a, String n) {
        this.age = a;
        this.name = n;
    }

    void display() {
        System.out.println("Age:" + age + " Name:" + name + " Maktab:" + maktab);
    }
}

public class App {
    public static void main(String[] args) {
        Coder.change();
        Coder C1 = new Coder(18, "Elbek");
        Coder C2 = new Coder(23, "John");
        Coder C3 = new Coder(23, "Sardor");
        C1.display();
        C2.display();
        C3.display();
    }
}