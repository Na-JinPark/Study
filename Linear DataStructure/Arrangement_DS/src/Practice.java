// Practice
// 기본 배열 자료형을 이용한 배열의 생성, 삽입, 삭제 기능 구현

import java.util.Arrays;

class MyArray {

    int[] arr;

//  배열의 초기 사이즈 설정

    MyArray(int size){
        this.arr = new int[size];
    }

//  배열에 데이터 삽입

    public void insertData(int index, int data){
        if(index<0 || index > this.arr.length){
            System.out.println("Index Error");
            return;
        }

        int[] arrDup = this.arr.clone();// 기존 배열을 arrDup 복제
        this.arr = new int[this.arr.length+1]; // 데이터를 삽입하기 때문에 기존 배열의 길이를 1 증가

        for (int i = 0; i < index; i++) { //기존 배열의 데이터를 다시 할당
            this.arr[i] = arrDup[i];
        }
        for (int i = index+1; i<this.arr.length  ; i++) {  // 데이터를 추가하려는 위치 다음부터 끝 인덱스 까지 기존 데이터를 할당
            this.arr[i] = arrDup[i-1];
        }
        this.arr[index] = data; // 추가하려는 위치에 데이터를 할당
    }


//  배열에서 특정 데이터 삭제
    public  void removeData(int data){
        int targetIndex = -1;

        for (int i = 0; i < this.arr.length; i++) {  //삭제하려고 하는 데이터가 기존 배열에 존재하는지 찾기
            if(this.arr[i]==data){
                targetIndex =i;   // 배열에 삭제하려고 하는 데이터가 존재하는 경우 해당 데이터 위치 저장
                break;
            }
        }

        if(targetIndex == -1){
            System.out.println("해당 데이터가 없습니다.");
        }else{
            int[] arrDup = this.arr.clone();   //기존데이터 백업
            this.arr = new int[this.arr.length -1];  //배열 크기 1감소

            for (int i = 0; i < targetIndex; i++) {  // 지울려고하는 인덱스 위치 전까지 기존 데이터 할당
                this.arr[i] = arrDup[i];
            }
            for (int i = targetIndex; i < this.arr.length ; i++) { // 지울려고 하는 인덱스 위치 다음부터 배열의 끝까지 기존 데이터 할당
                this.arr[i] = arrDup[i+1];
            }
        }
    }
}

public class Practice {
    public static void main(String[] args) {

//      Test code
        int size = 5;
        MyArray myArray = new MyArray(size);

        for (int i = 0; i < size; i++) {
            myArray.arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArray.arr));   // [1, 2, 3, 4, 5]

        myArray.arr[0] = 10;
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 3, 4, 5]

        myArray.insertData(2, 20);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 4, 5]

        myArray.insertData(6, 60);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 4, 5, 60]

        myArray.insertData(-1, 0);  // Index Error

        myArray.removeData(4);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 5, 60]

        myArray.removeData(5);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 60]

        myArray.removeData(99); // 해당 데이터가 없습니다.
    }
}
