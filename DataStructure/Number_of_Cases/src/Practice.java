// Practice
// 약수 구하기, 두 수의 최대공약수와 최소공배수 구하기
// 활용) 1~10의 수 중 A의 약수 또는 B의 약수인 경우의 수
// 활용) 1~10의 수 중 A의 약수이면서 B의 약수인 경우의 수

import java.util.ArrayList;

public class Practice {

    //  약수
    public ArrayList getDivisor(int num) {
        ArrayList result = new ArrayList();

        for (int i = 1; i <= (int)num/2; i++) {  //자기수의 절반까지만 for문 돌리기
            if(num%i==0) {
                result.add(i);//나누어 떨어지는 수 list에 넣기
            }
        }
        result.add(num); //자기 자신을 리스트에 넣기

        return result;
    }

    //  최대 공약수
//  GCD: the Greatest Common Denominator
    public int getGCD(int numA, int numB) {
        int gcd = -1;

        ArrayList divisorA = this.getDivisor(numA); //numA의 약수 구하기
        ArrayList divisorB = this.getDivisor(numB);

        for (int itemA : (ArrayList<Integer>)divisorA ) {
            for (int itemB : (ArrayList<Integer>)divisorB ) {
                if(itemA == itemB){        //numA와 numB의 약수 for문 돌려서 같은 약수 구하기
                    if(itemA > gcd){  //최대공약수 변수보다  그 값이 크면 최대공약수 변수에 넣어주기
                        gcd = itemA;
                    }
                }
            }
        }
        return gcd;
    }

    //  최소 공배수
//  LCM: the Lowest Common Multiple
    public int getLCM(int numA, int numB) {
        int lcm = -1;
        int gcd = this.getGCD(numA,numB);
        if(gcd != -1){
            lcm = numA*numB/gcd;
        }

        return lcm;
    }

    public static void main(String[] args) {

//      Test code
        int number1 = 10;
        int number2 = 6;

        Practice p = new Practice();
        ArrayList l1 = p.getDivisor(number1);   // 10: 1, 2, 5, 10
        ArrayList l2 = p.getDivisor(number2);   // 6: 1, 2, 3, 6
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println("최대 공약수: " + p.getGCD(number1, number2));
        System.out.println("최대 공배수: " + p.getLCM(number1, number2));
    }
}
