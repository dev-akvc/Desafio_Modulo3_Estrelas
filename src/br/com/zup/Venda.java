package br.com.zup;

public class Venda {
    private TipoPessoa pessoa;
    private double valorASerPago;
    private String datDeRegistro;

    public Venda() {
    }

    public Venda(Pessoa pessoa, double valorASerPago, String datDeRegistro) throws Exception {
        this.pessoa = pessoa.getTipoPessoa(1);
        this.pessoa = pessoa.getTipoPessoa(2);
        this.valorASerPago = valorASerPago;
        this.datDeRegistro = datDeRegistro;
    }

    public TipoPessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(TipoPessoa pessoa) {
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
