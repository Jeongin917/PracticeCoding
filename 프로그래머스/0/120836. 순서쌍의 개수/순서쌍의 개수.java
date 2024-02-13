import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0) // n % 1의 나머지가 0 일경우
                answer++; // answer + 1
        }
        
        return answer;
    }
}