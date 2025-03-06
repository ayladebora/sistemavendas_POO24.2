package br.ufpb.dcx.ayla.vendas;

import java.util.Objects;

public class Venda {
    private String codigoProduto;
    private double valorProduto;
    private int anoVenda;
    private Mes mesVenda;

    public Venda(String codigoProduto, double valorProduto, Mes mesVenda, int anoVenda){
        this.codigoProduto = codigoProduto;
        this.valorProduto = valorProduto;
        this.mesVenda = mesVenda;
        this.anoVenda = anoVenda;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getAnoVenda() {
        return anoVenda;
    }

    public void setAnoVenda(int anoVenda) {
        this.anoVenda = anoVenda;
    }

    public Mes getMesVenda() {
        return mesVenda;
    }

    public void setMesVenda(Mes mesVenda) {
        this.mesVenda = mesVenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return Double.compare(valorProduto, venda.valorProduto) == 0 && anoVenda == venda.anoVenda && Objects.equals(codigoProduto, venda.codigoProduto) && mesVenda == venda.mesVenda;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoProduto, valorProduto, anoVenda, mesVenda);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "codigoProduto='" + codigoProduto + '\'' +
                ", valorProduto=" + valorProduto +
                ", anoVenda=" + anoVenda +
                ", mesVenda=" + mesVenda +
                '}';
    }
}
