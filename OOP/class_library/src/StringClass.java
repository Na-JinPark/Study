public class StringClass {
    public static void p(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args) {
        String url = "https://FastCampus.co.kr/";

        final String FS = "https://fastcampus.co.kr/";

        //length()
        int length = url.length();
        System.out.println("문자열길이 : " + length);;

        p("----------------------------------");
        //charAt() 문자열을 하나씩 문자로 가져오는 것
        for (int i = 0; i < url.length(); i++) {
            System.out.println(url.charAt(i));
        }

        p("----------------------------------");
        //toCharArray() 문자열을 배열로 가져오는 것
        for(char c1 : url.toCharArray()){
            p(c1);
        }

        //contains 문자열에 해당 문자가 포함되는 건지 결과를 true, false로 반환, 소대문자 구분
        p(url.contains("http"));

        //indexOf 문자열이 시작되는 위치, 0보다 크면 해당 문자가 문자열에 포함하고 있다는 의미 -> 포함여부를 찾을때 indexOf 많이 사용
        p(url.indexOf("."));

        //lastIndexOf 뒤에서 부터 문자열을 찾아 위치 반환
        p(url.lastIndexOf("."));

        //toLowerCase() 문자열을 소문자로 변환
        p(url.toLowerCase());

        //toUppercase() 문자열을 대문자로 면환
        p(url.toUpperCase());

        //trim() 문자열의 공백 제거
        String url1 = "https://FastCampus.co.kr/        ";
        p("[" + url1 + "]");
        p("[" + url1.trim() + "]");

        //eauals() 대소문자 구분
        p(url.equals(FS));

        //equalsIgnoreCase() 대소문자 구분 안함
        p(url.equalsIgnoreCase(FS));

        String url2 = "http://www.naver.com/news/tv/sbs";
        //news, tv, sbs
        //분류, 매채, 방송국
        //new, radio, kbs

        p(url2);
        //replace(), replaceAll() 문자열의 "http://www.naver.com/"부분을 ""으로 변환
        p(url2.replace("http://www.naver.com/",""));

        //split() /를 기준으로 분리
        String[] url2List = url2.replace("http://www.naver.com/","").split("/");
        for(String u: url2List){
            p(u);
        }
        p("분류 : " + url2List[0]);
        p("매체 : " + url2List[1]);
        p("방송국 : " + url2List[2]);

        //concat() 문자를 더해주는 것
        p(url2.concat("/index.html"));
        p(url2 + "/index.html");

        //subString() 지정한 위치의 문자만 가져오는 것
        p(url);
        p(url.substring(8));
        p(url.substring(8,18));

        //valueOf() 문자 -> 숫자 , 숫자-> 문자로 변환
        String v1 = String.valueOf(12);
        int n1 = Integer.valueOf((v1));
        String v3 = 12 + ""; //숫자와 문자를 더하면 문자로 바뀐다.

        //compareTo() 문자 비교, 사전 기준으로 어떤게 앞에 있는지 비교 앞에잇으면 음수 뒤에 잇으면 양수 반환
        String st1 = "홍길동";
        String st2 = "이순신";
        p(st1.compareTo(st2)); //홍길동이 뒤에 잇으므로 양수
        p(st2.compareTo(st1));
        p(st2.compareTo(st2));//같으면 0

        //
        String name = "홍길동";
        int age = 24;
        double weight = 80.111112D;

        System.out.println("이름 : "+name + ", 나이 : " + age + ", 몸무게 : " + weight);
        String display = String.format("이름 %s, 나이: %d, 몸무게: %.2f", name, age, weight);
        System.out.println(display);



    }
}
