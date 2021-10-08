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

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public String toString(){
        StringBuilder dados = new StringBuilder();
        dados.append(tipoPessoa);
        dados.append("Nome: " +nome);
        dados.append("CPF: " +cpf);
        dados.append("E-mail: " +email);
        return dados.toString();
    }

}
