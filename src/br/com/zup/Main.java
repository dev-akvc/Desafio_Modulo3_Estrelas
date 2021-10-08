package br.com.zup;

public class Main {

    public static void main(String[] args) throws Exception {
        Sistema.menu();
        Pessoa pessoa = new Pessoa("cliente1", "123456", "@cliente1", TipoPessoa.CLIENTE);
        Pessoa pessoa1 = new Pessoa("vendedor1", "234567", "@vendedor1", TipoPessoa.VENDEDOR);
        ServicoVenda.cadastrarVendas(pessoa, 1000, "08/10/21");
    }
}
