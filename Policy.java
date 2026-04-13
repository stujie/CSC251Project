/**
   Name: Stutie Banerjie
   Class: CSC 251 - Advanced Java Programming
   Date: 3.22.2026
*/

public class Policy {
   // instance fields
   
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   
   /**
    * no-arg constructor
    * initializes all fields to default values
   */
   public Policy () {
      policyNumber = 0;
      providerName = null;
      policyHolder = null;
   }
   
   /** 
    * constructor w/ arguments
    * initializes all fields
    * @param num - policy number
    * @param pName - provider name
   */
   
   public Policy (int num, String pName, PolicyHolder ph) {
      policyNumber = num;
      providerName = pName;  
      policyHolder = ph;  
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
    * sets the policy holder
    * @param ph - the policy holder
   */
   
   
   public void setPolicyHolder (PolicyHolder ph) {
      policyHolder = ph;
   }   
   
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
    * gets policy holder 
    * @return policy holder information
   */
   
   public PolicyHolder getPolicyHolder () {
      return policyHolder;
   }
   

   /** 
    * calculate the insurance policy price based on the
    * policy holder information
    * @return the total policy price
   */
   
   public double calculatePolicyPrice () {
      double price = 600.0;
      double bmi = policyHolder.calculateBMI();
      
      if (policyHolder.getAge() > 50) {
         price += 75.0;
      }

      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
         price += 100.0;
      }
      if (bmi > 35.0) {
         price += (bmi - 35)*20;
      } 
      
      return price;
   }
   
   /**
    * toString method
    * returns policy holder information
   */
   public String toString() {
      return "Policy Number: " + policyNumber + "\n" +
          "Provider Name: " + providerName + "\n" +
          policyHolder.toString() +
          String.format("Policy Price: $%.2f\n", calculatePolicyPrice());
   }
}
