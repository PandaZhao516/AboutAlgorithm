package ConCurrency;

//�Ƚϲ��кʹ����ۼӲ������ٶ�
public class Tester2 {
	private static final long count = 1000000;//ִ�д���
	
	public static void main(String[] args) throws InterruptedException {
		concurrency();
		serial();
	}
	
	private static void concurrency() throws InterruptedException{
		long start = System.currentTimeMillis();
		
		//ͨ�������ڲ����������߳�
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int a = 0;
				for(long i = 0; i < count;i++){
					a+=5;
				}
			}
			
		});
		
		thread.start();
		
		//����ִ��
		int b = 0;
		for(long i = 0;i < count;i++){
			b--;
		}
		
		thread.join();//�ȴ��߳̽���
		long time = System.currentTimeMillis() - start;
		System.out.println("concurrency:"+time+"ms");
	}
	
	private static void serial(){
		long start = System.currentTimeMillis();
		
		int a = 0;
		for(long i = 0;i < count;i++){
			a += 5;
		}
		//����ִ��
		int b = 0;
		for(long i = 0;i < count;i++){
			b--;
		}
		
		long time = System.currentTimeMillis()-start;
		System.out.println("serial:"+time+"ms");
	}
}
