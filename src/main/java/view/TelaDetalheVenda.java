package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;
import view.TelaPessoa;

public class TelaDetalheVenda implements ActionListener{
	private JFrame janela;
	
	private JLabel labelCod = new JLabel("C�digo da compra: ");
	private JTextField valorCod;
	private JLabel labelNomeRoupa = new JLabel("Pe�a: ");
	private JTextField valorRoupa;
	private JLabel labelValorTotal = new JLabel("Valor total: ");
	private JTextField valorValor;
	private JLabel labelForma = new JLabel("Forma de pagamento: ");
	private JTextField valorForma;
	private JLabel labelCliente = new JLabel("Cliente: ");
	private JTextField valorCliente;
	private JLabel labelFuncionario = new JLabel("Funcion�rio: ");
	private JTextField valorFuncionario;
	
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;
	
	public void inserirEditar(int op, ControleDados d, TelaVenda v, int pos) {
		opcao = op;
		posicao = pos;
		dados = d;
		
		if (op == 1) s = "Cadastro de venda";
		if (op == 2) s = "Detalhe de venda";

		janela = new JFrame(s);
		
		if (op == 2) {
			valorCod = new JTextField(String.valueOf(dados.getVenda()[pos].getCodCompra()), 200);
			valorRoupa = new JTextField(String.valueOf(dados.getVenda()[pos].getCamisa()),200);
			valorValor = new JTextField(String.valueOf(dados.getVenda()[pos].getValorTotal()),200);
			valorForma = new JTextField(String.valueOf(dados.getVenda()[pos].getFormaPagamento()), 200);
			valorCliente = new JTextField(String.valueOf(dados.getVenda()[pos].getCliente().getNome()), 200);
			valorFuncionario = new JTextField(String.valueOf(dados.getVenda()[pos].getFuncionario().getNome()), 200);		
		} else {

			valorCod = new JTextField(200);
			valorRoupa = new JTextField(200);
			valorValor = new JTextField(200);
			valorForma = new JTextField(200);
			valorCliente = new JTextField(200);
			valorFuncionario = new JTextField(200);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}
		
		labelCod.setBounds(30, 20, 150, 25);
		valorCod.setBounds(180, 20, 180, 25);
		labelNomeRoupa.setBounds(30, 50, 150, 25);
		valorRoupa.setBounds(180, 50, 180, 25);
		labelValorTotal.setBounds(30, 50, 180, 25);
		valorValor.setBounds(180, 50, 180, 25);		
		labelForma.setBounds(30, 80, 150, 25);
		valorForma.setBounds(180, 80, 180, 25);
		labelCliente.setBounds(30, 110, 150, 25);
		valorCliente.setBounds(180, 110, 180, 25);
		labelFuncionario.setBounds(30, 140, 150, 25);
		valorFuncionario.setBounds(180, 140, 28, 25);
		
		if (op == 2) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}
		
		this.janela.add(labelCod);
		this.janela.add(valorCod);
		this.janela.add(labelNomeRoupa);
		this.janela.add(valorRoupa);
		this.janela.add(labelValorTotal);
		this.janela.add(valorValor);
		this.janela.add(labelForma);
		this.janela.add(valorForma);
		this.janela.add(labelCliente);
		this.janela.add(valorCliente);
		this.janela.add(labelFuncionario);
		this.janela.add(valorFuncionario);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res = false;
				if(opcao == 1) 
					novoDado[0] = Integer.toString(dados.getQtdVenda());
				else 
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorCod.getText();
				novoDado[3] =  valorRoupa.getText();
				novoDado[4] =  valorValor.getText();
				novoDado[5] =  valorForma.getText();
				novoDado[6] =  valorCliente.getText();
				novoDado[7] =  valorFuncionario.getText();

				if (opcao == 1 || opcao == 2) {
					novoDado[2] =  valorCod.getText();
					res = dados.inserirEditarVenda(novoDado);
				} 

				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {
				res = dados.removerVenda(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusao(); 
			}			
		}
	}
	
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, identidade, DDD e telefone n�o cont�m apenas n�meros", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusao() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se a venda existe.", null, 
				JOptionPane.ERROR_MESSAGE);
	
	
        }
}
        