package Arrays.Assignment;

public class CellsWithOddValues {

    public static void main(String[] args) {

        int m=2;
        int n=2;
        int [][] arr={{1,1},{0,0}};

        int odd=oddCells(m,n,arr);
        System.out.println(odd);
    }

    public static int oddCells(int m,int n,int [][]matrix){

        int [] rowNumber=new int[m];
        int [] cellNumber=new int[n];

        for(int [] arr:matrix){
            rowNumber[arr[0]]++;
            cellNumber[arr[1]]++;

        }
        int oddCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int cellValue = rowNumber[i] + cellNumber[j];
                if (cellValue % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }
}
