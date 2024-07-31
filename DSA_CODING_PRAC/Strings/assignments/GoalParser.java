package Strings.assignments;

public class GoalParser {

    public static void main(String[] args) {

        String input = "()()()g(al)";

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'g') {  // Use single quotes for character comparison
                stringBuilder.append("g");
            } else if (input.charAt(i) == '(') {
                if (input.charAt(i + 1) == ')') {
                    stringBuilder.append("o");
                    i++;
                } else {
                    stringBuilder.append("al");
                    i += 3;  // Skip "al)" by incrementing i by 3
                }
            }

        }

        // Print the final result
        System.out.println(stringBuilder.toString());
    }
}
