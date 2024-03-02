/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ruanmattos.main;

import java.util.Locale;

/**
 *
 * @author aluno
 */
public class ExercicioLoja {

    /**
     * Crie um Loja seguindo as informações abaixo, e mostrando o que é descrito na TELA a seguir:
     *
     * String produto1 = "Computador"; String produto2 = "Mesa de Escritório";
     *
     * String nomePessoa = "nome"; int idade = 30; int código = 5290; char genero = 'F';
     *
     * double preco1 = 2.100; double preco2 = 650.50; double medidaDaMesa = 53.234567;
     *
     * TELA: Produtos: Computador está custando R$2100,00 Mesa de escritório está custando R$650,50
     *
     * Registro de pessoa: 30 anos, código 5290 e sexo: F
     *
     * Medida da Mesa com oito casas decimais: 53,23456700 Medida da Mesa com três casas decimais: 53,235 Medida da Mesa com Ponto decimal dos EUA:
     * 53.235
     *
     * @param args
     */
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de Escritório";

        String nomePessoa = "nome";
        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100;
        double preco2 = 650.50;
        double medidaDaMesa = 53.234567;

        System.out.println("Produtos:");
        System.out.println(produto1 + " está custando R$ " + preco1);
        System.out.println(produto2 + " está custando R$ " + preco2);
        System.out.println();
        System.out.println("Registro de Pessoas: " + idade + " anos, código " + codigo + " e sexo: " + genero);
        System.out.println();
        System.out.printf("Medida da Mesa com oito casas decimais: %.8f\n", medidaDaMesa);
        System.out.printf("Medida da Mesa com três casas decimais: %.3f\n", medidaDaMesa);
        Locale.setDefault(Locale.US);
        System.out.printf("Medida da Mesa com Ponto decimal dos EUA: %.3f\n", medidaDaMesa);

    }
}
