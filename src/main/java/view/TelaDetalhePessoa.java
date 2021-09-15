package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaDetalhePessoa implements ActionListener {
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelTotalCompras = new JLabel("Total de compras: ");
	private JTextField valorTotalCompras;
        private JLabel labelSalario = new JLabel("Total de compras: ");
	private JTextField valorsalario;
	private JLabel labelCidade = new JLabel("Cidade: ");
	private JTextField valorCidade;
        private JLabel labelEstado = new JLabel("Estad0: ");
	private JTextField valorEstado;
        private JLabel labelBairro = new JLabel("Bairro: ");
	private JTextField valorBairro;
        private JLabel labelCep = new JLabel("CEP: ");
	private JTextField valorCep;
        private JLabel labelRua = new JLabel("Rua: ");
	private JTextField valorRua;
        private JLabel labelQuadra = new JLabel("Quadra: ");
	private JTextField valorQuadra;
        private JLabel labelLote = new JLabel("Lote: ");
	private JTextField valorLote;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelDataNascimento = new JLabel("Data de nascimento: ");
	private JTextField valorDataNascimento;
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorDDD;
	private JTextField valorTelefone;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
        private static ControleCliente dadosCliente;
        private static ControleFuncionario dadosFuncionario;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, 
			TelaPessoa p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Cliente";
		if (op == 2) s = "Cadastro de Funcionário";
		if (op == 3) s = "Detalhe de Cliente";
		if (op == 4) s = "Detalhe de Funcionário";

		janela = new JFrame(s);

		//Preenche dados com dados do aluno clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getCliente()[pos].getNome(), 200);
			valorNome = new JTextField(dados.getFuncionarios()[pos].getNome(), 200);
			valorCidade = new JTextField(dados.getFuncionarios()[pos].getEndereco().getCidade(),200);
                        valorEstado = new JTextField(dados.getFuncionarios()[pos].getEndereco().getEstado(),200);
                        valorBairro = new JTextField(dados.getFuncionarios()[pos].getEndereco().getBairro(),200);
                        String ce = String.valueOf(dados.getFuncionarios()[pos].getEndereco().getCEP());
                        String ru = String.valueOf(dados.getFuncionarios()[pos].getEndereco().getRua());
                        String qua = String.valueOf(dados.getFuncionarios()[pos].getEndereco().getQuadra());
                        String lo = String.valueOf(dados.getFuncionarios()[pos].getEndereco().getLote());
                        valorCep = new JTextField(ce,200);
                        valorRua = new JTextField(ru,200);
                        valorQuadra = new JTextField(qua,200);
                        valorLote = new JTextField(lo,200);
                        String compras =String.valueOf(dados.getCliente()[pos].getTotalCompras());
			valorTotalCompras = new JTextField(compras, 200);
			valorCPF = new JTextField(String.valueOf(dados.getCliente()[pos].getCpf()), 200);
			valorDataNascimento = new JTextField(String.valueOf(dados.getCliente()[pos].getDataNascimento()), 200);
			valorDDD = new JTextField(String.valueOf(dados.getCliente()[pos].getTelefone().getDDD()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getCliente()[pos].getTelefone().getNumero()), 10);			


		} else if (op == 4) { //Preenche dados com dados do professor clicado 
			valorNome = new JTextField(dados.getFuncionarios()[pos].getNome(), 200);
			valorCidade = new JTextField(dados.getFuncionarios()[pos].getEndereco().getCidade(),200);
                        valorEstado = new JTextField(dados.getFuncionarios()[pos].getEndereco().getEstado(),200);
                        valorBairro = new JTextField(dados.getFuncionarios()[pos].getEndereco().getBairro(),200);
                        String ce = String.valueOf(dados.getFuncionarios()[pos].getEndereco().getCEP());
                        String ru = String.valueOf(dados.getFuncionarios()[pos].getEndereco().getRua());
                        String qua = String.valueOf(dados.getFuncionarios()[pos].getEndereco().getQuadra());
                        String lo = String.valueOf(dados.getFuncionarios()[pos].getEndereco().getLote());
                        valorCep = new JTextField(ce,200);
                        valorRua = new JTextField(ru,200);
                        valorQuadra = new JTextField(qua,200);
                        valorLote = new JTextField(lo,200);
                        String salario =String.valueOf(dados.getFuncionarios()[pos].getSalario());
			valorsalario = new JTextField(salario, 200);
			valorCPF = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getCpf()), 200);
			valorDataNascimento = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getDataNascimento()), 200);
			valorDDD = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getTelefone().getDDD()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getTelefone().getNumero()), 10);	
		} else { //Não preenche com dados

                        String ce = String.valueOf(dados.getFuncionarios()[pos].getEndereco().getCEP());
                        String ru = String.valueOf(dados.getFuncionarios()[pos].getEndereco().getRua());
                        String qua = String.valueOf(dados.getFuncionarios()[pos].getEndereco().getQuadra());
                        String lo = String.valueOf(dados.getFuncionarios()[pos].getEndereco().getLote());
                        valorCep = new JTextField(ce,200);
                        valorRua = new JTextField(ru,200);
                        valorQuadra = new JTextField(qua,200);
                        valorLote = new JTextField(lo,200);
			valorsalario = new JTextField(200);
			valorCPF = new JTextField(200);
			valorTotalCompras = new JTextField(200);
			valorDDD = new JTextField(3);
			valorTelefone = new JTextField(10);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 800, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelBairro.setBounds(30, 750, 150, 25);
                valorBairro.setBounds(180, 50, 180, 25);
                labelCep.setBounds(30, 50, 150, 25);
                valorCep.setBounds(180, 50, 180, 25);
                labelCidade.setBounds(30, 50, 150, 25);
                valorCidade.setBounds(180, 50, 180, 25);
                labelEstado.setBounds(30, 50, 150, 25);
                valorEstado.setBounds(180, 50, 180, 25);
                labelLote.setBounds(30, 50, 150, 25);
                valorLote.setBounds(180, 50, 180, 25);
                labelQuadra.setBounds(30, 50, 150, 25);
                valorQuadra.setBounds(180, 50, 180, 25);
                labelRua.setBounds(30, 50, 150, 25);
                valorRua.setBounds(180, 50, 180, 25);
		labelCPF.setBounds(30, 80, 150, 25);
		valorCPF.setBounds(180, 80, 180, 25);
		labelDataNascimento.setBounds(30, 110, 150, 25);
		valorDataNascimento.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 140, 150, 25);
		valorDDD.setBounds(180, 140, 28, 25);
		valorTelefone.setBounds(210, 140, 65, 25);

		//Coloca os campos relacionados a endereco se aluno
		if (op == 1 || op == 3 ) {
			this.janela.add(labelTotalCompras);
			this.janela.add(valorTotalCompras);

		}

		//Coloca campos relacionados a valor hora/aula se professor
		if (op == 2 || op == 4) {

			this.janela.add(labelSalario);
			this.janela.add(valorsalario);
		}

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelDataNascimento);
		this.janela.add(valorDataNascimento);
		this.janela.add(labelTelefone);
		this.janela.add(valorDDD);
		this.janela.add(valorTelefone);
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
				boolean res;
				if(opcao == 1) //cadastro de novo aluno
					novoDado[0] = Integer.toString(dados.getQtdCliente());
				else if (opcao == 2) // cadastro de novo prof
					novoDado[0] = Integer.toString(dados.getQtdFuncionarios());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[3] =  valorCPF.getText();
				novoDado[4] =  valorDataNascimento.getText();
				novoDado[5] =  valorDDD.getText();
				novoDado[6] =  valorTelefone.getText();
                                novoDado[7] =  valorBairro.getText();
                                novoDado[8] =  valorCep.getText();
                                novoDado[9] =  valorCidade.getText();
                                novoDado[10] =  valorEstado.getText();
                                novoDado[11] =  valorLote.getText();
                                novoDado[12] =  valorQuadra.getText();
                                novoDado[13] =  valorRua.getText();
                               

				if (opcao == 1 || opcao == 3) {
					novoDado[2] =  valorTotalCompras.getText();
					res = dadosCliente.inserirEditarCliente(novoDado);
				} else {
					novoDado[2] =  valorsalario.getText();
					res = dadosFuncionario.inserirEditarFuncionario(novoDado);
				}

				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			} catch (ParseException ex) {
                        Logger.getLogger(TelaDetalhePessoa.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {//exclui aluno
				res = dadosCliente.removerCliente(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
				
			if (opcao == 4){ //exclui professor
				res = dadosFuncionario.removerFuncionario(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoProf(); 
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
				+ "2. CPF, identidade, DDD e telefone não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAluno() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o aluno está matriculado\n"
				+ "em alguma disciplina. Se sim, cancele\n "
				+ "a matricula e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoProf() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o professor está responsável\n"
				+ "por alguma disciplina. Se sim, substitua\n "
				+ "o professor e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
}