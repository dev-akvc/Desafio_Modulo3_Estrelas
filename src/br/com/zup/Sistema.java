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
        System.out.println("\t\tDigite: \n[1] para cadastrar cliente \n[2] para cadastrar vendedor \n[3] para cadastrar venda \n[4] para sair do Programa");
    }

    public static Pessoa cadastrarPessoa(TipoPessoa tipo) throws Exception {

        String nome = dadosDeUsuario(tipo == TipoPessoa.CLIENTE ? "Qual nome do cliente?" : "Qual nome do vendedor?").nextLine();
        String cpf = dadosDeUsuario(tipo == TipoPessoa.CLIENTE ? "Qual CPF do cliente?" : "Qual CPF do vendedor?").nextLine();
        String email = dadosDeUsuario(tipo == TipoPessoa.CLIENTE ? "Qual email do cliente?" : "Qual email do vendedor?").nextLine();
        return ServicoPessoa.cadastrarPessoa(nome, cpf, email, tipo);
    }

    public static Venda cadastrarVendas() throws Exception {
        double valorASerPago = dadosDeUsuario("Qual valor da venda? ").nextDouble();
        String dataDeRegistro = dadosDeUsuario("Qual data da venda? ").nextLine();
        return ServicoVenda.cadastrarVendas(cadastrarPessoa(TipoPessoa.CLIENTE),cadastrarPessoa(TipoPessoa.VENDEDOR) ,valorASerPago, dataDeRegistro);
    }


}
