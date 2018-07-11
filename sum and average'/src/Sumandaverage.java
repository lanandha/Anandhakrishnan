import java.util.Scanner;
public class Sumandaverage {
public static void main(String[]args){
	int n,sum=0;
	float Average;
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the values");
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
		sum=sum+a[i];
	}
	System.out.println("sum:"+sum);
	Average=(float)sum/n;
	System.out.println("Average:"+Average);
}
}
