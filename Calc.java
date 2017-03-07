import java.io.*;
		
public class Calc {
	public static void currencyCalcDollar(double userInputAmount) {
		double output = userInputAmount * 1.065;
		output = Math.round(output * 100);
		output = output/100;
		System.out.printf(userInputAmount + "€ is equal to " + output + "$\n"); //1.065
	}

	public static void currencyCalcYen(double userInputAmount) {
		double output = userInputAmount * 119.805;
		output = Math.round(output * 100);
		output = output/100;
		System.out.printf(userInputAmount + "€ is equal to " + output + "¥\n"); //119.805
	}
	
	public static void main(String[] args) throws IOException {
		while (true) {
		BufferedReader stdin =  new BufferedReader(new InputStreamReader( System.in ));
	
		System.out.println("Please choose a currency to convert into from Euro:");
		System.out.println("Dollar");
		System.out.println("Yen");
		
		String userInputCurrency = stdin.readLine();
		
		System.out.println("Now enter the amount to convert:");
		
		String x = stdin.readLine();
		
		double userInputAmount = Double.parseDouble(x);
		
		switch (userInputCurrency) {
		case "dollar": case "Dollar": case "$": currencyCalcDollar(userInputAmount);
		break;
		case "yen": case "Yen": case "¥": currencyCalcYen(userInputAmount);
		break;
		default: System.out.println("this is not a currency");
		break;
		}	
		}
	}
}
