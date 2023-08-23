<h1 align="center"> Selenium Code - Java - CrossBrowser Testing - single test of sample application in 3 different browsers in docker running in AWS CodePipeline  </h1> <br>

<p align="center">
  Description: This is a demo testcase on java tech with TestNg framework.
There is a single test which opens the website: https://anupdamoda.github.io/AceOnlineShoePortal/index.html# and verifies the Title of the website and 
the same test is being performed in 3 different browsers: Google Chrome, Microsoft Edge, Mozilla Firefox
and this is being run in AWS Code pipeline 
</p>


## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Requirements](#requirements)
- [Quick Start](#quick-start)


## Introduction
This is a demo testcase on java tech with TestNg and selenium test.
https://anupdamoda.github.io/AceOnlineShoePortal/index.html#

## Features
Selenium Tests


## Test Requirements



### Local
* [Java 11 SDK](https://www.oracle.com/au/java/technologies/javase/jdk11-archive-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)
* [ChromeDriver](https://chromedriver.chromium.org/downloads)

## Execution modes ## 🤖 Starting up

command: come to the project file and perform "Docker Compose Up"
once the docker hub and nodes are up and running then perform the tests by right-clicking on the TestNG and running the tests.

This test is designed to run locally or in AWS Codepipeline:
push the code into Github first.

In order to configure the AWS code pipeline please follow these steps:

Click on 'Create pipeline'
![img.png](img.png)

Enter the details of the new pipeline
![img_1.png](img_1.png)

Select the Source
![img_2.png](img_2.png)

Click on 'Connect to GitHub'
![img_3.png](img_3.png)

Select the Repository & Branch
![img_4.png](img_4.png)

in the Build Stage select the "AWSCodebuild"
![img_5.png](img_5.png)

and details about the Region and Create Project
![img_6.png](img_6.png)

Enter the details of the Project and some description
![img_7.png](img_7.png)

and the details of the operating system as "Ubuntu" and the environment image as "Managed image"
and select the checkbox if you want docker engine to run
![img_8.png](img_8.png)

and select the build spec - which should be present in the project
![img_9.png](img_9.png)

***
Post setting up & running the AWS Codepipeline:

the success run would look like the below:
![img_10.png](img_10.png)

and the results would appear like the below:
![img_11.png](img_11.png)