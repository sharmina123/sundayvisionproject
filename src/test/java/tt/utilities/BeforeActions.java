package tt.utilities;
 
import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions { 
	@Before
	public void beforeAction(Scenario scen){//parameter=senario 
	System.out.println(">>initializing Chrom Driver");
	SetupDrivers.setupDriver();//connect set up driver to beforeaction class
	System.out.println(scen.getName());//printing senario i am working on 

	}
}
