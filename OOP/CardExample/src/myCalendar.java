public class myCalendar {
    //public static final int LAST_MONTH = 12;
    //FINAL 사용시 보통 변수 이름 대문자 사용
    //상수 FINAL 사용시 STATIC을 사용해서 정적으로 사용한다.
    //Static 선언시 클래스로 바로 사용할수 있다.

    public final int LAST_MONTH;
    // 클래스 생성시 변수 값을 정하고 수정안하는 경우는 보통 final로만 사용
    // 생성시 LAST_MONTH 값을 지정해주면 다시 바꾸지 못한다.
    public myCalendar(int LAST_MONTH) {
        this.LAST_MONTH = LAST_MONTH;
    }

}
