class Solution {
    public String solution(String my_string) {
        // StringBuffer answer = new StringBuffer(my_string);
        
        StringBuffer buf = new StringBuffer(my_string); // String 과 StringBuffer는 다를 객체
        String answer = buf.reverse().toString(); // reverse를 활용하여 toString값으로 변환

        return answer;
        
        // StringBuffer 클래스는 String을 다루는 클래스입니다.
        // 생성자의 파라미터로 문자열을 입력받을 수 있습니다.
    }
}