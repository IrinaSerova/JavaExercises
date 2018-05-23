package com.irinaserova;

public class ShuffleArrayV2 {

	public static void shuffle(Object[] array) {
		int numOfEl = array.length;
		for (int i = 0; i < numOfEl; i++) {
			int s = 1 +(int)(Math.random()* (numOfEl -1));
			Object temp = array[s];
			array[s] = array[i];
			array[i] = temp;
		}
	}
	
	
	public static void main(String[] args) {
		
		Object[] arrayN = {1,2,3};
		ShuffleArrayV2.shuffle(arrayN);
		for(int i = 0; i < arrayN.length; i++) {
			System.out.print(arrayN[i] + " ");
		}
	
		

	}

}
