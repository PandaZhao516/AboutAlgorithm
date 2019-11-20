package innerClassDemo;

import innerClassDemo.InnerClassUpgrade.Eat;
import innerClassDemo.InnerClassUpgrade.Run;

public class Person {
	//private
	private class PEat implements Eat{

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("eat with mouth");
		}
	}
	//protected
	protected class PRun implements Run{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}		
	}
	
	public Eat howToEat(){
		//�����ڷ����е���
		class EatWithMouth implements Eat{

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("eat with mouth2");
			}
			
		}
		return new EatWithMouth();//����ת��
	}
	
	public Run howtoRun(){
		return new PRun();//����ת��
	}
}

class TestPerson{
	public static void main(String[] args){
		Person p = new Person();
		Eat e = p.howToEat();
		Run r = p.howtoRun();
		
		e.eat();
		r.run();
		
		Person.PRun ppr = p.new PRun();
		//Person.PEat ppe = p.new PEat();//����ʧ�ܣ���ΪPEat��private��
	}
}
