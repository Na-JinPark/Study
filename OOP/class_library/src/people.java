import java.sql.SQLOutput;

public class people {
    private String name;
    private int age;

    public people(String name, int age){
        this.name = name;
        this.age = age;
    }

    //클래스는 extends Object를 쓰지않아도 기본적으로 Object를 상속 받고 있기 때문에 toString()을 오버라이딩 할 수 있다.
    @Override
    public String toString() {
       return "이름: " + name + ", 나이: " + age;
    }
}
