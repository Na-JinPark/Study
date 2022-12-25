
import java.util.Scanner;

public class MiniA3 {
    public  static int intcheck(String text, String inputtype){
        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (true) {

            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요");
                System.out.print(text);
                continue;
            }

            num = sc.nextInt();

            if (num < 0) {

                if (inputtype == "age") {
                    System.out.println("나이가 잘못 입력되었습니다. 다시 입력해주세요");
                }else {
                    System.out.println("입장시간이 잘못 입력되었습니다. 다시 입력해주세요");
                }
                System.out.print(text);
                continue;
            }

            break;
        }

        return num;
    }
    public  static String stringcheck(String text){
        System.out.print(text);
        Scanner sc = new Scanner(System.in);

        String result = sc.nextLine();
        while (!(result.toLowerCase().equals("y")||result.toLowerCase().equals("n"))) {
            System.out.println("y/n 값만 입력가능합니다. 다시 입력해주세요");
            System.out.print(text);
            result = sc.nextLine();
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("[입장권 계산]");

        int age = intcheck("나이를 입력해 주세요.(숫자) : ", "age");
        int time = intcheck("입장시간을 입력해 주세요.(숫자입력) : ", "time");
        String nation = stringcheck("국가유공자 여부를 입력해 주세요.(y/n) : ");
        String card = stringcheck("복지카드 여부를 입력해 주세요.(y/n) : ");

        int ticket = 10000;

        if (age < 3) { //무료
            ticket = 0;
        }
        else if(age < 13 || time >= 17){ //특별할인일 경우
            ticket = 4000;
        }
        else if(nation.toLowerCase().equals("y") || card.toLowerCase().equals("y")){ // 일반할인일 경우
            ticket = 8000;
        }
        System.out.println("입장료 : " + ticket);
    }
}
