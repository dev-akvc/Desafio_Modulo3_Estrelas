package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoPessoa {
    public static List<Pessoa> listaClientes = new ArrayList<>();
    public static List<Pessoa> listaVendedores = new ArrayList<>();
    public static Pessoa pessoa;

    public static Pessoa cadastrarPessoa(String nome, String cpf, String email, TipoPessoa tipoPessoa) throws Exception {
        validarEmailComArroba(email);
        validarCadastroRepetido(email, cpf);
        pessoa = new Pessoa(nome, cpf, email, tipoPessoa);
        if (tipoPessoa == TipoPessoa.CLIENTE) {
            listaClientes.add(pessoa);
        } else {
            listaVendedores.add(pessoa);
        }
        return pessoa;
    }

    public static Pessoa buscarCliente(String cpf) throws Exception {
        for (Pessoa referenciaCliente : listaClientes) {
            if (referenciaCliente.getCpf().equals(cpf)) {
                return referenciaCliente;
            }
        }
        throw new Exception(" = Cliente não localizado = ");
    }

    public static Pessoa buscarVendedor(String email) throws Exception {
        for (Pessoa referenciaVendedor : listaVendedores) {
            if (referenciaVendedor.getEmail().equalsIgnoreCase(email)) {
                return referenciaVendedor;
            }
        }
        throw new Exception(" = Vendedor não localizado = ");
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
            throw new Exception(" = Email inválido = ");
        }
    }

    public static void validarCadastroRepetido(String email, String cpf) throws Exception {
        for (Pessoa referenciaCliente : listaClientes) {
            if (referenciaCliente.getEmail().equalsIgnoreCase(email) | referenciaCliente.getCpf().equals(cpf)) {
                throw new Exception(" = Cliente já cadastrado = ");
            }
        }
        for (Pessoa referenciaVendedor : listaVendedores) {
            if (referenciaVendedor.getEmail().equalsIgnoreCase(email)| referenciaVendedor.getCpf().equals(cpf)) {
                throw new Exception(" = Vendedor já cadastrado = ");
            }
        }
    }

}
