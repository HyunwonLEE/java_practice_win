package leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwappingNodes1721 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split("");
		ListNode listnode = null;
		for (int i = 0; i < str.length; i++) {
			int a = Integer.parseInt(str[4 - i]);
			if (i == 0)
				listnode = new ListNode(a);
			else {
				listnode = new ListNode(a, listnode);
			}
		}

		System.out.println("end");

	}

}
