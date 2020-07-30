package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day3 {

	@BeforeSuite
	public void beforesuite() {

		System.out.println("beforesuite");
	}

	@Parameters({"URL"})
	@Test(timeOut=4000)
	public void WebloginCarLoan(String appurl) {

		System.out.println("WebloginCarLoan");
		System.out.println(appurl);
	}

	@Test(groups= {"Smoke"})
	public void MobileloginCarLoan() {

		System.out.println("Mobilelogin");
	}

	@Test(enabled=false)
	public void MobilepayCarLoan() {

		System.out.println("Mobile pay");
	}

	@Test(dependsOnMethods= {"WebloginCarLoan","MobileloginCarLoan"})
	public void MobilesignoutCarLoan() {

		System.out.println("Mobile signout");
	}

	@Test
	public void MobilesignoutSuccessCarLoan() {

		System.out.println("Mobile signout success");
	}
	
	@AfterSuite
	public void aftersuite() {

		System.out.println("aftersuite");
	}

}
