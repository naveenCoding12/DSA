package Arrays.Assignment;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberFromMatrix {

    public static void main(String[] args) {

        int [][] arr={{3,7,8},{9,11,13},{15,16,17}};

        List<Integer> list =luckyNumber(arr);

        System.out.println(list);

    }
    public static List<Integer> luckyNumber(int [] [] matrix){

        List<Integer> list=new ArrayList<>();

        int rowSize= matrix.length;;
        int colSize=matrix[0].length;

        int [] rowsMin=new int[rowSize];
        int [] rowMinCOlId=new int[rowSize];

        for (int i = 0; i <rowSize ; i++) {
            int rowMinValue=matrix[i][0];
            int minCol=0;
            for (int j = 1; j <colSize ; j++) {
                if (matrix[i][j]<rowMinValue){
                    rowMinValue=matrix[i][j];
                    minCol=j;
                }
            }
            rowsMin[i]=rowMinValue;
            rowMinCOlId[i]=minCol;

        }

        for (int i = 0; i <rowSize ; i++) {
            int candididate=rowsMin[i];
            int column=rowMinCOlId[i];
            boolean isLucky=true;
            for (int j = 0; j < rowSize; j++) {
                if(matrix[j][column]>candididate){
                    isLucky=false;
                    break;
                }
            }
            if(isLucky){
                list.add(candididate);
            }

        }

        return list;
    }

}
