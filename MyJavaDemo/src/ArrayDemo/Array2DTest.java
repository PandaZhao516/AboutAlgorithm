package ArrayDemo;

public class Array2DTest {
	public static void main (String[] args){
		//��ά�䳤����
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[1];
		
		//Error:���ܿ�ȱ��һά��С
		//int[][] b = new int[][];
		
		int[][] c = new int[][]{{1, 2, 3},{4},{5, 6, 7, 8}};
		
		System.out.println(add(2,3));
		System.out.println(add(2,3,5));
		
	}
	
	public static int add(int x,int ...args){
		int sum = x;
		for(int i = 0;i<args.length;i++){
			 sum+=args[i];
		}
		return sum;
	} 
}
