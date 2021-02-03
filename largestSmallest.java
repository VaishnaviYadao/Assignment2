package Day2;
import java.util.*;
public class largestSmallest {
	 
	public static void main(String[] args)
	{
		int arr[]= {65,10,32,56,44,76,22};
		System.out.println("Array=" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array=" +Arrays.toString(arr));
		System.out.println("Smallest Element=" +arr[0]);
		System.out.println("2nd Smallest Element=" +arr[1]);
		System.out.println("Largest Element=" +arr[6]);
		System.out.println("2nd Largest Element=" +arr[5]);
		
	}

}
