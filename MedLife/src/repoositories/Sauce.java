package repoositories;

public class Sauce {
/*
 https://wiki.saucelabs.com/display/DOCS/Getting+Started+with+Appium+for+Mobile+Native+Application+Testing

WebDriver driver = new AndroidDriver<WebElement>( new URL("http://SAUCE_USERNAME:SAUCE_ACCESS_KEY@ondemand.saucelabs.com:80/wd/hub"), capabilities);// for Android

WebDriver driver = new IOSDriver<WebElement>( new URL("http://SAUCE_USERNAME:SAUCE_ACCESS_KEY@ondemand.saucelabs.com:80/wd/hub"), capabilities);// for iOS

and other difference in sauce

Webdriver driver=new Webdriver(); normally

Webdriver driver= Webdriver.firefox(); in selenium

DesiredCapabilities cap= DesiredCapabilities.Android();
 cap.setCapabilities(....,....) ;
DesiredCapabilities caps = DesiredCapabilities.android();
caps.setCapability("appiumVersion", "1.4.16");
caps.setCapability("deviceName","Android Emulator");
caps.setCapability("deviceType","phone");
caps.setCapability("deviceOrientation", "portrait");
caps.setCapability("browserName", "");
caps.setCapability("platformVersion","5.1");
caps.setCapability("platformName","Android");
caps.setCapability("app","http://mycorp.intranet/myapp.apk");                                                            


  SAUCE_USERNAME:Santos_Das SAUCE_ACCESS_KEY:91df3934-6106-4e7d-b3c8-7b40d171da98
AndroidDriver driver= new AndroidDriver<AndroidElement>(new URL("http://SAUCE_USERNAME:91df3934-6106-4e7d-b3c8-7b40d171da98@ondemand.saucelabs.com:80/wd/hub"), cap));

http://SAUCE_USERNAME:SAUCE_ACCESS_KEY@ondemand.saucelabs.com:80/wd/hub")
curl -u <sauce_username>:<sauce_access_key> -X POST -H "Content-Type: application/octet-stream" https://saucelabs.com/rest/v1/storage/<sauce_username>/<upload_filename>?overwrite=true --data-binary @<path/to/your_file_name>
curl -u Santos_Das:91df3934-6106-4e7d-b3c8-7b40d171da98 -X POST -H "Content-Type: application\octet-stream" https:\\saucelabs.com\rest\v1\storage\base.apk?overwrite=true -data-binary @ base.apk
curl -u Santos_Das:91df3934-6106-4e7d-b3c8-7b40d171da98 -X POST -H "Content-Type: application\octet-stream" https:\\saucelabs.com\rest\v1\storage\selendroid-test-app-0.17.0.apk.zip?overwrite=true -data-binary @ E:\Apps\selendroid-test-app-0.17.0.apk.zip
curl -u Santos_Das:91df3934-6106-4e7d-b3c8-7b40d171da98 -X POST -H "Content-Type: application/octet-stream" https://saucelabs.com/rest/v1/storage/Santos_Das/base.apk?overwrite=true --data-binary @/C:/Users/santosh/base.apk
curl -u <Santos_Das>:<91df3934-6106-4e7d-b3c8-7b40d171da98> -X POST -H "Content-Type: application/octet-stream" https://saucelabs.com/rest/v1/storage/<Santos_Das>/<base.apk>?overwrite=true --data-binary @\C:/Users/santosh/base.apk>
 */
}
