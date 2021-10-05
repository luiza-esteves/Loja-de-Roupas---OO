package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public final class TelaDetalheVenda implements ActionListener, MouseListener, ListSelectionListener{
	private JFrame janela;
	
	private final JLabel labelCod = new JLabel("Código da compra: ");
	private JTextField valorCod;
	private final JLabel labelNomeRoupa = new JLabel("Peça: ");
	private JTextField valorRoupa;
	private final JLabel labelValorTotal = new JLabel("Valor total: ");
	private JTextField valorValor;
	private final JLabel labelForma = new JLabel("Forma de pagamento: ");
	private JTextField valorForma;
	private final JLabel labelCliente = new JLabel("Cliente: ");
	private JTextField valorCliente;
	private final JLabel labelFuncionario = new JLabel("Funcionário: ");
	private JTextField valorFuncionario;
        
        private JFrame j;
        private JLabel t;
        
        private JList<String> listaRoupasCadastrados;

	private final JButton botaoExcluir = new JButton("Excluir");
	private final JButton botaoSalvar = new JButton("Salvar");

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
			valorRoupa = new JTextField(String.valueOf(dados.getVenda()[pos].getNomeRoupa()),200);
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
                        
                       
			botaoSalvar.setBounds(245, 300, 115, 30);
                        botaoSalvar.addActionListener(this);
		}
		
		labelCod.setBounds(30, 20, 150, 25);
		valorCod.setBounds(180, 20, 180, 25);
		labelNomeRoupa.setBounds(30, 60, 150, 25);
		valorRoupa.setBounds(180, 60, 180, 25);
                valorRoupa.addMouseListener(this);
		labelValorTotal.setBounds(30, 100, 180, 25);
		valorValor.setBounds(180, 100, 180, 25);		
		labelForma.setBounds(30, 140, 150, 25);
		valorForma.setBounds(180, 140, 180, 25);
		labelCliente.setBounds(30, 180, 150, 25);
		valorCliente.setBounds(180, 180, 180, 25);
		labelFuncionario.setBounds(30, 220, 150, 25);
		valorFuncionario.setBounds(180, 220, 180, 25);
                
		
		if (op == 2) {
			botaoSalvar.setBounds(120, 300, 115, 30);
			botaoExcluir.setBounds(245, 300, 115, 30);
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

		this.janela.setSize(450, 600);
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

			} catch (NullPointerException | NumberFormatException exc1) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;	
				res = dados.removerVenda(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusao(); 
						
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
				+ "2. Código não contem apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusao() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se a venda existe.", null, 
				JOptionPane.ERROR_MESSAGE);
	
	
        }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object src = e.getSource();
        if(src==valorRoupa){
                    
                    j = new JFrame("Opções roupa");
                    t = new JLabel("Opções roupa");
                    ArrayList<String> todasRoupas= new ArrayList();
                    
                      
                    ControleCalca cal = new ControleCalca(dados);
                    ControleCamisa cam = new ControleCamisa(dados);
                    ControleCamiseta cami  = new ControleCamiseta(dados);
                    ControleCasaco cas = new ControleCasaco(dados);
                    ControleCinto cin = new ControleCinto(dados);
                    ControleCropped cro = new ControleCropped(dados);
                    ControleMacacao mac = new ControleMacacao(dados);
                    ControleSaia sai= new ControleSaia(dados);
                    ControleShorte sho = new ControleShorte(dados);
                    for(int x=0;x<cal.getNomesCalcas().length;x++){
                        todasRoupas.add(cal.getNomesCalcas()[x]);
                    }
                    for(int x=0;x<cam.getNomesCamisa().length;x++){
                        todasRoupas.add(cam.getNomesCamisa()[x]);
                    }
                    for(int x=0;x<cami.getNomesCamiseta().length;x++){
                        todasRoupas.add(cami.getNomesCamiseta()[x]);
                    }
                    for(int x=0;x<cas.getNomesCasaco().length;x++){
                        todasRoupas.add(cas.getNomesCasaco()[x]);
                    }
                    for(int x=0;x<cin.getNomesCinto().length;x++){
                        todasRoupas.add(cin.getNomesCinto()[x]);
                    }
                    for(int x=0;x<cro.getNomesCropped().length;x++){
                        todasRoupas.add(cro.getNomesCropped()[x]);
                    }
                    for(int x=0;x<mac.getNomesMacacao().length;x++){
                        todasRoupas.add(mac.getNomesMacacao()[x]);
                    }
                    for(int x=0;x<sai.getNomesSaia().length;x++){
                        todasRoupas.add(sai.getNomesSaia()[x]);
                    }
                    for(int x=0;x<sho.getNomesShorte().length;x++){
                        todasRoupas.add(sho.getNomesShorte()[x]);
                    }
                    String z[]=todasRoupas.toArray(new String[0]);
                    
                    listaRoupasCadastrados = new JList<String>(z);
                    listaRoupasCadastrados.setBounds(20, 50, 400, 400);
                    
                    listaRoupasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                    listaRoupasCadastrados.setVisibleRowCount(100);
                    JScrollPane scroll = new JScrollPane(listaRoupasCadastrados);
                    j.add(t);
                    j.add(scroll);
                    j.setSize(600, 600);
                    j.setVisible(true);
                    listaRoupasCadastrados.addListSelectionListener(this);
                }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();
       

		if(e.getValueIsAdjusting() && src == listaRoupasCadastrados) {
                    
                    valorRoupa.setText(listaRoupasCadastrados.getName());                   
                    this.janela.add(valorRoupa);                    
                    this.j.dispose();
                    
                    
                   
                    
			
		}
        
    }

    
}
        