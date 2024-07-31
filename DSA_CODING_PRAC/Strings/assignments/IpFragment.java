package Strings.assignments;

public class IpFragment {

    public static void main(String[] args) {

        String input="1.1.1.1";

        StringBuilder stringBuilder=new StringBuilder();

        for(char ch : input.toCharArray()){
            if(ch=='.'){
                stringBuilder.append("[.]");
            }else{
                stringBuilder.append(ch);

            }

        }

        System.out.println(stringBuilder);
    }
}
