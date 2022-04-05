package leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListCycle141 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		ListNode listnode = new ListNode(Integer.parseInt(arr[0]));
		for(int i = 0; i < arr.length; i++) {
			listnode.next = new ListNode(Integer.parseInt(arr[i]));
			
			
		}
		System.out.println("");
	}

	public boolean hasCycle(ListNode head) {
		int cnt = 0;
		if (head == null)
			return false;
		while (cnt < 10000) {
			if (head.next == null)
				return false;
			head = head.next;
			cnt++;

		}

		return true;
	}

}


