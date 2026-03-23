/**
   Name: Stutie Banerjie
   Class: CSC 251 - Advanced Java Programming
   Date: 2.10.2026
*/

import java.util.*;
import java.io.*;

public class Project_Stutie_Banerjie {
   public static void main (String[] args) throws IOException{
      // arraylist - stores policy objects
      ArrayList<Policy> policies = new ArrayList<>();
      
      // counter variables
      int smoker = 0;
      int nonSmoker = 0;
      
      // read from file - policy information . txt
      File file = new File("PolicyInformation.txt");
      
      Scanner policyFile = new Scanner(file);
      
      // read till end of file
      while (policyFile.hasNext()) {
         // variable declarations
         int policyNumber = policyFile.nextInt();
         policyFile.nextLine();
         
         String providerName = policyFile.nextLine();
         String firstName = policyFile.nextLine();
         String lastName = policyFile.nextLine();
         
         int age = policyFile.nextInt();
         policyFile.nextLine();
         
         String smokingStatus = policyFile.nextLine();
         
         double height = policyFile.nextDouble();
         double weight = policyFile.nextDouble();
         
         
         // instantiate a Policy object
         Policy user = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
         
         // add to arraylist
         policies.add(user);
         
      }
      
      policyFile.close();
      
      // output all polices per user in array list  
      for (Policy user : policies) {
         System.out.println("Policy Number: " + user.getPolicyNumber());
         System.out.println("Provider Name: " + user.getProviderName());
         System.out.println("Policyholder's First Name: " + user.getFirstName());
         System.out.println("Policyholder's Last Name: " + user.getLastName());
         System.out.println("Policyholder's Age: " + user.getAge());
         System.out.println("Policyholder's Smoking Status: " + user.getSmokingStatus());
         System.out.println("Policyholder's Height: " + user.getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + user.getWeight() + " pounds");
         
         System.out.printf("Policyholder's BMI: %.2f%n", user.calculateBMI());     
         System.out.printf("Policy Price: $%.2f%n", user.calculatePolicyPrice());
         
         // space between individual policies
         System.out.println();
         
         // increment correct counter variable dependant on smoking status
         if (user.getSmokingStatus().equalsIgnoreCase("smoker")) {
            smoker++;
         }
         else {
            nonSmoker++;
         }
      }  
            
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
