import java.util.Scanner;

public class Exercise02_21
{
	public static void main(String[] args) 
        {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double dollars = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double rate = input.nextDouble();
		rate /= 1200;
		System.out.print("Enter number of years: ");
		int years = input.nextInt();
		double FutureValue = dollars * Math.pow(1 + rate, years * 12);
		System.out.println("Future value is $" + Math.round(FutureValue*100)/100.0);
	}    
}