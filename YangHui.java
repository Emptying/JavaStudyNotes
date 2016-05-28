public class YangHui{
	public static void main(String [] args){
		int row = 8;
		int [] []array=new int [row] [row];
		for(int i = 0;i<row;i++){
			for(int j = 0;j<=i;j++){
				//
				if(j==0||j==i){
					array[i][j]=1;
				}else{
					array[i][j]=array[i-1][j]+array[i-1][j-1];
				}
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}