// 선형 자료구조 - 스택

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek()); //스택의 가장 마지막 부분 데이터를 가져온다
        System.out.println(stack);

        System.out.println(stack.contains(1));
        System.out.println(stack.size());
        System.out.println(stack.empty());

        stack.clear(); //스택에 있는 데이터 지우기
        System.out.println(stack);
        //stack.pop(); //스택의 데이터가 비워져잇기때문에 오류가 난다.

    }

}
