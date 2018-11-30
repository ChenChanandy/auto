package com.lemon.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		
		//当火狐浏览器未安装在默认路径时
		//System.setProperty("webdriver.firefox.bin", "火狐安装路径");
		
		//2.x版本的selenium是不需要驱动文件设置
		//3.x版本必须要火狐驱动文件
		System.setProperty("webdriver.gecko.driver", "src/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.baidu.com");

	}

}
