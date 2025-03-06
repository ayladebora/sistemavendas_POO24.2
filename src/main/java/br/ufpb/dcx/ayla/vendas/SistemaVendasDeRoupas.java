package br.ufpb.dcx.ayla.vendas;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;

public class SistemaVendasDeRoupas implements SistemaVendas {
    private List<Venda> vendas;
    private Map<String, Produto> produtos;

    public SistemaVendasDeRoupas() {
        this.vendas = new ArrayList<>();
        this.produtos = new HashMap<>();
    }

    public void cadastrarVenda(String codigoProduto, double valorProduto,
                               Mes mes , int ano) throws ProdutoNaoExisteException {
        if (existeProduto(codigoProduto)){
            Venda venda = new Venda(codigoProduto, valorProduto,
                    mes, ano);
            this.vendas.add(venda);
        } else {
            throw new ProdutoNaoExisteException("Não existe produto com "+
                    "o código " + codigoProduto);
        }
    }

    @Override
    public void cadastrarProduto(String codigo, String descricao) throws ProdutoJaExisteException {
        if (this.produtos.containsKey(codigo)){
            throw new ProdutoJaExisteException("Já existe produto com este código.Produto não foi cadastrado");
        } else {
            Produto p = new Produto(codigo, descricao);
            this.produtos.put(codigo, p);
        }
    }

    @Override
    public Collection<Venda> pesquisarTodasAsVendas() {
        return null;
        //TODO
    }

    @Override
    public Collection<Produto> pesquisarTodosOsProdutos() {
        return null;
        //TODO
    }

    @Override
    public double obterValorTotalVendasMes(Mes mes, int ano) {
        return 0;
        //TODO
    }

    @Override
    public boolean existeVendaDoProduto(String codigoProduto) {
        return false;
        //TODO
    }

    @Override
    public int contaVendasDoProduto(String codigo) {
        return 0;
        //TODO
    }

    @Override
    public boolean existeProduto(String codigo) {
        return false;
        //TODO
    }

    @Override
    public String pesquisaDescricaoDoProduto(String codigoProduto) throws ProdutoNaoExisteException {
        return "";
        //TODO
    }


}
