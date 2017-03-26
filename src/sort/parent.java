package sort;


public class parent {
	private int parent,left,right=-8888;

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}
	
	

	@Override
	public String toString() {
		if(right==-8888)
			return "parent [parent=" + parent + ", left=" + left + "]";
		return "parent [parent=" + parent + ", left=" + left + ", right=" + right + "]";
		
	}
	

}
