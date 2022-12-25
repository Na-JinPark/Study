import java.util.*;

public class MiniA6 {
    public static String[] election(String[] name){

        String votename; //투표한 사람 이름
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>(); //후보자별 투표수
        for (int i = 0; i < name.length; i++) {
            map.put(name[i],0);
        }

        int totalvote = 10000; //총 투표수
        Random random = new Random();

        for (int i = 1; i <= totalvote; i++) {

            int result = (random.nextInt(name.length)+1) % name.length; // 배열의 길이가 4라고하면 0,1,2,3 하나씩 나오기때문에 25%로의 확률로 동일한 비율을 가진다.
            votename = name[result];
            map.replace(votename, map.get(votename) + 1); //투표한 사람의 투표수를 +1 해준다.

            System.out.format("[투표진행율]: %05.02f%c, %d명 투표 => %s\n", ((double)i/totalvote)*100f,'%', i, votename);
            map.forEach((key, value) -> System.out.printf("[기호:%d] %s: %05.02f%c, (투표수: %d)\n" , Arrays.asList(name).indexOf(key)+1, key , ((double)value/totalvote)*100f, '%', value));
        }

        List<String> list = new ArrayList<>();
        Integer maxVote = Collections.max(map.values()); // 최대 투표 값 찾기

        for(String key : map.keySet()) {

            if(map.get(key).equals(maxVote)) {
                list.add(key);   // 가장 많은 투표를 받은 사람을 리스트에 넣어준다.
            }
        }
        String[] result = list.toArray(new String[0]);

       return result;
    }
    public static void main(String[] args) {


        String[] name = new String[]{"이재명", "윤석열", "심상정", "안철수"}; //후보자

        do{
            name = election(name);
            if(name.length != 1){  //최고 투표수가 동일한 경우
                for (int i = 0; i < name.length; i++) {
                    System.out.printf("%s 후보자", name[i]);
                    if(i < name.length-1) System.out.print(", ");
                }
                System.out.println("의 투표수가 동일합니다. 재투표를 시작하겠습니다.");
            }else{
                break;
            }
        }while (name.length != 1);

        System.out.println("[투표결과] 당선인: "+name[0]);
    }
}
