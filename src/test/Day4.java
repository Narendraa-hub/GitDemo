package test;

import org.testng.annotations.Test;

public class Day4 {


	@Test
	public void WebloginHomeLoan() {
		
		System.out.println("WebloginHomeLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileloginHomeLoan() {
		
		System.out.println("MobileloginHomeLoan");
	}
}
