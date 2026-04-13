/**
   Name: Stutie Banerjie
   Class: CSC 251 - Advanced Java Programming
   Date: 3.22.2026
*/

public class Policy {
   // instance fields
   
   private int policyNumber;
   private String providerName;
   
   /**
    * no-arg constructor
    * initializes all fields to default values
   */
   public Policy () {
      policyNumber = 0;
      providerName = null;
   }
   
   /** 
    * constructor w/ arguments
    * initializes all fields
    * @param num - policy number
    * @param pName - provider name
   */
   
   public Policy (int num, String pName) {
      policyNumber = num;
      providerName = pName;    
   }
   
   // mutator (setter) methods
   
   /** 
    * sets the policy number
    * @param num - the policy number to be set
   */
   
   public void setPolicyNumber (int num) {
      policyNumber = num;
   }
   
   /** 
    * sets the providers name
    * @param pName - the provider name to be set
   */
   
   public void setProviderName (String pName) {
      providerName = pName;
   }
   
   /** 
    * sets policy holder's first name
    * @param fName - the policy holder's first name to be set
   */
   
   
   // accesor (getter) methods
   
   /** 
    * gets policy number 
    * @return policy number
   */
   
   public int getPolicyNumber () {
      return policyNumber;
   }
   
   /** 
    * gets provider name 
    * @return provider name
   */
   
   public String getProviderName () {
      return providerName;
   }
   

   /** 
    * calculate the insurance policy price based on the
    * age, smoking status, and BMI of the policy holder
    * @return the total policy price
   */
   
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
