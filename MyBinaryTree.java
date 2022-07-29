
public class MyBinaryTree<K extends Comparable<K>>
{
	private MyBinaryNode<K> root;
	
	public void add(K key)
	{
		this.root=this.addREcursively(root,key);
	}

	private MyBinaryNode<K> addREcursively(MyBinaryNode<K> current, K key) {
		// TODO Auto-generated method stub
		if(current==null)
			return new MyBinaryNode<>(key);
		int compareResult=key.compareTo(current.key);
		if(compareResult==0) return current;
		if(compareResult<0)
		{
			current.left=addREcursively(current.left, key);
		}
		else
			current.right=addREcursively(current.right, key);
		return current;
	}
	public int getSize()
	{
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(MyBinaryNode<K> current) {
		// TODO Auto-generated method stub
		return current==null?0:1+this.getSizeRecursively(current.left)+getSizeRecursively(current.right);
	}
}
