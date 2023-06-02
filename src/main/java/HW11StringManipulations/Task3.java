package HW11StringManipulations;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Write a program that reads two people's first
        //names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy//Girl=Ariel
        //Suggested baby name: DANRY

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is Mom's first name?");
        String momName= scanner.next();
        System.out.println("What is Dad's First name?");
        String dadName= scanner.next();
        System.out.println("Gender is Boy or Girl?");
        String gender= scanner.next();
        String suggestedname=null;

        if(gender.equals("Boy")){
           suggestedname=dadName.substring(0,3) + momName.substring(2,4);
        }else if(gender.equals(("Girl"))){
            suggestedname=momName.substring(1,3) + dadName.substring(3,6);
        }
        System.out.println(suggestedname);



    }
}
