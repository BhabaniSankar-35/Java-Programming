//Take user input and return the number of digit in that no
package com.QuestionPractice;
import java.util.Scanner;
public class CountNoOfDigit {
	public static int countDigit(int x) {
		int count=0;
		while(x!=0) {
			x=x/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a no: ");
		int n=sc.nextInt();
		
		int ans=countDigit(n);
		System.out.print("Sum of digit is: "+ans);
		sc.close();
	}

}
