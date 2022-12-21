// 기초 수학 - 지수와 로그

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

//      1. 제곱, 제곱근, 지수
        System.out.println("== 제곱 ==");
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(2,-3)); // 지수가 음수이면 분수 -> 2의 -3승분의 1
        System.out.println(Math.pow(-2,-3)); // -2의 -3승분의 1
        System.out.println(Math.pow(-2,3));

        System.out.println(Math.pow(2,30)); //E9는 10의 9승
        System.out.printf("%.0f\n",Math.pow(2,30)); //위의 2의 30승을 끝까지 출력하는 방법

        System.out.println("== 제곱근 ==");
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(16, 1.0/2));
        System.out.println(Math.pow(16, 1.0/4));

//      참고) 절대 값
        System.out.println("== 절대 값 ==");
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));

//      2. 로그
        System.out.println("== 로그 ==");
        System.out.println(Math.E);
        System.out.println(Math.log(2.718281828459045));
        System.out.println(Math.log10(1000));
        System.out.println(Math.log(4)/Math.log(2)); //log 2의 4

    }
}
