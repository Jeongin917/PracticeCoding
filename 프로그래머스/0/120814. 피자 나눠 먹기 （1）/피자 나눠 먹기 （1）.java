class Solution {
    public int solution(int n) {
        int answer = n / 7;
        
        if(n % 7 != 0){ // 만약 피자 조각에 인원이 나눠떨어지지 않으면
            answer += 1; // 피자 판수에 +1
        } 
        
        return answer;
        //return (n % 7 == 0) ?  n/7 : (n/7)+1;
    }
}