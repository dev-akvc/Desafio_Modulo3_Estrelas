package br.com.zup;

public class Venda {
    private Pessoa cliente;
    private Pessoa vendedor;
    private TipoPessoa tipoPessoa;
    private double valorASerPago;
    private String dataDeRegistro;

    public Venda() {
    }


    public Venda(Pessoa cliente, Pessoa vendedor, double valorASerPago, String dataDeRegistro){
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valorASerPago = valorASerPago;
        this.dataDeRegistro = dataDeRegistro;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getVendedor() {
        return vendedor;
    }

    public void setVendedor(Pessoa vendedor) {
        this.vendedor = vendedor;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    @Override
    public String toString(){
        StringBuilder dados = new StringBuilder();
        dados.append("\n == Registro de venda ==");
        dados.append("\n" + cliente);
        dados.append("\n" + vendedor);
        dados.append("\nValor: " +valorASerPago);
        dados.append("\nData da venda: " +dataDeRegistro);
        return dados.toString();
    }
}
