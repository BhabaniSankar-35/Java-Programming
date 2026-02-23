/*Block of code performing some specific action when it's called.(method called through object but function called
  through it's name*/

package com.Basic;

public class MethodInJava {
	//method without parameter
	public void m1() {
		System.out.println("This is method ");
	}
	//method with parameter
    public void m2(int x) {
    	System.out.println(x);
    }
    
	public static void main(String[] args) {
		//obj creation
		MethodInJava obj=new MethodInJava();
		
		//Method call
		obj.m1();
        obj.m2(5);
	}

}
