
import java.io.*;
class Maximumrepeating {
	static int maxRepeating(int arr[], int n, int k)
	{
		for (int i = 0; i< n; i++)
			arr[(arr[i]%k)] += k;
		int max = arr[0], result = 0;
		for (int i = 1; i < n; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
				result = i;
			}
		}
		return result;
	}
	public static void main (String[] args)
	{

		int arr[] = {2, 4, 4, 9, 3, 4, 1, 7,9,9,9};
		int n = arr.length;
		int k=10;
		System.out.println("Maximum repeating element is: " +
						maxRepeating(arr,n,k));
	}
}
/* This code is contributed by Devesh Agrawal */
