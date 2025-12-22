// creating a class MatrixOperation to perform matrix operations

import java.util.Scanner;
class MatrixOperation{
   
    public static int [][] createRandomMatrix(int row, int col){
	int[][] arr = new int[row][col];
	for(int i = 0; i < row ; i++){
	   for( int j = 0 ; j < col ; j++){
		arr[i][j] = (int) (Math.random() * ((10 - 1)  + 1)) + 1;
	    }
	}
	return arr;
    }

    //creating a method to add matrix
    public static int[][] addingMatrix(int a[][], int b[][]){
    	int result[][]= new int[a.length][a[0].length];
	for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] + b[i][j];

        return result;
    }
    

   //creating a method to subtract matrix
    public static int[][] subtractingMatrix(int a[][], int b[][]){
    	int result[][]= new int[a.length][b[0].length];
	for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] - b[i][j];

        return result;
    }

     // Creating a method to multiply  matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {

        int[][] result = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] a){
	for(int i = 0; i < a.length ; i++){
	   for(int j = 0 ; j < a[0].length ; j++)
		System.out.print((a[i][j] )+ " " );
	    System.out.println();
	}

    }
	
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//taking row and column as input
	int row = sc.nextInt();	
	int column = sc.nextInt();	
	
		
	int randomArray1[][] = createRandomMatrix(row, column);
	int randomArray2[][] = createRandomMatrix(row, column);

	//printing result by using displayMatrix function
	System.out.println("Random array 1" );
	displayMatrix(randomArray1);

	System.out.println("Random array 2" );
	displayMatrix(randomArray2);

	System.out.println("Addition of two matrix" );
	displayMatrix(addingMatrix(randomArray1,randomArray2));
	
	System.out.println("subtraction of two matrix" );
	displayMatrix(subtractingMatrix(randomArray1,randomArray2));

	System.out.println("multiplication of two matrix" );
	displayMatrix(multiplyMatrices(randomArray1,randomArray2));

		

	sc.close();
	
    }

}