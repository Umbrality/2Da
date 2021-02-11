package org.horizoncolumbus.hs;

public class SumOfMatrix {

    public static void main(String[] args) {

        int matrix[][] = {{0,1,1},{9,2,4},{9,8,4},{1,2,5}};
        for (int i = 0; i < 4; i++){
            System.out.print("\n");
            for (int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + "\t");
            }
        }

    }
}
