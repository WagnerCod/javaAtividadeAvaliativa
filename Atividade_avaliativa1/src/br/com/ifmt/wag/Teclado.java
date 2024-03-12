package br.com.ifmt.wag;

import java.util.Scanner;

public class Teclado {
	public static int lerInteiro(String rotulo) {
		try{
			System.out.println(rotulo);
			Scanner scann = new Scanner(System.in);
			return scann.nextInt();
		}catch(Exception e) {
			System.out.println("Apenas número! ");
		}
		return 0;
	}
	
	public static Double lerDouble(String rotulo) {
		try {
			System.out.println(rotulo);
			Scanner scann = new Scanner(System.in);
			return scann.nextDouble();			
		}catch(Exception e){
			System.out.println("Apenas numeros e sem ponto . ");
		}
		return 0.0;
	}
	
	public static String lerString(String rotulo) {
		System.out.println(rotulo);
		Scanner scann = new Scanner(System.in);
		return scann.nextLine();	
}
}
