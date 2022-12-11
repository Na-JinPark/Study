import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MiniA8 {

    public static long Tax_cal_print (List tax, long amount){

        List<Map.Entry<Integer, Integer>> Taxlist1 = new ArrayList<>(tax);

        int result = 0;

        for (int i = 0; i <Taxlist1.size() ; i++) {

            long taxstandard = i==Taxlist1.size() -1 ? amount-Taxlist1.get(i).getKey() : Taxlist1.get(i+1).getKey()-Taxlist1.get(i).getKey();
            int portion = Taxlist1.get(i).getValue();
            System.out.printf("%11d * %2d%c = %11d\n", taxstandard, portion,'%', (long)(taxstandard * ((float)portion/100)));

            result += (int)(taxstandard * ((float)portion/100));
        }
        return result; //세율에 의한 세금 계산
    }

    public static long progressive_deduction_cal (List DeductionList, Map por, long amount){

        List<Map.Entry<Integer, Integer>> DeductionList1 = new ArrayList<>(DeductionList);

        int taxstandard =DeductionList1.get(0).getKey(); //입력한 소득금액에 대한 과세표준금액

        int taxrate = (int)por.get(taxstandard); //세율가져오기
        int deductionamount =DeductionList1.get(0).getValue(); //입력한 소득금액에 대한 누진공제금액

        return  (long)(amount * ((float)taxrate/100))  - deductionamount;
    }
    public static void main(String[] args) {

        Map<Integer,Integer> Tax = new HashMap<>(); // 과세별 세율
        Tax.put(0,6);
        Tax.put(12000000,15);
        Tax.put(46000000,24);
        Tax.put(88000000,35);
        Tax.put(150000000,38);
        Tax.put(300000000,40);
        Tax.put(500000000,42);
        Tax.put(1000000000,45);

        Map<Integer,Integer> deductionamt = new HashMap<>(); //표준과세별 누진공제
        deductionamt.put(0,0);
        deductionamt.put(12000000,1080000);
        deductionamt.put(46000000,5220000);
        deductionamt.put(88000000,14900000);
        deductionamt.put(150000000,19400000);
        deductionamt.put(300000000,25400000);
        deductionamt.put(500000000,35400000);
        deductionamt.put(1000000000,65400000);

        long taxamount = 0;

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.: ");
        Scanner sc = new Scanner(System.in);
        long inputamount = 0;

        while (true) {

            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요");
                System.out.print("연소득을 입력해 주세요.: ");
                continue;
            }

            inputamount = sc.nextLong();

            if (inputamount < 0) {
                System.out.println("연소득금액이 잘못 입력되었습니다. 다시 입력해주세요");
                System.out.print("연소득을 입력해 주세요.: ");
                continue;
            }

            break;
        }

        long amount = inputamount;

        List Taxlist =  Tax.entrySet().stream().sorted(Map.Entry.comparingByKey()) //오름차순 정렬
                .filter(x-> x.getKey() < amount)  // 종합소득 계산시 필요한 세율만 filter
                .collect(Collectors.toList());
        taxamount = Tax_cal_print(Taxlist, amount); //세율에 의한 세금 계산
        System.out.println();
        System.out.printf("[세율에 의한 세금]: %18d\n" , taxamount);

        List DeductionList =  deductionamt.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())) //내림차순 정렬
                .filter(x-> x.getKey() < amount)  // 종합소득 계산시 필요한 누진공제만 filter
                .collect(Collectors.toList());
        taxamount = progressive_deduction_cal(DeductionList,Tax, amount); // 누진공제계산
        System.out.printf("[누진공제 계산에 의한 세금]: %11d\n", taxamount);


    }
}
