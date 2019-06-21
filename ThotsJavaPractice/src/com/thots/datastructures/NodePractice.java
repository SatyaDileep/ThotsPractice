/**
 * 
 */
package com.thots.datastructures;

import java.util.Scanner;

/**
 * @author thots
 * lets start data structures learning from scratch
 */

class Node{
	private int value;
	private Node next;
	
	Node (int value){
		this.value = value;
	}
	
	Node(int value, Node nodeVal){
		this.value = value;
		this.next = nodeVal;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}
	
}
public class NodePractice {

	public static Node[] arrayOfNodes;
	public static int lengthOfNodes;
	public static void main(String[] args) {
		Scanner scanEmUp = new Scanner(System.in);
		System.out.println("hey there..! welcome.. lets start initializing \n please enter the number of nodes..");
		lengthOfNodes = scanEmUp.nextInt();
		arrayOfNodes = new Node[lengthOfNodes];
		initializeNodeArray();
		// done with initializing -- lets iterate and print
		printNodeArray();
	}
	/**
	 * 
	 */
	private static void initializeNodeArray() {
		for(int i=0; i < lengthOfNodes; i++) {
			// lets initialize nodes with values in random fashion
			arrayOfNodes[i] = new Node((int)(Math.random()*100));
		}
		
		// link'em damnit..!
		for(int i=0; i != lengthOfNodes-1; i++) {
			arrayOfNodes[i].setNext(arrayOfNodes[i+1]);
		}
	}
	
	private static void printNodeArray() {
		String toPrint;
		for(Node eachNode : arrayOfNodes) {
			toPrint = eachNode.getNext() != null ? eachNode.getValue() +" --next-> "+eachNode.getNext().getValue() : eachNode.getValue() +" --next-> "+eachNode.getNext();
			System.out.println(toPrint);
		}
	}

}
