import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends Introduction {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElementByAndroidUIAutomator("attribut(\"value"\)")
		/*Java does not provide " inside " so for value we add \ as prefix and siggix before it's " so that it is 
		 * ignored
		 */
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		/*If we are going to identigy by prperty lik clickable, scrollable then we use following syntax 
		 * driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
		 */
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		// .size() will gove total results that satisfy the condition or statement
	}

}
