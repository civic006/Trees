package patterson.nathan.tree.resources;

public class BasicTreeNode {
	
	private int data;
	private BasicTreeNode left = null;
	private BasicTreeNode right = null;
	private BasicTreeNode parent = null;

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

	public BasicTreeNode getParent() {
		return parent;
	}

	public void setParent(BasicTreeNode parent) {
		this.parent = parent;
	}
	
	public String toString(){
		StringBuffer myBuff = new StringBuffer();
		myBuff.append("THIS::\t" + this.getData() + "\n");

		myBuff.append("PARENT::");
		if(this.getParent() == null){
			myBuff.append("NULL");
		}else{
			myBuff.append(this.getParent().getData());
		}
		
		return myBuff.toString();
	}
	
}
