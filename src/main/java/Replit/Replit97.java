package Replit;

import java.util.Scanner;

public class Replit97 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");

        String browser = sc.nextLine();

        if(browser.equalsIgnoreCase("Chrome")){
            System.out.println("Proceed with "  +browser+ " browser");

        }  else if (browser.equalsIgnoreCase("FireFox")) {
            System.out.println("Proceed with " +browser+ " browser");

        } else if (browser.equalsIgnoreCase("IE")) {
            System.out.println("Proceed with " +browser+ " browser");

        }else {
            System.out.println("Invalid browser");
        }

    }
}
