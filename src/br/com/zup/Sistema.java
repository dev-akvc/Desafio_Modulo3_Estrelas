package br.com.zup;

import java.util.Scanner;

public class Sistema {
    public static Scanner dadosDeUsuario(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //menu inicial
    public static void menu() {
        System.out.println("\t === Menu === ");
        System.out.println("\t\tDigite: \n[1] para cadastrar cliente \n[2] para cadastrar vendedor \n[3] para sair do Programa");
    }
}
