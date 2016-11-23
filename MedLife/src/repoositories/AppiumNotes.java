package repoositories;

public class AppiumNotes {
	//dumpsys window windows | grep -E 'mCurrentFocus|mFocusedApp'

	//u0 com.android.settings/com.android.settings.Settings$LocationSettingsActivity     }
	//in.fourthlion.ccd.mobileapp
//	adb shell pm list packages                              we get //net.one97.paytm
	//adb shell pm path net.one97.paytm                    path is here  (/data/app/net.one97.paytm-1/base.apk)
	//adb pull /data/app/net.one97.paytm-1/base.apk C:\Apps
	/*
	 * Find element AndroidUIautomator : driver.findElementByXPath("//UIAButton[@name='Allow'").click();

Automation on wifi without usb cable:
for older device connect with usb 
adb tcpip 5555
adb connect 10.0.0.1 // this is ip adress of phone 
remove usb and check adb devices

for adwanced device 
just enable adb over wifi and open commandprmt hit
adb connect 192.168.2.37(ip adress of phone)
	 */
	

}
