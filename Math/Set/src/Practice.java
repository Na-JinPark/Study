// Practice
// ArrayList를 사용한 집합 구현 실습 (집합 관련 연산 사용 X)

import java.util.ArrayList;

class MySet {
    // ArrayList
    ArrayList<Integer> list;

    // 생성자1
    MySet() {
        this.list = new ArrayList<Integer>();
    }

    // 생성자 2
    MySet(int[] arr) {
        this.list = new ArrayList<Integer>();

        for (int item : arr) {
            this.list.add(item);
        }
    }

    // 원소 추가 (중복 X)
    public void add(int x) {
        for (int item : this.list) {  //list의 데이터들을 하나씩 가져온다
            if (item == x) {     //리스트의 데이터와 입력받은 x가 같으면 return
                return;
            }
        }
        this.list.add(x);   //다르면 list에 입력받은 값 넣어주기
    }


    // 교집합
    public MySet retainAll(MySet b) {
        MySet result = new MySet();

        for (int itemA : this.list) {
            for (int itemB : b.list) {
                if (itemA == itemB) {  //list A와 B를 하나씩 비교해서 같으면 result 데이터 넣어주기
                    result.add(itemA);
                }
            }
        }
        return result;
    }

    // 합집합
    public MySet addAll(MySet b) {
        MySet result = new MySet();

        for(int itemA: this.list){
            result.add(itemA);
        }

        for(int itemB:b.list){
            result.add(itemB);
        }

        return result;
    }

    // 차집합
    public  MySet removeAll(MySet b){
        MySet result = new MySet();

        for(int itemA: this.list){
            boolean containFlag = false;

            for(int itemB:b.list){
                if(itemA == itemB) {
                    containFlag = true;
                    break;
                }
            }

            if(!containFlag){
                result.add(itemA);
            }
        }
        return  result;  //a-b를 뺀 a집합들 결과
    }
}



public class Practice {
    public static void main(String[] args) {

//      Test code
        MySet a = new MySet();

        a.add(1);
        a.add(1);
        a.add(1);
        System.out.println(a.list);
        a.add(2);
        a.add(3);
        System.out.println(a.list);
        a = new MySet(new int[]{1, 2, 3, 4, 5});
        MySet b = new MySet(new int[]{2, 4, 6, 8, 10});
        System.out.println("a: " + a.list);
        System.out.println("b: " + b.list);
        MySet result = a.retainAll(b);
        System.out.println("교집합: " + result.list);
        result = a.addAll(b);
        System.out.println("합집합: " + result.list);
        result = a.removeAll(b);
        System.out.println("차집합: " + result.list);
    }
}
