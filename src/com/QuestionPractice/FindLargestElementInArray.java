
package com.QuestionPractice;
import java.util.Scanner;

public class FindLargestElementInArray {
	
	public static int large(int []arr) {
		int n=arr.length;
		int ans=arr[0];
		for(int i=1;i<n;i++) {
		  if (arr[i]>ans) {
			  ans=arr[i];
		  }
		}
		return ans;
	}

	public static void main(String[] args) {
		//creating scanner class object
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n=sc.nextInt();
		
		int []arr=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
       
		//method call
		System.out.println("The large element in array is: "+large(arr));
		
		sc.close();
		
	}

}
