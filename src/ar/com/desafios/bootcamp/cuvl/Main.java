package ar.com.desafios.bootcamp.cuvl;

import java.util.Scanner;

public class Main {
	
	public static boolean yearIsValid(int year) {
		return year >= 1900 && year <= 2099;
	}
	
	public static boolean yearIsLeap (int year) {
		return year%4 == 0;
	}
	
	public static boolean isValidMonth (int month) {
		return month >0 && month <= 12;
	}
	
	public static int expectedDays(int month, int year) {
		int expectedDays = 0;
		
		if((month <= 7 && month%2 != 0) || (month >=8 && month % 2 == 0)) {
			expectedDays = 31;
		} else {
			expectedDays = 30;
		} 
		
		if (month == 2 && yearIsLeap(year)) {
			expectedDays = 29;
		}
		if (month == 2 && !yearIsLeap(year)) {
			expectedDays = 28;
		}
		
		
		return expectedDays;
	}
	
	public static boolean dateIsValid(int day, int month, int year) {
		return yearIsValid(year) && 
				isValidMonth(month) && 
				day <= expectedDays(month, year) && 
				day > 0;
	}
	
	
	public static int[] parseDate(String date) {
		int[] dateIntArray = new int[0];
		
		String[] dateArray = date.split("/");
		for(String s : dateArray) {
			
			int[] aux = new int[dateIntArray.length +1];
			for(int i = 0 ; i < dateIntArray.length ; i++) {
				aux[i] = dateIntArray[i];
			}
			
			s = s.replaceAll("[a-zA-Z]", "0");
			aux[aux.length-1] = Integer.parseInt(s);
			dateIntArray = aux;
		}
		
		return dateIntArray;
	} 
	
		

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar fecha en formato dd/mm/aaaa");
		String usrDate = scanner.next();
		scanner.close();
				
		
		int[] dateArray = parseDate(usrDate);
		
		if(dateIsValid(dateArray[0],dateArray[1],dateArray[2])) {
			System.out.println("Fecha válida");			
		} else {
			System.out.println("Fecha inválida");			
		}
		
	}
}
