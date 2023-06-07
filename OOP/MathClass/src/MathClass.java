public class MathClass {
    public static void main(String[] args) {
        double d1 = 12.426;
        System.out.println(d1);
        System.out.println(Math.round(d1)); //반올림
        System.out.println(Math.ceil(d1)); //올림
        System.out.println(Math.floor(d1)); //버림

        System.out.println("----------------------");
        //소수점 2째자리까지 표현하기위해서, 올림, 반올림, 버림
        System.out.println(SmartMath.round(d1,2));
        System.out.println(SmartMath.ceil(d1,2));
        System.out.println(SmartMath.floor(d1,2));

        System.out.println("----------------------");
        double x1 = 0;
        double y1 = 0;
        double x2 = 3;
        double y2 = 4;
        System.out.println(SmartMath.distance(x1, y1, x2, y2));

    }
}
