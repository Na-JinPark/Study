// Java 프로그래밍 - 변수와 자료형_1

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //sout 출력문 자동생성
        //soutv마지막변수 출력문 자동생성
///////////////////////////////////////////////////////2_1
//      1. 변수 사용하기
        System.out.println("== 변수 사용하기 ==");

        int age = 10;
        String country = "Korea";

        System.out.println(age);
        System.out.println(country);

//      2. 변수 이름 규칙
        System.out.println("== 변수 이름 규칙 ==");
//      2-1. 문자, 숫자, _(underscore), $ 사용 가능

        int apple = 2000;
        int apple3 = 2000;
        int _apple = 2000;
        int $apple = 2000;

        System.out.println($apple);
        System.out.println("$apple = " + $apple);

//      2-2. 숫자로 시작 X

        // int 3apple = 2000;

//      2-3. 대소문자 구분

        int apple2 = 1000;
        int Apple2 = 1000;

//      2-4. 공백 사용 X

        //int one apple = 1000;
        // oneApple 또는 one_apple형식으로 사용

//      2-5. 예약어 사용 X
//      예약어 예시: true, false, if, switch, for, continue, break, ...

//      참고) 한글 사용 가능
        int 사과 = 1000;
        System.out.println("사과 = " + 사과);;

//      3. 표기법
//      3-1. 카멜 표기법 (camelCase)
//      변수, 함수
        // myAge, oneApplePrice 등 낙타 등 모양처럼 뒤에 단어 대문자로 표기
        // 가장 앞의 문자는 소문자로, 나머지 단어의 첫 문자는 대문자로 표기

//      3-2. 파스칼 표기법 (PascalCase)
//      클래스
        // MyAge, OneApplePrice emd
        // 각문자의 첫 문자를 대분자로 표기

//      참고) 스네이크 표기법 (snake_case)
//      사용 X
        // my_age, one_apple_price 등 _사용하는 것
        // 소문자로 작성하고 단어와 단어사이에 언더바로 연결하여 표기



        ///////////////////////////////////////////////2_2
        //      1. 자료형 - 숫자
        System.out.println("== 숫자 ==");
//      1-1. 정수

        int intNum = 10;
        System.out.println("intNum = " + intNum);

        System.out.println(Integer.MIN_VALUE); //INTEGER의 최소값을 알 수 있다.
        System.out.println(Integer.MAX_VALUE);

        int intNum2 = Integer.MAX_VALUE;
        System.out.println("intNum2 = " + intNum2);
        int intNum3 = Integer.MAX_VALUE + 1;
        System.out.println("intNum3 = " + intNum3);  //최대값을 넘어가 -로 표시가 된다.
        long longNum = (long)Integer.MAX_VALUE + 1;

        /*변수를 long 으로 선언해주더라도 Integer.MAX_VALUE를 long으로 형변환 해주지 않으면
         Integer.MAX_VALUE + 1인 integer형의 데이터 범위가 넘어간 후 long으로 변환해주는 것이므로 잘못된 값이 들어가므로
         Integer.MAXM_VALUE를 long으로 형변환을 해주고 +1 을 해주어야한다.*/

        System.out.println("longNum = " + longNum);

//      1-2. 실수

        float floatNum = 1.23f; // float를 선언할 때 숫자뒤에 f를 붙히지 않으면 double로 인식
        double doubleNum = 1.23;

        System.out.println(Float.MAX_VALUE); //3.4028235E38 -> 3.4028235D의 38승이라는 뜻
        System.out.println(Double.MAX_VALUE);

//      1-3. 2진수 / 8진수 / 16진수

        int numBase2 = 0b1100;
        System.out.println("numBase2 = " + numBase2); //10진수로 표현
        int numBase8 = 014;
        System.out.println("numBase8 = " + numBase8);
        int numBase16 = 0xC;
        System.out.println("numBase16 = " + numBase16);

        System.out.println("0b = " + Integer.toBinaryString(numBase2));
        System.out.println("0 = " + Integer.toOctalString(numBase8));
        System.out.println("0x = " + Integer.toHexString(numBase16));

//      2. 자료형 - 부울
        System.out.println("== 부울 ==");

        boolean isPass = true;
        System.out.println("isPass = " + isPass);
        boolean isOk = false;
        System.out.println("isOk = " + isOk);

//      3. 자료형 - 문자
        System.out.println("== 문자 ==");

        char keyFirst = 'a';
        System.out.println("keyFirst = " + keyFirst);
        char keyLast = 'z';
        System.out.println("keyLast = " + keyLast);

        System.out.println((int)keyFirst); //문자 데이터들이 숫자로 매핑 되잇기 때문에 아스키 코드로 출력이됨
        System.out.println((int)keyLast);

/////////////////////////////////////////////////////////2_3
//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");

        String s1 = "Hello World";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);

//      1-1. equals

        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);

        String s5 = new String("Hi");
        System.out.println(s3.equals(s5));  //equals 값을 비교
        System.out.println(s3 == s5); //== 객체를 비교
        /* 문자열은 똑같은 데이터가 존재하는 경우 새로운 객체가 아니라 똑같은 데이터를 잡아준다
           s3에 Hi를 선언 하면서 hi라는 객체가 만들어지고 s4에서는 기존에 만들어진 hi가 있기 떄문에 객체를 새로 만들지 않고 기존의 객체를 사용
           s5는 new String을 사용하여 명시적으로 새로운 객체 hi를 생성
           equals는 hi라는 값을 비교한 것이기 때문에 true를 반환한 것이지만
           ==은 객체를 비교하는 것 이기 때문에 s3/s4와 s5를 비교시 false를 반환 한다. */

//      1-2. indexOf  특정 문자의 위치를 찾아주는 메소드

        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!",s6.indexOf("!")+1)); //뒤에 느낌표를 찾고 싶을 때


//      1-3. replace

        String s7 = s6.replace("Hello","Bye");
        System.out.println("s7 = " + s7);


//      1-4. substring

        System.out.println(s7.substring(0,3)); //0,1,2번째 문자 출력
        System.out.println(s7.substring(0,s7.indexOf("!")+1));

//      1-5. toUpperCase

        System.out.println(s7.toUpperCase());


//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");

        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("567898");
        System.out.println("sb1 = " + sb1);

        String a = "01234";
        String b = "56789";
        String bak = a;
        System.out.println((a==bak));

        a+=b;
        System.out.println("a = " + a);
        System.out.println((a==bak)); //string에 데이터 변화가 일어낫을때 같은 객체인지 다른객체인지 확인

        /* 문자열의 데이터가 자주 변경될때는 StringBuffer 쓰는게 좋다.
        StringBuffer는 데이터가 변경되도 객체가 새로 만들어 지지 않고 기존의 객체에 데이터를 이어서 변경
        String은 데이터의 변화가 일어 날때마다 새로운 객체를 생성해서 데이터를 바꾸어서 사용
        */


//      3. 자료형 - 배열
        System.out.println("== 배열 ==");

        int[] myArray1 = {1,2,3,4,5};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        char[] myArray2 = {'a','b','c','d','e'};
        System.out.println(myArray2[2]);

        String[] myArray3 = new String[3];
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "World!";
        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);


////////////////////////////////////////////////////////2_4
//      1. 자료형 - 리스트
        System.out.println("== 리스트 ==");

        ArrayList L1 = new ArrayList();

//      1-1. add 리스트 추가

        L1.add(1);
        L1.add("hello");
        L1.add(2);
        L1.add(3);
        L1.add(4);
        L1.add("world!");
        System.out.println("L1 = " + L1);

        L1.add(0,1);
        System.out.println("L1 = " + L1);

//      1-2. get  리스트에서 데이터 가져오기

        System.out.println(L1.get(0));
        System.out.println(L1.get(3));

//      1-3. size 리스트에 들어가 있는 데이터 갯수

        System.out.println(L1.size());

//      1-4. remove 리스트의 데이터 지우기

        System.out.println(L1.remove(0)); // 리스트의 위치로 데이터를 지울때
        System.out.println("L1 = " + L1);

        System.out.println(L1.remove(Integer.valueOf(2))); //리스트에 있는 데이터 값을 지우고 싶을때
        System.out.println("L1 = " + L1);

//      1-5. clear 리스트에 있는 모든 데이터를 제거해주는 함수

        L1.clear();
        System.out.println("L1 = " + L1);


//      1-6. sort  정렬

        ArrayList L2 = new ArrayList();
        L2.add(5);
        L2.add(3);
        L2.add(4);
        System.out.println("L2 = " + L2);

        L2.sort(Comparator.naturalOrder()); //오름차순
        System.out.println("L2 = " + L2);
        L2.sort(Comparator.reverseOrder()); //내림차순
        System.out.println("L2 = " + L2);

//      1-7. contains 데이터가 리스트에 들어있는 체크

        System.out.println(L2.contains((1)));
        System.out.println(L2.contains((3)));


//      2. Maps
        System.out.println("== Maps ==");

        HashMap map = new HashMap();


//      2-1. put

        map.put("kiwi",9000);
        map.put("apple",10000);
        map.put("mango",12000);
        System.out.println("map = " + map);

//      2-2. get

        System.out.println(map.get("mandarine"));
        System.out.println(map.get("kiwi"));

//      2-3. size

        System.out.println(map.size());

//      2-4. remove

        System.out.println(map.remove("kiwi"));
        System.out.println(map.remove("mandarine"));
        System.out.println("map = " + map);

//      2-5. containsKey

        System.out.println(map.containsKey(("apple")));
        System.out.println(map.containsKey(("kiwi")));


//      3. Generics
        // 자료형을 명시적으로 지정 ex) ArragList<String> li = new ArrayList<String>();
        // 제한적일수 있지만 안정성을 높여주고 형변환을 줄여줌
        System.out.println("== Generics ==");

        ArrayList L3 = new ArrayList();
        L3.add(1);
        L3.add("hello");
        System.out.println("L3 = " + L3);

        ArrayList<String> L4 = new ArrayList<String>(); //ArrayList<String> L4 = new ArrayList<>(); 오른쪽 비어있어도 암묵적으로 왼쪽 값을 넣어준다
        L4.add("hello");
        System.out.println("L4 = " + L4);

        HashMap map1 = new HashMap();
        map1.put(123,"id");
        map1.put("apple",10000);
        System.out.println("map1 = " + map1);

        HashMap<String, Integer> map2 = new HashMap<>();
        //map2.put(123,"id");
        map2.put("apple",10000);
        System.out.println("map2 = " + map2);

    }
}

