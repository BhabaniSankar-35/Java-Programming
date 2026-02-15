//Program to check a no is Even or Odd

package com.Basic;
import java.util.Scanner;

public class ConditionalSt {

	public static void main(String[] args) {
		//Creating Scanner obj
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a no to check even or odd");
		int no=sc.nextInt();
        
		if(no%2==0) {
			System.out.println("Entered no is a Even no");
		}
		else {
			System.out.println("Entered no is odd no");
		}
		sc.close();
	}
   
}
