package restartForJava;

public class CodeDemo {
	private int a = 1;
	private int b;
	private int c;
	//��̬�����
	static {
		int a =4;
		System.out.println("���Ǿ�̬�����1");
	}
	//��������
	{
		int a = 0;
		b = 2;
		System.out.println("���ǹ�������1");
	}
	
	public CodeDemo(){
		this.c = 3;
		System.out.println("���캯��");
	}
	
	public int add(){
		System.out.println("count a + b + c");
		return a+b+c;
	}
	//��̬�����
	static {
		System.out.println("���Ǿ�̬�����2,I do nothing");
	}
	//��������
	{
		System.out.println("���ǹ�������2");
	}
}
