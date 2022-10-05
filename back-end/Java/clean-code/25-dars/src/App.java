// |- Run time Polimorphizm -|
class Vehicle {
    // Upcasting
    int speed = 60;

    void run() {
        System.out.println("Bu mashina 60 km/s bilan yuradi");
    }
}

class Car extends Vehicle {
    int speed = 120;

    void run() {
        System.out.println("Bu mashina 120 km/s bilan yuradi");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle V = new Car(); // upcasting
        V.run();
    }
}
