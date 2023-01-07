public class Cola {
    //클래스 변수의 초기화

    //명시적 초기화
    private static int Volume = 20;
    private int ManufactureDate = 10;

    static{
        System.out.println("클래스 초기화 블럭");
        Volume = 40;
        System.out.println("용량 = " + Volume);
        //ManufactureDate = 50; 정적으로 선언 되어 있지 않기 때문에 사용 불가
    }

    {
        System.out.println("인스턴스 초기화 블럭");
        ManufactureDate = 50;
        Volume = 50;

        System.out.println("용량 = " + Volume);
        System.out.println("제조일자 = " + ManufactureDate);
    }

    public Cola() {
        System.out.println("생성자 호출");

        this.ManufactureDate = 60;
        this.Volume = 60;

        System.out.println("용량 = " + Volume);
        System.out.println("제조일자 = " + ManufactureDate);
    }
}
