// Practice6
// 배열 arr 에서 중복 값을 제거한 새 배열을 만드시오.

// 입출력 예시)
// arr: 1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5
// 결과: 1, 5, 3, 2, 4

import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
        int[] result = new int[arr.length];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i==0) {
                result[i] = arr[i];
                cnt++;
            }
            else {
                boolean chk = true;
                for(int item:result){
                    if(item == arr[i]) chk = false;
                }
                if(chk) {
                    result[cnt]=arr[i];
                    cnt++;
                }
            }
        }
        System.out.println(Arrays.toString(result));

        // 강의

        int[] arrResult = new int[arr.length];
        cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean chk = false;
            for (int j = 0; j < cnt; j++) {
                if(arr[i] == arrResult[j]){
                    chk = true;
                }
            }
            if(chk==false) {
                arrResult[cnt++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arrResult));
    }
}
