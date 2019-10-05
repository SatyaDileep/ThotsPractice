package com.thots.basics;

public class DamnDumb {

	public static void main(String a[]) {
		MyAbstractTest myAbstractTest = new MyAbstractTest();
		myAbstractTest.tempMethod();
	}
	

}

abstract class AbstractTest{
	public AbstractTest() {
		System.out.println("oh man..!");
	}
	public void someRandomShit() {
		System.out.println("uhhhh leave it");
	}
	abstract void tempMethod();
}

class MyAbstractTest extends AbstractTest{

	public  MyAbstractTest() {
		super();
		System.out.println("oooo");
	}
	@Override
	void tempMethod() {
		super.someRandomShit();
		
	}
	
}

interface Human{
	void birth();
	void death();
}

class HumanImpl implements Human{

	private HumanImpl() {
		
	}
	
	private static final Human humanImpl = new HumanImpl();
	public static Human getInstance() {
		return humanImpl;
	}
	@Override
	public void birth() {
		System.out.println("inside humanIMpl birth");
	}

	@Override
	public void death() {
		System.out.println("inside humanIMpl death method");
	}
	
	private void eat() {
		System.out.println("eat");
	}
	
	public void tempMethod() {
		System.out.println("woo");
	}
	
}