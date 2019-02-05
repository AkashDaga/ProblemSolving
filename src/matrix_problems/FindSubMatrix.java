package matrix_problems;

import java.util.Scanner;

public class FindSubMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Parent Matrix");
        int sizeOfParentMatrix = sc.nextInt();

        System.out.println("Enter the values of the array");

        int[][] parentMatrix = new int[sizeOfParentMatrix][sizeOfParentMatrix];
        for (int i = 0; i < sizeOfParentMatrix; i++) {
            for (int j = 0; j < sizeOfParentMatrix; j++) {
                parentMatrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < sizeOfParentMatrix; i++) {
            for (int j = 0; j < sizeOfParentMatrix; j++) {
                System.out.print(parentMatrix[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("Enter the size of sub Matrix");
        int sizeOfSubMatrix = sc.nextInt();

        System.out.println("Enter the values of the array");

        int[][] subMatrix = new int[sizeOfSubMatrix][sizeOfSubMatrix];
        for (int i = 0; i < sizeOfSubMatrix; i++) {
            for (int j = 0; j < sizeOfSubMatrix; j++) {
                subMatrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < sizeOfSubMatrix; i++) {
            for (int j = 0; j < sizeOfSubMatrix; j++) {
                System.out.print(subMatrix[i][j]+"  ");
            }
            System.out.println();
        }

        if(sizeOfSubMatrix > sizeOfParentMatrix) return;

        System.out.println("Sub matrixes ----> ");
        int numberOfMatchedMatrixes = 0;
        for(int i = 0; i <= sizeOfParentMatrix - sizeOfSubMatrix; i++){
            boolean founded = true;
            for(int j = 0; j <= sizeOfParentMatrix - sizeOfSubMatrix; j++){
                int rowIndex = 0;
                for(int p =  i; p < sizeOfSubMatrix+i ; p++ ){
                    int columnIndex = 0;
                    for(int q = j; q < sizeOfSubMatrix+j; q++){
                        System.out.print("childIndex: "+rowIndex+columnIndex+" "+subMatrix[rowIndex][columnIndex]+" ");
                        System.out.print("parentIndex: "+p+q+" "+parentMatrix[p][q]+" ");
                        if(parentMatrix[p][q] != subMatrix[rowIndex][columnIndex]){
                            founded = false;
                            break;
                        }
                        columnIndex++;
                    }
                    rowIndex++;
                    System.out.println();
                }
                if(founded) numberOfMatchedMatrixes++;
            }
        }

        if(numberOfMatchedMatrixes > 0){
            System.out.println("there are "+numberOfMatchedMatrixes + " submatrix present in the Parent Matrix");
        } else {
            System.out.println("The Submatrix is not present in the Parent Matrix");
        }
    }
}
