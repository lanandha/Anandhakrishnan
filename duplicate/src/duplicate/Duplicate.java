package duplicate;
import java.util.Scanner;
class Duplicate
{
static int countOccurrences(int arr[], int n, int x)
	{
		int count = 0;
		for (int i=0; i<n; i++)
			if (x == arr[i])
			count++;
		return count;
	}
		public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int arr[] = new int[a];
		for(int i = 0; i < a; i++)
        {
            arr[i] = sc.nextInt();
        }
		int n = arr.length;
	int	 x = sc.nextInt();
		System.out.println(x+" "+countOccurrences(arr,n,x));
		
	}
}
