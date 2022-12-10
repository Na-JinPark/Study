import java.util.Scanner;

public class MiniA4 {
    public  static String inputcheck(String test, String inputtype){
        System.out.print(test);
        String result = "";
        Scanner sc = new Scanner(System.in);

        if(inputtype != "mf"){

            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요");
                System.out.print(test);
            }
            sss(sc, "숫자만 입력 가능합니다. 다시 입력해주세요", test);
            if ( inputtype.equals("yyyy") && !(Integer.toString(sc.nextInt()).length() == 4)){
                while (Integer.toString(sc.nextInt()).length() != 4) {
                    sc.next();
                    System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요");
                    System.out.print(test);
                }
            }else if( !inputtype.equals("yyyy") && Integer.toString(sc.nextInt()).length() > 2){

                while (Integer.toString(sc.nextInt()).length() > 2) {
                    sc.next();
                    System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요");
                    System.out.print(test);
                }
            }

            return Integer.toString(sc.nextInt());
        }
        else if(inputtype == "string"){
            result = sc.nextLine();
            while (!(result.equals("y")||result.equals("n"))) {
                System.out.println("y/n 값만 입력가능합니다. 다시 입력해주세요");
                System.out.print(test);
                result = sc.nextLine();
            }
        }
        return result;
    }
    public static void sss(Scanner sc, String text, String test){
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(text);
            System.out.print(test);
        }
    }

    public static void main(String[] args) {
        System.out.println("[입장권 계산]");

        int year = Integer.parseInt(inputcheck("출생년도를 입력해 주세요.(yyyy) : ", "yyyy"));
        int month = Integer.parseInt(inputcheck("출생월을 입력해 주세요.(mm) : ", "mm"));
        String mf = inputcheck("성별을 입력해 주세요.(m/f) : ", "mf");
    }
}
