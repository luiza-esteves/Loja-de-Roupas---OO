package view;

import controle.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TelaRoupa implements ActionListener, ListSelectionListener{
    
        private JFrame janela;
	private JLabel titulo = new JLabel("Menu de Roupas");
	private JButton cadastroCalca ;
	private JButton refreshCalca;
	private JButton cadastroCamisa;
	private JButton refreshCamisa;
        private JButton cadastroCamiseta;
	private JButton refreshCamiseta;
        private JButton cadastroCasaco;
	private JButton refreshCasaco;
        private JButton cadastroCinto;
	private JButton refreshCinto;
        private JButton cadastroCropped;
	private JButton refreshCropped;
        private JButton cadastroMacacao;
	private JButton refreshMacacao;
        private JButton cadastroSaia;
	private JButton refreshSaia;
        private JButton cadastroShorte;
	private JButton refreshShorte;
        
        
        private static final JFrame jan = new JFrame("Roupas");
        private static final JLabel tit = new JLabel("Roupas");     
        private static final JButton calca = new JButton("Calça");
        private static final JButton camisa = new JButton("Camisa");
        private static final JButton camiseta = new JButton("Camiseta");
        private static final JButton casaco = new JButton("Casaco");
        private static final JButton cinto = new JButton("Cinto");
        private static final JButton cropped = new JButton("Cropped");
        private static final JButton macacao = new JButton("Macacao");
        private static final JButton saia = new JButton("Saia");
        private static final JButton shorte = new JButton("Short");
        
        
	private static ControleDados dados;
	private JList<String> listaCalcaCadastrados;
	private JList<String> listaCamisaCadastrados;
        private JList<String> listaCamisetaCadastrados;
        private JList<String> listaCasacoCadastrados;
        private JList<String> listaCintoCadastrados;
        private JList<String> listaCroppedCadastrados;
        private JList<String> listaMacacaoCadastrados;
        private JList<String> listaSaiaCadastrados;
        private JList<String> listaShorteCadastrados;
        
        
	private String[] listaNomes = new String[50];

    public TelaRoupa() {      
                tit.setFont(new Font("Arial", Font.BOLD, 20));
                tit.setBounds(140, 10, 150, 30);
                calca.setBounds(140, 50, 100, 30);
                camisa.setBounds(140, 100, 100, 30);	
                camiseta.setBounds(140, 150, 100, 30);
                casaco.setBounds(140, 200, 100, 30);
                cinto.setBounds(140, 250, 100, 30);
                cropped.setBounds(140, 300, 100, 30);
                macacao.setBounds(140, 350, 100, 30);
                saia.setBounds(140, 400, 100, 30);
                shorte.setBounds(140, 450, 100, 30);
  
                jan.setLayout(null);
		
		jan.add(tit);
		jan.add(calca);
		jan.add(camisa);
                jan.add(camiseta);
                jan.add(casaco);
                jan.add(cinto);
                jan.add(cropped);
                jan.add(macacao);
                jan.add(saia);
                jan.add(shorte);
		
		jan.setSize(400, 600);
		jan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jan.setVisible(true);
                
            
    }
    
    public static void main(String[] args) {
		TelaRoupa menu = new TelaRoupa();
                
		calca.addActionListener(menu);
		camisa.addActionListener(menu);
                camiseta.addActionListener(menu);
                casaco.addActionListener(menu);
                cinto.addActionListener(menu);
                cropped.addActionListener(menu);
                macacao.addActionListener(menu);
                saia.addActionListener(menu);
                shorte.addActionListener(menu);           
    }
        
        public void mostrarDados(int op, ControleDados d){
             System.out.println("oi");
            dados = d;
		switch (op) {
                    case 1:// Mostrar dados de alunos cadastrados (JList)
                       
                            listaNomes = new ControleCalca(dados).getNomesCalcas();
                            
                            listaCalcaCadastrados = new JList<String>(listaNomes);
                            janela = new JFrame("Calças");
                            titulo = new JLabel("Calças Cadastrados");
                            cadastroCalca = new JButton("Cadastrar");            
                            refreshCalca = new JButton("Refresh");

                            titulo.setFont(new Font("Arial", Font.BOLD, 20));
                            titulo.setBounds(90, 10, 250, 30);
                            listaCalcaCadastrados.setBounds(20, 50, 350, 120);
                            listaCalcaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                            listaCalcaCadastrados.setVisibleRowCount(10);

                            cadastroCalca.setBounds(70, 177, 100, 30);
                            refreshCalca.setBounds(200, 177, 100, 30);

                            janela.setLayout(null);

                            janela.add(titulo);
                            janela.add(listaCalcaCadastrados);
                            janela.add(cadastroCalca);
                            janela.add(refreshCalca);

                            janela.setSize(400, 250);
                            janela.setVisible(true);

                            cadastroCalca.addActionListener(this);
                            refreshCalca.addActionListener(this);
                            listaCalcaCadastrados.addListSelectionListener(this);

                            break;

                    case 2:// Mostrar dados de camisas cadastrados (JList)
                            listaNomes = new ControleCamisa(dados).getNomesCamisa();
                            listaCamisaCadastrados = new JList<String>(listaNomes);
                            janela = new JFrame("Camisa");
                            titulo = new JLabel("Camisa Cadastrados");
                            cadastroCamisa = new JButton("Cadastrar");
                            refreshCamisa = new JButton("Refresh");

                            titulo.setFont(new Font("Arial", Font.BOLD, 20));
                            titulo.setBounds(90, 10, 250, 30);
                            listaCamisaCadastrados.setBounds(20, 50, 350, 120);
                            listaCamisaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                            listaCamisaCadastrados.setVisibleRowCount(10);

                            cadastroCamisa.setBounds(70, 177, 100, 30);
                            refreshCamisa.setBounds(200, 177, 100, 30);

                            janela.setLayout(null);

                            janela.add(titulo);
                            janela.add(listaCamisaCadastrados);
                            janela.add(cadastroCamisa);
                            janela.add(refreshCamisa);

                            janela.setSize(400, 250);
                            janela.setVisible(true);

                            cadastroCamisa.addActionListener(this);
                            refreshCamisa.addActionListener(this);
                            listaCamisaCadastrados.addListSelectionListener(this);

                            break;
                    case 3:// Mostrar dados de alunos cadastrados (JList)
                            listaNomes = new ControleCamiseta(dados).getNomesCamiseta();
                            listaCamisetaCadastrados = new JList<String>(listaNomes);
                            janela = new JFrame("Camiseta");
                            titulo = new JLabel("Camiseta Cadastrados");
                            cadastroCamiseta = new JButton("Cadastrar");
                            refreshCamiseta = new JButton("Refresh");

                            titulo.setFont(new Font("Arial", Font.BOLD, 20));
                            titulo.setBounds(90, 10, 250, 30);
                            listaCamisetaCadastrados.setBounds(20, 50, 350, 120);
                            listaCamisetaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                            listaCamisetaCadastrados.setVisibleRowCount(10);

                            cadastroCamiseta.setBounds(70, 177, 100, 30);
                            refreshCamiseta.setBounds(200, 177, 100, 30);

                            janela.setLayout(null);

                            janela.add(titulo);
                            janela.add(listaCamisetaCadastrados);
                            janela.add(cadastroCamiseta);
                            janela.add(refreshCamiseta);

                            janela.setSize(400, 250);
                            janela.setVisible(true);

                            cadastroCamiseta.addActionListener(this);
                            refreshCamiseta.addActionListener(this);
                            listaCamisetaCadastrados.addListSelectionListener(this);

                            break;
                            
//                    case 4:// Mostrar dados de alunos cadastrados (JList)
//                            listaNomes = new ControleCasaco(dados).getNomeCasaco();
//                            listaCasacoCadastrados = new JList<String>(listaNomes);
//                            janela = new JFrame("Casaco");
//                            titulo = new JLabel("Casacos Cadastrados");
//                            cadastroCamiseta = new JButton("Cadastrar");
//                            refreshCamiseta = new JButton("Refresh");
//
//                            titulo.setFont(new Font("Arial", Font.BOLD, 20));
//                            titulo.setBounds(90, 10, 250, 30);
//                            listaCasacoCadastrados.setBounds(20, 50, 350, 120);
//                            listaCasacoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//                            listaCasacoCadastrados.setVisibleRowCount(10);
//
//                            cadastroCasaco.setBounds(70, 177, 100, 30);
//                            refreshCasaco.setBounds(200, 177, 100, 30);
//
//                            janela.setLayout(null);
//
//                            janela.add(titulo);
//                            janela.add(listaCasacoCadastrados);
//                            janela.add(cadastroCasaco);
//                            janela.add(refreshCasaco);
//
//                            janela.setSize(400, 250);
//                            janela.setVisible(true);
//
//                            cadastroCasaco.addActionListener(this);
//                            refreshCasaco.addActionListener(this);
//                            listaCasacoCadastrados.addListSelectionListener(this);
//
//                            break;
//                            
//                    case 5:// Mostrar dados de alunos cadastrados (JList)
//                            listaNomes = new ControleCinto(dados).getNomeCasaco();
//                            listaCintoCadastrados = new JList<String>(listaNomes);
//                            janela = new JFrame("Cinto");
//                            titulo = new JLabel("Cintos Cadastrados");
//                            cadastroCinto = new JButton("Cadastrar");
//                            refreshCinto = new JButton("Refresh");
//
//                            titulo.setFont(new Font("Arial", Font.BOLD, 20));
//                            titulo.setBounds(90, 10, 250, 30);
//                            listaCintoCadastrados.setBounds(20, 50, 350, 120);
//                            listaCintoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//                            listaCintoCadastrados.setVisibleRowCount(10);
//
//                            cadastroCinto.setBounds(70, 177, 100, 30);
//                            refreshCinto.setBounds(200, 177, 100, 30);
//
//                            janela.setLayout(null);
//
//                            janela.add(titulo);
//                            janela.add(listaCintoCadastrados);
//                            janela.add(cadastroCinto);
//                            janela.add(refreshCinto);
//
//                            janela.setSize(400, 250);
//                            janela.setVisible(true);
//
//                            cadastroCinto.addActionListener(this);
//                            refreshCinto.addActionListener(this);
//                            listaCintoCadastrados.addListSelectionListener(this);
//
//                            break;
//                    
//                    case 6:// Mostrar dados de alunos cadastrados (JList)
//                            listaNomes = new ControleCropped(dados).getNomeCropped();
//                            listaCroppedCadastrados = new JList<String>(listaNomes);
//                            janela = new JFrame("Cropped");
//                            titulo = new JLabel("Cropped Cadastrados");
//                            cadastroCropped = new JButton("Cadastrar");
//                            refreshCropped = new JButton("Refresh");
//
//                            titulo.setFont(new Font("Arial", Font.BOLD, 20));
//                            titulo.setBounds(90, 10, 250, 30);
//                            listaCroppedCadastrados.setBounds(20, 50, 350, 120);
//                            listaCroppedCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//                            listaCroppedCadastrados.setVisibleRowCount(10);
//
//                            cadastroCropped.setBounds(70, 177, 100, 30);
//                            refreshCropped.setBounds(200, 177, 100, 30);
//
//                            janela.setLayout(null);
//
//                            janela.add(titulo);
//                            janela.add(listaCroppedCadastrados);
//                            janela.add(cadastroCropped);
//                            janela.add(refreshCropped);
//
//                            janela.setSize(400, 250);
//                            janela.setVisible(true);
//
//                            cadastroCropped.addActionListener(this);
//                            refreshCropped.addActionListener(this);
//                            listaCroppedCadastrados.addListSelectionListener(this);
//
//                            break;
//                            
//                    case 7:// Mostrar dados de alunos cadastrados (JList)
//                            listaNomes = new ControleMacacao(dados).getNomeMacacao();
//                            listaMacacaoCadastrados = new JList<String>(listaNomes);
//                            janela = new JFrame("Macacão");
//                            titulo = new JLabel("Macacão Cadastrados");
//                            cadastroMacacao = new JButton("Cadastrar");
//                            refreshMacacao = new JButton("Refresh");
//
//                            titulo.setFont(new Font("Arial", Font.BOLD, 20));
//                            titulo.setBounds(90, 10, 250, 30);
//                            listaMacacaoCadastrados.setBounds(20, 50, 350, 120);
//                            listaMacacaoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//                            listaMacacaoCadastrados.setVisibleRowCount(10);
//
//                            cadastroMacacao.setBounds(70, 177, 100, 30);
//                            refreshMacacao.setBounds(200, 177, 100, 30);
//
//                            janela.setLayout(null);
//
//                            janela.add(titulo);
//                            janela.add(listaMacacaoCadastrados);
//                            janela.add(cadastroMacacao);
//                            janela.add(refreshMacacao);
//
//                            janela.setSize(400, 250);
//                            janela.setVisible(true);
//
//                            cadastroMacacao.addActionListener(this);
//                            refreshMacacao.addActionListener(this);
//                            listaMacacaoCadastrados.addListSelectionListener(this);
//
//                            break;
//                            
//                    case 8:// Mostrar dados de alunos cadastrados (JList)
//                            listaNomes = new ControleSaia(dados).getNomeSaia();
//                            listaSaiaCadastrados = new JList<String>(listaNomes);
//                            janela = new JFrame("Saia");
//                            titulo = new JLabel("Saias Cadastrados");
//                            cadastroSaia = new JButton("Cadastrar");
//                            refreshSaia = new JButton("Refresh");
//
//                            titulo.setFont(new Font("Arial", Font.BOLD, 20));
//                            titulo.setBounds(90, 10, 250, 30);
//                            listaSaiaCadastrados.setBounds(20, 50, 350, 120);
//                            listaSaiaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//                            listaSaiaCadastrados.setVisibleRowCount(10);
//
//                            cadastroSaia.setBounds(70, 177, 100, 30);
//                            refreshSaia.setBounds(200, 177, 100, 30);
//
//                            janela.setLayout(null);
//
//                            janela.add(titulo);
//                            janela.add(listaSaiaCadastrados);
//                            janela.add(cadastroSaia);
//                            janela.add(refreshSaia);
//
//                            janela.setSize(400, 250);
//                            janela.setVisible(true);
//
//                            cadastroSaia.addActionListener(this);
//                            refreshSaia.addActionListener(this);
//                            listaSaiaCadastrados.addListSelectionListener(this);
//
//                            break;
//                            
//                    case 9:// Mostrar dados de alunos cadastrados (JList)
//                            listaNomes = new ControleShorte(dados).getNomeShorte();
//                            listaShorteCadastrados = new JList<String>(listaNomes);
//                            janela = new JFrame("Saia");
//                            titulo = new JLabel("Saias Cadastrados");
//                            cadastroShorte = new JButton("Cadastrar");
//                            refreshShorte = new JButton("Refresh");
//
//                            titulo.setFont(new Font("Arial", Font.BOLD, 20));
//                            titulo.setBounds(90, 10, 250, 30);
//                            listaShorteCadastrados.setBounds(20, 50, 350, 120);
//                            listaShorteCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//                            listaShorteCadastrados.setVisibleRowCount(10);
//
//                            cadastroShorte.setBounds(70, 177, 100, 30);
//                            refreshShorte.setBounds(200, 177, 100, 30);
//
//                            janela.setLayout(null);
//
//                            janela.add(titulo);
//                            janela.add(listaShorteCadastrados);
//                            janela.add(cadastroShorte);
//                            janela.add(refreshShorte);
//
//                            janela.setSize(400, 250);
//                            janela.setVisible(true);
//
//                            cadastroShorte.addActionListener(this);
//                            refreshShorte.addActionListener(this);
//                            listaShorteCadastrados.addListSelectionListener(this);
//
//                            break; 
                    default:
                            JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
                                            JOptionPane.ERROR_MESSAGE);
                    }

	}
        
        public void actionPerformed(ActionEvent e) {
            System.out.println("evento funcionando");
            Object src = e.getSource(); 
            if(src == calca){     
                new TelaRoupa().mostrarDados(1, dados);
            }else if(src == camisa){
                new TelaRoupa().mostrarDados(2, dados);;
            }else if(src == camiseta){
                new TelaRoupa().mostrarDados(3, dados);
            }else if(src == casaco){
                new TelaRoupa().mostrarDados(4, dados);
            }else if(src == cinto){
                new TelaRoupa().mostrarDados(5, dados);
            }else if(src == cropped){
                new TelaRoupa().mostrarDados(6, dados);
            }else if(src == macacao){
                new TelaRoupa().mostrarDados(7, dados);
            }else if(src == saia){
                new TelaRoupa().mostrarDados(8, dados);
            }else if(src == shorte){
                new TelaRoupa().mostrarDados(9, dados);
            }
        }
        
    public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaCalcaCadastrados) {
                        
			new TelaDetalheRoupa().inserirEditar(10, dados, this, 
					listaCalcaCadastrados.getSelectedIndex());
		}

//		if(e.getValueIsAdjusting() && src == listaVendedoresCadastrados) {
//			new TelaDetalhePessoa().inserirEditar(4, dados, this, 
//					listaVendedoresCadastrados.getSelectedIndex());
//		}
	}

    public JList<String> getListaCalcasCadastrados() {
            return listaCalcaCadastrados;
    }

    public void setListaCalcaCadastrados(JList<String> listaCalcaCadastrados) {
            this.listaCalcaCadastrados = listaCalcaCadastrados;
    }
    
}
