package array;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
	
int[][] arr = {{1,8,4} ,{9,7,2,6,7} ,{4}};
		
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
		
			for(int j = 0 ; j < arr[i].length ; j++) {
				
				sum += arr[i][j];
			}
		}
		
		System.out.println("sum of all elements : " + sum);

	}

}