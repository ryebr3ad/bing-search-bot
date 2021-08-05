# Bing Search Bot

Use Robot and Selenium to do quick hits of the Bing search page in order to amass points so I can get Amazon bucks.

The intent is to have this run as a task in Windows.  The easiest way to do this is to schedule a task that runs a batch program which navigates to the head of the Bing Search Bot project, runs `mvn compile` to build the project, then runs `mvn exec:java` to execute it.
  
The user needs to be logged in for this to execute; for now, this is a necessary evil.

Running this requires the Edge Web Driver which is located here: https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/.  Version doesn't really matter, just make sure it's more recent.  Also ensure that the location of this file matches the location specified in the 'webdriver_location' property of `src/main/resources/config.properties`, either by updating the property to your location of choice or matching the path set on the property.
