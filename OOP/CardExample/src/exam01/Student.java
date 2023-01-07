package exam01;

public class Student {
    public String name;
    //기본생성자는 기본적으로 제공 되어 지지만
    //사용자 정의 생성자 존재시 기본 생성자는 제공 되어지지 않는다.
    //기본생성자를 직접 구현하면 두가지 동시에 사용할 수 있다.
    public Student (){ //기본생성자
        System.out.println("기본생성자");
    }

    public Student (String name){ //사용자 정의 생성자
        System.out.println("사용자 정의 생성자");
        this.name = name;
    }
}
