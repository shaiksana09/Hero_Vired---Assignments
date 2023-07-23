import java.util.Arrays;

public class cumulativemultiple {
    public static void main(String[] args) {
        int[] arrayno = {5, 3, 4, 2, 0, 8};
        //we can give any input if we want
        calculateCumulativeMultipleArray(arrayno);
        System.out.println("Cumulative Multiple of given array = " + Arrays.toString(arrayno));
    }

    public static void calculateCumulativeMultipleArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //to handle the exception
            try {

                if (arr[i] != 0) {
                    arr[i] = arr[i - 1] * arr[i];
                } else {

                    for (int j = i; j < arr.length; j++) {
                        arr[j] = 0;
                    }
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index is out of bounds...");
            }
        }
    }
}