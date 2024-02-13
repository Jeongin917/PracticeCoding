import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
         int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
        // Array(배열) 자르기
        // copyOfRange(배열변수명, 시작 index, 자르기 끝 index +1)
        return answer;
    }
}