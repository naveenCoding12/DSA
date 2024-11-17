package DSA_Maths.Bitwise;

public class Power {
    // a^b
    public static void main(String[] args) {

        int number=3;
        int power=6;
        int ans=1;
        while(power>0){
            if(((power)&1)==1){
                ans*=number;
            }
            number*=number;
            power=power>>1;

        }
        System.out.println(ans);
    }
}
