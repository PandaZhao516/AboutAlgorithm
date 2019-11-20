/**

*@description TODO
*@author Panda

 */
package Algorithm;

import java.util.ArrayList;
import java.util.List;





/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019��9��11��
 */
public class TreeNodeSort1 {
	public List<Integer> inorderTraversal(TreeNode root){
		List<Integer> res = new ArrayList<>();
		helper(root,res);
		return res;
	}

	/**
	 * @param root
	 * @param res
	 */
	private void helper(TreeNode root, List<Integer> res) {
		// TODO Auto-generated method stub
		if (root != null) {
            if (root.getLeftNode() != null) {
                helper(root.getLeftNode(), res);
            }
            res.add(root.val);
            if (root.getRightNode() != null) {
                helper(root.getLeftNode(), res);
            }
        }

	}
	
	
	/**
	 * �������
	 */
	public void preTraverseBTree(TreeNode tn){
		if(tn!= null){
			//���ʸ��ڵ�
			System.out.println("���ʸ��ڵ�"+tn.val);
			//������ڵ�
			preTraverseBTree(tn.getLeftNode());
			preTraverseBTree(tn.getRightNode());
		}
	} 
	
	/**
	 * �������
	 */
	
	public void mediumTraverseBTree(TreeNode tn){
		if(tn!=null){
			preTraverseBTree(tn.getLeftNode());
			System.out.println("���ʽڵ�:"+tn.val);
			preTraverseBTree(tn.getRightNode());
		}
	} 

}

