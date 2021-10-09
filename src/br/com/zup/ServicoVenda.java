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
        for (Venda referenciaVenda : listaVendas) {
            System.out.println(referenciaVenda);
        }
    }

    public static List<Venda> pesquisarComprasPorCpf(String cpf) throws Exception {
        List<Venda> comprasPorCpf = new ArrayList<>();
        for (Venda pesquisarVenda : listaVendas) {
            if (pesquisarVenda.getCliente().getCpf().equals(cpf)) {
                comprasPorCpf.add(pesquisarVenda);
            }
        }
        throw new Exception("= Nenhuma compra deste cliente foi localizada =");
    }

    public static List<Venda> pesquisarVendasPorEmail(String email) throws Exception {
        List<Venda> vendasPorEmail = new ArrayList<>();
        for (Venda pesquisarVenda : listaVendas) {
            if (pesquisarVenda.getVendedor().getEmail().equals(email)) {
                vendasPorEmail.add(pesquisarVenda);
            }
        }
        throw new Exception("= Nenhuma venda deste vendedor foi localizada =");
    }

//    public static Venda pesquisarVendasPorEmail(String email) throws Exception {
//        for (Venda pesquisarVenda : listaVendas) {
//            if (pesquisarVenda.getVendedor().getEmail().equals(email)) {
//                return pesquisarVenda;
//            }
//        }
//        throw new Exception("= Nenhuma venda deste vendedor foi localizada =");
//    }

}
