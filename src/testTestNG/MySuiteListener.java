package testTestNG;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuiteListener implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {

		System.out.println("--------------->> Test Suite " + suite.getName() + " is Started <<---------------");
		System.out.println("--------------->> Test Suite having methods: " + suite.getAllMethods().toString());

	}

	@Override
	public void onFinish(ISuite suite) {

		System.out.println("--------------->> Test Suite " + suite.getName() + " is Finished <<---------------");
		System.out.println("--------------->> Test Suite invoked methods: " + suite.getAllInvokedMethods().toString());

	}

}
