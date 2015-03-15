package patterson.nathan.tree.resources;

public class BasicTreeNode {
	
	int data;
	BasicTreeNode left = null;
	BasicTreeNode right = null;
	BasicTreeNode parent = null;

	public BasicTreeNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BasicTreeNode getLeft() {
		return left;
	}

	public void setLeft(BasicTreeNode left) {
		this.left = left;
	}

	public BasicTreeNode getRight() {
		return right;
	}

	public void setRight(BasicTreeNode right) {
		this.right = right;
	}
	
	
}
