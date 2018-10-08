# FloowDriveTest


Setup Instructions:

Step 1: Install Android Studio and set Android envionment in Environment variables.

Installing "Android Studio IDE" and "Android SDK"

    Step 0: Pre-Installation Check List. Before installing Android SDK, you need to install Java Development Kit (JDK). ...

    Step 1: Install "Android Studio IDE"

    Step 2: Installing Android SDK

Step 2: Install Genymotion(an Emulator for personal use)

Please find the below link for Genymotion Installation.

http://www.thedevline.com/2014/04/how-to-set-up-genymotion-fast-easy.html

Step 3: How to execute test on real android devices

            1. For test to run on devices, we need to make sure :
            
            2. USB Debugging is enabled
            
            3. ADB lists your devices into the connected devices
            
            4. Changing the Desired capability as per the hardware
            
            5. Enabling USB Debugging:
            
            6. By default, Android devices do not have USB Debugging enabled, these are under Developer Options. To turn them on,
            
            7. Navigate to Settings app on phone
            
            8. Scroll down and click on the Developer Options
            
            8. Turn on the Developer Options and click the USB Debugging

Step 4: Install Appium for windows.
    Install Appium Desktop:
    
    Step 1) Go to http://appium.io/ and click on Download Appium.
    
    Step 2) For Windows, select the exe file and download. ...
    
    Step 3) Click on the downloaded exe...
    
    Step 4) Next you will see the Server Start Window.

    Step 5) Appium will start in default port:4723

Usage:

Step 1: git clone https://github.com/vvidyasagar1/FloowDriveTest.git

Step 2: cd FloowDriveTest

Step 3: Configure Device ID in testng.xml file

Step 3: mvn test.


(OR)

Step 1: 
Download and import FloowDriveTest in to eclipse

    1. go to Project -> Build Automatically and deselect the option.

    2. Open your existing workspace in Eclipse.

    3. In the Eclipse menu, choose File -> Import.

    4. Expand the General folder and select Existing Projects into Workspace, then click Next. ...

    5. You should now see the Import Projects dialog.

    6. Select Finish.

Step 2:
Run pom.xml file


Step 3: 
Reports Location:

      observe 'emailable-report.html' in test-output folder.
    
    










