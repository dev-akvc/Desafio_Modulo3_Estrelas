package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("cliente1", "123456", "@cliente1", TipoPessoa.CLIENTE);
        Pessoa pessoa1 = new Pessoa("vendedor1", "234567", "@vendedor1", TipoPessoa.VENDEDOR);

        Venda venda = new Venda(pessoa1, 1000, "08/10/21");

        System.out.println(venda);
        System.out.println(pessoa);
    }
}
