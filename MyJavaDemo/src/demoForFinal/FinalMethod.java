package demoForFinal;

public class FinalMethod {
	public final void test(){
		
	}
	
	//final�����Ա�������û��Ӱ��
	public void test(int i){
		
	}
}

class Test extends FinalMethod{
	
	/**
	 * Cannot override the final method from FinalMethod
	 * final����������д
	 */
	//public void test(){}
	
	@Override
	public void test(int i){
		super.test(i);
	}
	
	//��ȻҲ����д�����Լ���ķ���
	public void test(int i,int j){
		
	}
}
