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


public class TelaDetalheRoupa implements ActionListener{
    private JFrame janela;
    
	private JLabel labelCodigo = new JLabel("Código: ");
	private JTextField valorCodigo;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelTamanho = new JLabel("Tamamnho: (P,M,G) ");
	private JTextField valorTamanho;
        private JLabel labelCor = new JLabel("Cor: ");
	private JTextField valorCor;
	private JLabel labelMaterial = new JLabel("Material: ");
	private JTextField valorMaterial;
        private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
        private JLabel labelCategoria = new JLabel("Categoria: ");
	private JTextField valorCategoria;
        private JLabel labelGenero = new JLabel("Genero: ");
	private JTextField valorGenero;
        private JLabel labelEstampa = new JLabel("Estampa: ");
	private JTextField valorEstampa;
        private JLabel labelComprimento = new JLabel("Comprimento: ");
	private JTextField valorComprimento;
        private JLabel labelPreco = new JLabel("Preço: ");
	private JTextField valorPreco;
        

	private JLabel labelTipoCalca = new JLabel("Tipo de calça: ");
	private JTextField valorTipoCalca;
	private JLabel labelCos = new JLabel("Cós");
	private JTextField valorCos;
        private JLabel labelLavagem = new JLabel("Lavagem");
	private JTextField valorLavagem;
        
        private JLabel labelModelagem = new JLabel("Modelagem: ");
	private JTextField valorModelagem ;
	private JLabel labelManga = new JLabel("Manga:");
	private JTextField valorManga;
        private JLabel labelGola = new JLabel("Gola:");
	private JTextField valorGola;
        private JLabel labelBoatao = new JLabel("Botão:");
	private JTextField valorBotao;
        
        private JLabel labelDecote = new JLabel("Decote: ");
	private JTextField valorDecote ;
        private JLabel labelCapuz = new JLabel("Capuz: ");
	private JTextField valorCapuz ;
        private JLabel labelZiper = new JLabel("Zíper: ");
	private JTextField valorZiper ;
        private JLabel labelOcasiao = new JLabel("Ocasião: ");
	private JTextField valorOcasiao ;
        private JLabel labelLargura = new JLabel("Largura: ");
	private JTextField valorLargura ;
        
        
        
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
                                    TelaRoupa p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Calça";
		if (op == 2) s = "Cadastro de Camisa";
                if (op == 3) s = "Cadastro de Camiseta";
                if (op == 4) s = "Cadastro de Casaco";
                if (op == 5) s = "Cadastro de Cinto";
                if (op == 6) s = "Cadastro de Cropped";
                if (op == 7) s = "Cadastro de Macacão";
                if (op == 8) s = "Cadastro de Saia";
                if (op == 9) s = "Cadastro de Short";
                
		if (op == 10) s = "Detalhe de Calça";
		if (op ==11) s = "Detalhe de Camisa";
                if (op == 12) s = "Detalhe de Camiseta";
                if (op == 13) s = "Detalhe de Casaco";
                if (op == 14) s = "Detalhe de Cinto";
                if (op == 15) s = "Detalhe de Cropped";
                if (op == 16) s = "Detalhe de Macacão";
                if (op == 17) s = "Detalhe de Saia";
                if (op == 18) s = "Detalhe de Short";

                janela = new JFrame(s);
               

		//Preenche dados com dados da calça
		if (op == 10) {
                        String cdg = String.valueOf(dados.getCalca()[pos].getCodigo());
                        valorCodigo = new JTextField(cdg, 200);
			valorNome = new JTextField(dados.getCalca()[pos].getNome(), 200);
			valorTamanho = new JTextField(dados.getCalca()[pos].getTamanho(), 200);
			valorCor = new JTextField(dados.getCalca()[pos].getCor(),200);
                        valorMaterial = new JTextField(dados.getCalca()[pos].getMaterial(),200);
                        valorMarca = new JTextField(dados.getCalca()[pos].getMarca(),200);
                        valorCategoria = new JTextField(dados.getCalca()[pos].getCategoria(),200);
                        valorGenero = new JTextField(dados.getCalca()[pos].getGenero(),200);
                        valorEstampa = new JTextField(dados.getCalca()[pos].getEstampa(),200);
                        String com = String.valueOf(dados.getCalca()[pos].getComprimento());
                        valorComprimento = new JTextField(com,200);
                        String preco =String.valueOf(dados.getCalca()[pos].getPreco());
			valorPreco = new JTextField(preco, 200);
                        valorTipoCalca = new JTextField(dados.getCalca()[pos].getTipoCalca(), 200);
                        valorCos = new JTextField(dados.getCalca()[pos].getCos(), 200);
                        valorLavagem = new JTextField(dados.getCalca()[pos].getLavagem(), 200); 			

		} else if (op == 11) { //Preenche dados com dados da camisa
			String cdg = String.valueOf(dados.getCamisa()[pos].getCodigo());
                        valorCodigo = new JTextField(cdg, 200);
			valorNome = new JTextField(dados.getCamisa()[pos].getNome(), 200);
			valorTamanho = new JTextField(dados.getCamisa()[pos].getTamanho(), 200);
			valorCor = new JTextField(dados.getCamisa()[pos].getCor(),200);
                        valorMaterial = new JTextField(dados.getCamisa()[pos].getMaterial(),200);
                        valorMarca = new JTextField(dados.getCamisa()[pos].getMarca(),200);
                        valorCategoria = new JTextField(dados.getCamisa()[pos].getCategoria(),200);
                        valorGenero = new JTextField(dados.getCamisa()[pos].getGenero(),200);
                        valorEstampa = new JTextField(dados.getCamisa()[pos].getEstampa(),200);
                        String com = String.valueOf(dados.getCamisa()[pos].getComprimento());
                        valorComprimento = new JTextField(com,200);
                        String preco =String.valueOf(dados.getCamisa()[pos].getPreco());
			valorPreco = new JTextField(preco, 200);
                        valorModelagem = new JTextField(dados.getCamisa()[pos].getModelagem(), 200);
                        valorManga = new JTextField(dados.getCamisa()[pos].getManga(), 200);
                        valorGola = new JTextField(dados.getCamisa()[pos].getGola(), 200);
                        valorBotao = new JTextField(dados.getCamisa()[pos].getBotao(), 200);
                        
		}else if (op == 12) { //Preenche dados com dados da camiseta
			String cdg = String.valueOf(dados.getCamiseta()[pos].getCodigo());
                        valorCodigo = new JTextField(cdg, 200);
			valorNome = new JTextField(dados.getCamiseta()[pos].getNome(), 200);
			valorTamanho = new JTextField(dados.getCamiseta()[pos].getTamanho(), 200);
			valorCor = new JTextField(dados.getCamiseta()[pos].getCor(),200);
                        valorMaterial = new JTextField(dados.getCamiseta()[pos].getMaterial(),200);
                        valorMarca = new JTextField(dados.getCamiseta()[pos].getMarca(),200);
                        valorCategoria = new JTextField(dados.getCamiseta()[pos].getCategoria(),200);
                        valorGenero = new JTextField(dados.getCamiseta()[pos].getGenero(),200);
                        valorEstampa = new JTextField(dados.getCamiseta()[pos].getEstampa(),200);
                        String com = String.valueOf(dados.getCamiseta()[pos].getComprimento());
                        valorComprimento = new JTextField(com,200);
                        String preco =String.valueOf(dados.getCamiseta()[pos].getPreco());
			valorPreco = new JTextField(preco, 200);
                        valorModelagem = new JTextField(dados.getCamiseta()[pos].getModelagem(), 200);
                        valorDecote = new JTextField(dados.getCamiseta()[pos].getDecote(), 200);
                        
                }else if (op == 13) { //Preenche dados com dados da Casaco
			String cdg = String.valueOf(dados.getCasaco()[pos].getCodigo());
                        valorCodigo = new JTextField(cdg, 200);
			valorNome = new JTextField(dados.getCasaco()[pos].getNome(), 200);
			valorTamanho = new JTextField(dados.getCasaco()[pos].getTamanho(), 200);
			valorCor = new JTextField(dados.getCasaco()[pos].getCor(),200);
                        valorMaterial = new JTextField(dados.getCasaco()[pos].getMaterial(),200);
                        valorMarca = new JTextField(dados.getCasaco()[pos].getMarca(),200);
                        valorCategoria = new JTextField(dados.getCasaco()[pos].getCategoria(),200);
                        valorGenero = new JTextField(dados.getCasaco()[pos].getGenero(),200);
                        valorEstampa = new JTextField(dados.getCasaco()[pos].getEstampa(),200);
                        String com = String.valueOf(dados.getCasaco()[pos].getComprimento());
                        valorComprimento = new JTextField(com,200);
                        String preco =String.valueOf(dados.getCasaco()[pos].getPreco());
			valorPreco = new JTextField(preco, 200);
                        valorCapuz = new JTextField(dados.getCasaco()[pos].getCapuz(), 200);
                        valorZiper = new JTextField(dados.getCasaco()[pos].getZiper(), 200);
                        valorGola = new JTextField(dados.getCasaco()[pos].getGola(), 200);
                        
                }else if (op == 14) { //Preenche dados com dados da cinto
			String cdg = String.valueOf(dados.getCinto()[pos].getCodigo());
                        valorCodigo = new JTextField(cdg, 200);
			valorNome = new JTextField(dados.getCinto()[pos].getNome(), 200);
			valorTamanho = new JTextField(dados.getCinto()[pos].getTamanho(), 200);
			valorCor = new JTextField(dados.getCinto()[pos].getCor(),200);
                        valorMaterial = new JTextField(dados.getCinto()[pos].getMaterial(),200);
                        valorMarca = new JTextField(dados.getCinto()[pos].getMarca(),200);
                        valorCategoria = new JTextField(dados.getCinto()[pos].getCategoria(),200);
                        valorGenero = new JTextField(dados.getCinto()[pos].getGenero(),200);
                        valorEstampa = new JTextField(dados.getCinto()[pos].getEstampa(),200);
                        String com = String.valueOf(dados.getCinto()[pos].getComprimento());
                        valorComprimento = new JTextField(com,200);
                        String preco =String.valueOf(dados.getCinto()[pos].getPreco());
			valorPreco = new JTextField(preco, 200);
                        valorOcasiao = new JTextField(dados.getCinto()[pos].getOcasiao(), 200);
                        String larg = String.valueOf(dados.getCinto()[pos].getLargura());
                        valorLargura = new JTextField(larg, 200);                
                        
                }
                
                
                
                
                
                
                
                else { //Não preenche com dados

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

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelBairro.setBounds(30, 60, 150, 25);
                valorBairro.setBounds(180, 60, 180, 25);
                labelCep.setBounds(30, 100, 150, 25);
                valorCep.setBounds(180, 100, 180, 25);
                labelCidade.setBounds(30, 140, 150, 25);
                valorCidade.setBounds(180, 140, 180, 25);
                labelEstado.setBounds(30, 180, 150, 25);
                valorEstado.setBounds(180, 180, 180, 25);
                labelLote.setBounds(30, 220, 150, 25);
                valorLote.setBounds(180, 220, 180, 25);
                labelQuadra.setBounds(30, 260, 150, 25);
                valorQuadra.setBounds(180, 260, 180, 25);
                labelRua.setBounds(30, 300, 150, 25);
                valorRua.setBounds(180, 300, 180, 25);
		labelCPF.setBounds(30, 340, 150, 25);
		valorCPF.setBounds(180, 340, 180, 25);
		labelDataNascimento.setBounds(30, 380, 150, 25);
		valorDataNascimento.setBounds(180, 380, 180, 25);
		labelTelefone.setBounds(30, 420, 150, 25);
		valorDDD.setBounds(180, 420, 28, 25);
		valorTelefone.setBounds(420, 140, 65, 25);

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
			botaoSalvar.setBounds(120, 480, 115, 30);
			botaoExcluir.setBounds(245, 480, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
                this.janela.add(labelBairro);
		this.janela.add(valorBairro);
                this.janela.add(labelCep);
		this.janela.add(valorCep);
                this.janela.add(labelCidade);
		this.janela.add(valorCidade);
                this.janela.add(labelEstado);
		this.janela.add(valorEstado);
                this.janela.add(labelLote);
		this.janela.add(valorLote);
                this.janela.add(labelQuadra);
		this.janela.add(valorQuadra);
                this.janela.add(labelRua);
		this.janela.add(valorRua);
		this.janela.add(labelDataNascimento);
		this.janela.add(valorDataNascimento);
		this.janela.add(labelTelefone);
		this.janela.add(valorDDD);
		this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 800);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

}
