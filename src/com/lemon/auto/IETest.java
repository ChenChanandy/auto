package com.lemon.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IETest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "src/IEDriverServer.exe");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//1:忽略IE浏览器保护模式的设置
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		//2:忽略浏览器的缩放设置
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		
		//通过驱动打开浏览器
		WebDriver driver = new InternetExplorerDriver(capabilities);
		
		//在浏览器中输入一个url
		driver.get("http://www.baidu.com");

	}

}
