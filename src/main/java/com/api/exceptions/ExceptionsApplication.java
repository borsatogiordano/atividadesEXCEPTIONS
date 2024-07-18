package com.api.exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceptionsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExceptionsApplication.class, args);

		boolean menuPrincipal = true;

		Scanner scannerP = new Scanner(System.in);
		while (menuPrincipal) {
			System.out.println("""
					Escolha um dos exercícios
					1 - Ex 1
					2 - Ex 2
					3 - Ex 3
					4 - Ex 4
					""");

			try {
				int escolha = scannerP.nextInt();
				switch (escolha) {
					case 1:
						Exercicios.ex1();
						break;
					case 2:
						Exercicios.ex2();
						break;
					case 3:
						Exercicios.ex3();
						break;
					case 4:
						Exercicios.ex4();
						break;
					case 5:
						scannerP.close();
						menuPrincipal = false;
						System.out.println("Saindo do programa.");
						break;
					default:
						System.out.println("Escolha inválida. Tente novamente.");
						break;
				}
			} catch (NoSuchElementException e) {
				System.out.println(new InputDiferente().getMessage());
				scannerP.next(); // Limpar o buffer do scanner
			}
		}
	}
}
