// Java 프로그래밍 - 클래스와 객체_1

// Car 클래스 - 객체변수, 메소드

import car.Car3;

class Car {
    String name;
    String type;

//Car(){} 생성자 디폴트로 존재해서 생략가능
    public  void printCarInfo(){
        System.out.println("== Car Info ==");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void move(){
        System.out.println(("이동!"));
    }
    public void brake(){
        System.out.println(("정지!"));
    }
}

// Car2 클래스 - 생성자, this
// this - 객체 자신을 의미
// this() - 생성자

class Car2 {
    String name;
    String type;
    //Car(){}

    Car2(String _name, String _type){ //생성자
        this.name = _name;
        this.type = _type;
        System.out.println("생성자 출력!");
    }
    public  void printCarInfo(){
        System.out.println("== Car Info ==");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void load(){
        System.out.println("짐을 주세요!");
    }
    public void horn(){
        System.out.println("빵빵");
    }

    //오버로딩 구현

    public void printCarInfo(String date){
        this.printCarInfo();
        System.out.println("date : " + date);
    }

    public void printCarInfo(int number){
        this.printCarInfo();
        System.out.println("number : " + number);
    }

    public void printCarInfo(String date, int number){
        this.printCarInfo();
        System.out.println("date : " + date);
        System.out.println("number : " + number);
    }
}
class Car4 {
    //스태틱 변수

    static String name = "None";  // Static을 사용하여 객체를 만들기 전부터 name라는 변수 생성
    String type;
    //Car(){} 생성자 디폴트로 존재해서 생략가능

    Car4(String name, String type){
        this.name = name;
        this.type = type;
    }
    public  void printCarInfo(){
        System.out.println("== Car Info ==");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }
    ///스태틱 메소드
    public static void getName(){
        //static 메소드일 경우 메소드 안에 쓰이는 변수도 static변수여야한다.
        System.out.println("Car name : " + name);
    }

}


///연습

class Animal{
    String name;
    double weight;
    String classification;

    Animal(String name, Double weight, String classification){
        this.name = name;
        this.weight = weight;
        this.classification = classification;
    }

    public void printInfo(){
        System.out.println("name = " + name);
        System.out.println("weight = " + weight);
        System.out.println("classification = " + classification);
    }

    public  void eat(){
        System.out.println("냠냠");
    }

    public  void sleep(){
        System.out.println("쿨쿨");
    }
    public  void walk(){
        System.out.println("걷기");
    }
    public  void run(){
        System.out.println("뛰기");
    }


}

////////////////오버로딩 실습

class Calculator{
    public int sum(int a, int b){return a+b;}
    public double sum(double a, double b){return a+b;}
    public double sum(String a, String b){
        return Double.parseDouble(a) + Double.parseDouble(b);
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }

}

public class Object {

    public static void main(String[] args) {
//      Car 클래스 사용

        Car mycar1 = new Car();  // 카 생성
        mycar1.name = "a";
        mycar1.type = "suv";
        mycar1.printCarInfo();
        mycar1.move();
        mycar1.brake();

//      Car2 클래스 사용

        Car2 mycar2 = new Car2("b","sedan");
        mycar2.printCarInfo();
        mycar2.load();
        mycar2.horn();

        Animal animal1 = new Animal("강아지",5.0,"포유류");
        Animal animal2 = new Animal("구피",0.01,"어류");

        animal1.printInfo();
        animal2.printInfo();


////////////////////////////////////////////////7_2

        Car2 myCar1 = new Car2("a", "sedan");

        myCar1.printCarInfo();

//      1. 오버로딩 사용
        // 오버로딩 - 한 클래스 내에서 같은 이름의 메소드를 여러개 정의
        // 오버로딩의 조건
        // - 메소드의 이름이 같아야한다.
        // - 매게변수의 개수 또는 타입이 같아야한다.
        // - 리턴타입의 차이로는 오버로딩이 되지 않음

        System.out.println("=== 오버로딩 사용 ===");

        myCar1.printCarInfo("2022");
        myCar1.printCarInfo(1234);
        myCar1.printCarInfo("2022",1234);

//      2. 접근 제어자
        System.out.println("=== 접근 제어자 ===");

        Car3 myCar3 = new Car3("a", "b", "c", "d");//패키지 임포트 Alt + Enter
        System.out.println(myCar3.name1);
        /*System.out.println(myCar3.name2);
        System.out.println(myCar3.name3);
        System.out.println(myCar3.name4);*/

//      3. Static
        System.out.println("=== Static ===");

        Car4.getName();
        Car4 mycar4_1 = new Car4("a","sedan");
        Car4 mycar4_2 = new Car4("b","suv");
        Car4 mycar4_3 = new Car4("c","rv");
        /* 변수가 static일 경우 객체 끼리 static 변수를 공유
           마지막으로 만든 객체 mycar4_3의 name인 c를 공유해서 mycar4_1,mycar4_2의 name도 다 c이다. */
        mycar4_1.printCarInfo();
        mycar4_2.printCarInfo();
        mycar4_3.printCarInfo();

        //// 오버로딩 연습
        Calculator c = new Calculator();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1.0,2.0));
        System.out.println(c.sum("1","2"));
        System.out.println(c.sum(1,2,3));

    }


}
