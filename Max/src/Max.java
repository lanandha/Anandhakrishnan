
public class Max {
	public static void main(String[] args){
		int l=args.length;
		if(l<9){
			System.out.println("please enter nine elements");
		}
		else{
			int [][]a=new int[3][3];
			int p=0;
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					a[i][j]=Integer.parseInt(args[p]);
					p++;
				}
			}
			System.out.println("the given array");
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
				}
				System.out.println();
				}
			int max=a[0][0];
	         for(int i=0;i<3;i++){
	         for(int j=0;j<3;j++){
	         if(a[i][j]>max){
	         max=a[i][j];
	         }
	         }
	         }
	         System.out.println("the biggest number in the array:"+max);
	         }
	}
	}



