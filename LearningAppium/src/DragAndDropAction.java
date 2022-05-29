import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragAndDropAction extends DesiredCapabilitesClass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		TouchAction t = new TouchAction(driver);
		//long press on source object-move to destination-release it there
		WebElement source = driver.findElementsByCssSelector("android.view.View").get(0);
		WebElement destination = driver.findElementsByCssSelector("android.view.View").get(1);
		//t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		/*
		 * We can use longPress in another way if only we want to long press (no toher action like
		 * hold or wait should be there
		 * t.longPress(lement(source)).moveTo(element(destination)).release().perform();
		 */
		t.longPress(element(source)).moveTo(element(destination)).release().perform();

	}

}
