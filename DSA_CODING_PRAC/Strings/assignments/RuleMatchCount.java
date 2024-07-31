package Strings.assignments;

public class RuleMatchCount {

    public static void main(String[] args) {

        String [][] strings={{
            "phone","blue","pixel"
        },{
            "computer","silver","lenovo"
        },{
            "phone","gold","iphone"
        }
                };

        String rulekey="phone";
        int count=0;
        for (int i = 0; i <strings.length ; i++) {
            for (int j = 0; j <strings[i].length ; j++) {
                if(strings[i][j].equals(rulekey)){
                    count++;
                }
            }

        }

        System.out.println(count);
    }
}
