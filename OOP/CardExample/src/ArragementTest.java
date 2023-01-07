import java.util.Arrays;

public class ArragementTest {
    public static void main (String[] args){
        //배열 선언
        int[] arr1;
        int arr2[];

        String[] str1, str12;
        String str2[], str21;

        //배열 선언 및 초기화
        int[] arr3 = new int[5];
        arr3[0] = 10;
        arr3[1] = 20;
        arr3[2] = 30;
        arr3[3] = 40;
        arr3[4] = 50;

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        System.out.println(arr3[4]);

        System.out.println("=========arr3===========");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        int[] arr4 = {1,2,3,4,5};

        System.out.println("==========arr4==========");
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        int[] arr5 = arr3; //얕은 복사 -> 주소 값을 복사
        arr3[0] = -10; // 같은 주소를 사용하기 때문에 arr5[0]의 값도 같이 바뀌게 된다.
        System.out.println("==========arr3==========");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println("==========arr5==========");
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }

        int[] arr6 = new int[5]; //깊은 복사 -> 실제 값을 새로운 메모리 공간에 복사
        for (int i = 0; i < arr3.length; i++) {
            arr6[i] = arr3[i];
        }
        arr3[0] = -100; //arr6[0]은 다른 메모리 공간을 사용하므로 arr6[0]의 값은 바뀌지 않음
        System.out.println("==========arr3==========");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println("==========arr6==========");
        for (int i = 0; i < arr6.length; i++) {
            System.out.println(arr6[i]);
        }

        //깊은 복사 종류
        int[] arr7 = arr6.clone(); //보편적인 방법
        int[] arr8 = Arrays.copyOf(arr6, arr6.length);
        int[] arr9 = new int[arr6.length];


    }
}
