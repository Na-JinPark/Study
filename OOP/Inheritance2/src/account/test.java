package account;

import java.util.Calendar;

public class test {
    public static void mina(String[] args){
        account account1 = new account();
        account1.name = "은행게좌";
        account1.date = Calendar.getInstance().getTime();
        account1.accountNumber = 12345;
        //account1.amount; 오류 -> private는 접근할수없다. 같은 클래스 내에서만 접근가능
    }
}
