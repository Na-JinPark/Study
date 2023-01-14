package people;

public class downCastingtest {
    public static void main(String[] args){
        People man = new People("홍길동", 1111);
        System.out.println("이름 : " + man.name);
        System.out.println("주민번호 : " + man.number);

        //staff staff1 = man; 컴파일 오류-> 다운 캐스팅을 할 대는 명시적으로 혀변환할 하위 클래스를 지정해주어야한다.
        //staff staff1 = (staff) man;
        //System.out.println("학교명 : " + ((staff) man).schoolName); 오류 -> man은 본질은 people이기 때문에 schoolname을 가지고 있지않다.

        System.out.println("=================================");
        staff manstaff = new staff("홍길동", 1111, "패스트캠퍼스", 2222);
        System.out.println("이름 : " + manstaff.name);
        //System.out.println("주민번호 : " + manstaff.getnumber());
        System.out.println("주민번호 : " + ((People)manstaff).number); //업캐스팅 people의 주민번호를 가지고온다
        System.out.println("학교명 : " + manstaff.schoolName);
        System.out.println("교번 : " + manstaff.number);

        System.out.println("=================================");
        People manpeople = manstaff;
        System.out.println("이름 : " + manpeople.name);
        System.out.println("주민번호 : " + manpeople.number);

        System.out.println("=================================");
        staff manstaff2 = (staff)manpeople;
        System.out.println("이름 : " + manstaff2.name);
        System.out.println("주민번호 : " + ((People)manstaff2).number);
        System.out.println("학교명 : " + manstaff2.schoolName);
        System.out.println("교번 : " + manstaff2.number);
    }
}
