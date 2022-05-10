package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Stack {

	private int size = 4;
	private int[] inp = new int[size];
	private int top = -1;
	private Scanner scanner = new Scanner(System.in);

	public Stack(int size, int top) {
		super();
		this.size = size;
		this.top = top;
	}
	
	
	public Stack() {
		super();
	}


	public void operate() {
		loop : do {
			int choice = displayOptions();
			switch (choice) {
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			default:
				break loop;
			}
		} while (true);
		System.out.println("Exiting stack operations");
	}

	private void display() {
		for(int i=top; i>=0; i--) {
			System.out.println(inp[i]);
		}
	}

	private void pop() {
		if(top < 0) {
			System.out.println("Stack empty, nothing to delete");
			return;
		}
		System.out.println(inp[top--]);
	}

	private void push() {
		if(top+1 == size) {
			System.out.println("Stack full, cannot insert more data");
			return;
		}
		inp[++top]=inputData();
	}

	private int displayOptions() {
		System.out.println("1. Insert \t 2. Delete\t 3.Display\t  4. Quit");
		return scanner.nextInt();
	}

	private int inputData() {
		System.out.println("Enter data to add to stack");
		return scanner.nextInt();
	}

	public int getSIZE() {
		return size;
	}

	public void setSIZE(int sIZE) {
		size = sIZE;
	}

	public int[] getInp() {
		return inp;
	}

	public void setInp(int[] inp) {
		this.inp = inp;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
}
