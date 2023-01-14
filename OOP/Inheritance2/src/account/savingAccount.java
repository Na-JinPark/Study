package account;

import java.util.Calendar;

public class savingAccount extends account {
    public void setting(){
        name = "은행계좌";
        date = Calendar.getInstance().getTime();
        accountNumber = 12345;
        // amount = 1000; -> 오류 -> private는 접근할수없다. 같은 클래스 내에서만 접근가능
    }
}
