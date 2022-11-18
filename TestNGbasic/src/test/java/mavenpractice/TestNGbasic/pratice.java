package mavenpractice.TestNGbasic;

import org.testng.annotations.Test;

public class pratice {
@Test(groups="Regression")
public void login() {
	System.out.println("login");
}
@Test(groups="Sanity")
public void searchproduct() {
	System.out.println("searchproduct");
}
@Test(groups="smoke")
public void logout() {
	System.out.println("logout");
}
}
