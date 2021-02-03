package Day2;
import java.util.Arrays;
public class MergeArray {
	
	public static void main(String[] args)
	{
		int[] FirstArray = {2,5,8,9};
		int[] SecondArray = {15,3,7,12};
		int fal = FirstArray.length;
		int sal = SecondArray.length;
		int[] result = new int[fal + sal];
		System.arraycopy(FirstArray,  0, result, 0, fal);
		System.arraycopy(SecondArray, 0,  result, fal, sal);
		System.out.println(Arrays.toString(result));
	

}
}
