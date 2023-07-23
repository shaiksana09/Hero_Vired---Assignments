import java.util.*;
public class javadequeue {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();

            deque.add(input);
            set.add(input);

            if (deque.size() == m) {
                if (set.size() > max)
                    max = set.size();

                int first = (int) deque.remove();
                if (!deque.contains(first))
                    set.remove(first);
            }
        }
        System.out.println(max);
    }
}   
        


