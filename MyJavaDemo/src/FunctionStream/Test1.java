package FunctionStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java7����
		List<Dish> menu = new ArrayList<>();
		List<Dish> lowCaloricDishes = new ArrayList<>();
		List<Dish> Dishes = new ArrayList<>();
		//���ۼ���ɸѡԪ��
		for(Dish d: menu){
			if(d.getCalories()<400){
				lowCaloricDishes.add(d);
			}
		}
		
		//��������Բ�������
		Collections.sort(lowCaloricDishes, new Comparator<Dish>(){

			@Override
			public int compare(Dish o1, Dish o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
			
		});
		
		//���������Ĳ����б�
		List<String> lowCaloricDishesName = new ArrayList<>();
		for(Dish d: lowCaloricDishes){
			lowCaloricDishesName.add(d.getName());
		}
		
		
		
		
		//Java8����
//		List<String> lowCaloricDishesNames =
//			menu.parallelStream()
//				.filter(d -> d.getCalories()<400)//ѡ��400��·�����µĲ���
//				.sorted(comparator(Dishes::getCalories))//���տ�·������
//				.map(Dish::getName)//��ȡ���ȵ�����
//				.collect(toList());//���������Ʊ�����List��
	}

}
