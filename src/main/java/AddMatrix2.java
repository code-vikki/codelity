import java.util.Arrays;
import java.util.Scanner;

public class AddMatrix2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int column = scanner.nextInt();

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] resultMatrix = new int[row][column];

        System.out.println("Enter numbers for 1st Matrix:");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter numbers for 2nd Matrix:");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print(matrix1[i][j] + "        ");
            }

                System.out.println("\n");

        }
        System.out.println("    " + "+");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print(matrix2[i][j] + "        ");
            }
            if(i<=(row-2)){
                System.out.println("\n");
            }

        }
        System.out.println("\n");
        System.out.println("=");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(resultMatrix[i][j] + "        ");
            }
            if(i<=(row-2)){
                System.out.println("\n");
            }

        }


    }


}
