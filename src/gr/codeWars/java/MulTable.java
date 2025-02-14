package gr.codeWars.java;

public class MulTable {

    public static class Multiplication{

        public static void main(String[] args) {
            int[][] mulTable = multiplicationTable(3);

            for (int[] ints : mulTable) {
                for (int j = 0; j < mulTable.length; j++) {
                    System.out.println(ints[j]);
                }
            }
        }
        public static int [][] multiplicationTable(int n){
            int[][] mulTable = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j ++) {
                    mulTable[i][j] = (i + 1) * (j + 1) ;
                }
            }
            return mulTable;
        }
    }
}
