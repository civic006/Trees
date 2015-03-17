package patterson.nathan.tree.resources;

public class MainApp {

	public static void main(String args[]) {
		BasicTree myTree = new BasicTree(5);
		myTree.add(new BasicTreeNode(6));
		BasicTreeNode p = new BasicTreeNode(4);
		BasicTreeNode q = new BasicTreeNode(8);
		myTree.add(p);
		myTree.add(q);
		
		System.out.println(myTree.toString());
		System.out.println(myTree.getCommonAncestorsSimple(p, q).toString());
	}
}
