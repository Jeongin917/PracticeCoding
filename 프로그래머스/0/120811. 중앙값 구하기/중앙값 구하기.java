import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        Arrays.sort(array); // 배열 오름차순으로 정렬
        
        int answer = array[array.length/2]; 
        // array의 길이를 2로 나누었을때, 그 몫이 배열의 가운데에 해당
        // ex) array.length 5 -> 5 / 2 = 2.5 -> int를 return하기 때문에 "2"라는 숫자만 남음
        // -> []안에 return된 숫자 "2"를 넣어주면 -> 해당 index의 번호 출력
        // tip: 배열의 index는 0부터 시작
            
        return answer;
    }
}