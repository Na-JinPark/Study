import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int test (int n, int depth, int[][] blocks,int answer){
        if(depth<0) return answer;
        else{
            int chk = Integer.MAX_VALUE;
            int lo = 0;
            for(int i = 0 ; i<blocks[depth].length; i++){
                int num = Math.abs((n-i))-1>0 ? blocks[depth][i] + Math.abs((n-i))-1 : blocks[depth][i];
                if(num<chk){
                    chk = num;
                    lo=i;
                }
            }
            answer += chk;
            return  test(lo, depth+1, blocks, answer);
        }
    }
    public void test1 (String a){
        String test = a;
    }
    public static void main(String[] args) {
        int[][] blocks = {{5, 6, 2, 6}, {1, 6, 4, 9}, {5, 6, 9, 4}, {55, 14, 21, 14}};
        int depth = 3;
        int n = 3;
        int answer = 0;
        test(0, 0, blocks, blocks[depth][n]);


    }

}

// 3, 4, 5
// 4, 6, 5
// 8, 1, 0

//3,4,5  3
//0,4,5  2
//9,9,9  3
//    1  1