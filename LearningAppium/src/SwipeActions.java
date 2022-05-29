import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class SwipeActions extends DesiredCapabilitesClass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		/*
		 * We cannot use xpath if it has special characters like $
		 * driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		 * for example if in above case we have special character in Xpath then we can skip using it
		 * by using //*[@attribute='value']; so appium will search for all classes and then compare with 
		 * specified value and it's attribute
		 */
		driver.findElementByXPath("//*[@content-desc='9']").click();
		//Swiping Gesture
		TouchAction t=new TouchAction(driver);
		//long press on element for one second and then move to another element and then leave it
		WebElement first=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second=driver.findElementByXPath("//*[@content-desc='45']");
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(1)))
		.moveTo(element(second)).release().perform();
		

	}

}
