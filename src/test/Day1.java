package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test(groups= {"Smoke"})
	public void FirstTest() {

		System.out.println("hello");
	}

	@Test
	public void SecondTest() {

		System.out.println("bye");
		Assert.assertTrue(false);
	}

	@AfterTest
	public void secondTest() {

		System.out.println("after test");
	}

}
