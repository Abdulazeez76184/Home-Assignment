package week3.day1;

public class LoginTestData extends TestData{
	public void enterUsername() {
	
		System.out.println("Credentials");
	}
	
	public void enterPassword() {
	
		System.out.println("HomePage");
	}
	public static void main(String[] args) {
		LoginTestData c= new LoginTestData();
		c.enterCredentials();
		c.navigateToHomePage();
		c.enterUsername();
		c.enterPassword();

	}

}
