/**
   Name: Stutie Banerjie
   Class: CSC 251 - Advanced Java Programming
   Date: 3.22.2026
*/

public class Policy {
   // instance fields
   
   private int policyNumber, age;
   private String providerName, firstName, lastName;
   private String smokingStatus;    // smoker or non-smoker
   private double height, weight;   // inches & pounds
   
   /**
    * no-arg constructor
    * initializes all fields to default values
   */
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
   
   /** 
    * constructor w/ arguments
    * initializes all fields
    * @param num - policy number
    * @param pName - provider name
    * @param fName - policy holder's first name
    * @param lName - policy holder's last name
    * @param a - policy holder's age
    * @param status - policy holder's smoking status (smoker or non-smoker)
    * @param h - policy holder's height (in inches)
    * @param w - policy holder's weight (in pounds)
   */
   
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
   
   public void setFirstName (String fName) {
      firstName = fName;
   }
   
   /** 
    * sets policy holder's last name
    * @param lName - the policy holder's last name to be set
   */
   
   public void setLastName (String lName) {
      lastName = lName;
   }
   
   /** 
    * sets policy holder's age
    * @param a - the policy holder's age to be set
   */
   
   public void setAge (int a) {
      age = a;
   }
   
   /** 
    * sets policy holder's smoking status
    * @param status - the policy holder's smoking status (smoker or non-smoker)
   */
   
   public void setSmokingStatus (String status) {
      smokingStatus = status;
   }
   
   /** 
    * sets policy holder's height
    * @param h - the policy holder's height to be set
   */
   
   public void setHeight (double h) {
      height = h;
   }
   
   /** 
    * sets policy holder's weight
    * @param w - the policy holder's weight to be set
   */
   
   public void setWeight (double w) {
      weight = w;
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
    * gets policy holder's first name
    * @return policy holder's first name
   */
   
   public String getFirstName () {
      return firstName;
   }
   
   /** 
    * gets policy holder's last name
    * @return policy holder's last name
   */
   
   public String getLastName () {
      return lastName;
   }
   
   /** 
    * gets policy holder's age
    * @return policy holder's age
   */
   
   public int getAge () {
      return age;
   }
   
   /** 
    * gets policy holder's smoking status
    * @return policy holder's smoking status
   */
   
   public String getSmokingStatus () {
      return smokingStatus;
   }
   
   /** 
    * gets policy holder's height
    * @return policy holder's height
   */
   
   public double getHeight () {
      return height;
   }
   
   /** 
    * gets policy holder's weight
    * @return policy holder's weight
   */
   
   public double getWeight () {
      return weight;
   }
   
   /** 
    * calculate the BMI of the policyholder
    * @return the calculated BMI
   */
   public double calculateBMI () {
      return (weight * 703.0)/(height * height);
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
      if (smokingStatus.equals("smoker")) {
         price += 100.0;
      }
      if (bmi > 35.0) {
         price += (bmi - 35)*20;
      } 
      
      return price;
   }
}
