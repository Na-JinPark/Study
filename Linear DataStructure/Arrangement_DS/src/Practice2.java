// Practice2
// 배열 arr 에서 target 에 해당하는 값의 인덱스를 출력
// 해당 값이 여러 개인 경우 가장 큰 인덱스 출력

// 입출력 예시)
// 배열 arr: 1, 1, 100, 1, 1, 1, 100
// 결과: 6

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 100, 1, 1, 1, 100};
        int target = 100;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target) {
                index = i;
            }
        }

        System.out.println("결과 = " + index);

        //강의

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target) {
                if(i> index){   //이부분은 꼭 안넣어줘도 될꺼가은데?...?
                    index = i;
                }
            }
        }

        if(index >= 0){
            System.out.println(index);
        }

    }
}
