package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> listaVendas = new ArrayList<>();

    public static Venda cadastrarVendas(String cpfCliente, String emailVendedor, double valorASerPago, String dataDeRegistro) throws Exception {
        Pessoa cliente = ServicoPessoa.buscarCliente(cpfCliente);
        Pessoa vendedor = ServicoPessoa.buscarVendedor(emailVendedor);
        Venda venda = new Venda(cliente, vendedor, valorASerPago, dataDeRegistro);
        listaVendas.add(venda);
        return venda;
    }

    public static void exibirVendas() {
        if (listaVendas.size() == 0) {
            System.out.println(" = Não há registro de vendas = ");
        } else {

            for (Venda referenciaVenda : listaVendas) {
                System.out.println(referenciaVenda);
            }
        }
    }

    public static List<Venda> pesquisarComprasPorCpf(String cpf) throws Exception {
        List<Venda> comprasPorCpf = new ArrayList<>();
        for (Venda pesquisarVenda : listaVendas) {
            if (pesquisarVenda.getCliente().getCpf().equals(cpf)) {
                System.out.println(pesquisarVenda);
                comprasPorCpf.add(pesquisarVenda);
            }
        }
        throw new Exception(" = Não há compras nesse CPF = ");
    }

    public static List<Venda> pesquisarVendasPorEmail(String email) throws Exception {
        List<Venda> vendasPorEmail = new ArrayList<>();
        for (Venda pesquisarVenda : listaVendas) {
            if (pesquisarVenda.getVendedor().getEmail().equals(email)) {
                System.out.println(pesquisarVenda);
                vendasPorEmail.add(pesquisarVenda);
            }
        }
        throw new Exception(" = Não há vendas cadastradas nesse email = ");
    }
}
