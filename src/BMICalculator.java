import java.util.Scanner;

	public class BMICalculator {
	   private double weight;
	   private double height;
	   private double bmi;
	   private int choice;
	   public BMICalculator() {
	   }
	   public void readUserData() {
	       
	       Scanner scnr = new Scanner(System.in);
	       while (true) {
	           
	           System.out.println("1.Weight in Pounds, Height in Inches.");
	           System.out.println("2.Weight in Kilograms, Height in meters.");
	           System.out.print("Enter Choice :");
	           choice = scnr.nextInt();
	           if (choice == 1) {
	               System.out.print("Enter Weight (in Pounds):");
	               weight = scnr.nextDouble();
	               if (weight < 0)
	            	   System.exit(0);
	               System.out.print("Enter Height (in inches):");
	               height = scnr.nextDouble();
	               if (height < 0)
	            	   System.exit(0);
	               break;
	           } else if (choice == 2) {
	               System.out.print("Enter Weight (in Kilograms):");
	               weight = scnr.nextDouble();
	               if (weight < 0)
	            	   System.exit(0);
	               System.out.print("Enter Height (in meters):");
	               height = scnr.nextDouble();
	               if (height < 0)
	            	   System.exit(0);
	               break;
	           } else {
	               System.out.println("*Inavlid Choice*");
	               continue;
	           }
	       }
	   }
	   public void calculateBmi() {
	       if (choice == 1) {
	          
	           bmi = (weight * 703) / (height * height);
	       } else {
	           bmi = weight / (height * height);
	       }
	   }
	   public void displayBmi() {
	       String category = "";
	       if (bmi < 18.5)
	           category = "Underweight";
	       else if (bmi >= 18.5 && bmi <= 24.9)
	           category = "Normal";
	       else if (bmi >= 25 && bmi <= 29.9)
	           category = "Overweight";
	       else if (bmi >= 30)
	           category = "Obese";
	       System.out.println("Your BMI is " + bmi);
	       System.out.println("You are classified as " + category);
	   }
	}
