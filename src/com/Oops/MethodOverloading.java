
//Method with same name different parameter list is called method overloading

package com.Oops;

public class MethodOverloading {
	//Method 1
	public int add(int a,int b) {
		return a+b;
	}
	/*Method 2 will not work because the parameter are same. Return type doesn't matter.
	public double add(int a, int b) {
		return a+b;
	}*/
	//Method 3
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	//Method 4
	public double add(double a, int b) {
		return a+b;
	}
    
	public static void main(String[] args) {
		//Object creation 
		MethodOverloading obj=new MethodOverloading();
		//Method call
        System.out.println(obj.add(5.67,5));//Method 4 will execute
        System.out.println(obj.add(5,6));//Method 1 Will execute
        System.out.println(obj.add(5,8,9));//Method 3 will execute
        
	}

}
