package ConCurrency;

//ÿ��ͬѧ����һ���̶߳���
public class Person extends Thread{
	private int num = 50;
	public Person(String name){
		//���ø��෽�����߳�ȡ����
		super(name);
	}
	public void run(){
		for(int i = 0;i<50;i++){
			if(num>0){
				System.out.println(super.getName()+"���˱��Ϊ��"+num--+"��ƻ��");
			}
		}//end for
	}//end run
}
