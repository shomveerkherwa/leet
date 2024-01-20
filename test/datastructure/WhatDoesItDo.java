package datastructure;

public class WhatDoesItDo {

	public static void main(String[] args) {
		for (int i = 0; i <= Math.pow(3, 2); i++) {
			String s = convertToBinary(i, 3);
			System.out.println(s);
		}
	}

	public static String convertToBinary(int n, int digits) {
		StringBuilder sb = new StringBuilder();
		for (int i = digits - 1; i >= 0; i--) {
			int idk = n & 1 << i;
			sb.append((idk) != 0 ? "1" : "0");	
		}
		return sb.toString();
	}
}
