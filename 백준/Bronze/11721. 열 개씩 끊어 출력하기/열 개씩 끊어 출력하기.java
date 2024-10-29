import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(""); // 단어 한개씩 배열에 담기

        for (int i = 0; i < words.length; i++) { // 배열의 길이만큼 for문 실행
            System.out.print(words[i]); // for문이 실행될 때 마다 줄간격없이 문자 프린트

            if (i % 10 == 9){ // 10개씩 단어 간격 띄위기
                System.out.println(); // 간격
            }
        }

        sc.close();
    }
}