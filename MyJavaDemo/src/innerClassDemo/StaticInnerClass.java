package innerClassDemo;

import innerClassDemo.InnerClassUpgrade.inter;

public class StaticInnerClass {
	private int i = 1;
	public static String str = "str";
	
	static class StaClass implements inter{
		private String s = "s";
		static int j = 2;
		
		static int getInt(){
			//return i+j;//��̬�ڲ��಻�ܷ��ʷǾ�̬���ⲿ�����
			return j;
		}
		
		private String getString(){
			return str+s;
		}

		@Override
		public void inter() {
			// TODO Auto-generated method stub
			System.out.println("inter");
		}
		
		static class InStaClass{
			int x = 6;
			static int y = 5;
			static int getInt(){
				//return x;//�����ھ�̬������ʹ�÷Ǿ�̬����
				return y;
			}
		}
		
	}
	public inter getInter(){
		return new StaClass();
	}
}
class Test2{
	public static void main (String[] args){
		int a = StaticInnerClass.StaClass.getInt();
		//StaticInnerClass.StaClass.getString();//�Ǿ�̬�����޷���������
		int b = StaticInnerClass.StaClass.InStaClass.getInt();
		System.out.println(a + "----" + b);
		//new StaticInnerClass().new StaClass();//����ʧ�ܣ�staClass�Ǿ�̬��
		new StaticInnerClass().getInter().inter();
	}
}
