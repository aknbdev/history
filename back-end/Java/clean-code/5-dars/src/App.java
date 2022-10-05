public class App {
    public static void main(String[] args) throws Exception {
        int day = 7;
        switch (day) {
        case 1: {
            System.out.println("Bir");
            break;
        }
        case 2: {
            System.out.println("Ikki");
            break;
        }
        case 3: {
            System.out.println("Uch");
            break;
        }
        case 4: {
            System.out.println("To'rt");
            break;
        }
        case 5: {
            System.out.println("Besh");
            break;
        }
        case 6: {
            System.out.println("Olti");
            break;
        }
        case 7: {
            System.out.println("Yetti");
            break;
        }

        default:
            System.out.println("Siz kiritgan son bu yerda yo'q!");
            break;
        }
    }
}
