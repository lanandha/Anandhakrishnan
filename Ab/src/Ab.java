import java.util.*;
public class Ab { 
		/*public static void main(String args[]){  
		 int temp,j;  
		int arr[][]={{1,2},{3,4}};  
		  for(int i=0;i<2;i++){  
		 for(j=0;j<2;j++){  
		   //System.out.print(arr[i][j]+" ");  
		 
		// System.out.println();
	//	  reverse(arr);  
		
	//int j;*/
		public static void main(String[]args) throws Exception {
			    int rows, cols,temp=0,temp1,i,j,q;
			    int[][] arr;
			    Scanner input = new Scanner(System.in);
			    System.out.print("Enter number of rows greater than 20: ");
rows = input.nextInt();
			    System.out.print("Enter number of columns greater than 20: ");
			    cols = input.nextInt();
			    arr = new int[rows][cols];
			    System.out.println("Enter elements of Array");
			   // for ( i = 0; i < rows; i++) {
			        for (j = 0; j < cols; j++) {
			        	for ( i = 0; i < rows; i++) {
			            arr[j][i] = input.nextInt();
			        }
			    }
			    System.out.println("Array is: ");
			   
			        for ( j = 0; j < cols; j++) { 
			        	for (i = 0; i < rows; i++) {
			      //  System.out.print(arr[i][j]+" ");
			   //     }
			    //}
			   // System.out.println();
			    //reverse(arr);
while(i<j)
{
	  arr[i][j]= temp;
	   temp = temp-1;
	   q=temp-1;
	   q = arr[j][i];
	   i++;
	   j--;
	}}System.out.println("Reversed array: ");
//	for(i=0; i<2; i++)
	for(i=0; i<2; i++){
		for(j=0;j<2;j++){  
			
	   System.out.print(arr[j][i]+ "  ");
	}       
	
		  
	
	System.out.println();}}}  }


