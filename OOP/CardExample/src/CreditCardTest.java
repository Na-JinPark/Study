import java.sql.SQLOutput;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard();
        myCard.cardNumber = 1234_5678_1234_1234L;
        myCard.cardOwner = "홍길동";

        System.out.println(myCard.cardNumber);
        System.out.println(myCard.cardOwner);
    }
}
