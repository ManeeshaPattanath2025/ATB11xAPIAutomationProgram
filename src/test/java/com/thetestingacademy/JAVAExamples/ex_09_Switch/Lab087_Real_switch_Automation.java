package com.thetestingacademy.JAVAExamples.ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_switch_Automation {
    public static void main(String[] args) {
        //web automation
        //I will ask the user to give me the input
        //from the broser which he wants to
        //usse to i will start automation in that browser

        //String browser =args[0];
        // System.out.println(browser);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();

        switch (browser)
        {
            case "chrome":
            System.out.println("Starting the chrome");
            System.out.println(".......");
            System.out.println("TC1");
            System.out.println("TC2");
            break;
            case "firefox":
                System.out.println("starting the firefox browser");
                //Further code to start the firefox
                //Webdriver driver=new Firefox();//selenium code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
            default:
                System.out.println("I have no idea which browser id this");
                break;

        }
    }
}
