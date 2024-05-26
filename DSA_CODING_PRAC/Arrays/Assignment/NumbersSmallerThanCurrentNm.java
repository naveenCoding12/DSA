package Arrays.Assignment;

import java.util.ArrayList;
import java.util.List;

public class NumbersSmallerThanCurrentNm {

    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        List<Integer> output = numberSmall(arr);
        System.out.println(output);
    }

    public static List<Integer> numberSmall(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = countSmaller(arr, arr[i]);
            list.add(count);
        }
        return list;
    }

    private static int countSmaller(int[] arr, int ele) {
        int count = 0;
        for (int j : arr) {
            if (j < ele) {
                count++;
            }
        }
        return count;
    }
}
