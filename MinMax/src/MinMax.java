//import java.util.Arrays;
//import java.util.Collections;
import java.util.*;
 public class MinMax {
public static void main(String[] args){  
       Integer num [] ={1,2,3,6,5};
      /* Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++){
			num[i]=sc.nextInt();
			String sa=String.valueOf(num);
			String ss[]=sa.split(" ");
			for(String w:ss){
				int a=Integer.valueOf(w);
				System.out.println(a);*/
       int min=Collections.min(Arrays.asList(num));
        int max = Collections.max(Arrays.asList(num));
        System.out.println("Minimum number of array is : " + min);
        System.out.println("Maximum number of array is : " + max);
    }}