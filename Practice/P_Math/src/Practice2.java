import java.util.Arrays;

public class Practice2 {
    public static void solution(int[] arr) {
        if(arr == null || arr.length<2){
            return;
        }

        int idx = -1;
        for(int i = arr.length-1; i>=1; i--){   // 일의 자리 숫자에서 왼쪽으로 비교
            if(arr[i] < arr[i-1]){  //왼쪽의 숫자가 크면 왼쪽의 인덱스 저장
                idx = i-1;
                break;
            }
        }

        if(idx == -1){ //숫자가 정렬이 되 있는경우
            System.out.println(Arrays.toString((arr)));
            return;
        }

        for (int i = arr.length-1; i >idx ; i--) {
            if(arr[i]<arr[idx] && arr[i] !=arr[i-1]){  //인덱스의 저장된 값보다 비교하는 수가 더 작고 비교한수와 비교한수의 왼쪽자리수가 같지 않을 경우
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx]= tmp;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {3, 2, 1};
        solution(arr);

        arr = new int[]{1, 9, 4, 7, 6};
        solution(arr);

        arr = new int[]{1, 1, 2, 3};
        solution(arr);
    }
}
