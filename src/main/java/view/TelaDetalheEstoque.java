
package view;

import controle.ControleDados;
import controle.ControleEstoque;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import modelo.Estoque;



public class TelaDetalheEstoque implements ActionListener{
    private JFrame janela;
    ControleDados dados = new ControleDados();
    ControleEstoque e;
    
    private int posicao;
    private int opcao;
    private String s;
    
    private final String[] novoDado = new String[4];
    
    private final JLabel labelCodigo = new JLabel("Código: ");
    private JTextField valorCodigo;
    private final JLabel labelNome = new JLabel("Nome: ");
    private JTextField valorNome;
    private final JLabel labelQtdEstoque = new JLabel("Quantidade em estoque ");
    private JTextField valorQtdEstoque;
    
    private final JButton botaoExcluir = new JButton("Excluir");
	private final JButton botaoSalvar = new JButton("Salvar");
//    list = new JList(d.get); //data has type Object[]
    //JScrollPane listScroller = new JScrollPane(list);
    
    public void inserirEditar(int op, ControleDados d, 
                                    TelaEstoque p, int pos) {
        e= new ControleEstoque(d);
          
        

		opcao = op;
		posicao = pos;
		dados = d;
                
                if (op == 1) s = "Estoque de Calça";
                if (op == 2) s = "Estoque de Camisa";
                if (op == 3) s = "Estoque de Camiseta";
                if (op == 4) s = "Estoque de Casaco";
                if (op == 5) s = "Estoque de Cinto";
                if (op == 6) s = "Estoque de Cropped";
                if (op == 7) s = "Estoque de Macacão";
                if (op == 8) s = "Estoque de Saia";
                if (op == 9) s = "Estoque de Short";
                if (op == 10) s = "Detalhe de Estoque de Calça";
                if (op == 11) s = "Detalhe de Estoque de Camisa";
                if (op == 12) s = "Detalhe de Estoque de Camiseta";
                if (op == 13) s = "Detalhe de Estoque de Casaco";
                if (op == 14) s = "Detalhe de Estoque de Cinto";
                if (op == 15) s = "Detalhe de Estoque de Cropped";
                if (op == 16) s = "Detalhe de Estoque de Macacão";
                if (op == 17) s = "Detalhe de Estoque de Saia";
                if (op == 18) s = "Detalhe de Estoque de Short";
                
                janela = new JFrame(s);
                
                if (op == 10) {
                    String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
                    String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
                    valorCodigo = new JTextField(cod, 200);
                    valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
                    valorQtdEstoque = new JTextField(qtdDisp, 200);              
                }else if (op ==11) {
                    String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
                    String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
                    valorCodigo = new JTextField(cod, 200);
                    valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
                    valorQtdEstoque = new JTextField(qtdDisp, 200);              
                }else if (op == 12) {
                    String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
                    String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
                    valorCodigo = new JTextField(cod, 200);
                    valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
                    valorQtdEstoque = new JTextField(qtdDisp, 200);              
                }else if (op == 13) {
                    String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
                    String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
                    valorCodigo = new JTextField(cod, 200);
                    valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
                    valorQtdEstoque = new JTextField(qtdDisp, 200);              
                }else if (op == 14) {
                    String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
                    String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
                    valorCodigo = new JTextField(cod, 200);
                    valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
                    valorQtdEstoque = new JTextField(qtdDisp, 200);              
                }else if (op == 15) {
                    String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
                    String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
                    valorCodigo = new JTextField(cod, 200);
                    valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
                    valorQtdEstoque = new JTextField(qtdDisp, 200);              
                }else if (op == 16) {
                    String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
                    String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
                    valorCodigo = new JTextField(cod, 200);
                    valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
                    valorQtdEstoque = new JTextField(qtdDisp, 200);              
                }else if (op == 17) {
                    String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
                    String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
                    valorCodigo = new JTextField(cod, 200);
                    valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
                    valorQtdEstoque = new JTextField(qtdDisp, 200);              
                }else if (op == 18) {
                    String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
                    String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
                    valorCodigo = new JTextField(cod, 200);
                    valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
                    valorQtdEstoque = new JTextField(qtdDisp, 200);              
                }
                else{
                    valorCodigo = new JTextField(200);
                    valorNome = new JTextField(200);
                    valorQtdEstoque = new JTextField(200);
                    
                    botaoSalvar.setBounds(245, 580, 115, 30);
                }
                if (op == 10 || op == 11 || op == 12 || op == 13 || op == 14 || op == 15 || op == 16 || op == 17 || op == 18) {
			botaoSalvar.setBounds(120, 480, 115, 30);
			botaoExcluir.setBounds(245, 480, 115, 30);
			this.janela.add(botaoExcluir);
		}
                
                labelCodigo.setBounds(30, 20, 150, 25);
                valorCodigo.setBounds(180, 20, 180, 25);
		labelNome.setBounds(30, 60, 150, 25);
		valorNome.setBounds(180, 60, 180, 25);
                labelQtdEstoque.setBounds(30, 100, 150, 25);
                valorQtdEstoque.setBounds(180, 100, 180, 25); 
                
                this.janela.add(labelCodigo);
		this.janela.add(valorCodigo);
		this.janela.add(labelNome);
		this.janela.add(valorNome);
                this.janela.add(labelQtdEstoque);
		this.janela.add(valorQtdEstoque);
                
                this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 800);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
    }
    
    @Override
        public void actionPerformed(ActionEvent e) {
          
		Object src = e.getSource();
		if(src == botaoSalvar) {
                   
			try {                           
				boolean res = false;
				
				novoDado[0] = Integer.toString(dados.getDados().getQtdEstoque());
				

				novoDado[1] =  valorCodigo.getText();
                                novoDado[2] =  valorNome.getText();
				novoDado[3] =  valorQtdEstoque.getText();
                                int qtd = Integer.parseInt(novoDado[3]);
                                if (opcao == 1 || opcao == 10) {
                                res = dados.inserirEditarEstoqueCalca(novoDado);
                                }
				if(res) {
                                    mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException | NumberFormatException exc1) {
				mensagemErroCadastro();
			} catch (ParseException ex) {
                        Logger.getLogger(TelaDetalheEstoque.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}

		if(src == botaoExcluir) {
                    ControleEstoque estoque = new ControleEstoque(dados);
                    
			boolean res = false;

			if (opcao == 10) {//exclui aluno
                            res = estoque.removerEstoqueCalca(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
				
			if (opcao == 11){ //exclui professor
				res = dados.removerCamiseta(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoProf(); 
			}
                        
                        if (opcao == 12) {//exclui aluno
				res = dados.removerCamiseta(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
                        
                        if (opcao == 13) {//exclui aluno
				res = dados.removerCasaco(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
                        
                        if (opcao == 14) {//exclui aluno
				res = dados.removerCinto(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
                        
                        if (opcao == 15) {//exclui aluno
				res = dados.removerCropped(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
                        
                        if (opcao == 16) {//exclui aluno
				res = dados.removerMacacao(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
                        
                        if (opcao == 17) {//exclui aluno
				res = dados.removerSaia(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
                        
                        if (opcao == 18) {//exclui aluno
				res = dados.removerShorte(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
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
