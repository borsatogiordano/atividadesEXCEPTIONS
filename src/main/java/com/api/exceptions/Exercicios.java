package com.api.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicios {

    public static void ex1() {

        Scanner scannerex1 = new Scanner(System.in);

        System.out.println("Digite um dividendo:");
        int dividendo = scannerex1.nextInt();

        System.out.println("Digite um divisor");
        int divisor = scannerex1.nextInt();

        try {
            System.err.println("A divisão de " + dividendo + " e " + divisor + " é igual a " + (dividendo / divisor));
        } catch (ArithmeticException e) {
            System.out.print("Erro: ");
            System.out.print(e.getMessage());
        }
        scannerex1.close();
    }

    public static void ex2() {

        boolean menu = true;

        Scanner scannerex2 = new Scanner(System.in);
        while (menu) {
            System.out.println("""
                        Escolha a opção desejada:
                        1 -
                        2 -
                        3 -
                        4 - Sair
                    """);

            try {
                int escolha = scannerex2.nextInt();

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
                    case 4:
                        scannerex2.close();
                        menu = false;
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: " + e.getMessage());
                scannerex2.next();
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
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        scanner.close();
    }

    public static void ex4() {

        Scanner scanner = new Scanner(System.in);
        boolean menuex4 = true;
        while (menuex4) {

            System.out.println("""
                    Escolha um dos exercicios para como ficará com as exceções personalizadas:
                    1 - Ex 1
                    2 - Ex 2
                    3 - Ex 3
                    """);

            try {
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:
                        Scanner sc = new Scanner(System.in);

                        System.out.println("Digite um dividendo:");
                        int dividendo = sc.nextInt();

                        System.out.println("Digite um divisor");
                        int divisor = sc.nextInt();

                        try {
                            System.err.println(
                                    "A divisão de " + dividendo + " e " + divisor + " é igual a "
                                            + (dividendo / divisor));
                        } catch (ArithmeticException e) {
                            System.out.print(new ExcecaoAritmetica().getMessage());
                        }
                        scanner.close();
                        break;
                    case 2:
                        Scanner scanner2 = new Scanner(System.in);
                        boolean menuex2 = true;

                        while (menuex2) {
                            System.out.println("""
                                    Escolha a opção desejada:
                                    1 -
                                    2 -
                                    3 -
                                    4 - Sair
                                    """);

                            try {
                                int escolhaex2 = scanner2.nextInt();

                                switch (escolhaex2) {
                                    case 1:
                                        System.out.println("Oi");
                                        break;
                                    case 2:
                                        System.out.println("Hi");
                                        break;
                                    case 3:
                                        System.out.println("Ça va");
                                        break;
                                    case 4:
                                        scanner2.close();
                                        menuex2 = false;
                                        break;
                                    default:
                                        System.out.println("Escolha inválida. Tente novamente.");
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println(new InputDiferente().getMessage());
                                scanner2.next(); // Limpar o buffer do scanner
                            }
                        }
                        break;
                    case 3:
                        Scanner scanner3 = new Scanner(System.in);
                        String nomes[] = { "Lucas", "Enzo", "Eloisa" };

                        System.out.println("Escolha um número para o nome: ");
                        for (int i = 0; i < nomes.length; i++) {
                            System.out.println((i + 1) + " - " + nomes[i]);
                        }

                        try {
                            int escolha3 = scanner3.nextInt() - 1;
                            System.out.println("Nome escolhido: " + nomes[escolha3]);
                        } catch (IndexForaDoLimite e) {
                            System.out.println("Erro: " + e.getMessage());
                        } catch (InputMismatchException e) {
                            System.out.println(new InputDiferente().getMessage());
                        }
                        break;

                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(new InputDiferente().getMessage());
            }
        }
    }
}