package innerClassDemo;
/**
 * 
 * @author Panda.Zhao
 *
 *���������������Ƕ���ڲ���
 */
public class EveryBlock {
	private String test(boolean b){
		if(b){
			class A{
				private String a = "a";
				String getString(){
					return a;		
				}
			}
			A a  = new A();
			String s = a.getString();
			return s;
		}
		//A a = new A(); //����ʧ�ܣ�����������
		return null;
	}
	
	public static void main (String[] args){
		EveryBlock eb = new EveryBlock();
		System.out.println("false is"+eb.test(false));
		System.out.println("true is"+eb.test(true));
	}
}
