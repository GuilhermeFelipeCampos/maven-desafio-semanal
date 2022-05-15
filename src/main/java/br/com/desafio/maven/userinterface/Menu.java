package br.com.desafio.maven.userinterface;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.desafio.maven.model.Produto;

public class Menu {
    public static void menu() {
        @SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        int id = 0;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            int option = teclado.nextInt();
            if (option == 1) {
                System.out.print("Digite a quantidade de produtos a cadastrar:");
                int n = teclado.nextInt();
                if (n == 0) {
                    continue;
                }
                for (int i = 1; i <= n; i++) {
                    System.out.printf("Digite o nome do %dº produto a cadastrar:", i);
                    teclado.nextLine();
                    String name = teclado.nextLine();
                    System.out.printf("Digite o Valor do %dº produto a cadastrar:", i);
                    double value = teclado.nextDouble();
                    System.out.printf("Digite a quantidade em estoque do %dº produto a cadastrar:", i);
                    int amount = teclado.nextInt();
                    id++;
                    Produto produto = new Produto(id, name, value, amount);
                    produtos.add(produto);

                }

            } else if (option == 2) {
                double total = 0;
                for (Produto produto : produtos) {
                    System.out.println(produto);
                    total += produto.getValue() * produto.getAmount();
                }
                System.out.println("Total = - - - - - - - - - - $" + total);
            } else {
                System.out.println("Opção inválida.");
            }
        } while (true);
    }
}
