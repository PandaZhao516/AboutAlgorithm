package Algorithm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "I am a Person";
//		FrequencySort fs = new FrequencySort();
//		String r1 = fs.frequencySort(s);
//		System.out.println(r1);
		
//		int[] price = {7,1,5,3,6,4};
//		StrockProfit sp = new StrockProfit();
//		int s = sp.stockProfit2(price);
//		System.out.println(s);
		
		//���ڵ�10
		TreeNode tn1 = new TreeNode(10);
		//���ڵ�9
		TreeNode tn2 = new TreeNode(9);
		//���ڵ�20
		TreeNode tn3 = new TreeNode(20);
		//���ڵ�15
		TreeNode tn4 = new TreeNode(15);
		//���ڵ�35
		TreeNode tn5 = new TreeNode(35);
		
		//���ڵ�����ҽڵ�
		tn1.setLeftNode(tn2);
		tn1.setRightNode(tn3);
		
		//20�ڵ�����ҽڵ�
		tn3.setLeftNode(tn4);
		tn3.setRightNode(tn5);
		
		/*�������ڵ��ʼ��*/
		
		TreeNodeSort1 ts1 = new TreeNodeSort1();
		
		ts1.mediumTraverseBTree(tn1);
	}

}
