package io.github.leandrofariasfl.tamagotchi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== BEM-VINDO AO SIMULADOR DE TAMAGOTCHI =====");

        System.out.println("\n--- Criando o Tamagotchi 1 ---");
        System.out.print("Digite o nome: ");
        String nome1 = sc.nextLine();

        System.out.print("Digite a fome (0 a 100): ");
        int fome1 = sc.nextInt();

        System.out.print("Digite a saúde (0 a 100): ");
        int saude1 = sc.nextInt();

        System.out.print("Digite a idade: ");
        int idade1 = sc.nextInt();

        Tamagotchi tamagotchi1 = new Tamagotchi(nome1, fome1, saude1, idade1);

        sc.nextLine();

        System.out.println("\n--- Criando o Tamagotchi 2 ---");
        System.out.print("Digite o nome: ");
        String nome2 = sc.nextLine();

        System.out.print("Digite a fome (0 a 100): ");
        int fome2 = sc.nextInt();

        System.out.print("Digite a saúde (0 a 100): ");
        int saude2 = sc.nextInt();

        System.out.print("Digite a idade: ");
        int idade2 = sc.nextInt();

        Tamagotchi tamagotchi2 = new Tamagotchi(nome2, fome2, saude2, idade2);

        int opcao = 0;
        int escolhaBichinho;

        while (opcao != 5) {
            System.out.println("\n===== MENU DE AÇÕES =====");
            System.out.println("1 - Alterar Fome (Alimentar)");
            System.out.println("2 - Alterar Saúde (Curar/Machucar)");
            System.out.println("3 - Alterar Idade (Fazer aniversário)");
            System.out.println("4 - Imprimir Status dos Tamagotchis");
            System.out.println("5 - Sair do Jogo");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quem você quer alimentar?");
                    System.out.println("1 - " + tamagotchi1.getNome());
                    System.out.println("2 - " + tamagotchi2.getNome());
                    System.out.print("Escolha: ");
                    escolhaBichinho = sc.nextInt();

                    if (escolhaBichinho == 1) {
                        System.out.print("Digite a nova fome para o " + tamagotchi1.getNome() + ": ");
                        tamagotchi1.setFome(sc.nextInt());
                    } else if (escolhaBichinho == 2) {
                        System.out.print("Digite a nova fome para o " + tamagotchi2.getNome() + ": ");
                        tamagotchi2.setFome(sc.nextInt());
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    System.out.println("De quem você quer alterar a saúde?");
                    System.out.println("1 - " + tamagotchi1.getNome());
                    System.out.println("2 - " + tamagotchi2.getNome());
                    System.out.print("Escolha: ");
                    escolhaBichinho = sc.nextInt();

                    if (escolhaBichinho == 1) {
                        System.out.print("Digite a nova saúde para o " + tamagotchi1.getNome() + ": ");
                        tamagotchi1.setSaude(sc.nextInt());
                    } else if (escolhaBichinho == 2) {
                        System.out.print("Digite a nova saúde para o " + tamagotchi2.getNome() + ": ");
                        tamagotchi2.setSaude(sc.nextInt());
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    System.out.println("De quem você quer alterar a idade?");
                    System.out.println("1 - " + tamagotchi1.getNome());
                    System.out.println("2 - " + tamagotchi2.getNome());
                    System.out.print("Escolha: ");
                    escolhaBichinho = sc.nextInt();

                    if (escolhaBichinho == 1) {
                        System.out.print("Digite a nova idade para o " + tamagotchi1.getNome() + ": ");
                        tamagotchi1.setIdade(sc.nextInt());
                    } else if (escolhaBichinho == 2) {
                        System.out.print("Digite a nova idade para o " + tamagotchi2.getNome() + ": ");
                        tamagotchi2.setIdade(sc.nextInt());
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Status Atual ---");
                    tamagotchi1.imprimir();
                    tamagotchi2.imprimir();
                    break;

                case 5:
                    System.out.println("\nEncerrando o simulador... Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}