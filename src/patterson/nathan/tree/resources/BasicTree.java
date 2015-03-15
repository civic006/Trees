package patterson.nathan.tree.resources;

public class BasicTree {

	BasicTreeNode root = null;

	public BasicTree(BasicTreeNode root) {
		this.root = root;
	}

	public void add(BasicTreeNode p) {
		add(p, root);
	}

	private void add(BasicTreeNode p, BasicTreeNode q) {
		if (p.getData() < q.getData()) {
			if (q.getLeft() == null) {
				q.setLeft(p);
			} else {
				add(p, q.getLeft());
			}
		} else {
			if (q.getRight() == null) {
				q.setRight(p);
			} else {
				add(p, q.getRight());
			}
		}
	}

	public void getCommonAncestors(BasicTreeNode p, BasicTreeNode q) {
	}

	public String inOrderTraversal() {
		StringBuffer outString = new StringBuffer();
		return inOrderTraversal(outString, root).toString();
	}

	private StringBuffer inOrderTraversal(StringBuffer outString,
			BasicTreeNode p) {
		if (p != null) {
			inOrderTraversal(outString, p.getLeft());
			outString.append(p.getData() + " ");
			inOrderTraversal(outString, p.getRight());
		}
		return outString;
	}

	public String toString() {
		return inOrderTraversal();
	}
}
