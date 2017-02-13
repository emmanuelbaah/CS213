package controller;

public class Node<T extends Comparable<T>> {
	
	Node<T> left;
	Node<T> right;
	T data;
	
	public Node(T data){
		this.data = data;
	}
	
	public Node(){
		
	}
}
