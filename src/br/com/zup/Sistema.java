package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static Scanner dadosDeUsuario(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //menu inicial
    public static void menu() {
        System.out.println(" === Chocolates Chocolatudos === ");
        System.out.println("\t\tDigite: \n 1- Cadastrar cliente \n 2- Cadastrar vendedor \n 3- Cadastrar venda " +
                "\n 4- Histórico de cadastros \n 5- Histórico de transações  \n 0- Sair do Menu");
    }


    public static Pessoa cadastrarPessoa(TipoPessoa tipo) throws Exception {
        String nome = dadosDeUsuario(tipo == TipoPessoa.CLIENTE ? "Qual nome do cliente?" : "Qual nome do vendedor?").nextLine();
        String cpf = dadosDeUsuario(tipo == TipoPessoa.CLIENTE ? "Qual CPF do cliente?" : "Qual CPF do vendedor?").nextLine();
        String email = dadosDeUsuario(tipo == TipoPessoa.CLIENTE ? "Qual email do cliente?" : "Qual email do vendedor?").nextLine();
        return ServicoPessoa.cadastrarPessoa(nome, cpf, email, tipo);
    }

    public static Venda cadastrarVendas() throws Exception {
        String cpfCliente = dadosDeUsuario("Qual CPF do cliente?").nextLine();
        String emailVendedor = dadosDeUsuario("Qual email do vendedor?").nextLine();
        double valorASerPago = dadosDeUsuario("Qual valor da venda? ").nextDouble();
        String dataDeRegistro = dadosDeUsuario("Qual data da venda? ").nextLine();
        return ServicoVenda.cadastrarVendas(cpfCliente, emailVendedor, valorASerPago, dataDeRegistro);
    }

    public static List<Venda> pesquisarComprasPorCpf() throws Exception {
        String cpf = dadosDeUsuario("Qual CPF do cliente?").nextLine();
        List<Venda> pesquisarComprasPorCpf = ServicoVenda.pesquisarComprasPorCpf(cpf);
        System.out.println("O cliente tem " + pesquisarComprasPorCpf.size() + " compras");
        return pesquisarComprasPorCpf;
    }

    public static List<Venda> pesquisarVendasPorEmail() throws Exception {
        String email = dadosDeUsuario("Qual email do vendedor?").nextLine();
        List<Venda> pesquisarVendasPorEmail = ServicoVenda.pesquisarVendasPorEmail(email);
        System.out.println("O vendedor tem " + pesquisarVendasPorEmail.size() + " vendas");
        return pesquisarVendasPorEmail;
    }

    public static boolean executar() throws Exception {
        boolean executarMenu = true;

        while (executarMenu) {
            menu();

            int opcaoEscolhida = dadosDeUsuario("O que gostaria de fazer?").nextInt();
            switch (opcaoEscolhida) {

                case 1:
                    Pessoa pessoa = cadastrarPessoa(TipoPessoa.CLIENTE);
                    System.out.println(" = Cliente cadastrado = \n" + pessoa);
                    break;

                case 2:
                    pessoa = cadastrarPessoa(TipoPessoa.VENDEDOR);
                    System.out.println(" = Vendedor cadastrado = \n" + pessoa);
                    break;

                case 3:
                    cadastrarVendas();
                    ServicoVenda.exibirVendas();
                    break;

                case 4:
                    int opcaoLista = dadosDeUsuario("Digite: \n 1- Exibir clientes cadastrados \n 2- Exibir vendedores cadastrados").nextInt();
                    if (opcaoLista == 1) {
                        ServicoPessoa.exibirPessoas(TipoPessoa.CLIENTE);
                    }
                    if (opcaoLista == 2) {
                        ServicoPessoa.exibirPessoas(TipoPessoa.VENDEDOR);
                    } else {
                        System.out.println("Digite opção válida");
                    }
                    break;

                case 5:
                    int opcaoTransacoes = dadosDeUsuario("Digite: \n 1- Buscar compras por cliente " +
                            "\n 2- Buscar vendas por vendedor \n 3- Exibir todas as vendas").nextInt();
                    if (opcaoTransacoes == 1) {
                        String cpfCliente = dadosDeUsuario("Qual CPF do cliente?").nextLine();
                        ServicoVenda.pesquisarComprasPorCpf(cpfCliente);
                    }
                    if (opcaoTransacoes == 2) {
                        String emailVendedor = dadosDeUsuario("Qual email do vendedor?").nextLine();
                        ServicoVenda.pesquisarVendasPorEmail(emailVendedor);
                    }
                    if (opcaoTransacoes == 3) {
                        ServicoVenda.exibirVendas();
                    } else {
                        System.out.println("Digite opção válida");
                    }
                    break;

                case 0:
                    System.out.println("= Bye =");
                    executarMenu = false;
                    break;
            }
        }
        return executarMenu;
    }
}
