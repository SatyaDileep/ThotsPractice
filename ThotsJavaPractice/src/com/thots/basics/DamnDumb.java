package com.thots.basics;

/**
 * This class is just a dummy to execute any code that comes to mind for
 * reference
 */
public class DamnDumb {

	public static void main(final String a[]) {
		final AbstractTest myAbstractTest = new MyAbstractTest();
		myAbstractTest.tempMethod();

	}

}

abstract class AbstractTest {
	int myIntegerField = 5;

	public AbstractTest() {
		System.out.println(myIntegerField);
		myIntegerField = 6775;
		System.out.println("I was called from the default constructor of my child..!");
	}

	public AbstractTest(int a, int b) {
		System.out.println("lets see what happens " + a + "//" + b);
	}

	public void someRandomShit() {
		System.out.println("uhhhh leave it");
	}

	abstract void tempMethod();
}

class MyAbstractTest extends AbstractTest {

	public MyAbstractTest() {
		super(8, 9);
		System.out.println("We can use the field here.." + myIntegerField);
	}

	@Override
	void tempMethod() {
		super.someRandomShit();

	}

}

interface Human {
	void birth();

	void death();
}

class HumanImpl implements Human {

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

	public void tempMethod() {
		System.out.println("woo");
	}

}