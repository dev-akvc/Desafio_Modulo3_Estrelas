package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoPessoa {
    public static List<Pessoa> listaClientes = new ArrayList<>();
    public static List<Pessoa> listaVendedores = new ArrayList<>();
    public static Pessoa pessoa;

    public static Pessoa cadastrarPessoa(String nome, String cpf, String email, TipoPessoa tipoPessoa) {
        pessoa = new Pessoa(nome, cpf, email, tipoPessoa);
        if (tipoPessoa == TipoPessoa.CLIENTE) {
            listaClientes.add(pessoa);
        } else {
            listaVendedores.add(pessoa);
        }
        return pessoa;
    }

    public static void exibirPessoas(TipoPessoa tipo) {
        if (tipo == TipoPessoa.CLIENTE) {
            for (Pessoa referenciaPessoa : listaClientes) {
                System.out.println(referenciaPessoa);
            }
        } else {
            for (Pessoa referenciaPessoa : listaVendedores) {
                System.out.println(referenciaPessoa);

            }
        }
    }


}
