class BubbleSort{
	public static void main(String [] args){
		int [] array={2,5,34,12,24,13,26,18,11};
		int [] array2={2,5,7,9,1,3,6,4,8};
		//����Ϊ����ĸ���-1��
		BubbleSort.ArraySort(array);
		BubbleSort.Arrayprint(array);
		BubbleSort.ArraySort(array2);
		BubbleSort.Arrayprint(array2);
		

	}
	
	public static void ArraySort(int [] array){
		for(int i=0;i<array.length-1;i++){
			//�ȽϵĴ���Ϊ����ĸ���-1 -������
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static void Arrayprint(int [] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
	
	public static void Arrayprint(String [] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
		System.out.println();
	}
	
}