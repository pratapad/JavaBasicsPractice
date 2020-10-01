package remoteTesting.dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromeTest1 {

		public static void main(String[] args) throws MalformedURLException {
			// TODO Auto-generated method stub
			//RemoteWebDriver class should be initialized
			//URL is the class, is passed as first argument to remote webdriver
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("firefox");
			URL u =new URL("http://localhost:4444/wd/hub");
			RemoteWebDriver driver= new RemoteWebDriver(u,cap);
			driver.get("http://www.edwardjones.com");
			System.out.println(driver.getTitle());
		}

	}


