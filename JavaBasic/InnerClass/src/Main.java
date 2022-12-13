// Java 프로그래밍 - 내부 클래스
/* 내부 클래스 -> 클래스 in 클래스, 중첩 클래스라고도 한다.
   내부 클래스에서 외부 클래스 멤버 접근가능 반대는 불가능
   종류 : 인스턴스 클래스, 정적 클래스, 지역 클래스, 익명 클래스(이름을 가지지 않는 클래스, 선언과 동시에 객체 생성, 일회용 클래스)
 */
// 내부 클래스 구조
class Outer{
    public void print(){
        System.out.println("Outer.print");
    }

    class Inner{
        public void innerPrint(){
            Outer.this.print();
        }
    }

    static class InnerStaticClass{
        void innerPrint(){
            //Outer.this.print(); 내부 클래스이지만 static을 사용하여 정적 특성을 가지고 메모리에 먼저 올라가는데 outer은 static이 아니라 메모리에 안올라가서 바로 사용할 수가 없기 때문에 현재 정적 내부 클래스는 외부로 접근할 수 없다.
        }
    }
}

abstract class  Person{
    public abstract void printInfo();
}

class Student extends  Person{
    public void printInfo(){
        System.out.println("Student.printInfo");
    }
}
public class Main {

    public static void main(String[] args) {

//      외부 클래스

        Outer o1 = new Outer();

//      내부 클래스 - 인스턴스

        Outer.Inner i1 = new Outer().new Inner(); //외부 객체를 만들고 내부 객체를 만들어서 접근

//      내부 클래스 - 정적

        Outer.InnerStaticClass is1 = new Outer.InnerStaticClass(); //정적이기 때문에 객체 생성하지않고 클래스 이름으로 바로 접근가능

//      익명 클래스
        Person p1 = new Person() {
            @Override
            public void printInfo() {
                System.out.println("Main.printInfo");
            }
        };


    }

}
