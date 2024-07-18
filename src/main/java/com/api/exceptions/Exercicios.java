package com.api.exceptions;

import java.util.Scanner;

public class Exercicios {

    public static void ex1() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dividendo:");
        int dividendo = scanner.nextInt();

        System.out.println("Digite um divisor");
        int divisor = scanner.nextInt();

        try {
            System.err.println("A divisão de " + dividendo + " e " + divisor + " é igual a " + (dividendo / divisor));
        } catch (ArithmeticException e) {
            System.out.print("Erro: ");
            System.out.print(e.getMessage());
        }
        scanner.close();
    }
}
