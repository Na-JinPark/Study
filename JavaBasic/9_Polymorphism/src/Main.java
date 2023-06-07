// Java 프로그래밍 - 다형성( 한 객체가 여러가지 타입을 가질 수 있는 것)

class Person {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student extends Person {
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {
    public void print() {
        System.out.println("CollegeStudent.print");
    }
}


public class Main {

    public static void main(String[] args) {

//      1. 다형성
        System.out.println("== 다형성 ==");
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student();
        //Student s2 = new Person(); 부모로 자식 객체를 만드는 것은 안된다.
        p1.print();
        s1.print();
        s1.print2();
        p2.print();
        //p2.print2(); 객체가 자식일지라도 Person에는 print2()가 없기 때문에 출력할수 없다.

        Person p3 = new CollegeStudent();
        p3.print();
        // CollegeStudent c1 = new Student(); 같은 부모를 상속하엿어도 자식 클래스 끼리는 다형성 성립을 할 수 없다.


//      2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); // 업캐스팅(자식 클래스의 객체가 부모 클래스의 타입으로 형변환 하는 것)

        pp1 = pp2;
        pp1 = ss2;
        ss1 = ss2;
        //ss1 = pp2;
        ss1 = (Student) pp3; //다운캐스팅(업캐스팅 됫던 것을 자신의 클래쪽으로 타입 변환 해주는 것)

        /*CollegeStudent cc1;
        CollegeStudent cc2 = new CollegeStudent();
        ss1 = (Student) cc2;
        cc1 = (Student) ss2;*/


//      3. instanceof
        System.out.println("== instanceof ==");
        Person pe1 = new Person();
        Student st1 = new Student();
        Person pe2 = new Student();
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person);
        System.out.println(pe1 instanceof Student);

        System.out.println(st1 instanceof Student);
        System.out.println(st1 instanceof Person);

        System.out.println(pe2 instanceof Person);
        System.out.println(pe2 instanceof Student);

        System.out.println(pe3 instanceof Person);
        System.out.println(pe3 instanceof CollegeStudent);

        if(pe1 instanceof  Student){
            Student stu1 = (Student)  pe1;
        }
        if(st1 instanceof  Person){
            Person per1 = (Person)st1;
        }

    }
}
