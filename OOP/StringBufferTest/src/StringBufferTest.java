public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        /*sb.append("홍길동");
        sb.append(System.lineSeparator()); //줄바꿈
        sb.append("학생");
        sb.append(System.lineSeparator());
        sb.append(20);*/
        sb.append("홍길동")
          .append(System.lineSeparator()) //줄바꿈
          .append("학생")
          .append(System.lineSeparator())
          .append(20);
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("홍길동")
                .append(System.lineSeparator()) //줄바꿈
                .append("학생")
                .append(System.lineSeparator())
                .append(20);
        System.out.println(sb2);

        //StringBuffer은 멀티쓰레딩에서 많이 사용 그외에는 StringBuilder사용
        //StringBuffer은 append에 synchronized(동기화)로사용
        //사용자가 append사용시 lock이 걸리고 다른 사용자는 사용 불가

        String name = "홍길동";
        String dept = "학생";
        int age = 20;

        StringBuilder sb3 = new StringBuilder();
        /*sb3.append("이름: " + name)
                .append(System.lineSeparator()) //줄바꿈
                .append("학생: "+ dept)
                .append(System.lineSeparator())
                .append("나이: " + age);*/
        sb3.append(String.format("이름: %s", name))
                .append(System.lineSeparator()) //줄바꿈
                .append(String.format("직업: %s", dept))
                .append(System.lineSeparator())
                .append(String.format("나이: %d", age));
        System.out.println(sb3);

        //.net 에는 sb2.appendLine(), sb2.appendForamt() 존재한다
        //sb3.appendLine("이름: " + name) ==append(System.lineSeparator()) 와 같은 것
        // sb3.append(String.format("이름: %s", name)) ==  sb2.appendForamt()와 같은 것
        System.out.print(age);
        System.out.println(age);

        //appendLine, appendForamt구현
        StringPlus sp = new StringPlus();
        //sp.append(String.format("이름: %s", name));
        sp.appendFormat("이름 : %s", name)
          .line()
          .appendFormat("직업: %s", dept)
          .line()
          .appendFormat("나이: %d", age)
          .appendLine("끝");
        System.out.println(sp.toString());
    }
}
