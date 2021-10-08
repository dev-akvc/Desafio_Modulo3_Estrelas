package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoPessoa {
    public static List<Pessoa> listaClientes = new ArrayList<>();
    public static List<Pessoa> listaVendedores = new ArrayList<>();
    public static Pessoa pessoa;

    public static Pessoa cadastrarPessoa(String nome, String cpf, String email, TipoPessoa tipoPessoa) throws Exception {
        validarEmailComArroba(email);
        validarEmailRepetido(email);
        validarCpfRepetido(cpf);
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
            for (Pessoa referenciaCliente : listaClientes) {
                System.out.println(referenciaCliente);
            }
        } else {
            for (Pessoa referenciaVendedor : listaVendedores) {
                System.out.println(referenciaVendedor);
            }
        }
    }

    public static void validarEmailComArroba(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("= Email inválido =");
        }
    }

    public static void validarEmailRepetido(String email) throws Exception {
        for (Pessoa referenciaCliente : listaClientes) {
            if (referenciaCliente.getEmail().equals(email)) {
                throw new Exception("= Email já cadastrado na lista de clientes =");
            }
        }
        for (Pessoa referenciaVendedor : listaVendedores) {
            if (referenciaVendedor.getEmail().equals(email)) {
                throw new Exception("= Email já cadastrado na lista de vendedores =");
            }
        }
    }

    public static void validarCpfRepetido(String cpf) throws Exception {
        for (Pessoa referenciaCliente : listaClientes) {
            if (referenciaCliente.getCpf().equals(cpf)) {
                throw new Exception("= CPF já cadastrado na lista de clientes =");
            }
        }
        for (Pessoa referenciaVendedor : listaVendedores) {
            if (referenciaVendedor.getCpf().equals(cpf)) {
                throw new Exception("= CPF já cadastrado na lista de vendedores =");
            }
        }
    }

}
