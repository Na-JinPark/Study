import java.time.LocalDate;
import java.util.Scanner;

public class MiniA5 {

    public static int datecheck(String text, String inputtype){

        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {

            if(!sc.hasNextInt()) {
                sc.next();
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요");
                System.out.print(text);
                continue;
            }

            num = sc.nextInt();

            if (inputtype.equals("yyyy")) {

                if ( num < 1  ) { //음수체크
                    System.out.println("년도가 잘못 입력 되었습니다. 다시 입력해주세요");
                    System.out.print(text);
                    continue;
                }
            }
            else if (inputtype.equals("mm")) {

                if (num < 1 || 12 < num) { // 1~12월까지 입력됫는지 체크
                    System.out.println( "월이 잘못 입력되었습니다. 다시 입력해주세요");
                    System.out.print(text);
                    continue;
                }
            }

            break;
        }

        return num;
    }
    public static void main(String[] args) {

        System.out.println("[달력 출력 프로그램]");

        int year = datecheck("달력의 년도를 입력해 주세요.(yyyy) : ", "yyyy");
        int month = datecheck("달력의 월을 입력해 주세요.(mm) : ", "mm");

        System.out.println();
        System.out.println();

        LocalDate firstdate = LocalDate.of(year, month, 1); //입력받은 년도와 월의 1일 날짜 생성
        int firstday = firstdate.getDayOfWeek().getValue(); //생성한 날의 요일 구하기(달의 첫번쨰 요일)

        System.out.println(String.format("[%04d년 %02d월]", year, month));
        System.out.println("일\t월\t화\t수\t목\t금\t토\t");

        for (int i = 1; i <= firstday + firstdate.lengthOfMonth(); i++) {

            if(i<=firstday) {
                System.out.print("\t");
            }else{
                System.out.printf("%02d\t", i-firstday);
            }
            if(i % 7 == 0) {                // 다음 주로 줄 바꿈
                System.out.println();
            }
        }

    }

}
