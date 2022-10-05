// |- Abstract class -|
// abstract class Bike {
// Bike() {
// System.out.println("Bike Made!");
// }

// abstract void run();

// void color() {
// System.out.println("This is blue");
// }
// }

// class Honda extends Bike {
// void run() {
// System.out.println("This is Honda!");
// }
// }

// public class App {
// public static void main(String[] args) throws Exception {
// Bike B = new Honda();
// B.run();
// B.color();
// }
// }

// |- Interface  -|

// interface printable {
//     void print();
// }

// class A4 implements printable {
//     public void print() {
//         System.out.println("Bu A4 qogoz formati.");
//     }
// }

// public class App {
//     public static void main(String[] args) {
//         A4 A = new A4();
//         A.print();
//     }
// }

interface printable {
    void print();
}

interface showable {
    void show();
}

class A4 implements printable, showable {
    public void print() {
        System.out.println("This is print method");
    }

    public void show() {
        System.out.println("This is Show method");
    }
}

public class App {
    public static void main(String[] args) {
        A4 A1 = new A4();
        A1.print();
        A1.show();
    }
}