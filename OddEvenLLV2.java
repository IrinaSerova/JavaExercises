package com.irinaserova;
import java.util.*;

import com.irinaserova.OddEvenLL.ListNode;

public class OddEvenLLV2 {
	public ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null) return head;

		ListNode odd = head;
		ListNode even= head.next;
		ListNode evenhead = head.next; //this stores even list's head
		ListNode next = even.next; //start from 3rd element

		while (next != null) {
			if (even.next == next) {
				odd.next = next;
				odd = next;
			}
			else {
				even.next = next;
				even = next;
			}

			next = next.next;
		}

		odd.next = evenhead;
		even.next = null; //need to cut off even's tail or you'll get a loop

		return head;
	}
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}