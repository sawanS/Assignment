import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	
	int counter=0;
	int retrylimit=1;
	
	
	public boolean retry(ITestResult result) {


		if(counter<retrylimit)
		{
			
			System.out.println("Retrying test " + result.getName() + " with status "
                    + " for the " + (retrylimit+1) + " time(s).");
			
			counter++;
			return true;
		}
		
		
		
		return false;
	}

}
