package com.irinaserova;

import java.util.ArrayList;


public class AddNumberV2 {
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		int carry = 1;
		ArrayList<Integer> result = new ArrayList<>(A);
		int len = A.size();
		for (int i = len - 1; i >= 0; i--) {
			if (carry == 0) {
				// no need to check remaining digits
				break;
			}
			int digit = A.get(i);
			// plus 
			int num = digit + carry;
			if (num >= 10) {
				carry = num / 10;
				digit = num % 10;
			} else {
				carry = 0;
				digit = num;
			}
			result.set(i, digit);
		}
		// for 9 9 9
		if (carry != 0) {
			result.add(0, 1);
		}
		// remove  zeros
		int index = 0;
		while (index < result.size() && result.get(index) == 0) {
			result.remove(index);
		}

		return result;

	}
}

