package innerClassDemo;

public class MemberInner {
	private String a = "a";
	public int i =1;
	//�ڲ���
	class Inner{
		private String b = "b";
		public String c = "c";
		
		public int getInt(){
			return i;//�ڲ�����Է����ⲿ�����
		}
		
		private String getString(){
			return a + b + c;//�ڲ�����Է����ⲿ���private����
		}
	}
	
	public String getParam(){
		Inner inner = new Inner();
		inner.b = "bb";//�ⲿ����Է����ڲ����private����
		inner.c = "cc";
		return inner.getInt() + inner.getString();
	}
}

class Test{
	
	public static void main(String[] args){
		MemberInner mi = new MemberInner();
		System.out.println(mi.getParam());
		
		MemberInner.Inner moi = mi.new Inner();
		moi.c = "ccc";
	//	moi.b = "bbb"; //b�����ǲ��ɼ���
		System.out.println(moi.getInt());
	//	System.out.println(moi.getString());//�������ɼ�
		
	}
}
