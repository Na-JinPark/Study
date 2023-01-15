package SUM;

public class sum {

    //메소드 오버로딩
    //동일 한 메소드 명으로 매게변수 또는 return값이 다르게 만든 메소드

    //정적 메소드의 경우 클래스 내부에 소속된 변수들의 접근 못함.
    // 또한 정적 메소드 내부에서는 this,super사용 못함
    public static int sum(int num1, int num2, int num3, int num4){
        return  num1 + num2+num3 + num4;
    }

    public  int sum(int num1, int num2){
        return  num1 + num2;
    }

    public  int sum(int num1, int num2, int num3){
        return  num1 + num2 + num3;
    }

    public int sum(int[] num, int cnt){
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += num[i];
        }
        return sum;
    }
}
