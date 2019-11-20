/**

*@description TODO
*@author Panda

 */
package LinkedList;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019��9��20��
 */
public class path2AddTwoNumbers {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 	//��ʼ��
		 	ListNode dummyHead = new ListNode(0);
		    ListNode p = l1, q = l2, curr = dummyHead;
		    int carry = 0;
		    while (p != null || q != null) {
		    	//�п�
		        int x = (p != null) ? p.val : 0;
		        int y = (q != null) ? q.val : 0;
		        //��ֵ
		        int sum = carry + x + y;
		        //����λ������ǰֵ
		        carry = sum / 10;
		        curr.next = new ListNode(sum % 10);
		        //������һ�ν��еĲ���
		        curr = curr.next;
		        if (p != null) p = p.next;
		        if (q != null) q = q.next;
		    }
		    //�������Ľ�λ
		    if (carry > 0) {
		        curr.next = new ListNode(carry);
		    }
		    return dummyHead.next;	    
	 }
	 
}
