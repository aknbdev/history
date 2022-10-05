public class App {
    public static void main(String[] args) throws Exception {
        int kop = 1;
        do {
            int kar = 1;
            do {
                System.out.println(kop + "*" + kar + "=" + kop * kar);
                kar++;
            } while (kar <= 10);
            System.out.println();
            kop++;
        } while (kop <= 10);
    }
}
