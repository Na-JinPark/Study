package people;

public class intanceofTest {
    public static void main(String[] args){
        People man = new People("홍길동", 1111);
        staff manstaff = new staff("박하은", 2222, "패스트캠퍼스", 33333);

        //남자 -> 사람
        //남자교직원 -> 교직원, 사람
        System.out.println("man instanceof People : " + (man instanceof People));
        System.out.println("man instanceof staff : " + (man instanceof staff));
        System.out.println("manstaff instanceof People : " + (manstaff instanceof People));
        System.out.println("manstaff instanceof staff : " + (manstaff instanceof staff));
    }
}
