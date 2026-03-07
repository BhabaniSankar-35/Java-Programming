
/*When a child class inherit methods from parent class and change the implementation according to there
 * need this process called Method overriding
 */
package com.Oops;

class Parents{
	public void property() {
		System.out.println("Gold and Land");
	}
	public void marry() {
		System.out.println("Relatives girl");
	}
}

class Child extends Parents{
	
	public void marry() {
		System.out.println("Some Other Girl");//overriding the parent implementation
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		//Parent class object
		Parents p=new Parents();
		p.property();
		p.marry();
		
		//Child class object
		Child c=new Child();
		c.marry();
		
		//Child class object(Reference)
		Parents obj=new Child();//we can call both parents & child class methods by this object
		obj.marry();
		obj.property();
		
	}

}
