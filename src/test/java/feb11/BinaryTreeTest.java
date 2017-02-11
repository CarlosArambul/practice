package feb11;

import org.junit.Assert;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
    public void getHeight() {

		BinaryTree b = new BinaryTree(5);
		Assert.assertEquals(0, b.getHeight());
		
		b = new BinaryTree(5);
		b.insert(4);
		b.insert(2);
        Assert.assertEquals(2, b.getHeight());

    }
	
	
	@Test
    public void isBalancedHeight_should_return_false () {

		BinaryTree b = new BinaryTree(5);
		b.insert(4);
		b.insert(2);

        Assert.assertFalse(b.isHeightBalanaced());
        
        b = new BinaryTree(6);
		b.insert(4);
		b.insert(3);
		b.insert(2);
		b.insert(5);
		b.insert(9);
		b.insert(8);
		b.insert(10);
		b.insert(11);

    }
	
	@Test
    public void isBalancedHeight_should_return_true () {

		BinaryTree b = new BinaryTree(4);
		b.insert(5);
		b.insert(2);

        // unique
		Assert.assertTrue(b.isHeightBalanaced());

    }
	
}
