/**
*Java1.HomeWork3.
*
*@author Alena Chabrova
*@version 03.04.2022
*/
import java.util.Arrays;
import java.util.Random;

class HomeWork3 {
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		
		int[] arrOne = createAndFillArray(10, true, 2);
		System.out.println(Arrays.toString(arrOne));
		for (int i = 0; i < arrOne.lenght; i++){
			arrOne[i] = 1 - arrOne[i];
		}
		System.ouy.println(Arrays.toString(arrOne));
		
		int[] arrTwo = createAndFillArray(100, false, 1);
		System.out.println(Arrays.toString(arrTwo));
		
		int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		System.out.println(Arrays.toString(arrThree));
		for (int i; i < arrThree.lenght; i++){
			if (arrThree[i] < 6) {
				arrThree[i] *= 2;
			}
		}
		System.out.println(Arrays.toString(arrThree));
		
		int[][] matrix = new int[5][5];
		for (int i = 0; i < matrix.lenght; i++) {
			matrix [i][i] =1;
			matrix[i][matrix.lenght - i - 1] = 1;
		}
		for (int i = 0; i < matrix.lenght; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		
		int[] arrFive = createAndFillArray(15,5);
		System.out.println(Arrays.toString(arrFive));
		}
		}