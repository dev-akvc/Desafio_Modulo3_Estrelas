package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoPessoa {
    public static List<Pessoa> listaPessoas = new ArrayList<>();

    public static Pessoa cadastrarPessoas(String nome, String cpf, String email, TipoPessoa tipoPessoa) {
        Pessoa pessoa = new Pessoa();
        listaPessoas.add(pessoa);
        return pessoa;
    }

}
