import java.net.MalformedURLException;
import java.util.concurrent.*;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;
 
public class Gestures extends DesiredCapabilitesClass{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Adding implicit timeouts to make sure synchorisation errors are not happening
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//Tap
		TouchAction t = new TouchAction(driver);
		
		WebElement expandlist = driver.findElementByXPath("//android.widget.TextView[@text='Expandable "
				+ "Lists']");
		/*
		 * We are creating an onbject for webelement so that we can pass it's handler in withElement
		 * method and make the code simpler instead of passing a very long code as parameter of those
		 * method
		 */
		t.tap(tapOptions().withElement(element(expandlist))).perform();
	
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		
		WebElement pn = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2)))
		.release().perform();
		//We have to release after long press
		//Thread.sleep(100);
		System.out.println(driver.findElementByAndroidUIAutomator("text(\"Sample menu\")").isDisplayed());
	}

}
