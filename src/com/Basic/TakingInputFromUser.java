package com.Basic;
import java.util.Scanner;
public class TakingInputFromUser {
      public static void main(String[]args) {
    	  //creating object of Scanner Class
    	  Scanner sc=new Scanner(System.in);
    	      
    	  
    	  //taking integer input
    	  System.out.println("Enter a no");
    	  int no=sc.nextInt();
    	  sc.nextLine();
    	  System.out.println("you entered: "+no);
    	  
    	  //Taking string input
    	  System.out.println("Enter your Name:");
    	   String name=sc.nextLine();
    	   System.out.println("you entered: "+name);
    	   
    	   sc.close();
      }
}
