package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {


	@Parameters({"URL","username"})
	@Test(groups= {"Smoke"})
	public void thirdTest(String appurl,String uname) {
		
		System.out.println("world");
		System.out.println(appurl);
		System.out.println(uname);
	}
	
	@Test(dataProvider="getdata")
	public void Login(String username,String password) {
		
		System.out.println("world");
		System.out.println(username);
		System.out.println(password);
	}
	
	@BeforeTest
	public void FirstTest() {
		
		System.out.println("before test");
	}
	@DataProvider
	public Object[][] getdata() {
		
		// 1, 2, 3 set of data (username & password)
		Object[][] data = new Object[3][2];
		//1st set of data
		data[0][0] = "1username";
		data[0][1] = "password";
		
		//2nd set of data
		data[1][0] = "2username";
		data[1][1] = "password";		
		
		//3rd set of data
		data[2][0] = "3username";
		data[2][1] = "password";
		return data;
	}
	
}
