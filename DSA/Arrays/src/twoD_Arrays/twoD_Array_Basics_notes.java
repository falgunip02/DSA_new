package twoD_Arrays;

import java.util.Scanner;

public class twoD_Array_Basics_notes {

//    declaration:
//    type[][] arrayname = new type[rows][columns];
//    int[][] numbers = new int[3][5];
//    location acccess in 2D array => numbers[0][1];
//    outer loops => control rows          --
//    inner loops => controls column        -
//                                          -

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<columns;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i< rows;i++){
            for(int j = 0 ; j<columns;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
