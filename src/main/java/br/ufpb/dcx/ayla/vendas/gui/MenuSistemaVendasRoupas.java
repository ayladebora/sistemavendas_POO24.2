package br.ufpb.dcx.ayla.vendas.gui;

import br.ufpb.dcx.ayla.vendas.SistemaVendasDeRoupas;
import br.ufpb.dcx.ayla.vendas.SistemaVendas;
import br.ufpb.dcx.ayla.vendas.gui.controllers.*;

import javax.swing.*;
import java.awt.*;

public class MenuSistemaVendasRoupas extends JFrame{

    JLabel linha1, linha2;
    ImageIcon roupaImg = new ImageIcon("./imgs/roupas.jpeg");
    SistemaVendas sistema = new SistemaVendasDeRoupas();
    JMenuBar barraDeMenu = new JMenuBar();

    public MenuSistemaVendasRoupas(){
        setTitle("Sistema de Vendas de Roupas");
        setSize(800, 600); //tamanho da janela
        setLocation(150, 150);
        setResizable(false);
        setBackground(Color.white);
        linha1 = new JLabel("Sistema de Vendas de Roupas de Ayla", JLabel.CENTER);
        linha1.setForeground(Color.blue);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(roupaImg, JLabel.CENTER);
        setLayout(new GridLayout(3, 1));
        add(linha1);
        add(linha2);
        add(new JLabel());
        JMenu menuCadastrar = new JMenu("Cadastrar");
        JMenuItem menuCadastrarProduto = new JMenuItem(
                "Cadastrar produto");
        menuCadastrar.add(menuCadastrarProduto);
        JMenuItem menuCadastrarVenda = new JMenuItem( "Cadastrar venda");
        menuCadastrar.add(menuCadastrarVenda);
        menuCadastrarProduto.addActionListener(new CadastrarProdutoController(sistema, this));
        menuCadastrarVenda.addActionListener(new CadastrarVendaController(sistema, this));
        barraDeMenu.add(menuCadastrar);
        setJMenuBar(barraDeMenu);
    }


    public static void main(String[] args) {
        JFrame janela = new MenuSistemaVendasRoupas();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
