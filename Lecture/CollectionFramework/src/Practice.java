// Practice
// 로또 번호 만들기

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {

        HashSet set = new HashSet();

        for (int i = 0; set.size() <6; i++) {
            int num = (int)(Math.random() * 45)+1; //random함수를 이용하여 0~44까지의 무작위 숫자를 추출
            set.add(num); //HashSet을 사용하여 중복된 값은 제외, set.size()<6 이기때문에 6개의 숫자만 더해진다.
        }

        LinkedList list = new LinkedList(set);
        Collections.sort(list); //For문으로 넣어준 set의 6개의 숫자는 정렬이 되어 있지 않기 떄문에 정렬을 위해 사용
        System.out.println("로또번호 = " + list);

    }
}
