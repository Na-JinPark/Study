
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class MiniA4 {
    static int year;
    static int month;
    public static int datecheck(String test, String inputtype){

        System.out.print(test);
        Scanner sc = new Scanner(System.in);
        int num;
        Calendar cal = java.util.Calendar.getInstance();

        while (true) {

            if(!sc.hasNextInt()) {
                sc.next();
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요");
                System.out.print(test);
                continue;
            }

            num = sc.nextInt();

            if (inputtype.equals("yyyy")) {

                if ( num < 1900  || cal.get(cal.YEAR) < num) { //출생년도 1900~현재년도 까지만 입력
                    System.out.println("출생년도가 잘못 되었습니다. 다시 입력해주세요");
                    System.out.print(test);
                    continue;
                }
            }
            else if (inputtype.equals("mm")) {

                if (num < 1 || 12 < num) { // 1~12월까지 입력됫는지 체크
                    System.out.println( "출생월이 잘못 되었습니다. 다시 입력해주세요");
                    System.out.print(test);
                    continue;
                }
            }
            else if (inputtype.equals("dd")) {

                cal.set(year,month,1);
                int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

                if (num < 1 || lastday < num) { //1일부터 출생월의 마지막 날
                    System.out.printf( "출생일이 잘못 입력됬습니다. %d월은 1일부터 %d일입니다. 다시 입력해주세요\n", month, lastday);
                    System.out.print(test);
                    continue;
                }
            }

            break;
        }

        return num;
    }

    public  static String stringcheck(String test) {

        System.out.print(test);
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        while (!(result.toLowerCase().equals("m") || result.toLowerCase().equals("f"))) {
            System.out.println("m/f 값만 입력가능합니다. 다시 입력해주세요");
            System.out.print(test);
            result = sc.nextLine();
        }
        return result;

    }


    public static void main(String[] args) {
        System.out.println("[주민등록번호 계산]");

         year = datecheck("출생년도를 입력해 주세요.(yyyy) : ", "yyyy");
         month = datecheck("출생월을 입력해 주세요.(mm) : ", "mm");
          int day = datecheck("출생일을 입력해 주세요.(dd) : ", "dd");
        String mf = stringcheck("성별을 입력해 주세요.(m/f) : ");
        int num = 0;

        //주민번호 생성
        // 주민번호 뒷자리 첫번째번호
        switch (year/100){
            case 18 :
                num = mf =="m" ? 9 : 0;
                break;
            case 19 :
                num = mf =="m" ? 1 : 2;
                break;
            case 20 :
                num = mf =="m" ? 3 : 4;
                break;
        }

        StringBuffer number = new StringBuffer();
        number.append(Integer.toString(year).substring(2,4));
        number.append( month < 10? String.format("%02d", month) : month );
        number.append( day < 10? String.format("%02d", day) : day );
        number.append( "-");
        number.append(num);
        number.append(new Random().nextInt(1000000));

        System.out.println(number);
    }
}
