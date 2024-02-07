class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++){ // array의 배열의 길이만큼 for문 실행
            if(array[i] > height){ // array[i]번째의 키가 height보다 클 경우
                answer++; // answer에 +1해주기
            }
        }
        
        return answer;
    }
}