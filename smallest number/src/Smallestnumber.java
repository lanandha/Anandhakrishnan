import java.util.Scanner;
public class Smallestnumber 
	{
	    public static void main(String[] args) 
	    {
	        int n, l1, l2, temp,t;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();

            int a[] = new int[n];
            System.out.println("Enter all the elements:");
            for(int i = 0; i < n ; i++)
            {
                a[i] = s.nextInt();
            }
            for(int i = 0; i < n; i++)
            {
                for(int j = i + 1; j < n; j++)
                {
	      
	                    if(a[i] < a[j])
	                    {
	                        temp = a[i];
	                        a[i] = a[j];
	                        a[j] = temp;
	                    }
                
                }}
	            System.out.println("Largest two numbers are:"+a[0]+" and "+a[1]);
                
	            System.out.println("smallest two numbers are:"+a[n-1]+" and "+a[n-2]);
	          }
            }
	

