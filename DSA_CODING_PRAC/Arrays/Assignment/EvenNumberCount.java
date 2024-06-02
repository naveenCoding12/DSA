package Arrays.Assignment;

public class EvenNumberCount {

    public static void main(String[] args) {

        int [] arr={1,5,2,4,456};

        int even=evenDigit(arr);

        System.out.println(even);
    }

    public static int evenDigit(int [] arr){

        int count=0;

        for (int i = 0; i < arr.length ; i++) {

            int counteven=0;
            int number=arr[i];
            while(number>0){
                number=number/10;
                counteven++;
            }
            if(counteven%2==0){
                count++;
            }
        }
        return count;
    }
}
