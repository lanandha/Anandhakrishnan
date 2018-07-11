import java.util.Scanner;
public class Maximumtimes {
	public static void main(String[]args){
		int n,x,i=0,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the element");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the the all element");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the element count"+a[i] );
				x=s.nextInt();
				for(i=0;i<n;i++)
				{
					if(a[i]==x)
					{
						count++;
					}
				}
				System.out.println("The count is : "+count);
	}

}
