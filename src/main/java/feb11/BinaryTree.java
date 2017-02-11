package feb11;

public class BinaryTree {

	public BinaryTree left;
	public BinaryTree right;
	public int value;
	
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
	
	public int getHeight() {
		int rightHeight = 0;
		if (right != null) {
			rightHeight = right.getHeight() + 1;
		}
		
		int leftHeight = 0;
		if (left != null) {
			leftHeight = left.getHeight() + 1;
		}
		
		return rightHeight > leftHeight ? rightHeight: leftHeight;
		
	}
	
	public boolean isHeightBalanaced(){
		
		int leftHeight = -1;
		if (left != null){
			leftHeight = left.getHeight();
		}
		int rightHeight = -1;
		if (right != null){
			rightHeight = right.getHeight();
		}
		
		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}
		
		if (left != null && !left.isHeightBalanaced()) {
			return false;
		}
		
		if (right != null && !right.isHeightBalanaced()) {
			return false;
		}
		
		return true;
	}
	
	
}
