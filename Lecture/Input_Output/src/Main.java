// Java 프로그래밍 - 입출력_1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void referInputStream() throws IOException {
//      System.in
        System.out.println("== System.in ==");

        System.out.print("입력 :");
        int a = System.in.read() - '0';
        /* System.in.read()는 charater값 하나를 받아올수 있음.
           숫자 값을 받아오면 문자라서 아스키 코드 값에 매핑이 되어 있는데 그 아스키 코드값만큼 빼서 숫자로 변환해주는 부분*/
        System.out.println("a = " + a);
        System.in.read(new byte[System.in.available()]);
        /*값을 입력하고 enter를 누르면 enter값을 포함해서 데이터를 읽어오는데 in.read는 입력 스트림에서 하나만 가져올수 있기때문에
        엔터값이 남게 된다. 그래서 엔터 값을 소진 시켜주어야한다.
        이 부분을 써주지 않으면 엔터 값이 남아 있어 다음 입력받는 부분 데이터 값에 엔터 값이 들어가 입력받지 못하는 상황이 생긴다.*/

//      InputStreamReader
        System.out.println("== InputStreamReader ==");

        InputStreamReader reader = new InputStreamReader(System.in); // 매개변수료 System.in을 넣어주어야한다.
        char[] c = new char[3];//하나의 변수가 아니라 여러개의 문자를 받아 올수 있는데 값을 받아오기 위한 배열이 필요
        System.out.print("입력 :");
        reader.read(c);
        System.out.println(c);

//      BufferedReader 자유자재로 문자를 입력할 수 있다.
        System.out.println("== BufferedReader ==");

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        System.out.print("입력 :");
        String s1 = br.readLine();
        System.out.println("s1 = " + s1);
    }

    public static void main(String[] args) throws IOException {

//      1. 입력
//      1-1. 다른 입력 방식 참고
       // referInputStream();

//      1-2. Scanner (주로 사용되는것)
        System.out.println("== Scanner ==");

        Scanner sc = new Scanner(System.in);
        /*System.out.print("입력1:");
        System.out.println(sc.next());
        sc.nextLine();*/

        /*System.out.print("입력2:");
        System.out.println(sc.nextInt());//Integer 값만 입력받을수 있다. 그 외 타입은 오류 발생
        sc.nextLine();

        System.out.print("입력3:");
        System.out.println(sc.nextLine()); //자유자재로 입력할 수 있다.*/


//      참고) 정수, 문자열 변환

        int num = Integer.parseInt("12345");
        String str = Integer.toString(12345);

//      2. 출력
        System.out.println("== 출력 ==");

        System.out.println("Hello");
        System.out.println("World!");

        System.out.print("Hello ");
        System.out.println("World!");
        System.out.println();

        System.out.printf("Hello ");
        System.out.printf("World!");
        System.out.println();

        String s = "자바";
        int number = 3;

        System.out.println(s+"는 언어 선호도 "+number+"위 입니다.");
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n",s,number);

        System.out.printf("%d\n",10);
        System.out.printf("%o\n",10); //8진수
        System.out.printf("%x\n",10); //16진수

        System.out.printf("%f\n",5.2f);
        System.out.printf("%c\n",'A');
        System.out.printf("%s\n","안녕하세요");

        System.out.printf("%5d\n",123);
        System.out.printf("%-5d\n",123);
        System.out.printf("%5d\n",1234);
        System.out.printf("%5d\n",12345);

        System.out.printf("%.2f\n",1.123456789f); //반올림해서 출력
    }
}
