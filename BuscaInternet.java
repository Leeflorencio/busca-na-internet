package com.beecrowd;

import java.util.Scanner;

public class BuscaInternet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer numeroDePessoasTerceiroLink;
        Integer numeroDePessoasPrimeiroLink = 0;


        System.out.println("Digite o número de pessoas que clicaram no terceiro link: ");
        numeroDePessoasTerceiroLink = sc.nextInt();

        for (int i = 1; i<= 1000; i++){
            numeroDePessoasPrimeiroLink = (numeroDePessoasTerceiroLink * 2) * 2;
        }

        System.out.println(numeroDePessoasPrimeiroLink);
    }
}
