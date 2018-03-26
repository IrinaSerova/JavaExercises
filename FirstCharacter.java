package com.irinaserova;


//Given a string, find the first non-repeating character in it and 
//return it's index. If it doesn't exist, return -1.

// Scan the string from left to right and construct the count array.
//  Scan the string from left to right and check for count of each
// character, if you find an element who's count is 1, return it.
public class FirstCharacter {
	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	/* calculate count of characters 
	       in the passed string */
	static void charArray(String str) 
	{
		for (int i = 0; i < str.length();  i++)
			count[str.charAt(i)]++;
	}

	/* The method returns index of first non-repeating
	       character in a string. If all characters are repeating 
	       then returns -1 */
	static int firstNRepeating(String str)
	{
		charArray(str);
		int index = -1, i;

		for (i = 0; i < str.length();  i++)
		{
			if (count[str.charAt(i)] == 1)
			{
				index = i;
				break;
			}   
		}  

		return index;
	}

	
	public static void main (String[] args)
	{
		String str = "testing";
		int index =  firstNRepeating(str);

		System.out.println(index == -1 ? "Either all characters are repeating or string " +
				"is empty" : "First non-repeating character is " +  str.charAt(index));
	}
}

