package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoPessoa {
    public static List<Pessoa> listaPessoas = new ArrayList<>();

    public static Pessoa cadastrarPessoa(String nome, String cpf, String email, TipoPessoa tipoPessoa) {
        Pessoa pessoa = new Pessoa(nome, cpf, email, tipoPessoa);
        listaPessoas.add(pessoa);
        return pessoa;
    }

    public static void exibirPessoas(){
        for (Pessoa referenciaPessoa: listaPessoas) {
            System.out.println(referenciaPessoa);
        }
    }


}
