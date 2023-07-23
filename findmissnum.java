
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  findmissnum{
    public static void main(String[] args) {
      
        int[] arr1 = {1, 2, 3, 5, 6, 8, 10, 11, 14};
        //any input numbers can be given 
        System.out.println("Missing numbers in the given Array are : " + MissingNumFind(arr1));
    }

    public static String MissingNumFind(int[] arr) {
        Arrays.sort(arr);

        List<Integer> missingNumbersArray = new ArrayList<>();
        int min = arr[0];
        int max = arr[arr.length - 1];

        for (int i = min + 1; i < max; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNumbersArray.add(i);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < missingNumbersArray.size(); i++) {
            result.append(missingNumbersArray.get(i));
            if (i < missingNumbersArray.size() - 1) {
                result.append(", ");
            }
        }

        return result.toString();
        //converting the result into the string
    }
}
