import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) { // 정수의 갯수 = n
        ArrayList<Integer>  answer = new ArrayList<Integer>(); // answer는 홀수를 담을 list
       
        for(int i = 1; i <= n; i++){ // i는 1부터 담기며, n의 갯수만큼 실행
            if(i % 2 != 0) // 매개변수(n)까지 i 계산 -> 2로 나누어 떨어지지안을경우 
                answer.add(i); // array.list에 add
        }
        return answer;
    }
}