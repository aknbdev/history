class Car {
    String name = "Mers";
    String model; // field

    // public String changeName(String name) { // method
    // this.name = name;
    // return name;
    // }

    // public void changeName(String name) {
    // this.name = name;
    // System.out.println(name);
    // }

    public Car(String Name) {
        // this.name = Name;
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Volvo"); // create object
        // c1.changeName("Volvo");
        System.out.println(c1.name);
    }
}

// String - "Salom" kabi matnni o'zida saqlaydi
// int - 123 kabi butun sonlarni o'zida saqlaydi
// float - 19.21 kabi o'nli kasrlarni o'zida saqlaydi
// char - 'a' Yoki '*' kabi belgilarni o'zida saqlaydi
// boolean - True Yoki False qiymatlarini o'zida saqlaydi

// O'zgaruvchi e'lon qilish : type variable = value;
