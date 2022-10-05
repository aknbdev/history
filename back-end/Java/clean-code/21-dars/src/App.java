// |- Polimorphism -|
class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Adder A1 = new Adder();
        System.out.println("Result:" + A1.add(5, 4));
        System.out.println("Result:" + A1.add(5, 4, 9));
        System.out.println("Result:" + A1.add(5.2, 4.7));
    }
}
