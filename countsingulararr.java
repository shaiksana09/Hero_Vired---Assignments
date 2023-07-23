
import java.util.HashMap;
import java.util.Map;

public class countsingulararr {

    public static void main(String[] args) {
        int[] arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        //any input can be given 
        int countofSingularsocks = countSingularSocks(arrNum);
        System.out.println("The total count of singular socks = " + countofSingularsocks);
    }

    public static int countSingularSocks(int[] arrNum) {
        Map<Integer, Integer> socksCount = new HashMap<>();

        for (int sock : arrNum) {
            socksCount.put(sock, socksCount.getOrDefault(sock, 0) + 1);
        }

        int countofSingularsocks = 0;

        for (int count : socksCount.values()) {
            //counting the singular socks
            if (count % 2 != 0) {
                countofSingularsocks++;
            }
        }

        return countofSingularsocks;
    }
}
