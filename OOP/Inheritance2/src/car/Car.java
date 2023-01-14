package car;

public class Car extends Vehicle{
    //상속하고 있는 차량의 생성자를 먼저 호출하고 자동차의 생성자를 호출
    public String name = "자동차";
    public String displacement;
    public Car(){ //자동차의 기본생성자
    }
    public Car(double maxSpeed, int personnel, String displacement){ //자동차의 사용자지정 생성자
        super(maxSpeed, personnel);
        /*super.maxSpeed = maxSpeed;
        super.personnel = personnel;*/
        this.displacement = displacement;
    }
    public void information(){
        System.out.println("(차량)이름 : " + super.name);
        System.out.println("최대속도 : " + maxSpeed);
        System.out.println("정원 : " + personnel);

        System.out.println("배기량 : " + displacement);
        System.out.println("(자동차)이름 : " + name);
    }
}
