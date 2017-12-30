/**
 * @author BikDS
 * December 28, 2017
 * The purpose of this class is to calculate the value of a monthly investment
 * after an inputed number of years, rate, and value
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class MonthlyInvestmentCalculator {
	public static void main(String[] args){
		
		System.out.println("Welcome to the future value calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
				while (choice.equalsIgnoreCase("y")){
					
					System.out.print("Enter monthly investment: ");
					double monthlyInvestment = Double.parseDouble(sc.nextLine());
					
					System.out.print("Enter yearly interest rate: ");
					double yearlyInterestRate = Double.parseDouble(sc.nextLine());
					
					System.out.print("Enter number of years: ");
					int years = Integer.parseInt(sc.nextLine());
					
					double monthlyInterestRate = yearlyInterestRate / 12 / 100;
					int months = years * 12;
					
					double futureValue = 0;
					int i = 1;
					while (i <= months){
						futureValue = futureValue + monthlyInvestment;
						double monthlyInterestAmount = futureValue * monthlyInterestRate;
						futureValue = futureValue + monthlyInterestAmount;
						i = i + 1;
						
					}
					
					System.out.println("Future value: " + NumberFormat.getCurrencyInstance().format(futureValue));
					System.out.println();
					
					System.out.print("Continue? (y/n): ");
					choice = sc.nextLine();
					System.out.println();
					
				}
				sc.close();
				System.out.println("Bye!");
	}

}
