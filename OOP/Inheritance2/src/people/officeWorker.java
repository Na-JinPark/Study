package people;

public class officeWorker extends staff {
    public String department;

    public officeWorker(String name, long number, String schoolName, long staffnumber, String department){
        super(name, number, schoolName, staffnumber);
        this.department = department;
    }

    @Override
    public void information(){
        System.out.println("=======================");
        System.out.println("이름 : " + name );
        System.out.println("주민번호 : " + getnumber() );
        System.out.println("학교명 : " + schoolName );
        System.out.println("교번 : " + number );
        System.out.println("부서 : " + department );
    }
}
