class Solution {
    public int solution(int price) {
        
        // 큰 금액을 우선적으로 확인 할 수 있도록 if문 시작은 큰 금액부터 작성 (ex) 580,000원
        // 100,000원부터 할인된 가격으로 if문을 실행할 경우 첫번째 if문에서 true이므로
        // 맞지 않은 할인률이 적용
        if(price >= 500000){ 
            int total = (int)(price * 0.8);
            return total;
        } else if (price >= 300000){
            int total = (int)(price * 0.9);
                return total;
        } else if (price >= 100000){
            int total = (int)(price * 0.95);
                return total;
        } else return price; // 10만원 미만일 경우 그냥 price를 return
    
    }
}