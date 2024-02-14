class Solution {
    public String solution(int age) {
        String answer = "";
        String[] result = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        while(age > 0){ // age가 0 이상일 경우
            answer = result[age % 10] + answer; 
            age /= 10;
             // result[나머지] = answer에 담기 -> age / 10 값이 0 이상일 경우 answer 재실행
        }
        return answer;
    }
}