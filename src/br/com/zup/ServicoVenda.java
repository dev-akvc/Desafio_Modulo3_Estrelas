package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> listaVendas = new ArrayList<>();

    public static Venda cadastrarVendas(Pessoa cliente, Pessoa vendedor, double valorASerPago, String dataDeRegistro) throws Exception {
        Venda venda = new Venda(cliente, vendedor, valorASerPago, dataDeRegistro);
        listaVendas.add(venda);
        return venda;
    }

    public static void exibirVendas() {
        if (listaVendas.size() == 0) {
            System.out.println(" = Não há registro de vendas = ");
        } else {

            for (Venda referenciaVenda : listaVendas) {
                System.out.println("Estão cadstradas " +listaVendas.size() +" vendas\n" +referenciaVenda);
            }
        }
    }

    public static List<Venda> pesquisarComprasPorCpf(String cpf) {
        List<Venda> comprasPorCpf = new ArrayList<>();
        for (Venda pesquisarVenda : listaVendas) {
            if (pesquisarVenda.getCliente().getCpf().equals(cpf)) {
                comprasPorCpf.add(pesquisarVenda);
            }
        }
        return comprasPorCpf;
    }

    public static List<Venda> pesquisarVendasPorEmail(String email) {
        List<Venda> vendasPorEmail = new ArrayList<>();
        for (Venda pesquisarVenda : listaVendas) {
            if (pesquisarVenda.getVendedor().getEmail().equals(email)) {
                vendasPorEmail.add(pesquisarVenda);
            }
        }
        return vendasPorEmail;
    }

}
