package Figure;

public abstract class figure { //추상메소드가 하나라도 포함하면 추상클래스가 됭어ㅑ한다.

    protected int x;
    protected int y;

    public figure(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void reset(){
        x = 0;
        y = 0;
    }
    public abstract void make();

}
