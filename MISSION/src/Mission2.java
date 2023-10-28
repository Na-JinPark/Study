import java.util.ArrayList;
import java.util.Scanner;

public class Mission2 {
    public  static class Coordinate {
        int x;
        int y;
        double distance = Double.MAX_VALUE;
        int nearidx;
        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void distance(int x, int y, int idx){
            double distance = Math.sqrt(Math.pow((y - this.y), 2) + Math.pow((x - this.x), 2));
            if(this.distance > distance){
                this.distance = distance;
                this.nearidx = idx;
            }
        }
        public String toString(){
            return "("+ x + "," + y + ")";
        }
    }
    public static boolean chk(ArrayList<Coordinate> list, int x1, int y1){
        for (int j = 0; j < list.size(); j++) {
            if(list.get(j).x == x1 && list.get(j).y == y1){
                System.out.printf("중복 된 좌표값이 존재합니다.\n");
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Coordinate myCoordinate = new Coordinate();
        System.out.println("나의 x,y 좌표 값을 입력해주세요. ex) 1 1");
        myCoordinate.setX(sc.nextInt());
        myCoordinate.setY(sc.nextInt());

        ArrayList<Coordinate> CoordinateList = new ArrayList<Coordinate>();

        int i = 0;
        while(i<10){

            final Coordinate o = new Coordinate();
            System.out.printf("%d번째 임의의 x,y 좌표 값을 입력해주세요. ex) 1 1\n", i + 1);
            o.setX(sc.nextInt());
            o.setY(sc.nextInt());

            if(i != 0 && !chk(CoordinateList, o.x, o.y)) continue;
            CoordinateList.add(o);
            myCoordinate.distance(o.x, o.y, i);

            i++;
        }
        System.out.println(CoordinateList.get(myCoordinate.nearidx));
        System.out.printf("가장 가까운 좌표값은 %s 입니다. \n",CoordinateList.get(myCoordinate.nearidx));

    }
}
