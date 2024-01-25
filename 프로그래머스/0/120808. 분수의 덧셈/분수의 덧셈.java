class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int n3 = ((numer1 * denom2) + (numer2 * denom1));
        int d3 = (denom1 * denom2);
        
        for(int i = n3 - 1; i > 1; i--){
            if(n3 % i == 0 && d3 % i == 0){
                n3 /= i;
                d3 /= i;
            }
        }
        
        int[] answer = {n3, d3};
        return answer;
    }
}