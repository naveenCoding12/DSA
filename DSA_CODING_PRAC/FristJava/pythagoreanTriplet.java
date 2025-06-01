package FristJava;

public class pythagoreanTriplet {
    public static void main(String[] args) {
        int [] arr={10, 4, 6, 12, 5};
        int n= arr.length;
        boolean isTriple=false;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k <n ; k++) {
                    int x=arr[i]*arr[i];
                    int y=arr[j]*arr[j];
                    int z=arr[k]*arr[k];
                    if(x== (y+z ) || y==x+z || z==x+y){
                        isTriple=true;
                    }
                }

            }

        }
        System.out.println(isTriple);
    }
}
