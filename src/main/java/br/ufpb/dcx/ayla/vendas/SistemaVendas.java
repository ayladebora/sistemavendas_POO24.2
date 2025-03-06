package br.ufpb.dcx.ayla.vendas;

import java.util.Collection;
/**
 * Sistema que gerencia vendas de uma loja.
 */
public interface SistemaVendas {

    /**
     * Cadastra uma nova venda no sistema
     * @param codigoProduto O código do produto a cadastrar
     * @param valorProduto O valor do produto sendo cadastrado
     * @param mes O mês em que foi feita a venda
     * @param ano O ano em que foi feita a venda
     * @throws ProdutoNaoExisteException Caso já exista algum produto cadastrado
     * que tenha o mesmo código
     */
    public void cadastrarVenda(String codigoProduto, double valorProduto,
                               Mes mes , int ano) throws ProdutoNaoExisteException;

    /**
     *
     * @param codigo
     * @param descricao
     * @throws ProdutoJaExisteException
     */
    public void cadastrarProduto(String codigo, String descricao)
            throws ProdutoJaExisteException;

    public Collection<Venda> pesquisarTodasAsVendas();

    public Collection<Produto> pesquisarTodosOsProdutos();

    public double obterValorTotalVendasMes(Mes mes, int ano);

    public boolean existeVendaDoProduto(String codigoProduto);

    public int contaVendasDoProduto(String codigo);

    public boolean existeProduto(String codigo);

    public String pesquisaDescricaoDoProduto(String codigoProduto)
            throws ProdutoNaoExisteException;
}
