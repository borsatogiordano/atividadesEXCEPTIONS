package com.api.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicios {

    public static void ex1() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dividendo:");
        double dividendo = scanner.nextInt();

        System.out.println("Digite um divisor");
        double divisor = scanner.nextInt();

        try {
            System.err.println("A divisão de " + dividendo + " e " + divisor + " é igual a " + (dividendo / divisor));
        } catch (ArithmeticException e) {
            System.out.print("Erro: ");
            System.out.print(e.getMessage());
        }
        scanner.close();
    }

    public static void ex2() {

        Scanner scanner = new Scanner(System.in);

        boolean menu = true;

        while (menu) {
            System.out.println("""
                        Escolha a opção desejada:
                        1 -
                        2 -
                        3 -
                        4 - Sair
                    """);

            try {
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("Oi");
                        break;
                    case 2:
                        System.out.println("Hi");
                        break;
                    case 3:
                        System.out.println("Ça va");
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: " + e.getMessage());
                ex2();
                // chamando ex2 por que nao entra no try novamente
                // Scanner nao pode ser fechado por conta do try catch
            }
        }
    }

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);

        String nomes[] = { "Lucas", "Enzo", "Eloisa" };

        System.out.println("Escolha um número para o nome: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + " - " + nomes[i]);
        }

        try {
            int escolha = scanner.nextInt() - 1;
            try {
                System.out.println("Nome escolhido: " + nomes[escolha]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}