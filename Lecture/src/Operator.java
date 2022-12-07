public class Operator {

    public static void main(String[] args) {

//      1. 대입 연산, 부호 연산자

        int num = 100; //대입
        num = +10;  //부호
        num = 10;
        num = -10;

//      2. 산술 연산자, 증가/감소 연산자
        System.out.println("== 산술 연산자, 증가/감소 연산자 ==");

        int numX = 10;
        int numY = 3;
        int result = 0;

        result = numX+numY;
        result = numX-numY;
        result = numX*numY;
        result = numX/numY;
        result = numX%numY; //나머지
        System.out.println("result = " + result);

        int numZ = 1;
        System.out.println("numZ++ = " + numZ++);
        System.out.println("numZ++ = " + numZ);

        numZ = 1;
        System.out.println("numZ++ = " + ++numZ);
        System.out.println("numZ++ = " + numZ);

        numZ = 1;
        System.out.println("numZ++ = " + numZ--);
        System.out.println("numZ++ = " + numZ);

        numZ = 1;
        System.out.println("numZ++ = " + --numZ);
        System.out.println("numZ++ = " + numZ);


//      3. 관계 연산자
        System.out.println("== 관계 연산자 ==");

        int numA= 10;
        int numB = 9;

        System.out.println(numA>numB);
        System.out.println(numA<numB);
        System.out.println(numA==numB);
        System.out.println(numA!=numB);

//      4. 논리 연산자  ex) &&,||,!
        System.out.println("== 논리 연산자 ==");

        System.out.println((10>9) && (1==0)); //And
        System.out.println((10>9) || (1==0)); //Or

//      5. 복합 대입 연산자
        System.out.println("== 복합 대입 연산자 ==");

        int num1 = 10;
        int num2 = 5;
        num1 +=num2; // => num1 = num1 + num2
        System.out.println("num2 = " + num1);

        num1 -=num2;
        num1 *=num2;

//      6. 삼항 연산자
        System.out.println("== 삼항 연산자 ==");

        int a = 100;
        String aResult = (a == 100) ? "yes" : "no";
        System.out.println("aResult = " + aResult);


/////////////////////////////////////////////////////////////////3_2
//      1. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");
//      1-1. AND 연산자 (&) 두개다 1일 경우 1
        System.out.println("== & ==");

        int bit1 = 5;
        int bit2 = 3;
        int resultbit = 0;
        resultbit = bit1 & bit2;

        System.out.println("resultbit = " + resultbit);
        System.out.println(Integer.toBinaryString((bit1)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(bit1)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(bit2)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(resultbit)));

        /*println -> ln 엔터키를 하나 추가해서 출력
          printf -> 포맷("%04d")을 만들어 포맷에 맞게 데이터 값을 집어넣고 출력*/

//      1-2. OR 연산자 (|) 하나라도 1일 경우 1
        System.out.println("== | ==");

        resultbit = bit1 | bit2;
        System.out.println("resultbit = " + resultbit);
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(bit1)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(bit2)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(resultbit)));


//      1-3. XOR 연산자 (^)  두개가 같은 경우 0 다른경우 1
        System.out.println("== XOR ==");

        resultbit = bit1 ^ bit2;
        System.out.println("resultbit = " + resultbit);
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(bit1)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(bit2)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(resultbit)));

//      1-4. 반전 연산자 (~)
        System.out.println("== ~ ==");

        resultbit = ~bit1;
        System.out.println("resultbit = " + resultbit);
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(bit1)));
        System.out.printf("%s\n", Integer.toBinaryString(resultbit));
        // 원래 앞에 0이엇던 32개의 바이트가 반전이 되어 1로 표시된다.

//      2. 비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");
//      2-1. << 연산자

        int bitA = 3;
        resultbit = bitA << 1;

        System.out.println("resultbit = " + resultbit);
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(bitA)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(resultbit)));


//      2-2. >> 연산자

        resultbit = bitA >> 1;

        System.out.println("resultbit = " + resultbit);
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(bitA)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(resultbit)));


//      2-3. >>> 연산자

        bitA = -5;
        resultbit = bitA >> 1;
        System.out.printf("%s\n",Integer.toBinaryString(bitA));
        System.out.printf("%s\n",Integer.toBinaryString(resultbit)); // 맨앞에 비트는 위에 부호비트를 그대로 가지고 와서 1로 채워진것

        resultbit = bitA >>> 1;
        System.out.printf("%s\n",Integer.toBinaryString(bitA));
        System.out.printf("%s\n",Integer.toBinaryString(resultbit)); // 맨앞에 부호비트를 무조건 0으로 채워준다


    }
}
