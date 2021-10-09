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

    public static Pessoa buscarPessoas(TipoPessoa tipo) throws Exception {
        if (tipo == TipoPessoa.CLIENTE) {
            for (Pessoa referenciaCliente : listaClientes) {
                return referenciaCliente;
            }
        } else {
            for (Pessoa referenciaVendedor : listaVendedores) {
                return referenciaVendedor;
            }
        }
        throw new Exception(" Não localizado cliente/ vendedor ");
    }

    public static void exibirPessoas(TipoPessoa tipo) {
        if (tipo == TipoPessoa.CLIENTE) {
            if (listaClientes.size() == 0) {
                System.out.println(" = Não há clientes na lista = ");
            } else {
                for (Pessoa referenciaCliente : listaClientes) {
                    System.out.println(referenciaCliente);
                }
            }
        }
        if (tipo == TipoPessoa.VENDEDOR) {
            if (listaVendedores.size() == 0) {
                System.out.println(" = Não há vendedores na lista = ");
            } else {
                for (Pessoa referenciaVendedor : listaVendedores) {
                    System.out.println(referenciaVendedor);
                }
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
            if (referenciaCliente.getEmail().equalsIgnoreCase(email)) {
                throw new Exception("= Email já cadastrado na lista de clientes =");
            }
        }
        for (Pessoa referenciaVendedor : listaVendedores) {
            if (referenciaVendedor.getEmail().equalsIgnoreCase(email)) {
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
