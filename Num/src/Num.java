
public class Num {
//	public class array {
		public static void main(String[] args){
			int l=args.length;
			if(l<4){
				System.out.println("please enter four elements");
			}
			else{
				int [][]a=new int[2][2];
				int p=0;
				for(int i=0;i<2;i++){
					for(int j=0;j<2;j++){
						a[i][j]=Integer.parseInt(args[p]);
						p++;
					}
				}
				System.out.println("the given array");
				for(int i=0;i<2;i++){
					for(int j=0;j<2;j++){
					System.out.print(a[i][j]+" ");
					}
					System.out.println();
					}
				System.out.println("the reverse array");
				for(int i=1;i>=0;i--){
					for(int j=1;j>=0;j--){
					System.out.print(a[i][j]+" ");
					}
					System.out.println();
					}
			}
		}
		}

