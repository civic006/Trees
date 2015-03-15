package patterson.nathan.tree.resources;

public class MainApp {

	public static void main(String args[]) {
		BasicTree myTree = new BasicTree(new BasicTreeNode(6));
		myTree.add(new BasicTreeNode(8));
		myTree.add(new BasicTreeNode(5));
		System.out.println(myTree.toString());
	}
}
