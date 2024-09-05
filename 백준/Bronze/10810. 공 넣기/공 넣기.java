import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n];
        for (int i = 0; i < m; i++) {
            int startIndex = sc.nextInt();
            int endIndex = sc.nextInt();
            int ballNum = sc.nextInt();
            Arrays.fill(basket, startIndex-1, endIndex, ballNum);
        }

        for(int i = 0; i < basket.length; i++) {
            System.out.print(basket[i]);
            if(i != basket.length-1) System.out.print(" ");
        }

        sc.close();
    }
}