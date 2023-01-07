import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args){
       // myCalendar myCalendar1 = new myCalendar();
        //myCalendar.lastMonth = 13; final 변수 사용시 값을 수정할 수 없다.

        //LAST_MONTH static을 사용하여 정적변수이기 때문에 클래스로 사용가능
        //final로만 명시 했을 경우 클래스로 사용불가 myCalendar1.LAST_MONTH 로 사용하여야한다.

       // System.out.println(myCalendar.LAST_MONTH);

        myCalendar myCalendar1 = new myCalendar(13);

        //myCalendar1.LAST_MONTH=12;
    }
}
