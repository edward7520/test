package com.my.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ���ڵ�
 * 
 * @author edward
 * @version 1.0
 *
 */
public class TreeNode {

	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();

	public TreeNode(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	// ��Ӻ��ӽڵ�
	public void add(TreeNode node) {
		children.add(node);
	}

	// ɾ�㺢�ӽڵ�
	public void remove(TreeNode node) {
		children.remove(node);
	}

	// ȡ�ú��ӽڵ�
	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}
}
