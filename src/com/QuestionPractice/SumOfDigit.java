
//You have to take a no from user and give sum of that no to the user(outputScreen).

package com.QuestionPractice;
import java.util.Scanner;
public class SumOfDigit {
	public static int digitSum(int x) {
		int digit=0;
		int sum=0;
		while(x!=0) {
			digit=x%10;
			x=x/10;
			sum+=digit;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a no to see sum of Digit of that no");
		int num=sc.nextInt();
		
		System.out.println("Sum of digits are "+digitSum(num));
		
		//closing scannerClass
		sc.close();
	}

}
