/**

*@description TODO
*@author Panda

 */
package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019��11��26��
 */
public class methodCiteDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("zhaoyaping","heiwenjie","yuanyue");
		list.forEach(value->System.out.println(value));
		list.forEach(System.out::println);
		
		/*
		 * ��̬�������ã�����������̬������
		 * ʵ���������ã���������������������ʵ��������
		 * �෽�����ã���������ʵ��������
		 * ���췽������ ��������new
		 */
		
		Mcd_Apple apple1 = new Mcd_Apple("�츻ʿ", "Red", 280);
		Mcd_Apple apple2 = new Mcd_Apple("����", "Yello", 470);
		Mcd_Apple apple3 = new Mcd_Apple("��ͨ", "Red", 320);
		Mcd_Apple apple4 = new Mcd_Apple("����", "Green", 300);
		
		List<Mcd_Apple> listApple = Arrays.asList(apple1,apple2,apple3,apple4);
		
		//lambda���ʽ		
		//listApple.sort((Mcd_Apple a1,Mcd_Apple a2)-> {return new Double(a1.getWeight()-a2.getWeight()).intValue();});
		
		//��̬���ʽ-��̬������
		listApple.sort(Mcd_Apple::compareByWeight);
		
		//��̬���ʽ-ʵ��������
		Mcd_Apple mcd_Apple = new Mcd_Apple();
		listApple.sort(mcd_Apple::compareByWeight2);
		
		//��̬���ʽ-�෽����
		listApple.sort(Mcd_Apple::compareByWeight3);
		
		listApple.forEach(apple -> System.out.println(apple));
		
		Mcd_Apple mcd_apple2 = new Mcd_Apple();
		//lambda���ʽ
		System.out.println(mcd_apple2.getString(()->{return new String();}));
		//���췽��������ʽ
        System.out.println(mcd_apple2.getString(String::new));
		
	}

}
