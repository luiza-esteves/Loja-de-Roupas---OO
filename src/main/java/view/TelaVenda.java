package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Classe responável pela tela que exibe a lista de vendas.
 * @author Rafael Xavier
 * @version 1.0 (Out 2021) 
 */
public class TelaVenda implements ActionListener, ListSelectionListener {

    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroVenda;
    private JButton refreshVenda;
    private ControleDados dados;
    private JList<String> listaVendasCadastradas;
    private String[] listaCods = new String[50];
    
    /**
     * Método responsável por mostrar a lista de vendas
     * @param d objeto do tipo ControleDados, responsável por passar todos os códigos de todas 
     * as vendas
     */
    public void mostrarDados(ControleDados d) {
        dados = d;

        listaCods = new ControleVenda(dados).getCodigosCompras();
        listaVendasCadastradas = new JList<String>(listaCods);
        janela = new JFrame("Vendas");
        titulo = new JLabel("Vendas Cadastradas");
        cadastroVenda = new JButton("Cadastrar");
        refreshVenda = new JButton("Atualizar");

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(90, 10, 250, 30);
        listaVendasCadastradas.setBounds(20, 50, 350, 120);
        listaVendasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaVendasCadastradas.setVisibleRowCount(10);

        cadastroVenda.setBounds(70, 400, 100, 30);
        refreshVenda.setBounds(200, 400, 100, 30);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(listaVendasCadastradas);
        janela.add(cadastroVenda);
        janela.add(refreshVenda);

        janela.setSize(400, 500);
        janela.setVisible(true);

        cadastroVenda.addActionListener(this);
        refreshVenda.addActionListener(this);
        listaVendasCadastradas.addListSelectionListener(this);

    }
    
    /**
     * Método que faz com que a ação do botão selecionado seja executada.
     * Nesse caso temos como opções editar uma venda, cadastrar ou atualizar a lista de vendas.
     * @param e é um objeto do tipo ActionEvent que carrega a opção escolhida pelo usuário
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == cadastroVenda) {
            new TelaDetalheVenda().inserirEditar(1, dados, this, 0);
        }

        if (src == refreshVenda) {
            listaVendasCadastradas.setListData(new ControleVenda(dados).getCodigosCompras());
            listaVendasCadastradas.updateUI();
        }
    }
    
    /**
     * Método responsável por comparar o índice da venda a ser 
     * editada com o índice na lista onde as vendas estão armazenadas e assim 
     * chama o método de edição
     * @param e do tipo ListSelectionEvent, passa o item da lista que foi selecionado
     */
    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaVendasCadastradas) {
            new TelaDetalheVenda().inserirEditar(2, dados, this,
                    listaVendasCadastradas.getSelectedIndex());
        }

    }

}
