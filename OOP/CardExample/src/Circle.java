
public class Circle {
    //원 넓이, 둘레
    //파이r제곱
    //2파이r
    //r -> 원의 반지름

    double radius; //반지름
    static double PI = 3.14; //클래스 내에 공간만 사용
    //static 을 사용할때 변수이름은 보통 대문자 사용

    // double pi = 3.14 -> pi는 3.14동일 한데 Circle 생성시마다 공간을 생성한다.
    // 불필요한 공간을 사용하기 때문에 staic으로 선언해준다.
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return  PI * radius *radius;
    }

    public  double getPerimeter(){
        return 2 * PI * radius;
    }
}
