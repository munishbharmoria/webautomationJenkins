import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportsClass {
	ExtentReports extent;
	ExtentTest logger;
	
	public void startTest()
	{
		extent= new ExtentReportsClass(System.getProperty("user.dir")+"webautomation-master\\src\\main\\resources\\reports",true);
		extent.addSystemInfo("Host Name"," Cucumber Demo");
		extent.loadConfig(new File(System.getProperty("user.dir"+"\\src\\main\\resources\\config\\extentReport-config.xml")));
	}

}
