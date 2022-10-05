// |- Aggregation -|
// class Operation {
//     int square(int n) {
//         return n * n;
//     }
// }

// class Circle {
//     Operation op;
//     double pi = 3.14;

//     double area(int r) {
//         op = new Operation();
//         int rsquare = op.square(r);
//         return pi * rsquare;
//     }
// }

// public class App {
//     public static void main(String[] args) throws Exception {
//         Circle c = new Circle();
//         double result = c.area(5);
//         System.out.println("Result = " + result);
//     }
// }

// |- Adress -|
class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Emp {
    int id;
    String name;
    Address ad;

    Emp(int id, String name, Address ad) {
        this.id = id;
        this.name = name;
        this.ad = ad;
    }

    void display() {
        System.out.println("Id:" + id + "\nName:" + name);
        System.out.println("City:" + ad.city + "\nState:" + ad.state + "\nCountry:" + ad.country + "\n\n");
    }
}

public class App {
    public static void main(String[] args) {
        Address A1 = new Address("Pop", "Namangan", "Uzbekistan");
        Address A2 = new Address("Chust", "Namangan", "Uzbekistan");

        Emp E1 = new Emp(25, "Jasur", A1);
        Emp E2 = new Emp(21, "Tohir", A2);

        E1.display();
        E2.display();
    }
}
