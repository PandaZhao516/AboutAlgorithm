package innerClassDemo;

public class Son {
	/**
	 * �ڲ���̳�father��
	 */
	class Father_1 extends Father{
		public int strong(){
			return super.strong()+1;
		}
	}
	
	/**
	 * �ڲ���̳�Mother��
	 */
	class Mother_1 extends Mother{
		public int kind(){
			return super.kind() -2;
		}
	}
	
	public int getStong(){
		return new Father_1().strong();
	}
	
	public int getKind(){
		return new Mother_1().kind();
	}
}


