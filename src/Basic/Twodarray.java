package Basic;

import java.util.*;
public class Twodarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        //2D array syntax
        int[][] numbers = new int[rows] [cols];

        //input
        //rows
        for(int i = 0; i<rows ;i++){
            //colums
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }        }

        //output
        for(int i=0;i<rows;i++){
            for(int j= 0; j<cols;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
