package people;

public class staff extends People{
    public String schoolName;
    public long number;//사원번호(학교의 교직원번호)
    public staff(){}
    public staff(String name, long number, String schoolName, long staffnumber){
        super(name, number);
        this.schoolName = schoolName;
        this.number = staffnumber;
    }

    public long getNumber(){
        return number;
    }
    @Override
    public void information(){
        System.out.println("=======================");
        System.out.println("이름 : " + name );
        System.out.println("주민번호 : " + super.number );
        System.out.println("학교명 : " + schoolName );
        System.out.println("교번 : " + number );
    }
}
