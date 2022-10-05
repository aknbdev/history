// |- Final kalit sozi -|
// final kalit sozi orqali:
// variableni qiymatini ozgartirishni cheklaymiz -> final int a = 15;
// methodda polimorphizmni cheklaymiz -> final void speed(){}
// classda inheritanceni cheklaymiz -> final class Car{}

class Vehicle {
    final int speed = 70;

    final void speed() {
        System.out.println("Tezlikni ruxsat etilgan chegarsi 70.");
    }
}
// class Car extends Vehicle{
// void speed(){
// System.out.println("Speed limit 120km/s");
// }
// }

final class Car {
    int speed = 120;
}

class Toyota extends Car {

}

public class App {
    public static void main(String[] args) throws Exception {
        // Car C = new Car;
    }
}
