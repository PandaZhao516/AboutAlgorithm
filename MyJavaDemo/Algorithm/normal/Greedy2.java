/**

*@description TODO
*@author Panda

 */
package normal;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019��12��3��
 */
public class Greedy2 {

	/**
	 * @param args
	 * �������ĳһ��ʼ�����
	 * while(�ܳ�����������Ŀ��ǰ��һ��){
	 * 	���ÿ��еľ��ߣ�������н��һ����Ԫ��
	 * }
	 * �����н�Ԫ����ϳ������һ�������Խ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greedyGiveMoney(280);
	}
	
	public static void greedyGiveMoney(int money){
		System.out.println("��Ҫ����"+money+"Ԫ��");
		int[] moneyLevel = {1,5,10,20,50,100};
		for(int i = moneyLevel.length-1;i>=0;i--){
			int num = money/moneyLevel[i];
			int mod = money%moneyLevel[i];
			money = mod;
			if(num>0){
				System.out.println("��Ҫ����"+num+"��"+moneyLevel[i]+"ԪǮ");
			}		
		}
	}
}
