package Arrays.Assignment;

import java.util.Arrays;

public class Pangram {

    public static void main(String[] args) {

        String str="thequickbrownfoxjumpsoverthelazydog";
        boolean output=checkPangram(str);

        System.out.println(output);
    }

    public static boolean checkPangram(String str){

        if(str.length()<26){
            return  false;
        }
        boolean [] seen=new boolean[26];

        for(char ch :str.toCharArray()){
            if(Character.isLetter(ch)){
                seen[ch - 'a']=true;
            }
        }
        System.out.println(Arrays.toString(seen));

        for(boolean b:seen){
            if(!b){
                return  false;
            }
        }

        return  true;
    }
}
