import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // |- Problem1 -|

        // Method-1
        // int user = scan.nextInt();
        // for (int i = 1; i <= user; i++) {
        // if (user % i == 0 && i % 1 == 0) {
        // System.out.println(i);
        // }
        // }
        // Method-2
        // int i = 1, user = scan.nextInt();
        // while (i <= user) {
        // if (user % i == 0) {
        // System.out.println(i);
        // }
        // i++;
        // }

        // |- Problem2 -|

        // int k = 7, N = scan.nextInt();
        // while (true) {
        // if (k == N) {
        // System.out.println("Number of trial!");
        // break;
        // } else if (k > N) {
        // System.out.println("K > " + N);
        // } else if (k < N) {
        // System.out.println("K < " + N);
        // } else {
        // System.out.println("Please. Enter the an Integer!");
        // }
        // N = scan.nextInt();
        // }

        // |- Problem3 -|

        // int sum = 0, user = scan.nextInt();
        // while (true) {
        // if (user == 0) {
        // break;
        // } else {
        // sum += user;
        // }
        // user = scan.nextInt();
        // }
        // System.out.println("The sum of Numbers is : " + sum);

        // |- Problem4 -|
        // int fac = 1;
        // for (int i = 2; i <= 10; i++) {
        // System.out.print(i + "!=");
        // for (int k = 1; k <= i; k++) {
        // fac = fac * k;
        // if (k == i) {
        // break;
        // }
        // System.out.print(k + "*");
        // }
        // System.out.print(i + "=" + fac + "\n");
        // fac = 1;
        // }

        // |- Problem5 -|
        // int N, M, min, EKUB = 1, U1 = 1;
        // System.out.println("Enter The N and M Numbers: ");
        // N = scan.nextInt();
        // M = scan.nextInt();
        // min = Math.min(N, M);
        // |- Method1 -|
        // for (int i = 1; i <= min; i++) {
        // if (N % i == 0 && M % i == 0) {
        // EKUB = i;
        // }
        // }
        // |- Method2 -|
        // while (U1 <= min) {
        // if (N % U1 == 0 && M % U1 == 0) {
        // EKUB = U1;
        // }
        // U1++;
        // }
        // System.out.println("EKUB: " + EKUB);

        // |- Problem6 -|
        // for (int i = 1; i <= 5; i++) {
        // for (int k = 4; k >= i; k--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int l = 1; l <= 5; l++) {
        // for (int m = 1; m <= l; m++) {
        // System.out.print(" ");
        // }
        // for (int n = 5; n >= l + 1; n--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // |- Problem7 -|
        // for (int i = 1; i <= 10; i++) {
        // for (int k = i; k <= 10; k++) {
        // if (k == 10) {
        // System.out.print(0 + " ");
        // } else {
        // System.out.print(k + " ");
        // }
        // }
        // for (int y = 1; y < i; y++) {
        // System.out.print(y + " ");
        // }
        // System.out.println();
        // }

        // |- Problem8 -|
        // System.out.print("Enter the N: ");
        // int U = 0, N = scan.nextInt();
        // for (int i = 1; i <= N; i++) {
        // int K = i;
        // while (true) {
        // if (K == 0) {
        // break;
        // }
        // if (K % 10 == 3) {
        // U++;
        // }
        // K /= 10;
        // }
        // }
        // System.out.println("U: " + U);

        // |- Problem9 -|
        // int U = 0, user = scan.nextInt();
        // for (int i = 1; i <= user; i++) {
        // for (int s = user; s >= i; s--) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // U++;
        // if (U == 10) {
        // System.out.print(0 + " ");
        // U = 0;
        // } else {
        // System.out.print(U + " ");
        // }
        // }
        // System.out.println();
        // }

        // |- Problem10 -|
        // int sum = 0, user = scan.nextInt();
        // int k = user;
        // while (true) {
        // if (k >= 1) {
        // sum += k % 10;
        // k /= 10;
        // } else if (k == 0) {
        // break;
        // }
        // if (sum >= 10 && k < 1) {
        // k = sum;
        // sum = 0;
        // }
        // }
        // System.out.println("Result: " + sum);

        // |- Problem11 -|
        // for (int i = 1; i < 7; i++) {
        // for (int j = 1; j < 7; j++) {
        // for (int j2 = 1; j2 < 7; j2++) {
        // if (i + j + j2 == 10) {
        // System.out.println(i + " " + j + " " + j2);
        // }
        // }
        // }
        // }

        // |- Problem12 -|
        // int sum = 0, user = scan.nextInt();
        // for (int i = 1; i <= user; i++) {
        // sum += i;
        // }
        // System.out.println("Result: " + sum);

    }
}
