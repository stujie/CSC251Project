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
         
         // create POlicyHolder object
         PolicyHolder ph = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         
         
         // instantiate a Policy object
         Policy user = new Policy(policyNumber, providerName, ph);
         
         // add to arraylist
         policies.add(user);
         
      }
      
      policyFile.close();
      
      // output all polices per user in array list  
      for (Policy user : policies) {
         // calls toString methods per user 
         System.out.println(user);
         
         // smoker counter increments
         if(user.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker")) {
            smoker++;
         }
         else {
            nonSmoker++;
         }
         
         // spacing
         System.out.println();
      }        
      
      // counter outprint
      System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + smoker); 
      System.out.println("The number of policies with a non-smoker is: " + nonSmoker);                               

   }
}
