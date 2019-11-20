package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;

public class EachNode {
	class TreeNode{
		private String value = null;
		private TreeNode leftchildren = null;
		private TreeNode rightchildren = null;
		
		public TreeNode(String value,TreeNode leftchildren,TreeNode rightchildren){
			this.value = value;
			this.leftchildren = leftchildren;
			this.rightchildren = rightchildren;
		}
		public void setValue(String value) {
            this.value = value;
        }

        public void setLeftchildren(TreeNode leftchildren) {
            this.leftchildren = leftchildren;
        }

        public void setRightchildre(TreeNode rightchildre) {
            this.rightchildren = rightchildre;
        }

        public String getValue() {
            return value;
        }

        public TreeNode getLeftchildren() {
            return leftchildren;
        }

        public TreeNode getRightchildre() {
            return rightchildren;
        }
	}
	public TreeNode getTargetTree() {
	    // Ҷ�ӽڵ�
	    TreeNode G = new TreeNode("G", null, null);
	    TreeNode D = new TreeNode("D", null, null);
	    TreeNode E = new TreeNode("E",G,null);
	    TreeNode B = new TreeNode("B",D,E);
	    TreeNode H = new TreeNode("H", null, null);
	    TreeNode I = new TreeNode("I", null, null);
	    TreeNode F = new TreeNode("F",H,I);
	    TreeNode C = new TreeNode("C",null,F);
	    // ������ڵ�
	    TreeNode root = new TreeNode("A",B,C);
	    return root;
	}
	//�������������
	public void preorderVisitTreeNode(TreeNode node){
		if(null != node){
			System.out.print(node.value);
			if(null!= node.leftchildren){
				preorderVisitTreeNode(node.leftchildren);
			}
			if(null!= node.rightchildren){
				preorderVisitTreeNode(node.rightchildren);
			}
		}
	}
	/**
	 * 
	 * �������������
	 * �ȱ������ڵ㣬Ȼ��ڶ��㣬�����㣬���������ߣ�ͬ��ڵ�����������
	 * @param args
	 */
	public void levelorderVisitTreeNode(TreeNode node){
		if(null != node){
			LinkedList<TreeNode> list = new LinkedList<TreeNode>();
			list.add(node);
			TreeNode currentNode;
			while(!list.isEmpty()){
				currentNode = list.poll();
				System.out.print(currentNode.value);
				System.out.print("Ŀǰlist�ĳ�����"+list.size());
				if(null != currentNode.leftchildren){
					list.add(currentNode.leftchildren);
				}
				if(null != currentNode.rightchildren){
					list.add(currentNode.rightchildren);
				}
			}
		}
	}
	public static void main(String[] args){
		EachNode treeSearch = new EachNode();
		TreeNode tree = treeSearch.getTargetTree();
	//	treeSearch.preorderVisitTreeNode(tree);
		treeSearch.levelorderVisitTreeNode(tree);
	}
}

