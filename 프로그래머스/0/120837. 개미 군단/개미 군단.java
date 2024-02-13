class Solution {
    public int solution(int hp) {

        
        int fir = hp / 5;
        int se = (hp % 5) / 3;
        int th = (hp % 5) % 3;
        
        
        return fir + se + th;
    }
}