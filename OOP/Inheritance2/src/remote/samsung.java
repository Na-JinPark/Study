package remote;

public class samsung implements remote{
    public void music(){
        System.out.println("음악을 들려줍니다.");
    }

    @Override
    public void on() {
        System.out.println("삼성TV의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("삼성TV의 전원을 끕니다.");
    }
}
