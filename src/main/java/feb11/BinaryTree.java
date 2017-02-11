package feb11;

public class BinaryTree {

	private BinaryTree left;
	private BinaryTree right;
	private int value;
	
	BinaryTree(int initialValue){
		this.value = initialValue;
	}
	
	public void insert(int newValue){
		if (newValue < value) {
			if (left == null) {
				left = new BinaryTree(newValue);
			} else {
				left.insert(newValue);
			}
		} else if (newValue > value) {
			if (right == null) {
				right = new BinaryTree(newValue);
			} else {
				right.insert(newValue);
			}
		}
	}
	
	public void printInOrder() {
		if (left != null) {
			left.printInOrder();
		}
		
		System.out.println(value);
		
		if (right != null) {
			right.printInOrder();
		}
	}
	
	public void printPreOrder() {
		
		System.out.println(value);
		
		if (left != null) {
			left.printPreOrder();
		}
		
		if (right != null) {
			right.printPreOrder();
		}
	}
	
	
}
