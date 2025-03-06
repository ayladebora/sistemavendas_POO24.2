package br.ufpb.dcx.ayla.vendas;

public class ProdutoJaExisteException extends Exception {

    public ProdutoJaExisteException(String msg){
        super(msg);
    }
}
