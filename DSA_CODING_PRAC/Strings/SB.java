package Strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();

        for (int i = 0; i <26 ; i++) {
            stringBuilder.append((char)('a'+i));

        }
        // order of n only no new object is created modifications are done only in existing one
        System.out.println(stringBuilder);
    }
}
