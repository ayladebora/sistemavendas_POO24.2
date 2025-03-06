package br.ufpb.dcx.ayla.vendas.gui.controllers;

import br.ufpb.dcx.ayla.vendas.Mes;
import br.ufpb.dcx.ayla.vendas.ProdutoNaoExisteException;
import br.ufpb.dcx.ayla.vendas.SistemaVendas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastrarVendaController implements ActionListener {

    private SistemaVendas sistema;
    private JFrame janelaPrincipal;

    public CadastrarVendaController(SistemaVendas sistema, JFrame janelaPrincipal){
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String codigoProduto = JOptionPane.showInputDialog(janelaPrincipal, "Digite o código do produto");
        try {
            double valor  = Double.parseDouble(JOptionPane.showInputDialog(janelaPrincipal, "Digite o valor do produto"));
            Mes mesVenda = Mes.MARCO;
            int anoVenda = 2025;
            sistema.cadastrarVenda(codigoProduto, valor, mesVenda, anoVenda);
            JOptionPane.showMessageDialog(janelaPrincipal, "Venda cadastrada com sucesso");
        } catch (ProdutoNaoExisteException e){
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro! Produto não existe. Detalhes:"+e.getMessage());
            e.printStackTrace();
        } catch (Exception e){
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro! Produto não cadastrado. ");
            e.printStackTrace();
        }

    }
}
