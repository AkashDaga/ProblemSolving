package matrix_problems;

import java.util.Scanner;

public class SubMatrixSum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Parent Matrix");
        int sizeOfParentMatrix = sc.nextInt();

        System.out.println("Enter the values of the array");

        int[][] parentMatrix = new int[sizeOfParentMatrix][sizeOfParentMatrix];
        for (int i = 0; i < sizeOfParentMatrix; i++) {
            for (int j = 0; j < sizeOfParentMatrix; j++) {
                parentMatrix[i][j] = sc.nextInt();
            }
            System.out.println("");
        }

        for (int i = 0; i < sizeOfParentMatrix; i++) {
            for (int j = 0; j < sizeOfParentMatrix; j++) {
                System.out.print(parentMatrix[i][j]+"  ");
            }
            System.out.println("");
        }

        System.out.println("Enter the size of sub Matrix");
        int sizeOfSubMatrix = sc.nextInt();

        System.out.println("Enter the values of the array");

        if(sizeOfSubMatrix > sizeOfParentMatrix) return;

        for(int i = 0; i < sizeOfParentMatrix - sizeOfSubMatrix + 1; i++){
            for(int j = 0; j < sizeOfParentMatrix - sizeOfSubMatrix + 1; j++){

                int sum = 0;
                for(int p =  i; p < sizeOfSubMatrix+i ; p++ ){
                    for(int q = j; q < sizeOfSubMatrix+j; q++){
                        sum += parentMatrix[p][q];
                    }
                }
                System.out.print(sum+ " ");
            }
            System.out.println();
        }
    }
}
