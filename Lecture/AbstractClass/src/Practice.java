// Practice
// 아래 Device 추상 클래스를 이용하여
// UsbPort1 클래스와 WiFi 클래스를 자유롭게 구현해보세요.

abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

// UsbPort1 클래스
class  UsbPort1 extends Device{
    UsbPort1(int id){
        this.deviceId = id;
    }

    void deviceInfo(){
        System.out.println("id = " + this.deviceId);
    }

    void connect(){
        System.out.println("연결 하였습니다.");
    }
    void disconnect(){
        System.out.println("연결이 해제 되었습니다.");
    }
    void send(){
        System.out.println("데이터를 전송합니다.");
    }
    void receive(){
        System.out.println("데이터를 수신합니다.");
    }
    /*void deviceInfo() {
        System.out.println("id = " + this.deviceId);
        System.out.println("연결 하였습니다.");
        System.out.println("연결이 해제 되었습니다.");
        System.out.println("데이터를 전송합니다.");
        System.out.println("데이터를 수신합니다.");
    }*/

}


// WiFi 클래스
class  WiFi extends Device{
    int deviceId;
    WiFi(int deviceId){
        this.deviceId = deviceId;
    }
// 마우스 우클릭 -> Generate -> Override Methods 클릭시 추상 클래스를 한번에 선택하여 작성할 수 있다.
    @Override
    void deviceInfo() {

    }

    @Override
    void connect() {

    }

    @Override
    void disconnect() {

    }

    @Override
    void send() {

    }

    @Override
    void receive() {

    }
}


public class Practice {

    public static void main(String[] args) {
        // Test code
       UsbPort1 usb1 = new UsbPort1(1);
       usb1.deviceInfo();
       WiFi wifi = new WiFi(0);
    }

}
