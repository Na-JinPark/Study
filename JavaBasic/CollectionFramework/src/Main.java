// Java 프로그래밍 - 컬렉션 프레임워크
// 여러 데이터를 편리하게 관리할수 있게 만들어 놓은 것
// 대표 인터페이스 -> List, Set, Map

import java.util.*;

public class Main {

    public static void main(String[] args) {

//      1. List  순서가 있는 데이터의 집합, 데이터 중복허용
//        1-1. ArrayList
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1);
        list1.remove(Integer.valueOf(2));
        System.out.println("list1 = " + list1);
        list1.add(0, 10);
        System.out.println("list1 = " + list1);
        System.out.println("list1.size() = " + list1.size());
        System.out.println("list1.contains(1) = " + list1.contains(1));
        System.out.println("list1.indexOf(10) = " + list1.indexOf(10));

//      1-2. LinkedList
        System.out.println("== LinkedList ==");

        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list2 = " + list2);
        list2.addFirst(10);
        list2.addLast(20);
        System.out.println("list2 = " + list2);
        list2.remove(Integer.valueOf(1));
        System.out.println("list2 = " + list2);
        list2.removeFirst();
        list2.removeLast();
        System.out.println("list2 = " + list2);
        System.out.println(list2.size());

//      2. Set  순서가 없는 데이터의 집합, 중복이 허용되지않음
//      2-1. HashSet
        System.out.println("== HashSet ==");

        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(1);//값으로 데이터를 지울수있다.
        System.out.println("set1 = " + set1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1); //중복된 값을 추가해도 원래 데이터만 출력
        System.out.println(set1.size());
        System.out.println(set1.contains(2));

//      2-2. TreeSet
        System.out.println("== TreeSet ==");

        TreeSet set2 = new TreeSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("set2 = " + set2);
        set1.remove(2); //값으로 삭제
        System.out.println("set2 = " + set2);
        set2.clear(); //전체데이터 삭제
        System.out.println("set2 = " + set2);
        set2.add(10);
        set2.add(5);
        set2.add(15);
        set2.add(15);
        System.out.println("set2 = " + set2);
        System.out.println(set2.first());
        System.out.println(set2.last());
        System.out.println(set2.lower(10)); //10보다 작은 값만 출력가능
        System.out.println(set2.higher(10)); //10보다 큰 값만 출력가능

//      3. Map  키와 값의 쌍으로 이루어진 데이터 집합, 순서를 유지하지 않음
//      3-1. HashMap
        System.out.println("== HashMap ==");
        HashMap map1 = new HashMap();
        map1.put(1, "kiwi");
        map1.put(2, "apple");
        map1.put(3, "mango");
        System.out.println("map1 = " + map1);

        map1.remove(2);
        System.out.println("map1 = " + map1);
        System.out.println("map1.get(1) = " + map1.get(1));


//      3-2. TreeMap
        System.out.println("== TreeMap ==");

        TreeMap map2 = new TreeMap();
        map2.put(10,"kiwi");
        map2.put(5,"apple");
        map2.put(15,"mango");
        System.out.println("map2 = " + map2);

        System.out.println(map2.firstEntry()); //첫번째 데이터
        System.out.println(map2.firstKey());  //첫번째 키값
        System.out.println(map2.lastEntry());
        System.out.println(map2.lastKey());
        System.out.println(map2.lowerEntry(10));
        System.out.println(map2.higherEntry(10));


    }
}
