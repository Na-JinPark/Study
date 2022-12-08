// Java 프로그래밍 - 추상 클래스 (하나 이상의 추상 메소드를 포함하는 클래스)
//추상 메소드 자식클래스에서 반드시 오버라이딩 해야하는 메소드

// 추상 클래스 Person

import java.sql.SQLOutput;

abstract  class Person{
    abstract void printInfo();
}

// 추상 클래스 상속
class Student extends Person{  //추상클래스를 상속받앗을 경우 내부의 추상 메소드를 반드시 재정의 해주어야한다.
    public void printInfo(){
        System.out.println("Student.printInfo");
    }
}


public class Main {

    public static void main(String[] args) {

//        추상 클래스의 사용
        //Person p1 = new Person(); 추상 클래스를 바로 객체로 만드는 것은 불가능
        Student s1 = new Student();
        s1.printInfo();

        Person p2 = new Person() {
            @Override
            void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
        p2.printInfo();

    }

}
