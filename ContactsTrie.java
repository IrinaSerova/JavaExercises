package com.irinaserova;


import java.util.*;


public class ContactsTrie {
	private static Scanner in;
	public static class Node{
		public int size;
		public HashMapExercise<Character, Node> children = new HashMapExercise<Character, Node>();
		public Node(){
			this.size = 1;
		}
		public void addChild(Character charr, Node node){
			children.put(charr, node);
		}
	}
	public static class tries{
		Node root = new Node();
		public void addContact(String Name){
			//System.out.println("adding "+ Name);
			Node current = root;
			for(int i=0; i<Name.length(); i++){
				//System.out.println("adding "+Name.charAt(i));
				if(current.children.containsKey(Name.charAt(i))){
					//System.out.println("found");
					current = current.children.get(Name.charAt(i));
					current.size++;
				} else {
					//System.out.println("not found");

					Node temp = new Node();
					current.addChild(Name.charAt(i),temp);
					current = temp;

				}
			}
		}
		public int partialFind(String Name){
			Node current = root;
			for(int i=0; i<Name.length(); i++){
				if(current.children.containsKey(Name.charAt(i))){
					current = current.children.get(Name.charAt(i));
				} else {
					return 0;    
				}

			}
			return current.size;
		}
	}
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n = in.nextInt();
		tries phoneBook = new tries();
		for(int a0 = 0; a0 < n; a0++){
			String op = in.next();
			String contact = in.next();
			if(op.contains("add")){
				//System.out.println(contact);
				phoneBook.addContact(contact);
			}else{
				System.out.println(phoneBook.partialFind(contact));
			}
		}
	}
}