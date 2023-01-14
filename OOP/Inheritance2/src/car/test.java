package car;

import people.People;
import people.staff;

public class test {
    public static void main(String[] args){
       /* Vehicle vehicle1 = new Vehicle();
        vehicle1.name = "차량";
        vehicle1.maxSpeed = 100;
        vehicle1.personnel = 2;
        vehicle1.information();

        System.out.println("==================================");

        Car car1 = new Car();
        car1.name = "차량";
        car1.maxSpeed = 100;
        car1.personnel = 2;
        car1.displacement = "2000cc";
        car1.information();*/

        Car car1 = new Car(200, 4, "20000cc");
        car1.information();

    }
}
