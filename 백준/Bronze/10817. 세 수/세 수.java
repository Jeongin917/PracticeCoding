import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/10817 : 세수
        Scanner sc = new Scanner(System.in);

        int[] numlist = new int[3];
        for (int i = 0; i < numlist.length; i++) {
            numlist[i] = sc.nextInt();
        }
        Arrays.sort(numlist);
        System.out.println(numlist[1]);

        sc.close();
    } // end of main
} // end of class