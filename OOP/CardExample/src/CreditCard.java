public class CreditCard {
    private long cardNumber;
    public String cardOwner;
    public long total_amount;
    public long total_point;

    //카드 사용
    public void use(long amount){
        total_amount +=  amount;
    }

    //카드 비용 지급
    public void payBill(long pay){
        total_amount -=  pay;
        addPoint(pay / 1000);
    }

    //포인트 적립
    private void addPoint(long point){
        total_point += point;
    }

    //setter
    public void setCardNumber(long cardNumber){
        if(cardNumber < 1000_0000_0000_0000L){
            System.err.println("카드번호에 문제가 있습니다.");
        } else {
            this.cardNumber = cardNumber;
        }
    }

    //getter
    public long getCardNumber(){
        return cardNumber;
    }
}
