package aaa;
import java.util.*;
public class Mile {
	public static void main(String[]args){
		int xx,yy,n,i,o,j,ss,m,temp=0,k,l,p,q,r,s,sub=0,x,y,z;
		int a=4374;
		//i=a%10000;
		j=a%1000;//374
		m=a/1000;//4
		n=j/100;//3
		p=m-n;//1
		x=Math.abs(p);//1
		System.out.println(x);//1
		k=a%100;//74
		i=a%10;//4
		o=k/10;//7
		q=n-o;//3-7=-4
		y=Math.abs(q);//4
		r=o-i;//7-4=3
		z=Math.abs(r);//3
		//System.out.println(q+" "+r);
		sub=x-y;//1-4=-3
		xx=Math.abs(sub);//3
		int yyy=~(xx-1);//-3
		//System.out.println(sub);
		ss=y-z;//4-3=1
		yy=Math.abs(ss);//1
		temp=(yyy*10)+yy;//-30+1=-29
		int qqq=~(temp-1);
		System.out.print(qqq);//29
	}

}
