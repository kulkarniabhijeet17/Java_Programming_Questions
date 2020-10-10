package com.javase.interviewprograms;

// Que. Write a program to reverse a string
public class StringReversal {
	public static void main(String[] args) {
		String str = "Sachin Ramesh Tendulkar";
		StringBuffer str2 = new StringBuffer();
		str2.append(str);

		// Approach 1: Using reverse() method of StringBuffer/StringBuilder
		str2 = str2.reverse();
		System.out.println(str2);

		// Approach 2: Using charAt() method of String
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);

		// Approach 3: Using split() method of String
		reverse = "";
		String[] token = str.split("");
		for (int i = token.length - 1; i >= 0; i--) {
			reverse = reverse + token[i];
		}
		System.out.println(reverse);

		// Approach 4: Using toCharArray() method of String
		reverse = "";
		char chars[] = str.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			reverse = reverse + chars[i];
		}
		System.out.println(reverse);
	}
}