package br.com.zup;

public class Main {

    public static void main(String[] args){
        boolean tentarNovamente = true;

        while (tentarNovamente) {
            try {
                tentarNovamente = Sistema.executar();
            } catch (Exception erro) {
                System.out.println(erro.getMessage());
            }
        }
    }
}
