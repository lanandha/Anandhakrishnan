package aaa;

import java.util.*;

public class Use {
	static boolean isPerfectSquare(double x){
		double sr=Math.sqrt(x);
		return ((sr-Math.floor(sr))==0);
	}
	public static void main(String[] args) 
    {
        double x = 2500;
         
        if (isPerfectSquare(x))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}


