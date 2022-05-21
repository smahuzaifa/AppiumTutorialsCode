import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
 
public class Gestures extends Introduction{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//Tap
		TouchAction t = new TouchAction(driver);
		WebElement expandlist = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandlist))).perform();
	}

}
