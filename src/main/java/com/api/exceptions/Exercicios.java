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
                // Scanner nao pode ser fechado por conta do try catch
            }
        }
    }
}