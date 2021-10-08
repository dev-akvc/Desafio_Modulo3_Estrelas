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

    public static Pessoa cadastrarCliente() {
        TipoPessoa tipoPessoa = TipoPessoa.CLIENTE;
        String nome = dadosDeUsuario("Qual nome do cliente? ").nextLine();
        String cpf = dadosDeUsuario("Qual CPF do cliente? ").nextLine();
        String email = dadosDeUsuario("Qual email do cliente? ").nextLine();
        return ServicoPessoa.cadastrarPessoa(nome, cpf, email, tipoPessoa);
    }

    public static Pessoa cadastrarVendedor() {
        TipoPessoa tipoPessoa = TipoPessoa.VENDEDOR;
        String nome = dadosDeUsuario("Qual nome do vendedor? ").nextLine();
        String cpf = dadosDeUsuario("Qual CPF do vendedor? ").nextLine();
        String email = dadosDeUsuario("Qual email do vendedor? ").nextLine();
        return ServicoPessoa.cadastrarPessoa(nome, cpf, email, tipoPessoa);
    }

    public static Venda cadastrarVendas() {
        double valorASerPago = dadosDeUsuario("Qual valor da venda? ").nextDouble();
        String dataDeRegistro = dadosDeUsuario("Qual data da venda? ").nextLine();

        return ServicoVenda.cadastrarVendas(cadastrarCliente(), cadastrarVendedor(), valorASerPago, dataDeRegistro);
    }


}
