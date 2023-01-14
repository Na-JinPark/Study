package account2;
import account.account;

import java.util.Calendar;

public class savingAccountCheck extends account { //다른 패키지에있는 클래스를 상속받을 시 import 필요
    public void check(){
        name = "은행계좌";
        date = Calendar.getInstance().getTime();
        // amount = 1000; -> 오류 -> private는 접근할수없다. 같은 클래스 내에서만 접근가능
        // accountNumber = 12345; -> 오류 -> default는 같은 패키지 내에서만 접근가능
    }
}
