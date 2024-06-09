package array;

public class SingleDimenstionalArray {

	public static void main(String[] args) {
		
		  int[] i = {5, 8, 3, 7}; 
	        int j = 0;
	        
	        for (int l : i) {
	        	
	            j += l ;
	        }
	        
	        System.out.println("Sum of the integers in the array: " + j);
	    }
	}