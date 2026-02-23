//Array in java is a collection of similar/homogeneous type data.
package com.Basic;

public class ArrayInJava {

	public static void main(String[] args) {
		
        int [] arr=new int [4];// array declaration
         
        //array initialization
         arr[0]=1; arr[1]=1;
         arr[2]=1; arr[3]=1;
        
        System.out.println("Array elements arr");
        for(int i=0;i<4;i++) {
        	System.out.print(arr[i]+" ");
        }
        
	}

}
