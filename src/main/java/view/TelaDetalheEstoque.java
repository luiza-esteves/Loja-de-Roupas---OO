package view;

import controle.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Estoque;



public class TelaDetalheEstoque implements ActionListener, ListSelectionListener{
    private JFrame janela;
    ControleDados dados = new ControleDados();
    
    ControleEstoque e;
    private String[] roupa;
    
    private int posicao, indice;
    private int opcao;
    private String s;
    
    private final String[] novoDado = new String[4];
    
    private final JLabel labelCodigo = new JLabel("Código: ");
    private JTextField valorCodigo;
    private final JLabel labelNome = new JLabel("Nome: ");
    private JTextField valorNome;
    private final JLabel labelQtdEstoque = new JLabel("Quantidade em estoque ");
    private JTextField valorQtdEstoque;
    JList listaNome = null;
    
    private final JButton botaoExcluir = new JButton("Excluir");
	private final JButton botaoSalvar = new JButton("Salvar");
        private String nome ;
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
                    valorQtdEstoque = new JTextField(200);                    
                    botaoSalvar.setBounds(245, 580, 115, 30);
                                      
                    if(op==1){
                        
                        ControleCalca calca = new ControleCalca(dados);
                        roupa = calca.getNomesCalcas();
                        listaNome = new JList(calca.getNomesCalcas());
                        listaNome.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                        listaNome.setLayoutOrientation(JList.VERTICAL_WRAP);
                        listaNome.setVisibleRowCount(-1);
                        listaNome.addListSelectionListener(this);
                           
                    }else if(op==2){
                     
                        ControleCamisa camisa = new ControleCamisa(dados);
                        roupa = camisa.getNomesCamisa();
                        listaNome = new JList(camisa.getNomesCamisa());
                        listaNome.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                        listaNome.setLayoutOrientation(JList.VERTICAL_WRAP);
                        listaNome.setVisibleRowCount (-1);
                        listaNome.addListSelectionListener(this);
                        nome = String.valueOf(listaNome.getSelectedValue());                        
                    }else if(op==3){
                        ControleCamiseta camiseta = new ControleCamiseta(dados);
                        listaNome = new JList(camiseta.getNomesCamiseta());
                        roupa = camiseta.getNomesCamiseta();
                        listaNome.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                        listaNome.setLayoutOrientation(JList.VERTICAL_WRAP);
                        listaNome.setVisibleRowCount (-1);
                        nome = String.valueOf(listaNome.getSelectedValue());
                    }else if(op==4){
                        ControleCasaco casaco = new ControleCasaco(dados);
                        roupa = casaco.getNomesCasaco();
                        listaNome = new JList(casaco.getNomesCasaco());
                        listaNome.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                        listaNome.setLayoutOrientation(JList.VERTICAL_WRAP);
                        listaNome.setVisibleRowCount (-1);
                        nome = String.valueOf(listaNome.getSelectedValue());
                        
                    }else if(op==5){
                        ControleCinto cinto = new ControleCinto(dados);
                        listaNome = new JList(cinto.getNomesCinto());
                        roupa = cinto.getNomesCinto();
                        listaNome.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                        listaNome.setLayoutOrientation(JList.VERTICAL_WRAP);
                        listaNome.setVisibleRowCount (-1);
                        nome = String.valueOf(listaNome.getSelectedValue());
                        
                    }else if(op==6){
                        ControleCropped cropped = new ControleCropped(dados);
                        listaNome = new JList(cropped.getNomesCropped());
                        roupa = cropped.getNomesCropped();
                        listaNome.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                        listaNome.setLayoutOrientation(JList.VERTICAL_WRAP);
                        listaNome.setVisibleRowCount (-1);
                        nome = String.valueOf(listaNome.getSelectedValue());
                        
                    }else if(op==7){
                        ControleMacacao macacao = new ControleMacacao(dados);
                        listaNome = new JList(macacao.getNomesMacacao());
                        roupa = macacao.getNomesMacacao();
                        listaNome.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                        listaNome.setLayoutOrientation(JList.VERTICAL_WRAP);
                        listaNome.setVisibleRowCount (-1);
                        nome = String.valueOf(listaNome.getSelectedValue());
                    }else if(op==8){
                        ControleSaia saia = new ControleSaia(dados);
                        listaNome = new JList(saia.getNomesSaia());
                        roupa = saia.getNomesSaia();
                        listaNome.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                        listaNome.setLayoutOrientation(JList.VERTICAL_WRAP);
                        listaNome.setVisibleRowCount (-1);
                        nome = String.valueOf(listaNome.getSelectedValue());
                        
                    }else if(op==9){
                        ControleShorte shorte = new ControleShorte(dados);
                        listaNome = new JList(shorte.getNomesShorte());
                        roupa = shorte.getNomesShorte();
                        listaNome.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                        listaNome.setLayoutOrientation(JList.VERTICAL_WRAP);
                        listaNome.setVisibleRowCount (-1);
                        nome = String.valueOf(listaNome.getSelectedValue());
                    }
                    
                    JScrollPane listScroller = new JScrollPane(listaNome);
                    listScroller.setBounds(180, 60, 180, 100);
                    this.janela.add(listScroller);
                    
                }
                
                if (op == 10 || op == 11 || op == 12 || op == 13 || op == 14 || op == 15 || op == 16 || op == 17 || op == 18) {
			botaoSalvar.setBounds(120, 480, 115, 30);
			botaoExcluir.setBounds(245, 480, 115, 30);
                        valorNome.setBounds(180, 20, 180, 25);
                        this.janela.add(valorNome);
			this.janela.add(botaoExcluir);
		}
                                         
                labelCodigo.setBounds(30, 200, 150, 25);
                valorCodigo.setBounds(180, 200, 180, 25);
		labelNome.setBounds(30, 70, 150, 25);
		
                labelQtdEstoque.setBounds(30, 250, 150, 25);
                valorQtdEstoque.setBounds(180, 250, 180, 25); 
                
                
                this.janela.add(labelNome);
		
                this.janela.add(labelCodigo);
		this.janela.add(valorCodigo);

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
                                novoDado[2] =  nome;
                                System.out.println(novoDado[2]);
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
                    
			boolean res = false;

			if (opcao == 10) {//exclui aluno
                            res = dados.removerEstoqueCalca(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
				
			if (opcao == 11){ //exclui professor
				res = dados.removerEstoqueCamisa(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoProf(); 
			}
                        
                        if (opcao == 12) {//exclui aluno
				res = dados.removerEstoqueCamiseta(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
                        
                        if (opcao == 13) {//exclui aluno
				res = dados.removerEstoqueCasaco(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
                        
                        if (opcao == 14) {//exclui aluno
				res = dados.removerEstoqueCinto(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
                        
                        if (opcao == 15) {//exclui aluno
				res = dados.removerEstoqueCropped(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
                        
                        if (opcao == 16) {//exclui aluno
				res = dados.removerEstoqueMacacao(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
                        
                        if (opcao == 17) {//exclui aluno
				res = dados.removerEstoqueSaia(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
                        
                        if (opcao == 18) {//exclui aluno
				res = dados.removerEstoqueShorte(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
	
		}
	}
        
        @Override
            public void valueChanged(ListSelectionEvent e) {       
                indice = listaNome.getSelectedIndex();       
                nome = roupa[indice];
                System.out.println(nome);

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
