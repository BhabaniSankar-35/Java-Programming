package com.QuestionPractice;
import java.util.Scanner;

public class ReverseDigit {
	public static void reverse(int x) {
		int rev=0;
		while (x!=0) {
			int a=x%10;
			rev=rev*10+a;
			x/=10;
		}
		System.out.println("Revesre of the no is: "+rev);
	}

	public static void main(String[] args) {
		//scanner class object creation
		Scanner sc=new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter a no : ");
		int num=sc.nextInt();
       
		//function calling
		reverse(num);
		
		sc.close();
	}

}
