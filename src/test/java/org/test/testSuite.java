package org.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testSuite {
	
	@BeforeClass
	private void beforeclass() {
		System.out.println("before class");
	}
	
	
@Test
private void test() {
System.out.println("test");
}

@Test
private void test1() {
System.out.println("test1");
}

@Test
private void test2() {
System.out.println("test2");
}
	

	

}
