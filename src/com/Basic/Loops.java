package com.Basic;

public class Loops {

	public static void main(String[] args) {
		//use of for loop
		for(int i=1;i<=10;i++) {
			System.out.print(i);
		}
		//use of while loop
		int n=1;
		while(n<=10) {
			System.out.print(n);
			n++;
		}
		
		//use of doWhile loop
		int a=1;
		do {
			System.out.println("printing time "+a);
			a++;
		}while(a<1);
	}

}
