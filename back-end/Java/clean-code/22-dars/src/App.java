// |-  -|

// class Overriding {
//     void show() {
//         System.out.println("Overridin is starting...");
//     }
// }

// class Over extends Overriding {
//     void show() {
//         System.out.println("This is function...");
//     }
// }

// public class App {
//     public static void main(String[] args) throws Exception {
//         Over O1 = new Over();
//         O1.show();
//     }
// }

class Bank {
    int getRate() {
        return 0;
    }
}

class Humo {
    int getRate() {
        return 9500;
    }
}

class Halq {
    int getRate() {
        return 9800;
    }
}

public class App {
    public static void main(String[] args) {
        Humo H1 = new Humo();
        Halq H2 = new Halq();
        System.out.println(H1.getRate());
        System.out.println(H2.getRate());
    }
}