// Practice1
// ArrayList 를 이용한 스택 구현

import java.util.ArrayList;

class MyStack1 {
    ArrayList list;

    MyStack1() {
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
        if(this.list.size() == 0){  //리스트 크기가 0인경우 데이터 존재 x -> true 반환
            return true;
        } else {
            return  false;
        }
    }

    public void push(int data) {
        this.list.add(data);    // 리스트에 순서대로 데이터 추가
    }

    public Integer pop() {

        if(isEmpty()){  //데이터가 존재하는지 확인
            System.out.println("Stack is empty!");
            return null;
        }

        int data = (int)this.list.get(this.list.size()-1); //리스트 끝값을 가져오기
        this.list.remove(this.list.size()-1); // 리스트 가장 끝 인덱스를 사용해 데이터 제거
        return data;
    }

    public Integer peek() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }

        int data = (int)this.list.get(this.list.size()-1);
        return data;
    }

    public void printStack() {
        System.out.println(this.list);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        // Test code
        MyStack1 myStack = new MyStack1();
        System.out.println(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.printStack();               // 1, 2, 3, 4, 5

        System.out.println(myStack.peek()); // 5
        myStack.printStack();               // 1, 2, 3, 4, 5

        System.out.println(myStack.pop());  // 5
        System.out.println(myStack.pop());  // 4
        myStack.printStack();               // 1, 2, 3

        System.out.println(myStack.pop());  // 3
        System.out.println(myStack.pop());  // 2
        System.out.println(myStack.pop());  // 1
        myStack.printStack();
    }
}
