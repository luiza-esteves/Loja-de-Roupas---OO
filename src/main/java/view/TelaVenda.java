package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaVenda implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroVenda;
	private JButton refreshVenda;
	private ControleDados dados;
	private JList<String> listaVendasCadastradas; 
	private String[] listaCods = new String [50];
	 
	public void mostrarDados (ControleDados d, int op) {
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
		
        @Override
    public void actionPerformed (ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastroVenda)
			new TelaDetalheVenda().inserirEditar(1, dados, this, 0);
		
		if(src == refreshVenda) {
			listaVendasCadastradas.setListData(new ControleVenda(dados).getCodigosCompras());			
			listaVendasCadastradas.updateUI();
		}
	}
		
        @Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaVendasCadastradas) {
			new TelaDetalheVenda().inserirEditar(2, dados, this, 
				listaVendasCadastradas.getSelectedIndex());
		}
 
	}	
	
}
	
