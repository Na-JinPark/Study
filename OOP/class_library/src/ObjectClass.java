import java.util.Calendar;
import java.util.Date;

public class ObjectClass {
    public static boolean isHonggildong(String str){

        if("홍길동".equals(str)){
            return true;
        } else {
            return false;
        }
        //아래방식으로 equals사용시 str이 null일 경우 오류가 발생
        //조건을 if(str!=null && str.equals(("홍길동"))) 이렇게 변경해도되지만 위에 처럼 조건을 거는게 더 간단
        /*if(str.equals(("홍길동"))){
            return true;
        } else {
            return false;
        }*/
    }
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = "이순신";
        String str3 = null;

        //equals
        if(str1 == str2){};
        if(str1.equals(str2)){}
        //문자열 비교시 equals를 써서 비교를 하여야한다.

        System.out.println(isHonggildong(str1));
        System.out.println(isHonggildong(str2));
        System.out.println(isHonggildong(str3));

        //hashCode
        Object obj1 = new Object();
        System.out.println(str1);
        System.out.println(str1.hashCode());
        System.out.println(obj1.hashCode());

        //toString()
        System.out.println(obj1.toString()); //obj1.toString()은 obj1.hashCode()의 16진수 값
        System.out.println(obj1.hashCode());
        System.out.println(Integer.toHexString(obj1.hashCode()));

        String str4 = new String("홍길동");
        System.out.println(str4.toString());

        Date dt1 = Calendar.getInstance().getTime();
        System.out.println(dt1.toString());

        people 홍길동 = new people("홍길동", 20);
        System.out.println(홍길동.toString());
        //toString은 클래스에서 오버라이딩하여 사용 할 수 있다.
    }
}
