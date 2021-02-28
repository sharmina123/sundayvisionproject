package tt.utilities;



import cucumber.api.java.After;

public class AfterActions {
	
	@After
	public void AfterAction(){
		SetupDrivers.tearDownDriver();
		System.out.println("------ Test Completed");
		
	}

}
