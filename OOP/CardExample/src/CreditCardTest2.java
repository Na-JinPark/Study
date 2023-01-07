public class CreditCardTest2 {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard();
        //myCard.setcardNumber = 1234_5678_1234_1234L;
        myCard.setCardNumber(234_5678_1234_1234L);
        myCard.cardOwner = "홍길동";


        CreditCard myCard2 = new CreditCard();
        //myCard2.cardNumber = 2222_3333_4444_5555L;
        myCard2.setCardNumber(2222_3333_4444_5555L);
        myCard2.cardOwner = "홍길동";

        myCard.use(12000);
        myCard2.use(25000);

        System.out.println("========================");
        //System.out.println(myCard.cardNumber);
        System.out.println(myCard.getCardNumber());
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.total_amount);
        System.out.println(myCard.total_point);
        System.out.println("========================");
        //System.out.println(myCard2.cardNumber);
        System.out.println(myCard2.getCardNumber());
        System.out.println(myCard2.cardOwner);
        System.out.println(myCard2.total_amount);
        System.out.println(myCard2.total_point);

    }
}
