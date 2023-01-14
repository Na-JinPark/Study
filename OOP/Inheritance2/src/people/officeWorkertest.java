package people;

public class officeWorkertest {
    public static void main(String[] args){
        People man = new People("홍길동", 1111);
        System.out.println("이름 : " + man.name);
        System.out.println("주민번호 : " + man.number);

        System.out.println("==================================");
        staff beststaff = new staff("박하은", 2222, "패스트캠퍼스", 33333);
        People woman = beststaff; //staff를 woman으로 업캐스팅
        System.out.println("이름 : " + woman.name);
        System.out.println("주민번호 : " + woman.number);
        //System.out.println("학교명 : " + woman.schoolName); 오류
        System.out.println("학교명 : " + beststaff.schoolName);
        System.out.println("교번 : " + beststaff.number);

        System.out.println("==================================");
        officeWorker goodworker = new officeWorker("박하영", 4444, "패스트캠퍼스", 55555, "경영지원");
        People goodpeople = goodworker; //officeWorker -> people 업캐스팅
        staff goodstaff = goodworker; //officeWorker -> staff 업캐스팅
        System.out.println("이름 : " + goodpeople.name);
        System.out.println("주민번호 : " + goodpeople.number);
        System.out.println("학교명 : " + goodstaff.schoolName);
        System.out.println("교번 : " + goodstaff.number);
        //System.out.println("부서 : " + goodpeople.department);
        //System.out.println("부서 : " + goodstaff.department);
        System.out.println("부서 : " + goodworker.department);
    }
}
