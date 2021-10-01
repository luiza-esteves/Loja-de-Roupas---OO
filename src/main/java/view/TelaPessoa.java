package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaPessoa implements ActionListener, ListSelectionListener {		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private JButton cadastroVendedor;
	private JButton refreshVendedor;
	private static ControleDados dados;
	private JList<String> listaClientesCadastrados;
	private JList<String> listaVendedoresCadastrados;
	private String[] listaNomes = new String[50];

	public void mostrarDados(ControleDados d, int op){
		dados = d;

		switch (op) {
                    case 1:// Mostrar dados de alunos cadastrados (JList)
                            listaNomes = new ControleCliente(dados).getNomesCliente();                           
                            listaClientesCadastrados = new JList<String>(listaNomes);
                            janela = new JFrame("Cliente");
                            titulo = new JLabel("Clientes Cadastrados");
                            cadastroCliente = new JButton("Cadastrar");
                            refreshCliente = new JButton("Refresh");

                            titulo.setFont(new Font("Arial", Font.BOLD, 20));
                            titulo.setBounds(90, 10, 250, 30);
                            listaClientesCadastrados.setBounds(20, 50, 350, 120);
                            listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                            listaClientesCadastrados.setVisibleRowCount(10);

                            cadastroCliente.setBounds(70, 177, 100, 30);
                            refreshCliente.setBounds(200, 177, 100, 30);

                            janela.setLayout(null);

                            janela.add(titulo);
                            janela.add(listaClientesCadastrados);
                            janela.add(cadastroCliente);
                            janela.add(refreshCliente);

                            janela.setSize(400, 250);
                            janela.setVisible(true);

                            cadastroCliente.addActionListener(this);
                            refreshCliente.addActionListener(this);
                            listaClientesCadastrados.addListSelectionListener(this);

                            break;

                    case 2:// Mostrar dados de professores cadastrados (JList)
                            listaNomes = new ControleFuncionario(dados).getNomefuncionario();
                            listaVendedoresCadastrados = new JList<String>(listaNomes);
                            janela = new JFrame("Funcionários");
                            titulo = new JLabel("Funcionários Cadastrados");
                            cadastroVendedor = new JButton("Cadastrar");
                            refreshVendedor = new JButton("Refresh");

                            titulo.setFont(new Font("Arial", Font.BOLD, 20));
                            titulo.setBounds(90, 10, 250, 30);
                            listaVendedoresCadastrados.setBounds(20, 50, 350, 120);
                            listaVendedoresCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                            listaVendedoresCadastrados.setVisibleRowCount(10);


                            cadastroVendedor.setBounds(70, 177, 100, 30);
                            refreshVendedor.setBounds(200, 177, 100, 30);

                            janela.setLayout(null);

                            janela.add(titulo);
                            janela.add(listaVendedoresCadastrados);
                            janela.add(cadastroVendedor);
                            janela.add(refreshVendedor);

                            janela.setSize(400, 250);
                            janela.setVisible(true);

                            cadastroVendedor.addActionListener(this);
                            refreshVendedor.addActionListener(this);
                            listaVendedoresCadastrados.addListSelectionListener(this);
                            break;

                    default:
                            JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
                                            JOptionPane.ERROR_MESSAGE);
                    }

	}



	//Captura eventos relacionados aos botões da interface
        @Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo aluno
		if(src == cadastroCliente){
			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);
                }
		//Cadastro de novo professor
		if(src == cadastroVendedor){
			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);
                }
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
        @Override
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

    public JFrame getJanela() {
        return janela;
    }

    public void setJanela(JFrame janela) {
        this.janela = janela;
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }

    public JButton getCadastroCliente() {
        return cadastroCliente;
    }

    public void setCadastroCliente(JButton cadastroCliente) {
        this.cadastroCliente = cadastroCliente;
    }

    public JButton getRefreshCliente() {
        return refreshCliente;
    }

    public void setRefreshCliente(JButton refreshCliente) {
        this.refreshCliente = refreshCliente;
    }

    public JButton getCadastroVendedor() {
        return cadastroVendedor;
    }

    public void setCadastroVendedor(JButton cadastroVendedor) {
        this.cadastroVendedor = cadastroVendedor;
    }

    public JButton getRefreshVendedor() {
        return refreshVendedor;
    }

    public void setRefreshVendedor(JButton refreshVendedor) {
        this.refreshVendedor = refreshVendedor;
    }

    public static ControleDados getDados() {
        return dados;
    }

    public static void setDados(ControleDados dados) {
        TelaPessoa.dados = dados;
    }

    public JList<String> getListaClientesCadastrados() {
        return listaClientesCadastrados;
    }

    public void setListaClientesCadastrados(JList<String> listaClientesCadastrados) {
        this.listaClientesCadastrados = listaClientesCadastrados;
    }

    public JList<String> getListaVendedoresCadastrados() {
        return listaVendedoresCadastrados;
    }

    public void setListaVendedoresCadastrados(JList<String> listaVendedoresCadastrados) {
        this.listaVendedoresCadastrados = listaVendedoresCadastrados;
    }

    public String[] getListaNomes() {
        return listaNomes;
    }

    public void setListaNomes(String[] listaNomes) {
        this.listaNomes = listaNomes;
    }
               

}