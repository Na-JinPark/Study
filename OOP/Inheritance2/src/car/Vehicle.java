package car;

public class Vehicle {
    public String name = "차량";
    public double maxSpeed;
    public int personnel;
    public Vehicle(){
        System.out.println("");
    } //차량의 ㄱㅣ본생성자
    public Vehicle(double maxSpeed, int personnel){ //차량의 사용자지정 생성자
        this.maxSpeed = maxSpeed;
        this.personnel = personnel;
    }
    public void information(){
        System.out.println("이름 : " + name);
        System.out.println("최대속도 : " + maxSpeed);
        System.out.println("정원 : " + personnel);
    }
}
