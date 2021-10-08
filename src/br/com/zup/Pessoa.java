package br.com.zup;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private TipoPessoa tipoPessoa;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String email, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.tipoPessoa = tipoPessoa;
    }

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoPessoa getTipoPessoa(int opcao) throws Exception {
        if (opcao == 1) {
            System.out.println("Cliente");
            return TipoPessoa.CLIENTE;
        }
        if (opcao == 2) {
            System.out.println("Vendedor");
            return TipoPessoa.VENDEDOR;
        }
        throw new Exception("* Opção inválida *");
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\n = " + tipoPessoa.toString() + " = ");
        dados.append("\nNome: " + nome);
        dados.append("\nCPF: " + cpf);
        dados.append("\nE-mail: " + email);
        return dados.toString();
    }

}
