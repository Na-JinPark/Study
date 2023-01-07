package exam01;

public class collegeStudent {
    public String name;
    public int age;
    public String gender;
    public String department;

    //생성자 오버로딩
    public collegeStudent(){}
    public collegeStudent(String name){
        this.name = name;
    }
    public collegeStudent(int age){
        this.age = age;
    }
    public collegeStudent(String name, int age){
        this(name); //바로 위에 이름 생성자 호출
        //this생성자는 한번만 쓸수 있다.
        //this(age) 함께 사용 불가
        this.age = age;
    }
    public collegeStudent(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public collegeStudent(String name, int age, String gender, String department){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
    }

    //매게변수 타입이 같은 경우 같은 생성자로 인식하기 때문에 중복오류 발생
    public collegeStudent(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    /*public exam01.collegeStudent(String name, String department){
        this.name = name;
        this.department = department;
    }*/
}
