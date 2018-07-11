
public class Tdarray {
	//public static void reverse(int[][] arr){
		/*int rows = arr.length;
	    int cols = arr[0].length;
	  //  if(cols<4){
	//		System.out.println("please enter four elements");
	//	}
	  //  else{
	    int array[][]=new int[rows][cols];
	    for(int i = rows-1; i >= 0; i--) {
	        for(int j = cols-1; j >= 0; j--) {
	            array[rows-1-i][cols-1-j] = arr[i][j];
	        }
	    }
	    for(int i = 0; i < rows; i++) {
	        for(int j = 0; j < cols; j++) {
	            System.out.print(array[i][j]+" ");
	            }
	     }
	}*/
public static void main(String[] args){ 
	    int[][] arr;
	    if(args.length==0){
			System.out.println("please enter four elements");
		}
	    else
	    System.out.print("Enter number of rows: ");
	    int rows=Integer.parseInt(args[0]);
	    System.out.print("Enter number of columns: ");
	    int cols = Integer.parseInt(args[1]);
	    arr = new int[rows][cols];
	    System.out.println("Enter elements of Array");
	   
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            arr[0][0] =Integer.parseInt(args[2]);
	            arr[0][1] =Integer.parseInt(args[3]);
	            arr[1][0]=Integer.parseInt(args[4]);
	            arr[1][1]=Integer.parseInt(args[5]);
	           }}
	    System.out.println("Array is: ");
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	        System.out.print(arr[i][j]+" ");
	        }
	    System.out.println();}
	    System.out.println("Reversed is: ");
	    for (int i = 1; i >=0; i--) {
	        for (int j = 1; j >=0; j--) {
	        System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	    }}}
	        
               


