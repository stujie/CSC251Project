/**
   Name: Stutie Banerjie
   Class: CSC 251 - Advanced Java Programming
   Date: 2.10.2026
*/

public class Policy {
   // instance fields
   
   private int policyNumber, age;
   private String providerName, firstName, lastName;
   private String smokingStatus;    // smoker or non-smoker
   private double height, weight;   // inches & pounds
   
   // no-arg constructor
   
   public Policy () {
      policyNumber = 0;
      providerName = null;
      firstName = null;
      lastName = null;
      age = 0;
      smokingStatus = null;
      height = 0.0;
      weight = 0.0;
   }
   
   // constructor w/ arguments
   
   public Policy (int num, String pName, String fName, String lName, int a, String status, double h, double w) {
      policyNumber = num;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = status;
      height = h;
      weight = w;      
   }
   
   // mutator (setter) methods
   
   public void setPolicyNumber (int num) {
      policyNumber = num;
   }
   public void setProviderName (String pName) {
      providerName = pName;
   }
   public void setFirstName (String fName) {
      firstName = fName;
   }
   public void setLastName (String lName) {
      lastName = lName;
   }
   public void setAge (int a) {
      age = a;
   }
   public void setSmokingStatus (String status) {
      smokingStatus = status;
   }
   public void setHeight (double h) {
      height = h;
   }
   public void setWeight (double w) {
      weight = w;
   }
   
   // accesor (getter) methods
   
   public int getPolicyNumber () {
      return policyNumber;
   }  
   public String getProviderName () {
      return providerName;
   }
   public String getFirstName () {
      return firstName;
   }
   public String getLastName () {
      return lastName;
   }
   public int getAge () {
      return age;
   }
   public String getSmokingStatus () {
      return smokingStatus;
   }
   public double getHeight () {
      return height;
   }
   public double getWeight () {
      return weight;
   }
   
   // method to calculate BMI of the policyholder
   public double calculateBMI () {
      return (weight * 703.0)/(height * height);
   }
   
   // method to calculate the price of the insurance policy
   public double calculatePolicyPrice () {
      double price = 600.0;
      double bmi = calculateBMI();
      
      if (age > 50) {
         price += 75.0;
      }
      if (smokingStatus.equalsIgnoreCase("smoker")) {
         price += 100.0;
      }
      if (bmi > 35.0) {
         price += (bmi - 35)*20;
      } 
      
      return price;
   }
}
