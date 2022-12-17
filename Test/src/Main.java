
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static Map chk(int num, Map max){
        for(int i=num; i>0; i--){
            if(num%i==0){
                if(max.containsKey(i)){
                    max.replace(i, (int)max.get(i)+1);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
int[] A = {6,12,4};
int num = 0;
        Map max = new HashMap();
        List alist = Arrays.stream(A).boxed().collect(Collectors.toList());
        Collections.sort(alist);
        int maxnnum = (int)alist.get(alist.size()-1);
        for(int j=1; j<maxnnum; j++){
            if(maxnnum%j==0) max.put(j,0);
        }
        for(int i=0;i<alist.size()-1;i++){
            max = chk((int)alist.get(i),max);
        }
        num = (int)Collections.max(max.values());
        System.out.println("num = " + num);

    }
}