package SUM;

public class sumtest {
    public static void main(String[] args){
        sum sum1 = new sum();

        System.out.println(sum1.sum(1,2));
        System.out.println(sum1.sum(1,2,3));
        System.out.println(sum1.sum(new int[] {10,20,30,40,50},5));

        //static으로 메소드를 구현하는 경우 클래스를 생성하지않고 클래스명으로 바로 메소드 사용
        System.out.println(sum.sum(1,2,3,4));
    }
}
