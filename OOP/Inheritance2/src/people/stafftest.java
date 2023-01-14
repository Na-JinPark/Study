package people;

public class stafftest {
    public static void main(String[] args){
        staff staff1 = new staff("김사랑", 1111, "패스트캠퍼스", 2222);
        System.out.println("이름 : " + staff1.name);
        //System.out.println("주민번호 : " + staff1.number); staff클래스의 number 즉 교번이 출력된다.
        System.out.println("주민번호 : " + staff1.getnumber());
        System.out.println("학교명 : " + staff1.schoolName);
        System.out.println("교번 : " + staff1.number);
        //System.out.println("교번 : " + staff1.getNumber());

        System.out.println("================================");
        People people1 = staff1; //업캐스팅 -> 자식클래스로 부모클래스에 대힙하는 경우
        System.out.println(people1.name);
        System.out.println(people1.number);
    }
}
