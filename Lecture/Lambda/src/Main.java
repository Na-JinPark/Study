// Java 프로그래밍 - 람다식
//람다 표현식 - 메소드 대신 한의 식으로 표현하는 것, 익명함수(일회용함수)라고도 한다.
/* 장점 - 코드간결, 코드가독성이 높아짐, 생산성이 높아짐
   단점 - 재사용 불가능, 디버깅이 어려움, 재귀함수로는 맞지않음*/
interface ComputeTool {
    public abstract int compute(int x, int y);

    public abstract int compute2(int x, int y);
}


public class Main {

    public static void main(String[] args) {

        ComputeTool cTool = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x+y;
            }
            public int compute2(int x, int y){
                return x-y;
            }
        };
        System.out.println(cTool.compute(1,2));

        // 람다식
        // 인터페이스에 추상메소드가 2개 이상일때는 사용이 제한된다.
        /*ComputeTool cTool2 = (x,y) -> {return x+y};
        System.out.println(cTool2.compute(1,2);*/

    }
}
