package patterson.nathan.tree.resources;

import java.util.HashSet;

public class BasicTree {

	private BasicTreeNode root = null;

	public BasicTree(int root) {
		this.root = new BasicTreeNode(root);
	}

	public void add(BasicTreeNode p) {
		add(p, root);
	}

	private void add(BasicTreeNode p, BasicTreeNode q) {
		if (p.getData() < q.getData()) {
			if (q.getLeft() == null) {
				q.setLeft(p);
				p.setParent(q);
			} else {
				add(p, q.getLeft());
			}
		} else {
			if (q.getRight() == null) {
				q.setRight(p);
				p.setParent(q);
			} else {
				add(p, q.getRight());
			}
		}
	}

	public BasicTreeNode getCommonAncestorsSimple(BasicTreeNode p, BasicTreeNode q) {
		HashSet<BasicTreeNode> mySet = new HashSet<BasicTreeNode>();
		while(q.getParent() != null){
			mySet.add(q.getParent());
			q = q.getParent();
		}
		while(p.getParent() != null){
			if(mySet.contains(p.getParent())){
				return p.getParent();
			}
		}
		return null;
	}

	public String inOrderTraversal() {
		StringBuffer outString = new StringBuffer();
		inOrderTraversal(outString, root);
		return outString.toString();
	}

	private void inOrderTraversal(StringBuffer outString,
			BasicTreeNode p) {
		if (p != null) {
			inOrderTraversal(outString, p.getLeft());
			outString.append(p.getData() + " ");
			inOrderTraversal(outString, p.getRight());
		}
	}

	public String toString() {
		return inOrderTraversal();
	}

	public BasicTreeNode getRoot() {
		return root;
	}	
}
