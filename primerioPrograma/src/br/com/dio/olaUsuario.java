package br.com.dio;

import java.util.Scanner;

public class olaUsuario {

	public static void main(String[] args) {
		
		String userName;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("DIGITE SEU NOME:");
		userName = keyboard.next();
		
		keyboard.close();
		
		System.out.println("=================");
		System.out.println("Olá " + userName + "!");
		System.out.println("=================");
	}

}


