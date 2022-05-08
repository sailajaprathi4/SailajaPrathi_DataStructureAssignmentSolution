package com.gl.DSA.GradedAssignment2;

class MNCMain
{
	public static Nodes node;
	static Nodes prevNode = null;
	static Nodes headNode = null;

	static void binaryTreeToSkewedBT(Nodes root,int order)
	{
			
		if(root == null)
		{
			return;
		}
	
		if(order > 0)
		{
			binaryTreeToSkewedBT(root.right, order);
		}
		else
		{
			binaryTreeToSkewedBT(root.left, order);
		}
		Nodes rightNode = root.right;
		Nodes leftNode = root.left;
	
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
	
		if (order > 0)
		{
			binaryTreeToSkewedBT(leftNode, order);
		}
		else
		{
			binaryTreeToSkewedBT(rightNode, order);
		}
	}

	static void traverseRightSkewed(Nodes root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.value + " ");
		traverseRightSkewed(root.right);	
	}

	public static void main (String[] args)
	{
	
		MNCMain.node = new Nodes(50);
		MNCMain.node.left = new Nodes(30);
		MNCMain.node.right = new Nodes(60);
		MNCMain.node.left.left=new Nodes(10);
		MNCMain.node.right.left=new Nodes(55);
		int order = 0;
		binaryTreeToSkewedBT(node, order);
		traverseRightSkewed(headNode);
	}
}
