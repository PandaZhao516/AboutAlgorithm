package ConCurrency;

public class Apple implements Runnable{
	public int num = 50;//ƻ������
	
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<50;i++){
			synchronized(this){
				if(num>0){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//ģ�������ӳ�
					System.out.println(Thread.currentThread().getName()+"���˱��Ϊ:"+num--+"��ƻ��");
				}
			}
			
		}//end for
	}//end run

}
