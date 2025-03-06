package br.ufpb.dcx.ayla.vendas.gui.controllers;

import br.ufpb.dcx.ayla.vendas.ProdutoJaExisteException;
import br.ufpb.dcx.ayla.vendas.SistemaVendas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CadastrarProdutoController implements ActionListener {

    private SistemaVendas sistema;
    private JFrame janelaPrincipal;

    public CadastrarProdutoController(SistemaVendas sistema, JFrame janelaPrincipal){
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String codigo = JOptionPane.showInputDialog(janelaPrincipal, "Digite o código do produto");
        String descricao = JOptionPane.showInputDialog(janelaPrincipal, "Digite a descrição do produto");
        try {
            sistema.cadastrarProduto(codigo, descricao);
            JOptionPane.showMessageDialog(janelaPrincipal, "Produto cadastrado com sucesso");
        } catch (ProdutoJaExisteException e){
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro! Produto não cadastrado. Detalhes:"+e.getMessage());
            e.printStackTrace();
        }
    }
}
