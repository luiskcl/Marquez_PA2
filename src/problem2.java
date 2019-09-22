import java.util.Scanner;
public class problem2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		double weight;
		double height;
		double eqn;
		String userChoice;
		
		
		System.out.println("What equation do you want to use? ");
		System.out.println("Method one (lbs/in) or method two (kg/m)");
		System.out.print("Method: ");
			userChoice = scnr.next();
			
		
		if (userChoice.equals("one")) {
			System.out.println("Enter weight in pounds: ");
				weight = scnr.nextDouble();
		
			System.out.println("Enter height in inches: ");
				height = scnr.nextDouble();
			
				eqn = (703 * weight) / (Math.pow(height, 2));
		
				System.out.printf("BMI: %.1f\n", eqn);
				
			if (eqn < 18.5) {
				System.out.println("Underweight");
			}
			
			else if(eqn > 18.5 && eqn < 24.9) {
				System.out.println("Normal weight");
			}
			
			else if(eqn > 25 && eqn < 29.9) {
				System.out.println("Overweight");
			}
			
			else if(eqn > 30) {
				System.out.println("Obesity");
			}
		}
		
		else if (userChoice.equals("two")) {
			System.out.println("Enter weight in kilograms: ");
				weight = scnr.nextDouble();
				
			System.out.println("Enter height in meters: ");
				height = scnr.nextDouble();
				
			eqn = (weight) / (Math.pow(height, 2));
			
			System.out.printf("BMI: %.1f\n", eqn);
			
			if (eqn < 18.5) {
				System.out.println("Underweight");
			}
			
			else if(eqn > 18.5 && eqn < 24.9) {
				System.out.println("Normal weight");
			}
			
			else if(eqn > 25 && eqn < 29.9) {
				System.out.println("Overweight");
			}
			
			else if(eqn > 30) {
				System.out.println("Obesity");
			}
	}
		

}
}
