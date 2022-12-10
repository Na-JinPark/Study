import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MiniA2 {


    public static void main(String[] args) {

        System.out.println("[캐쉬백 계산]");

        /*boolean result = true;
        while (result) {
            try {

                System.out.print("결제금액을 입력해주세요.(금액) : ");
                Scanner sc = new Scanner(System.in);
                int amount = sc.nextInt();
                double cash = Math.floor(amount * 0.1); //결제금액의 10%로 계산
                double cashback = cash > 300 ? 300 : Math.floor(cash / 100) * 100; //결제금액의 10%로가 300원 이상이면 캐쉬백 300 미만이면 원단위 절삭
                System.out.format("결제 금액은 %d원이고, 캐시백은 %d원입니다.", amount, (int) cashback);
                result = false;

            } catch (InputMismatchException e) {
                System.out.println("결제금액은 숫자로 입력해 주세요");
            }
        }*/

        System.out.print("결제금액을 입력해주세요.(금액) : ");
        Scanner sc = new Scanner(System.in);
        int amount = 0;
        while (true) {

            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요");
                System.out.print("결제금액을 입력해주세요.(금액) : ");
                continue;
            }

            amount = sc.nextInt();

            if (amount < 0) {
                System.out.println("결제금액이 잘못 입력되었습니다. 다시 입력해주세요");
                System.out.print("결제금액을 입력해주세요.(금액) : ");
                continue;
            }

            break;
        }

        /*while (!sc.hasNextInt()) { //값이 숫자인지 판별
            sc.next();  //입력받은 값 비우기
            System.out.println("결제금액은 숫자만 입력 가능합니다. 다시 입력해주세요");
            System.out.print("결제금액을 입력해주세요.(금액) : ");
        }

        int amount = sc.nextInt();*/
        double cash = Math.floor(amount * 0.1); //결제금액의 10%로 계산
        double cashback = cash > 300 ? 300 : Math.floor(cash / 100) * 100; //결제금액의 10%로가 300원 이상이면 캐쉬백 300 미만이면 원단위 절삭
        System.out.format("결제 금액은 %d원이고, 캐시백은 %d원입니다.", amount, (int) cashback);


    }
}
