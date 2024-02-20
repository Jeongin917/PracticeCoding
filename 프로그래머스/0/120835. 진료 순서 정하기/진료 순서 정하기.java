class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        // 배열값 비교. 자신보다 높은 숫자가 있으면 +1
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] < emergency[j])
                    answer[i]++;
            }
        // 순서 배열 index 전체에 +1 
        answer[i]++;
        }
        return answer;
    }
}