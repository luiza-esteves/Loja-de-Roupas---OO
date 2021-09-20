package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaEstoque implements ActionListener, ListSelectionListener {
        private JFrame janela;
	private JLabel titulo;
	private JButton cadastroRoupa;
	private JButton refreshRoupa;

	private static ControleDados dados;
        private static ControleEstoque dadosEstoque;
	private JList<String> listaRoupasCadastradas;
	private String[] listaNomes = new String[50];
        
        

        public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo aluno
		if(src == cadastroRoupa)
			new TelaDetalheEstoque().inserirEditar(1, dados, this, 0);

		//Cadastro de novo professor
		if(src == cadastroVendedor)
			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

		// Atualiza a lista de nomes de alunos mostrada no JList
		if(src == refreshCliente) {
			listaClientesCadastrados.setListData(new ControleCliente(dados).getNomesCliente());			
			listaClientesCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de professores mostrada no JList
		if(src == refreshVendedor) {
			listaVendedoresCadastrados.setListData(new ControleFuncionario(dados).getNomefuncionario());
			listaVendedoresCadastrados.updateUI();
		}

	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaClientesCadastrados) {
			new TelaDetalhePessoa().inserirEditar(3, dados, this, 
					listaClientesCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaVendedoresCadastrados) {
			new TelaDetalhePessoa().inserirEditar(4, dados, this, 
					listaVendedoresCadastrados.getSelectedIndex());
		}
	}
    
}
