package DSA_Maths.Bitwise;

import java.util.HashMap;
import java.util.Map;

public class NotDuplicateNumber {

    public static void main(String[] args) {
        int[] n = {2, 3, 7, 7, 2, 4, 7, 4, 2, 4, 3};
        System.out.printf("%d is not a repeated number in the array%n", frequency(n));
    }

    static int findNonRepeated(int[] n) {
        int[] bitCount = new int[32]; // Assuming 32-bit integer

        // Count bits at each position
        for (int num : n) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }

        // Find the unique number
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bitCount[i] % 3 != 0) { // Assuming every number except one appears thrice
                result |= (1 << i);
            }
        }

        return result;
    }

    static int frequency(int [] arr){
        int noRepeat=0;

        Map<Integer,Integer> hashMap=new HashMap<Integer, Integer>();

        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

       for (Map.Entry<Integer, Integer> entry:hashMap.entrySet()){
           if(entry.getValue()==1){
                noRepeat= entry.getKey();
           }

       }
    return noRepeat;
    }
}
