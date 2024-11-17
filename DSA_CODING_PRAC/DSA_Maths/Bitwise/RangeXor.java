package DSA_Maths.Bitwise;

public class RangeXor {

    // xor of two numnbers a,b is xor(b) ^ xor(a-1)

    public static void main(String[] args) {
        int a=3;
        int b=9;

        int ans=xor(b)^xor(a-1);
        System.out.println(ans);
    }

    static  int xor(int num){

        if(num%4==0){
            return num;
        }
        if(num%4==1){
            return 1;
        }
        if(num%4==2){
            return num+1;
        }
        return 0;
    }
}
