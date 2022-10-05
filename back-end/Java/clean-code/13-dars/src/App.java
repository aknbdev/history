class Student { // Student bu klas
    int id; // Fields
    String name; // Fields

    void getInfo(int i, String n) { // Method
        this.id = i;
        this.name = n;
    }

    void displayInfo() { // Method
        System.out.println(id + " " + name);
    }
}

class Rectangle { // Class
    int length, width; // Fields

    void insert(int l, int w) { // Method
        this.length = l;
        this.width = w;
    }

    void show() { // Method
        System.out.println(length * width);
    }

    void yashirin(int l, int w) {
        this.length = l;
        this.width = w;
        System.out.println("Yuzasi: " + (length * width));
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Student S1 = new Student();
        // Student S2 = new Student();
        /**
         * Fields - qiymat berish___S1.id = 37; S1.name = "Javokhir"; S2.id = 18;
         * S2.name = "John"; System.out.println(S1.id + " " + S1.name);
         * System.out.println(S2.id + " " + S2.name);
         */

        /**
         * Method - Qiymat berish___ S1.getInfo(18, "John"); S1.displayInfo();
         * S2.getInfo(25, "Javokh"); S2.displayInfo();
         */

        // Method - Qiymat berish___
        Rectangle R1 = new Rectangle(), R2 = new Rectangle();
        R1.insert(4, 5);
        R1.show();
        new Rectangle().yashirin(5, 6);

    }
}
