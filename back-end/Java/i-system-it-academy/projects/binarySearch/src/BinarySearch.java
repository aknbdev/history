import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] arr = { 1, 7, 6, 12, 5, 4, 3, 9 };
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.print("Min to Max: ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}