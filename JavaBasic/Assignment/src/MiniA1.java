public class MiniA1 {
    public static void main(String[] args) {

        System.out.println("[구구단 출력]");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9 ; j++) {

                //string.format사용
                /*String result = String.format("%02d x %02d = %02d", j, i, j*i);
                System.out.print(result + "    ");*/

                //format사용
                System.out.format("%02d x %02d = %02d    ", j, i, j*i);
            }
            System.out.println();
        }
    }
}
