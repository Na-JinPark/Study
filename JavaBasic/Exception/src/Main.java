// Java 프로그래밍 - 예외 처리

import org.omg.CORBA.TRANSACTION_MODE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class NotTenException extends  RuntimeException{}; //자바에서 제공해주는 예외처리가 아닌 사용자 정의 예외
public class Main {

    public static boolean checkTen(int ten) {
        if (ten != 10) {
            return false;
        }

        return true;
    }

    public static boolean checkTenWithException(int ten) {
        
        try{
            if (ten != 10) {
                throw  new NotTenException();
            }

        }catch(NotTenException e){
            System.out.println("e = " + e);
            return  false;
        }
        
        return true;
    }

    public static boolean checkTenWithThrows(int ten) throws NotTenException {
        if (ten != 10) {
            throw  new NotTenException();
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

//      1. 예외
//      1-1. 0으로 나누기
        System.out.println("== 0으로 나누기 ==");
        //int a = 5 / 0;
        
        try{
            int a = 5/0;
        }catch(ArithmeticException e){
            System.out.println("0으로 나누기 예외 발생");
            System.out.println("e = " + e);
        }finally { //예외가 발생하든 않하든 항상 출력
            System.out.println("1-1 연습 종료");
        }


//      1-2. 배열 인덱스 초과
        System.out.println("== 배열 인덱스 초과 ==");
        int[] b = new int[4];
//        b[4] = 1;

        try{
            b[4] = 1;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("e = " + e);
        }


//      1-3. 없는 파일 열기
        System.out.println("== 없는 파일 열기 ==");
//        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

        try{
            BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        }catch(FileNotFoundException e){
            System.out.println("e = " + e);
        }

//      2. throw, throws
        System.out.println("== checkTen ==");
        
        boolean checkResult = Main.checkTen(10);
        System.out.println("checkResult = " + checkResult);


        System.out.println("== checkTenWithException ==");

        checkResult = Main.checkTenWithException(9);
        System.out.println("checkResult = " + checkResult);

        System.out.println("== checkTenWithThrows ==");

        try{
            checkResult = Main.checkTenWithThrows(5);
        }catch (NotTenException e){
            System.out.println("e = " + e);
        }
        System.out.println("checkResult = " + checkResult);

    }

}
