package fruit;

import people.People;

public class fruittest {
    public static void fruitcheck(fruit fruitcheck){
        if(fruitcheck instanceof  banana) {
            System.out.println("바나나 입니다.");
        } else if(fruitcheck instanceof  pear){
            System.out.println("배 입니다.");
        } else if(fruitcheck instanceof apple){
            System.out.println("사과 입니다.");
        } else {
            System.out.println("바나나, 배, 사과 가 아닙니다.");
        }
    }
    public static void main(String[] args){
        fruit fruit1 = new fruit();
        fruit fruit2 = new banana();//업캐스팅
        fruit fruit3 = new pear();
        fruit fruit4 = new apple();

        fruit[] fruitlist = {fruit1, fruit2, fruit3, fruit4};

        for(int i = 0; i<fruitlist.length; i++){
            fruitcheck(fruitlist[i]);
        }

        /*fruitcheck(fruit1);
        fruitcheck(fruit2);
        fruitcheck(fruit3);
        fruitcheck(fruit4);*/

        fish fish1 = new fish();
        /*if(fish1 instanceof  fruit) { fish와 fruit는 상속관계가 아니기때문에 오류, instanceof는 상속관계가 잇을경우에만 사용가능
            System.out.println("과일 입니다.");
        } else {
            System.out.println("과일이 아닙니다.");
        }*/


    }
}
