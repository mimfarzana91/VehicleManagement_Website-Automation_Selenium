Steps:
1. Download/Clone the project/repo
2. Copy the project/repo in ~/eclipse-workspace
3. Open Eclipse>File>Import>Maven>Existing Maven Projects
4. Click Browse and select ~/eclipse-workspace & then click the checkbox and then click the Finish button
5.  Download geckidriver from here: (Download the file as per OS)
https://github.com/mozilla/geckodriver/releases/tag/v0.26.0
6. Expand the following:
FindVehicle-master>src/test/java>vehicle.reservation.lib
7. Double click on Baseconfiguration.java to open it
8. Change  from String DriverLocation =  "D:\\geckodriver-v0.26.0-win64\\geckodriver.exe"; to String DriverLocation =  �<Your gecko driver location�;
(N.B. For Windows OS please use ~\\geckodriver.exe & for Unix OS (I.e. Mac/Linux) use ~/geckodriver)
9. Right click on the project root and click on Build Path>Configure Build Path
10. Edit JRE System Library to Java SE 8 (Make sure that JDK 8 is installed & set it to PATH environment variable)
11. Click Help>Install New Software
12. On Work with: field type http://beust.com/eclipse/6.14.3. On the result click on the checkbox TestNG & then click Next.
13. Click Next again and then click I accept and then click Finish. Wait for the software to be installed.
14. Click Install Anyway & click Restart Now.
15. Expand the following:
FindVehicle-master>src/test/java>vehicle.reservation.testSteps
16. Right click on any of the .java files Run As>TestNG Test in order to start the automation script execution.