package br.com.zup;

public class Venda {
    private Pessoa pessoa;
    private double valorASerPago;
    private String datDeRegistro;

    public Venda() {
    }

    public Venda(Pessoa pessoa, double valorASerPago, String datDeRegistro) {
        this.pessoa = pessoa;
        this.valorASerPago = valorASerPago;
        this.datDeRegistro = datDeRegistro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }

    public String getDatDeRegistro() {
        return datDeRegistro;
    }

    public void setDatDeRegistro(String datDeRegistro) {
        this.datDeRegistro = datDeRegistro;
    }

    @Override
    public String toString(){
        StringBuilder dados = new StringBuilder();
        dados.append("\n == Registro de venda ==");
        dados.append("\n" + pessoa);
        dados.append("\nValor: " +valorASerPago);
        dados.append("\nData da venda: " +datDeRegistro);
        return dados.toString();
    }
}
