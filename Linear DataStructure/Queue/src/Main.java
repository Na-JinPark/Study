// 선형 자료구조 - 큐


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
         Queue queue = new LinkedList();


        /* Queue queue = new Queue 이렇게 써도 되지만 Quere가 인터페이스 방식으로 구현이 되어있어
           추상메소드들을 오버라이드해줘서 써줘야한다.
           그래서 큐에 필요한 연산들이 다 구현되있는 LinkedList를 ㅇㅣ용해 큐를 사용한다.*/

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        System.out.println(queue.poll()); //데이터 꺼내기
        System.out.println(queue);

        System.out.println(queue.poll()); //데이터 꺼내기
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.contains((3)));
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

        queue.clear();
        System.out.println(queue);
        System.out.println(queue.poll());
        // 큐에 데이터가 없을때 poll실행시 null값 반환

    }
}
