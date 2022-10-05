class Account {
    int acc_no;
    String name;
    float balance;

    void insert(int a, String n, float b) {
        this.acc_no = a;
        this.name = n;
        this.balance = b;
    }

    void depozit(float b) {
        this.balance += b;
        System.out.println("Hisobingiz " + b + "ga toldirildi");
    }

    void widthdrow(float b) {
        if (balance < b) {
            System.out.println("Balansda yetarli mablag yoq!");
        } else {
            this.balance -= b;
            System.out.println("Sizning hisobingizdan " + b + " miqdorda pul yechib olindi!");
        }
    }

    void chechBalance() {
        System.out.println("Sizning hisobingizdagi summa: " + balance);
    }

    void display() {
        System.out.println("Account number: " + acc_no + "\nName: " + name + "\nBalance: " + balance);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Account A1 = new Account();
        A1.insert(263, "John", 2500);
        A1.display();
    }
}
