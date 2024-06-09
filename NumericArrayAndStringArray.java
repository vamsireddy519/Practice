
import java.util.Arrays;
public class Exercise1 {
    public static void main(String[] args) {
        int[] my_array1 = {
            2269, 2035, 4456, 1456, 2013, 
            2124, 2458, 7689, 9809, 5567, 
            5432, 2165, 6547, 3456
        };
        String[] my_array2 = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };        
        System.out.println("Original numeric array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));
        System.out.println("Original string array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));
    }
}