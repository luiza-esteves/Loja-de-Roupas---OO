package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaMenu implements ActionListener {

    private static final JFrame janela = new JFrame("Loja de roupas");
    private static final JLabel titulo = new JLabel("Menu Principal");
    private static final JButton cliente = new JButton("Cliente");
    private static final JButton funcionario = new JButton("Funcionário");
    private static final JButton estoque = new JButton("Estoque");
    private static final JButton venda = new JButton("Nova venda");
    private static final JButton roupa = new JButton("Roupa");

    public static ControleDados dados = new ControleDados();//carrega os dados 

    public TelaMenu() {
        //tela inicial com opções
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(120, 10, 150, 30);
        cliente.setBounds(140, 50, 100, 30);
        funcionario.setBounds(140, 100, 100, 30);
        estoque.setBounds(140, 150, 100, 30);
        venda.setBounds(140, 200, 100, 30);
        roupa.setBounds(140, 250, 100, 30);

        janela.setLayout(null);
        janela.setSize(400, 400);
        janela.add(titulo);
        janela.add(cliente);
        janela.add(funcionario);
        janela.add(estoque);
        janela.add(venda);
        janela.add(roupa);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        TelaMenu menu = new TelaMenu();

        cliente.addActionListener(menu);
        funcionario.addActionListener(menu);
        estoque.addActionListener(menu);
        venda.addActionListener(menu);
        roupa.addActionListener(menu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource(); // pega a opção escolhida pelo usuário

        if (src == cliente) {
            new TelaPessoa().mostrarDados(dados, 1);
        }

        if (src == funcionario) {
            new TelaPessoa().mostrarDados(dados, 2);
        }

        if (src == estoque) {
            new TelaEstoque(dados);
        }

        if (src == venda) {
            new TelaVenda().mostrarDados(dados);
        }

        if (src == roupa) {
            new TelaRoupa(dados);
        }

    }

}
