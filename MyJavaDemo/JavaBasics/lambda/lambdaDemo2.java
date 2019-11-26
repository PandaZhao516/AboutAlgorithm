/**

*@description TODO
*@author Panda

 */
package lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019��11��26��
 */
public class lambdaDemo2 {
	public static void main(String[] args){
		String[] friends = {"heiwenjie","zhaoyaping","yuanyue","liuheng","liuchenzhe","wangqiong"};
		
		//1.1���������ڲ�������friends
		Arrays.sort(friends, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o1.compareTo(o2));
			}
		});
		
		Arrays.sort(friends, (String o1, String o2)->o1.compareTo(o2));

		
		//========================================================================================
		
		//2.1ʹ�������ڲ��࣬����name��length����
		Arrays.sort(friends,new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o1.length()-o2.length());
			}
			
		});
		
		Arrays.sort(friends, (String o1,String o2)->(o1.length()-o2.length()));
		
		//========================================================================================
		//3.1ʹ�������ڲ��࣬�������һ����ĸ����
		Arrays.sort(friends, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.charAt(o1.length()-1)- o2.charAt(o2.length()-1);
			}
			
		});
		
		//3.2ʹ��lambda���ʽʵ��,���÷����Ĳ���������һ���࣬����ӿ�����ֻ����һ�����󷽷�
		Arrays.sort(friends,(String o1, String o2)->o1.charAt(o1.length()-1)- o2.charAt(o2.length()-1));
		
		for(String a:friends){
			System.out.println(a);
		}
		
	}
}
