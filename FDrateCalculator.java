package com.polymorph;

import java.util.Scanner;

class RBI {
	double maturity;
	double rate=0;

	public void Fd(double principle, double tenure) {
		System.out.println("Maturity amount = " + (principle + ((principle * rate * tenure) / 100)));
		System.out.println("Interest = " + (principle + ((principle * rate * tenure) / 100) - principle));
	}

}

class HDFC extends RBI {
	@Override
	public void Fd(double principle1, double tenure1) {
		System.out.println("Maturity amount = " + (principle1 + ((principle1 * 7.5 * tenure1) / 100)));
		System.out.println("Interest = " + (principle1 + ((principle1 * 7.5 * tenure1) / 100) - principle1));
	}

}

class KOTAK extends RBI {

	@Override
	public void Fd(double principle2, double tenure2) {
		System.out.println("Maturity amount = " + (principle2 + ((principle2 * 7.0 * tenure2) / 100)));
		System.out.println("Interest = " + (principle2 + ((principle2 * 7.0 * tenure2) / 100) - principle2));
	}

}

class SBI extends RBI {
	@Override
	public void Fd(double principle3, double tenure3) {
		System.out.println("Maturity amount = " + (principle3 + ((principle3 * 9.5 * tenure3) / 100)));
		System.out.println("Interest = " + (principle3 + ((principle3 * 9.5 * tenure3) / 100) - principle3));
	}

}

class PNB extends RBI {
	@Override
	public void Fd(double principle4, double tenure4) {
		System.out.println("Maturity amount = " + (principle4 + ((principle4 * 8.0 * tenure4) / 100)));
		System.out.println("Interest = " + (principle4 + ((principle4 * 8.0 * tenure4) / 100) - principle4));
	}

}

class DBS extends RBI {
	@Override
	public void Fd(double principle, double tenure) {
		System.out.println("Maturity amount = " + (principle + ((principle * 7.2 * tenure) / 100)));
		System.out.println("Interest = " + (principle + ((principle * 7.2 * tenure) / 100) - principle));
	}

}

public class FDrateCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HDFC hdfc = new HDFC();
		KOTAK kotak = new KOTAK();
		SBI sbi = new SBI();
		PNB pnb = new PNB();
		DBS dbs = new DBS();


		boolean flag = true;
		do {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> FD CALCULATOR <<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("\nChoose bank>>>>>\tHDFC\tKOTAK\tSBI\tPNB\tDBS");
			System.out.println("\nEnter bank name = ");
			String bankname = sc.nextLine();
			
			switch (bankname.toUpperCase()) {

			case "HDFC":
				System.out.print("Enter amount = ");
				double principle1 = sc.nextDouble();
				System.out.print("Enter duration = ");
				double tenure1 = sc.nextDouble();
				hdfc.Fd(principle1, tenure1);
				break;

			case "KOTAK":
				System.out.print("Enter amount = ");
				double principle2 = sc.nextDouble();
				System.out.print("Enter duration = ");
				double tenure2 = sc.nextDouble();
				kotak.Fd(principle2, tenure2);
				break;

			case "SBI":
				System.out.print("Enter amount = ");
				double principle3 = sc.nextDouble();
				System.out.print("Enter duration = ");
				double tenure3 = sc.nextDouble();
				sbi.Fd(principle3, tenure3);
				break;

			case "PNB":
				System.out.print("Enter amount = ");
				double principle4 = sc.nextDouble();
				System.out.print("Enter duration = ");
				double tenure4 = sc.nextDouble();
				pnb.Fd(principle4, tenure4);
				break;

			case "DBS":
				System.out.print("Enter amount = ");
				double principle5 = sc.nextDouble();
				System.out.print("Enter duration = ");
				double tenure5 = sc.nextDouble();
				dbs.Fd(principle5, tenure5);
				break;

			default:
				System.out.print("Please enter valid name");
				continue;
			}

			System.out.println("\nDo you want to continue calculating FD rates? (yes/no)");
			String answer = sc.next();
			if (answer.equalsIgnoreCase("no")) {
				flag = false;
			} else if (!answer.equalsIgnoreCase("yes")) {
				System.out.println("Invalid input. Assuming 'no'");
				flag = false;
			}
			sc.nextLine(); // consume the remaining newline character from the input buffer
		} while (flag);
		System.out.println("Thank you visit again");

		sc.close();
	}

}

