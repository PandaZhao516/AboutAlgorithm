package innerClassDemo;

public class MemberInner2 {
	private int num;
	
	public MemberInner2() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberInner2(int num){
		this.num = num;
	}
	


	private  class Inner{
		public MemberInner2 getTest2(){
			return MemberInner2.this;//MemberInner2.thisָ�����ⲿ��Ķ���
		}
		
		public MemberInner2 newTest2(){
			return new MemberInner2();
		}
	}
}
