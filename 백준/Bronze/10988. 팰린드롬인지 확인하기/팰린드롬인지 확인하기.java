import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/10988 : 팰리드롬
        Scanner sc = new Scanner(System.in);

        String[] strList = sc.nextLine().split(""); // 단어 한개씩 쪼개서 배열에 넣기

        int i;
        for (i = 0; i < strList.length/2; i++) {
            int y = strList.length - (i + 1);
            if (!strList[i].equals(strList[y])){
                System.out.println("0");
                break;
            }
        }
        if (i >= strList.length/2){
            System.out.println("1");
        }
        sc.close();
    }
}