// |- Super Keyword -|
/**
 * Super kalit sozi orqali child klasdan parent classdagi field ga va method ga
 * va constructor ga dostup oladi
 */

class Animal {
    String color = "Black";

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    String color = "Grey";

    void show() {
        System.out.println(color);
        System.out.println(super.color);
    }

    void eat() {
        System.out.println("Eating bread...");
    }

    void display() {
        eat();
        super.eat();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Dog D1 = new Dog();
        D1.display();
    }
}
