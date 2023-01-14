package account2;

import account.account;

import java.util.Calendar;

public class test {

    //같은 패키지가 아니고 상속도 아닐 경우 public만 접근가능
    public static void main(String[] args){
        account account1 = new account();
        account1.name = "은행계좌";
        //account1.date = Calendar.getInstance().getTime(); -> 오류 protected 는 해당 클래스를 상속받아야만 할 수 있다.
    }
}
