package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Taxpayer;



public class Program {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);
		
		List<Taxpayer> taxPayerList = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			if (c != 'i' && c != 'c') {
				System.out.println("Invalid input!");
				i--;
				continue;
			}
			System.out.print("Name : ");
			String name = sc.nextLine();
			System.out.print("Annual Income : ");
			Double annualIncome = sc.nextDouble();
			if( c == 'i') {
				System.out.print("Health expenditures : ");
				Double healthCosts = sc.nextDouble();
				
				taxPayerList.add(new Individual(name, annualIncome, healthCosts));
				
			}else {
				System.out.print("Number of employees : ");
				int employeesNumber = sc.nextInt();
				
				taxPayerList.add(new Company(name, annualIncome, employeesNumber));
			}
			
			
		}
		 
		System.out.println("\nTAXES PAID:");
		Double sum = (double) 0;
		for (Taxpayer taxp : taxPayerList) {
			System.out.println(taxp);
			sum += taxp.taxCalc();
		}
		
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));
		
		
		sc.close();

	
		
	}
}
