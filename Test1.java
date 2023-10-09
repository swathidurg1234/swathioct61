package org.da;

public class Test1 {
public void myMethod() {
	System.out.println("i am method>>>");
	

}
{
	System.out.println("Instance Block");
	
}

public void f_class() {
	System.out.println("Constructor");	

}
static {
	System.out.println("Static Block");
	
}
public static void main(String[] args) {
	Test1 f=new Test1();
	f.f_class();
	f.myMethod();
	
}
}
