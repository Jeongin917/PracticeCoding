import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] strList = sc.nextLine().split(" ");

        int[] nlist = new int[n];
        for (int i = 0; i < n; i++) {
            nlist[i] = Integer.parseInt(strList[i]);
        }

//        int max = IntStream.of(nlist).max().getAsInt();
//        int min = IntStream.of(nlist).min().getAsInt();

        int max = -1_000_000; // 1000000
        int min = 1_000_000;

        for (int num : nlist) {
            if(num > max) max = num;
            if(num < min) min = num;
        }

//        for (int i = 0; i < nlist.length; i++) {
//            if(nlist[i] > max) max = nlist[i];
//            if(nlist[i] < min) min = nlist[i];
//        }

        System.out.println(min + " " + max);

        sc.close();
    }
}

// 7 35