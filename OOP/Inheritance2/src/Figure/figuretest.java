package Figure;

public class figuretest {
    public static void main(String[] args){
        //figure figure1 = new figure() 추상메소드는 객체화 할수 없다.
        triangle triangle1 = new triangle(10,10,100,120);
        triangle1.make();

        square square1 = new square(15,12,200,240);
        square1.make();

        circle circle1 = new circle(25,24,300);
        circle1.make();
        circle1.reset();
        circle1.make();
    }
}
