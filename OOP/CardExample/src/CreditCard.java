public class CreditCard {
    public long cardNumber;
    public String cardOwner;
    public long total_amount;
    public void use(long amount){
        total_amount = total_amount  + amount;
    }
    public void payBill(long pay){
        total_amount = total_amount - pay;
    }
    public void use(){

    }
    //카드 사용
    //카드 비용 지급
    //포인트 적립
}
