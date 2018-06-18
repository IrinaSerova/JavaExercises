package com.irinaserova;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

import javax.swing.text.html.HTMLDocument.Iterator;

//print out the lyrics to 99 Bottles. Bottles of what? Make a variable for what is in the bottle
//		(so it can be easily changed) and start it out as “beer” or another beverage of your choice, 
//		if you would like. Also, extract a variable to represent the initial number of bottles.
public class Bottles {
	static int seed = 3;
	static String beverage = "beer";

	public static void main(String[] args) {

		List<String> phrase = new ArrayList<>();
		phrase.add("%d bottles of " + beverage + " on the wall.");
		phrase.add("%d bottles of " + beverage + "!");
		phrase.add("Take one down. Pass it around.");
		phrase.add("%t bottles of " + beverage + " on the wall.");

		List<String> endingPhrase = new ArrayList<>();
		endingPhrase.add("1 bottle of " + beverage + " on the wall, 1 bottle of " + beverage + ".");
		endingPhrase.add("Take one down and pass it around, no more bottles of " + beverage + " on the wall.");
		endingPhrase.add("No more bottles of " + beverage + " on the wall, no more bottles of " + beverage + ".");
		endingPhrase.add("Go to the store and buy some more, " + seed + " bottles of " + beverage + " on the wall.");

		Iterator<Integer> numberOfBottles = IntStream.iterate(seed, i -> i - 1)
				.limit(seed).boxed().iterator();

		while (numberOfBottles.hasNext()) {
			Integer bottle = numberOfBottles.next();

			if (numberOfBottles.hasNext()) {
				phrase.stream()
				.map(s -> s.replaceAll("%d", String.valueOf(bottle)))
				.map(s -> s.replaceAll("%t", String.valueOf(bottle - 1)))
				.forEach(System.out::println);
			} else {
				endingPhrase.stream().forEach(System.out::println);;
			}
		}
	}
}
