package ConCurrency;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("��ʼ������");
//		
//		System.out.println("����������");
		
//		//���߳�������Ϸ
//		for(int i = 0; i<50;i++){
//			System.out.println("����Ϸ"+i);
//			if(i == 10){
//				PlayMusicThread musicThread = new PlayMusicThread();
//				musicThread.start();
//			}
//		}
		
		//���̲߳�������
		for(int i = 0; i<50;i++){
			System.out.println("��������"+i);
			if(i == 10){
				Runnable target =new PlayGameThread();
				Thread t= new Thread(target);
				t.start();
			}
		}
	}
	
	public static void playGame(){
		for(int i = 0;i < 50;i++){
			System.out.println("����Ϸ"+i);
		}
	}
	
	public static void playMusic(){
		for(int i = 0;i < 50;i++){
			System.out.println("��������"+i);
		}
	}

}

class PlayMusicThread extends Thread{
	private int playTime = 50;//����ʱ�䣬��ѭ����ģ�ⲥ�Ź���
	public void run(){
		for(int i = 0;i < playTime; i++){
			System.out.println("��������"+i);
		}
	}
}

class PlayGameThread implements Runnable{
	private int playTime = 50;//����ʱ�䣬��ѭ����ģ�ⲥ�Ź���
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < playTime; i++){
			System.out.println("����Ϸ"+i);
		}
	}
	
}



