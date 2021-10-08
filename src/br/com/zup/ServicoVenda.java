package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> listaVendas = new ArrayList<>();

    public static Venda cadastrarVendas(Pessoa cliente, Pessoa vendedor, double valorASerPago, String dataDeRegistro) {
        Venda venda = new Venda(cliente, vendedor, valorASerPago, dataDeRegistro);
        listaVendas.add(venda);
        return venda;
    }

}
