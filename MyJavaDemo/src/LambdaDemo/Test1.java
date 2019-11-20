package LambdaDemo;

import java.util.Comparator;

import FunctionalProgram.Apple;

public class Test1 {
	public static void main(String[] args){
		Comparator<Apple> byWeight = new Comparator<Apple>(){

			@Override
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return o1.getWeight();
			}
			
		};
		
		Comparator<Apple> byWeight2 = (Apple a1,Apple a2) -> a1.getWeight();
		 
		//��һ�����ʽ������һ��String���͵Ĳ���������һ��int.Lambdaû��return��䣬��Ϊ�Ѿ�������return
		//(String) s -> s.length();
		
		//����һ������ΪApple�Ĳ���������ƻ���������Ƿ񳬹�150
		//(Apple a) -> a.getWeight() >150;
		
		//����int�͵Ĳ�����û�з���ֵ
//		(int x,int y) -> {
//			System.out.println("resutlt:");
//			System.out.println(x+y);
//		}
		
		//û�в�������һ��int
//		() -> 42
		
		//����apple���������رȽϵ�ֵ
		//		(Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight())
		
		
		Runnable r1 = () -> System.out.print("HelloWorld");//ʹ��lambda
		Runnable r2 = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.print("HelloWorld2");
			}
			
		};
		
		process(r1);
		process(r2);
		
		process(()->{System.out.print("HelloWorld0");});
		
	}
	public static void process(Runnable r){
		r.run();
	}
	
	
	
}
