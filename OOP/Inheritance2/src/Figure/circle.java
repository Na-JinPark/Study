package Figure;

public class circle extends figure {
    int radius;
    public circle(int x, int y, int radius){
        super(x,y);
        this.radius = radius;
    }
    public void reset(){
        x = 0;
        y = 0;
        radius = 0;
    }
    @Override
    public void make(){
        System.out.println("[원그리기]=================");
        System.out.println("좌표값: (" + x + ", " + y + ")");
        System.out.println("반지름 : " + radius );
    }
}
