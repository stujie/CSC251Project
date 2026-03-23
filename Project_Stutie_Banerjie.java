/**
   Name: Stutie Banerjie
   Class: CSC 251 - Advanced Java Programming
   Date: 2.10.2026
*/

import java.util.Scanner;

public class Project_Stutie_Banerjie {
   public static void main (String[] args) {
      // variables
      Scanner keyboard = new Scanner(System.in);
      int policyNumber, age;
      String providerName, firstName, lastName;
      String smokingStatus;    // smoker or non-smoker
      double height, weight;   // inches & pounds
   
      // user input
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      // instantiate a Policy object
      Policy user = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      // space between user input prompts & final output summary
      System.out.println();
      
      // final output  
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status: " + smokingStatus);
      System.out.println("Policyholder's Height: " + height + " inches");
      System.out.println("Policyholder's Weight: " + weight + " pounds");
      System.out.printf("Policyholder's BMI: %.2f%n", user.calculateBMI());     
      System.out.printf("Policy Price: $%.2f%n", user.calculatePolicyPrice());                   
   }
}
