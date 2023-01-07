package exam01;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard();
        //myCard.cardNumber = 1234_5678_1234_1234L;
        myCard.cardOwner = "홍길동";

        //System.out.println(myCard.cardNumber);
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.total_amount);
        System.out.println(myCard.total_point);

        myCard.use(8000);
        myCard.use(12000);
        myCard.use(210000);
        myCard.payBill(30000);
        //System.out.println(myCard.cardNumber);
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.total_amount);
        System.out.println(myCard.total_point);
    }
}
