import com.sun.org.apache.xml.internal.utils.res.XResources_ja_JP_A;
import com.sun.org.apache.xpath.internal.objects.XString;

import javax.xml.transform.Result;
import java.util.Scanner;

public class MiniA3 {

    public  static String inputcheck(String test, String checktype){
        System.out.print(test);
        String result = "";
        Scanner sc = new Scanner(System.in);

        if(checktype == "int"){
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요");
                System.out.print(test);
            }
            return Integer.toString(sc.nextInt());
        }
        else if(checktype == "string"){
            result = sc.nextLine();
            while (!(result.equals("y")||result.equals("n"))) {
                System.out.println("y/n 값만 입력가능합니다. 다시 입력해주세요");
                System.out.print(test);
                result = sc.nextLine();
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("[입장권 계산]");

        int age = Integer.parseInt(inputcheck("나이를 입력해 주세요.(숫자) : ", "int"));
        int time = Integer.parseInt(inputcheck("입장시간을 입력해 주세요.(숫자입력) : ", "int"));
        String nation = inputcheck("국가유공자 여부를 입력해 주세요.(y/n) : ", "string");
        String card = inputcheck("복지카드 여부를 입력해 주세요.(y/n) : ", "string");

        int ticket = 10000;

        if (age < 3) { //무료
            ticket = 0;
        }
        else if(age < 13 || time >= 17){ //특별할인일 경우
            ticket = 4000;
        }
        else if(nation.equals("y") || card.equals("y")){ // 일반할인일 경우
            ticket = 8000;
        }
        System.out.println("입장료 : " + ticket);
    }
}
