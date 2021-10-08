package br.com.zup;

public enum TipoPessoa {
    CLIENTE,
    VENDEDOR;

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
}
