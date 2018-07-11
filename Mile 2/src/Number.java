import java.math.*;
import java.util.*;
public class Number {
public static void main(String[]args){
String b;
int ii = 0,i1,i2,i3,i4,i5,i6,i7;
char c,d,e,f,g,h,i,j,k,l,m;
	Scanner ss=new Scanner(System.in);
	b=ss.nextLine();
	
      c=b.charAt(0);
      String sa=Character.toString(c);
      int ia=Integer.valueOf(sa);
	if(ia%2==0){
		System.out.println(c);
	
	}else{
		d=b.charAt(1);
	String sb=Character.toString(d);
    int ib=Integer.valueOf(sb);
i1=ia+ib;
if(i1%2==0){
	System.out.println(i1);
	}
else{
	e=b.charAt(2);
	String sc=Character.toString(e);
    int ic=Integer.valueOf(sc);
i2=i1+ic;
	//System.out.println(i2);
	if(i2%2==0){
		System.out.println(i2);
		}
	else{
		f=b.charAt(3);
		String sd=Character.toString(f);
	    int id=Integer.valueOf(sd);
	i3=i2+id;
		//System.out.println(i3);
		if(i3%2==0){
			System.out.println(i3);
			}
		else{
			g=b.charAt(4);
			String se=Character.toString(g);
		    int ie=Integer.valueOf(se);
		i4=i3+ie;
			if(i4%2==0){
				h=b.charAt(5);
				i=b.charAt(6);
				String sf=Character.toString(h);
			    int iii=Integer.valueOf(sf);
				String sg=Character.toString(i);
			    int ig=Integer.valueOf(sg);
ii=iii+ig;
//System.out.println(ii);
			}
			else{	System.out.println(ii);
		 if(ii%2==0){
				
					System.out.println(ii);
				}else{
				j=b.charAt(7);	
				k=b.charAt(8);
				//i=b.charAt(6);
				String sh=Character.toString(j);
			    int ih=Integer.valueOf(sh);
				String si=Character.toString(k);
			    int ai=Integer.valueOf(si);
i6=ih+ai;if(i6%2==0){
	System.out.println(i6);
				}
else{
l	=b.charAt(9);
System.out.println(l);
}
}
			}
		}
	}
}
	}
}
}