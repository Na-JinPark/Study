import java.util.*;

public class MiniA7 {

    public static void Lotto(HashMap lottolist, int CNT){ //로또생성

        HashSet set ;
        LinkedList sortlist ;

        for (int j = 0; j < CNT; j++) {

            set = new HashSet();

            for (int i = 0; set.size() <6; i++) {
                int num = (int)(Math.random() * 45)+1; //random함수를 이용하여 0~44까지의 무작위 숫자를 추출
                set.add(num); //HashSet을 사용하여 중복된 값은 제외, set.size()<6 이기때문에 6개의 숫자만 더해진다.
            }
            sortlist = new LinkedList(set);
            Collections.sort(sortlist);
            lottolist.put((char)('A'+j) ,sortlist);
        }
    }

    public static  void printlotto(HashMap<Character,LinkedList>  printlotto, String lotto){

        for ( Character key : printlotto.keySet() ) { //로또 당첨 번호 출력

            LinkedList value = printlotto.get(key);

            if(lotto.equals("lotto")) {
                System.out.printf("\t");
            }else{
                System.out.printf("%s\t", key);
            }

            for (int i = 0; i < value.size(); i++) {
                System.out.printf("%02d\t", value.get(i));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {


        HashMap<Character,LinkedList> lotto = new HashMap<>(); //1등 로또번호
        HashMap<Character,LinkedList> Userlotto= new HashMap<>(); //사용자 로또번호

        System.out.println("[로또 당첨 프로그램]");
        System.out.println();
        System.out.print("로또 개수를 입력해주세요.(숫자 1~10): ");
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while (true) {

            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요");
                System.out.print("로또 개수를 입력해주세요.(숫자 1~10): ");
                continue;
            }

            cnt = sc.nextInt();

            if (cnt < 1 || 10 < cnt) {
                System.out.println("로또개수가 잘못 입력되었습니다. 다시 입력해주세요");
                System.out.print("로또 개수를 입력해주세요.(숫자 1~10): ");
                continue;
            }
            break;
        }

        Lotto(Userlotto, cnt); //입력값 만큼 로또 생성
        printlotto(Userlotto,"Userlotto"); //사용자 로또번호 출력
        System.out.println();

        System.out.println("[로또 발표]");
        Lotto(lotto, 1); //로또 당첨 전호
        printlotto(lotto,"lotto"); //1등 로또 당첨번호 출력
        System.out.println();

        System.out.println("[내 로또 결과]");
        for ( Character userkey : Userlotto.keySet() ) { //로또 당첨 번호 출력
            int col = 0; //일치된 로또 번호 숫자
            LinkedList userlotto = Userlotto.get(userkey); //사용자 로또 리스트
            LinkedList finallotto = lotto.get('A'); //당첨 로또 리스트

            System.out.printf("%s\t", userkey);

            for (int i = 0; i < userlotto.size() ; i++) {
                for (int j = 0; j < finallotto.size() ; j++) {
                    if(userlotto.get(i)==finallotto.get(j)) col++; //로또번호가 일치한 경우
                }
                System.out.printf("%02d  ", userlotto.get(i));
            }
            System.out.printf("==> %d개 일치\n", col);

        }
    }

}
