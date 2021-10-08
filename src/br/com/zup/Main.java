package br.com.zup;

public class Main {

    public static void main(String[] args) throws Exception {
        Sistema.menu();
        ServicoVenda.cadastrarVendas(Sistema.cadastrarCliente(), Sistema.cadastrarVendedor(),1000,"2/2");

    }
}
