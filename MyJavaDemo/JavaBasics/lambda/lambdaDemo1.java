/**

*@description TODO
*@author Panda

 */
package lambda;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019��11��26��
 */
public class lambdaDemo1 {
	public static void main(String[] args){
		//1.1ʹ���ڲ���
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello panda!");
			}
			
		}).start();
		
		//1.2ʹ��lambda���ʽ
		new Thread(()->System.out.println("Hello panda2!")).start();
		
		//============================================================
		
		//2.1ʹ�������ڲ���
		Runnable rac1 = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello panda3!");
			}
			
		};
		
		//2.2ʹ��lambda���ʽ
		Runnable rac2 = ()->System.out.println("Hello panda1!"); 
		
		rac1.run();
		rac2.run();
	}
}
