package Figure;

public class square extends figure{
    int len;
    int height;
    public square(int x, int y, int len, int height){
        super(x,y);
        this.len = len;
        this.height = height;
    }

    @Override
    public void make(){
        System.out.println("[사각형그리기]=================");
        System.out.println("좌표값: (" + x + ", " + y + ")");
        System.out.println("길이 : " + len + ", 높이 : " + height );
    }
}
