import java.io.*;

public class File_Input_Output {
    public static void main(String[] args) throws IOException {
//      1. 파일 쓰기
//      FileWriter
        FileWriter fw = new FileWriter("./Lecture/Input_Output/memo.txt");// 현재 폴더(./)에 memo텍스트 파일 생성
        String memo = "헤드 라인\n";
        fw.write(memo);
        memo = "1월 1일 날씨 맑음\n";
        fw.write(memo);
        fw.close();//파일 생성후 항상 close로 닫아주어야한다.


//      PrintWriter
        PrintWriter pw = new PrintWriter("./Lecture/Input_Output/memo.txt");
        memo = "헤드 라인2";
        pw.println(memo); //PrintWriter은 엔터가 포함되잇기 때문에 내용에 \n하지 않아도 된다

        memo = "1월 1일 날씨 맑음2";
        pw.println(memo);

        pw.close();

//      파일 이어 쓰기

        FileWriter fw2 = new FileWriter("./Lecture/Input_Output/memo.txt", true);
        memo = "1월 2일 날씨 완전 맑음\n";
        fw2.write(memo);
        fw2.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("./Lecture/Input_Output/memo.txt", true));
        memo = "1월 3일 날씨 또 맑음\n";
        pw2.write(memo);
        pw2.close();

//      2. 파일 입력

        BufferedReader br = new BufferedReader(new FileReader("./Lecture/Input_Output/memo.txt"));

        while(true)
        {
            String line = br.readLine();//파일을 한줄씩 읽어오는 것
            if(line == null){
                break;
            }
            System.out.println(line);
        }
        br.close();

    }
}
