package ConCurrency;

//ʹ�ü̳з�ʽ��ʵ��
public class Tester50 {
	public static void main(String[] args) {
		//���������̣߳�ͬѧ������ƻ��
//		new Person("A").start();
//		new Person("B").start();
//		new Person("C").start();
		//ʹ��ʵ��runnable�ķ�ʽ��ʵ��
		Apple a = new Apple();
		new Thread(a,"A").start();
		new Thread(a,"B").start();
		new Thread(a,"C").start();
	}

}
