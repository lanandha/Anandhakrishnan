package search;


//	package search;
	import java.util.*;
	public class Seven {
	//public class search {
		public static void main(String[]args){
			int n, x, y,flag = 0, i=0,sum=0,e=0,d=0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
			 System.out.print("Enter the element you want to find:");
		        x = s.nextInt();
		        y=s.nextInt();
		        for(i = 0; i < n; i++)
		        {
		            if(a[i] == x)
		            {
		                flag =1;
		                break;
		            }
		            else
		            {
		                flag = 0;
		            }
		        }
		        if(flag == 1)
		        {
		            e=(i+1);
		           
		            System.out.println(e);
		        
		        		} for(i = 0; i < n; i++)
				        {
				            if(a[i] == y)
				            {
				                flag =1;
				                break;
				            }
				            else
				            {
				                flag = 0;
				            }
				        } if(flag == 1)
				        {
				            d=(i+1);
				           
				            System.out.println(d);}
				        
				        	  if(e<d){
				        		  for(i=e-1;i<d;i++){
		    	 a[i]=0;  
		    	 
				        		  }for(i=0;i<n;i++){
		       System.out.println(a[i]);
		       sum=sum+a[i];
		    }
		       System.out.println(sum);
				        	  
		
			}
				        	  else {
				        		  for(i=0;i<n;i++){
				        			  sum=sum+a[i];
				        		  }
				        		  System.out.println(sum);
				        	  }
		}
		
			}
		
	




