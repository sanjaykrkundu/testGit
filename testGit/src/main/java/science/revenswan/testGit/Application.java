package science.revenswan.testGit;

import science.revenswan.testGit.service.TestService;

public class Application {

	
	
	public static void main(String[] args) {
		TestService service = new TestService();
		System.out.println("Hello World!");
		service.service1("sanjay");
	}
	
}
