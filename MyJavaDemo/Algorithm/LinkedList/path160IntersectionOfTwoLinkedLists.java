/**

*@description TODO
*@author Panda

 */
package LinkedList;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019��9��24��
 */
public class path160IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		/**
		 * �������Ȳ ƴ��������
		 */
		ListNode ha = headA;
		ListNode hb = headB;
		while(ha!=hb){
			ha = (ha!=null)?ha.next:headB;
			hb = (hb!=null)?hb.next:headA;
		}
		return ha;
    }
}
