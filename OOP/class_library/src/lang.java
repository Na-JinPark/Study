import java.util.Calendar;
import java.util.Date;

public class lang {
    public static void main(String[] args) {
        /*java.lang 패키지
        - 자바 프로그램의 가장 기본이 되는 클래스들을 포함
        - import문 없이 사용
        - 대표적인 String, System 클래스를 import문 없이 사용할 수 있었던 이유*/
        System.out.println("TEST!!");
        String str = "홍길동";
        System.out.println(str);
        
        Date today = Calendar.getInstance().getTime();
        System.out.println("today = " + today);
    }
}
