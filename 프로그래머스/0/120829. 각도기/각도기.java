class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if(angle < 90){
            return 1;
        } else if(angle == 90){
            return 2;
        }else if(angle < 180){
            return 3;
        }else if(angle == 180){
            return 4;
        } else{
            return 0; // 제한사항에 포함되지 않는 숫자를 입력할 경우 0으로 리턴할 수 있게 넣어주기
        }
        
        
        // return answer;
    }
}