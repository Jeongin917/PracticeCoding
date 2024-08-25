import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] checkList = new int[30];
        for (int i = 0; i < checkList.length; i++) {
            checkList[i] = i+1;
        }

        for(int i = 0; i < checkList.length-2; i++) {
            int cur = sc.nextInt();
            checkList[cur-1] = 0;
        }

        for (int num : checkList) {
            if(num != 0) {
                System.out.println(num);
            }
        }

        sc.close();

    }
}
