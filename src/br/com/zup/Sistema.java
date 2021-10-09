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
        System.out.print("\t\tDigite: \n 1- Cadastrar cliente \n 2- Cadastrar vendedor \n 3- Cadastrar venda");
        System.out.println("\n 4- Verificar compras \n 5- Verificar vendas \n 6- Sair do Menu");
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
                    List<Venda> compras = pesquisarComprasPorCpf();
                    System.out.println(compras);
                    break;

                case 5:
                    List<Venda> vendas = pesquisarVendasPorEmail();
                    System.out.println(vendas);
                    break;

                case 6:
                    System.out.println("= Bye =");
                    executarMenu = false;
                    break;
            }
        }
        return executarMenu;
    }
}
