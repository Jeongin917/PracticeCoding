class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string.replace(letter, "");
        return answer;
        
        // replace을 사용하여 특정 문자열 삭제
        // replace("삭제하려고하는 문자 작성", "바꾸려고하는 문자 작성")
    }
}