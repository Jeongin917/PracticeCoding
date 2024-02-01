class Solution {
    public String solution(String my_string, int n) {
        
        char[] stringArray = my_string.toCharArray();
        String answer = "";
        
        for(int i = 0; i < stringArray.length; i++){
            for(int j = 1; j <= n; j++){
                answer += stringArray[i]; // answer에 stringArray[i] 단어를 한개씩 입력
            }
        }
        return answer;
    }
}