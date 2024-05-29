package uv_app.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Appium {
	
	@Test
	public void AppiumTest() throws MalformedURLException
	
	{
		UiAutomator2Options options = new UiAutomator2Options();
	options
AndroidDriver driver = new AndroidDriver(new URL("https://127.0.0.1:4723"), null);
}
}
