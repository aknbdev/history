// class Bike {
// // Javada abstraction va abstract classlar
// // 1. Abstract class
// // 2. Interface
// }

// abstract class Moto {
// abstract void run();
// }

// class Honda extends Moto {
// void run() {
// System.out.println("Bu honda edi");
// }
// }

// public class App {
// public static void main(String[] args) throws Exception {
// Moto M = new Honda();
// M.run();
// }
// }

abstract class Shape {
    abstract void drow();
}

class Rectangle extends Shape {
    void drow() {
        System.out.println("Bu tortburchak");
    }
}

class Circle extends Shape {
    void drow() {
        System.out.println("Bu aylana");
    }
}

public class App {
    public static void main(String[] args) {
        Shape S1 = new Circle();
        Shape S2 = new Rectangle();
        S1.drow();
        S2.drow();
    }
}