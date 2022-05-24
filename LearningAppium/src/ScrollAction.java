import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollAction extends Introduction {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		/*
		 * There is no method in appium for scroll action.
		 * So we use Android API for that. We will now be bringing android api into appium
		 * Syntax:
		 * driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(attribute(\"value\"));");
		 */
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		//+ is seen above since the "" are going into 2nd line
		//Withing "" is android code to scroll
				

	}

}
