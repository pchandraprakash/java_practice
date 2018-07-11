package arraysPractice;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// 2D Array
		System.out.println("=======START OF 2D ARRAY=======");
		// step 1: declare and initialize a 2D Array
		int[][] matrix_1 = new int[3][3];
		// step 2: declare iterating, counter variables and initialize them
		int p, q, count = 1;
		// printing 2D Array
		// step 3: first for loop containing first iterating variable
		for (p = 0; p < 3; p++) {
			// step 4: second for loop containing second iterating variable
			for (q = 0; q < 3; q++) {
				// step 5: initialize the 2D array with counter variable value
				matrix_1[p][q] = count;
				// step 6: print the 2D array elements
				System.out.print(matrix_1[p][q] + " ");// inner for loop will be print
				// step 7: increment the counter by 1 depending on the situation
				count++;
			}
			System.out.println();// outer for loop will be println
		}
		System.out.println("=======END OF 2D ARRAY=======");
		System.out.println("******************************");
		System.out.println("=======START OF 3D ARRAY=======");
		// 3D Array
		int arr[][][] = new int[3][3][3];
		int i, j, k, num = 1;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				for (k = 0; k < 3; k++) {
					arr[i][j][k] = num;
					num++;
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("=======END OF 3D ARRAY=======");
	}
}