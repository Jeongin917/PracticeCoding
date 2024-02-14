class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] strArr = rsp.split(""); // ""를 기준으로 rsp를 쪼갠값을 배열에 담기
        
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals("0")) {
                answer += "5"; // i번째 index값이 0이라면 answer에 String = 5넣기
            }else if(strArr[i].equals("5")){
                answer += "2";
            }else if(strArr[i].equals("2")){
                answer += 0;
            } 
            
        }
        return answer;
    }
}