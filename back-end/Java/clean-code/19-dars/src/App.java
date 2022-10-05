// |- Vorislik -|
// class Inheritence {
//     int age = 15;
//     String name = "Tohir";
// }

// public class App extends Inheritence {
//     public static void main(String[] args) {
//         Inheritence I1 = new Inheritence();
//         System.out.println("Age:" + I1.age + "Name:" + I1.name);
//     }
// }

// |- Turlari -|
// 1) yakka , Single
// 2) kop darajali

// |- Single inheritence -|
// class Animal {
//     void eat() {
//         System.out.println("Eating...");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Barking...");
//     }
// }

// public class App {
//     public static void main(String[] args) {
//         Dog D1 = new Dog();
//         D1.bark();
//         D1.eat();
//     }
// }

// |- Multilevel inheritence -|
// class Animal {
//     void eat() {
//         System.out.println("Eating...");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Barking...");
//     }
// }

// class babyDog extends Dog {
//     void weep() {
//         System.out.println("Weeping...");
//     }
// }

// public class App {
//     public static void main(String[] args) {
//         babyDog D1 = new babyDog();
//         D1.bark();
//         D1.eat();
//         D1.weep();
//     }
// }

// |- Iralhic inheritance -|
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

class babyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class App {
    public static void main(String[] args) {
        Cat D1 = new Cat();
        D1.meow();
        D1.eat();
    }
}