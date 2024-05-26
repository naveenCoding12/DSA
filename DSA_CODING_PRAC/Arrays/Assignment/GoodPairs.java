package Arrays.Assignment;

public class GoodPairs {

    public static void main(String[] args) {

//        Input: nums = [1,2,3,1,1,3]
//        Output: 4
//        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

        int[] arr = {2, 1, 3, 2};
        int count = goodPairs(arr);
        System.out.println(count);
    }

    public static int goodPairs(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
