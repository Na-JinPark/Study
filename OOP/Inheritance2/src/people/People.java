package people;

public class People {
    public String name;
    public long number; //주민번호
    public People(){};
    public People(String name, long number){
        this.name = name;
        this.number = number;
    }

    public long getnumber(){
        return number;
    }

    public void information(){
        System.out.println("=======================");
        System.out.println("이름 : " + name );
        System.out.println("주민번호 : " + number );
    }
}
