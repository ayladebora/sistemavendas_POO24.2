package br.ufpb.dcx.ayla.vendas;

public class ProdutoNaoExisteException extends Exception {

    public ProdutoNaoExisteException(String msg){
        super(msg);
    }
}
