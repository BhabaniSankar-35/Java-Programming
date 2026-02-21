package com.QuestionPractice;

public class FactorialNo {
   public static int fact(int num) {
	   int fact=1;
	   while(num!=0) {
		   fact*=num;
		   num--;
	   }
	   return fact;
   }
	public static void main(String[] args) {
		
		int ans=fact(8);
		System.out.println("Factoria of the no is: "+ans);

	}

}
