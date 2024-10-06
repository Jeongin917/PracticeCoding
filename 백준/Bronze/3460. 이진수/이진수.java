import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            int curIdx = 0;
            while (num != 0) {
                if(num % 2 == 1) {
                    System.out.printf("%d ", curIdx);
                }
                num /= 2;
                curIdx++;
            }
            System.out.println();
        }

        sc.close();
    }
}
