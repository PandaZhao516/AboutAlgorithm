/**

*@description TODO
*@author Panda

 */
package normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019��11��18��
 */
public class Greedy {
	public static void main(String[] args){
		HashMap<String,HashSet<String>> broadcasts = new HashMap<String,HashSet<String>>();
		broadcasts.put("K1", new HashSet<String>(Arrays.asList(new String[]{"ID","NV","UT"})));
		broadcasts.put("K2", new HashSet<String>(Arrays.asList(new String[] {"WA","ID","MT"})));
	    broadcasts.put("K3", new HashSet<String>(Arrays.asList(new String[] {"OR","NV","CA"})));
	    broadcasts.put("K4", new HashSet<String>(Arrays.asList(new String[] {"NV","UT"})));
	    broadcasts.put("K5", new HashSet<String>(Arrays.asList(new String[] {"CA","AZ"})));
	    
	  //��Ҫ���ǵ�ȫ������
        HashSet<String> allAreas = new HashSet<String>(Arrays.asList(new String[] {"ID","NV","UT","WA","MT","OR","CA","AZ"}));
        
        List<String> result = Algorithm(broadcasts,allAreas);
        System.out.println("selects:"+result);
	}
	
	public static List<String> Algorithm(HashMap<String,HashSet<String>> broadcasts,HashSet<String> allAreas){
		List<String> selects = new ArrayList<String>();
		HashSet<String> tempSet = new HashSet<>();
		String maxKey = null;
		
		while(allAreas.size()!=0){
			maxKey = null;
			for(String key : broadcasts.keySet()){
				tempSet.clear();
				HashSet<String> areas = broadcasts.get(key);
				tempSet.addAll(areas);
				//���������Ľ�������ʱtempSet�ᱻ��ֵΪ���������ݣ����Դ˴�ʹ����ʱ����
				tempSet.retainAll(allAreas);
				//����ü��ϰ����ĵ���������ԭ���Ķ�
				if(tempSet.size()>0&&(maxKey == null||tempSet.size()> broadcasts.get(maxKey).size())){
					maxKey = key;
				}
			}
			if (maxKey != null) {
                selects.add(maxKey);
                allAreas.removeAll(broadcasts.get(maxKey));
            }
		}
		return selects;
	}
}
