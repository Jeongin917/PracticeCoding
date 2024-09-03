import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(" ".repeat(number - i));
            System.out.println("*".repeat(2 * i - 1));
        }

        for (int i = number-1; i >= 1; i--) {
            System.out.print(" ".repeat(number - i));
            System.out.println("*".repeat(2 * i - 1));
        }
         sc.close();
    }
}