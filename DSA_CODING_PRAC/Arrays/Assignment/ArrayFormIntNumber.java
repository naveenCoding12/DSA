package Arrays.Assignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayFormIntNumber {

    public static void main(String[] args) {

        int num = 5;

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= num / 2; i++) {
            list.add(i);
            list.add(-i);
        }
        if (num % 2 != 0) {
            list.add(0);
        }

        // Print the list
        System.out.println(list);
    }
}
