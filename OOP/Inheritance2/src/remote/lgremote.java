package remote;

public class lgremote implements remote, phone{

    @Override
    public void on() {
        System.out.println("엘지TV의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("엘지TV의 전원을 끕니다.");
    }
    @Override
    public void call() {
        System.out.println("전화를 받습니다.");
    }

}
