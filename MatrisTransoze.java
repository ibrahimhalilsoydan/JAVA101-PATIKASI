public class MatrisTransoze {
    public static void main(String[] args) {
    int [][] matrix ={{1,2,3},{4,5,6}};

    int[][] transpose = transoseMatrix(matrix);
        System.out.println( "Matrisin Transpozu:");
        printMatrix(transpose);
    }
    public static int[][] transoseMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] traspose = new int[cols][rows];

        for (int i= 0; i<rows;i++){
            for (int j=0;j<cols;j++){
                traspose[j][i]=matrix[i][j];
            }
        }
        return traspose;
    }
    public static void printMatrix(int[][] matrix){
        for ( int []row: matrix){
            for (int num :row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}