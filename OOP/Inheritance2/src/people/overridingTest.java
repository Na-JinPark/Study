package people;

public class overridingTest {
    public static void main(String[] args){
        People man = new People("홍길동", 1111);
        People woman = new People("홍길동", 2222);
        staff manstaff = new staff("이순신", 3333, "패스트캠퍼스", 33333);
        officeWorker officeWorker1 = new officeWorker("강감찬", 4444, "패스트캠퍼스", 44444,"경영지원");

        People[] list = {man, woman,manstaff, officeWorker1};
        for (int i = 0; i < list.length; i++) {
            list[i].information();
        }
    }
}
