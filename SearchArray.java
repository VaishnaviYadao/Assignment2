package Day2;
import java.util.Scanner;

public class SearchArray {
	
	public static void main(String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int flag = 0;
		int i=0;
		System.out.println("Enter the elements of Array:");
		for(i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter elements to be search:");
		int search = sc.nextInt();
		for(i=0; i<n; i++)
		{
			if(arr[i]==search)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("Elements at:"+(i+1));
		}
		else
		{
			System.out.print("-1");
		}
	}

}