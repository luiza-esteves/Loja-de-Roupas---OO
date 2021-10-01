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
    
	private final JLabel labelCodigo = new JLabel("Código: ");
	private JTextField valorCodigo;
	private final JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private final JLabel labelTamanho = new JLabel("Tamamnho: (P,M,G) ");
	private JTextField valorTamanho;
        private final JLabel labelCor = new JLabel("Cor: ");
	private JTextField valorCor;
	private final JLabel labelMaterial = new JLabel("Material: ");
	private JTextField valorMaterial;
        private final JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
        private final JLabel labelCategoria = new JLabel("Categoria: ");
	private JTextField valorCategoria;
        private final JLabel labelGenero = new JLabel("Genero: ");
	private JTextField valorGenero;
        private final JLabel labelEstampa = new JLabel("Estampa: ");
	private JTextField valorEstampa;
        private final JLabel labelComprimento = new JLabel("Comprimento: ");
	private JTextField valorComprimento;
        private final JLabel labelPreco = new JLabel("Preço: ");
	private JTextField valorPreco;
	private final JLabel labelTipoCalca = new JLabel("Tipo de calça: ");
	private JTextField valorTipoCalca;
	private final JLabel labelCos = new JLabel("Cós");
	private JTextField valorCos;
        private final JLabel labelLavagem = new JLabel("Lavagem");
	private JTextField valorLavagem;        
        private final JLabel labelModelagem = new JLabel("Modelagem: ");
	private JTextField valorModelagem ;
	private final JLabel labelManga = new JLabel("Manga:");
	private JTextField valorManga;
        private final JLabel labelGola = new JLabel("Gola:");
	private JTextField valorGola;
        private final JLabel labelBotao = new JLabel("Botão:");
	private JTextField valorBotao;
        private final JLabel labelEstilo = new JLabel("Estilo:");
	private JTextField valorEstilo;
        private final JLabel labelTipoCintura = new JLabel("Tipo de cintura:");
	private JTextField valorTipoCintura;       
        private final JLabel labelDecote = new JLabel("Decote: ");
	private JTextField valorDecote ;
        private final JLabel labelCapuz = new JLabel("Capuz: ");
	private JTextField valorCapuz ;
        private final JLabel labelZiper = new JLabel("Zíper: ");
	private JTextField valorZiper ;
        private final JLabel labelOcasiao = new JLabel("Ocasião: ");
	private JTextField valorOcasiao ;
        private final JLabel labelLargura = new JLabel("Largura: ");
	private JTextField valorLargura ;
        private final JLabel labelTipoShort = new JLabel("Tipo de Short: ");
	private JTextField valorTipoShort ;
        private final JLabel labelTipoBoca = new JLabel("Tipo de Boca: ");
	private JTextField valorTipoBoca;
           
	private final JButton botaoExcluir = new JButton("Excluir");
	private final JButton botaoSalvar = new JButton("Salvar");
	private final String[] novoDado = new String[16];
	private static ControleDados dados;

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
                        
                }else if (op == 15) { //Preenche dados com dados do cropped
			String cdg = String.valueOf(dados.getCropped()[pos].getCodigo());
                        valorCodigo = new JTextField(cdg, 200);
			valorNome = new JTextField(dados.getCropped()[pos].getNome(), 200);
			valorTamanho = new JTextField(dados.getCropped()[pos].getTamanho(), 200);
			valorCor = new JTextField(dados.getCropped()[pos].getCor(),200);
                        valorMaterial = new JTextField(dados.getCropped()[pos].getMaterial(),200);
                        valorMarca = new JTextField(dados.getCropped()[pos].getMarca(),200);
                        valorCategoria = new JTextField(dados.getCropped()[pos].getCategoria(),200);
                        valorGenero = new JTextField(dados.getCropped()[pos].getGenero(),200);
                        valorEstampa = new JTextField(dados.getCropped()[pos].getEstampa(),200);
                        String com = String.valueOf(dados.getCropped()[pos].getComprimento());
                        valorComprimento = new JTextField(com,200);
                        String preco =String.valueOf(dados.getCropped()[pos].getPreco());
			valorPreco = new JTextField(preco, 200);
                        valorEstilo = new JTextField(dados.getCropped()[pos].getEstilo(), 200);
                        valorModelagem = new JTextField(dados.getCropped()[pos].getModelagem(), 200);
                        valorManga = new JTextField(dados.getCropped()[pos].getManga(), 200); 
                        
                }else if (op == 16) { //Preenche dados com dados do macacão
			String cdg = String.valueOf(dados.getMacacao()[pos].getCodigo());
                        valorCodigo = new JTextField(cdg, 200);
			valorNome = new JTextField(dados.getMacacao()[pos].getNome(), 200);
			valorTamanho = new JTextField(dados.getMacacao()[pos].getTamanho(), 200);
			valorCor = new JTextField(dados.getMacacao()[pos].getCor(),200);
                        valorMaterial = new JTextField(dados.getMacacao()[pos].getMaterial(),200);
                        valorMarca = new JTextField(dados.getMacacao()[pos].getMarca(),200);
                        valorCategoria = new JTextField(dados.getMacacao()[pos].getCategoria(),200);
                        valorGenero = new JTextField(dados.getMacacao()[pos].getGenero(),200);
                        valorEstampa = new JTextField(dados.getMacacao()[pos].getEstampa(),200);
                        String com = String.valueOf(dados.getMacacao()[pos].getComprimento());
                        valorComprimento = new JTextField(com,200);
                        String preco =String.valueOf(dados.getMacacao()[pos].getPreco());
			valorPreco = new JTextField(preco, 200);
                        valorLavagem = new JTextField(dados.getMacacao()[pos].getLavagem(), 200);
                        valorModelagem = new JTextField(dados.getMacacao()[pos].getModelagem(), 200);         
                }else if (op == 17) { //Preenche dados com dados da saia
			String cdg = String.valueOf(dados.getSaia()[pos].getCodigo());
                        valorCodigo = new JTextField(cdg, 200);
			valorNome = new JTextField(dados.getSaia()[pos].getNome(), 200);
			valorTamanho = new JTextField(dados.getSaia()[pos].getTamanho(), 200);
			valorCor = new JTextField(dados.getSaia()[pos].getCor(),200);
                        valorMaterial = new JTextField(dados.getSaia()[pos].getMaterial(),200);
                        valorMarca = new JTextField(dados.getSaia()[pos].getMarca(),200);
                        valorCategoria = new JTextField(dados.getSaia()[pos].getCategoria(),200);
                        valorGenero = new JTextField(dados.getSaia()[pos].getGenero(),200);
                        valorEstampa = new JTextField(dados.getSaia()[pos].getEstampa(),200);
                        String com = String.valueOf(dados.getSaia()[pos].getComprimento());
                        valorComprimento = new JTextField(com,200);
                        String preco =String.valueOf(dados.getSaia()[pos].getPreco());
			valorPreco = new JTextField(preco, 200);
                        valorTipoCintura = new JTextField(dados.getSaia()[pos].getTipoCintura(), 200);
                        valorModelagem = new JTextField(dados.getSaia()[pos].getModelagem(), 200);         
                }else if (op == 18) { //Preenche dados com dados da saia
			String cdg = String.valueOf(dados.getShorte()[pos].getCodigo());
                        valorCodigo = new JTextField(cdg, 200);
			valorNome = new JTextField(dados.getShorte()[pos].getNome(), 200);
			valorTamanho = new JTextField(dados.getShorte()[pos].getTamanho(), 200);
			valorCor = new JTextField(dados.getShorte()[pos].getCor(),200);
                        valorMaterial = new JTextField(dados.getShorte()[pos].getMaterial(),200);
                        valorMarca = new JTextField(dados.getShorte()[pos].getMarca(),200);
                        valorCategoria = new JTextField(dados.getShorte()[pos].getCategoria(),200);
                        valorGenero = new JTextField(dados.getShorte()[pos].getGenero(),200);
                        valorEstampa = new JTextField(dados.getShorte()[pos].getEstampa(),200);
                        String com = String.valueOf(dados.getShorte()[pos].getComprimento());
                        valorComprimento = new JTextField(com,200);
                        String preco =String.valueOf(dados.getShorte()[pos].getPreco());
			valorPreco = new JTextField(preco, 200);
                        valorTipoShort = new JTextField(dados.getShorte()[pos].getTipoShort(), 200);
                        valorTipoBoca = new JTextField(dados.getShorte()[pos].getTipoBoca(), 200);         
                }
                    
                else { //Não preenche com dados
                        
                        valorCodigo = new JTextField(200);
			valorNome = new JTextField(200);
			valorTamanho = new JTextField(200);
			valorCor = new JTextField(200);
                        valorMaterial = new JTextField(200);
                        valorMarca = new JTextField(200);
                        valorCategoria = new JTextField(200);
                        valorGenero = new JTextField(200);
                        valorEstampa = new JTextField(200);               
                        valorComprimento = new JTextField(20);      
			valorPreco = new JTextField(200);
                        valorTipoCalca= new JTextField(200);
                        valorCos= new JTextField(200);
                        valorLavagem= new JTextField(200);
                        valorModelagem= new JTextField(200);
                        valorManga= new JTextField(200);
                        valorGola= new JTextField(200);
                        valorBotao= new JTextField(200);
                        valorDecote= new JTextField(200);
                        valorCapuz= new JTextField(200);
                        valorZiper= new JTextField(200);
                        valorOcasiao= new JTextField(200);
                        valorLargura= new JTextField(200);
                        valorEstilo= new JTextField(200);
                        valorTipoCintura= new JTextField(200);
                        valorTipoShort= new JTextField(200);
                        valorTipoBoca= new JTextField(200);

			botaoSalvar.setBounds(245, 650, 115, 30);
		}

                labelCodigo.setBounds(30, 20, 150, 25);
                valorCodigo.setBounds(180, 20, 180, 25);
		labelNome.setBounds(30, 60, 150, 25);
		valorNome.setBounds(180, 60, 180, 25);
                labelTamanho.setBounds(30, 100, 150, 25);
                valorTamanho.setBounds(180, 100, 180, 25);
                labelCor.setBounds(30, 140, 150, 25);
                valorCor.setBounds(180, 140, 180, 25);
                labelMaterial.setBounds(30, 180, 150, 25);
                valorMaterial.setBounds(180, 180, 180, 25);
                labelMarca.setBounds(30, 220, 150, 25);
                valorMarca.setBounds(180, 220, 180, 25);
                labelCategoria.setBounds(30, 260, 150, 25);
                valorCategoria.setBounds(180, 260, 180, 25);
                labelGenero.setBounds(30, 300, 150, 25);
                valorGenero.setBounds(180, 300, 180, 25);
		labelEstampa.setBounds(30, 340, 150, 25);
		valorEstampa.setBounds(180, 340, 180, 25);
		labelComprimento.setBounds(30, 380, 150, 25);
		valorComprimento.setBounds(180, 380, 180, 25);
		labelPreco.setBounds(30, 420, 150, 25);
		valorPreco.setBounds(180, 420, 100, 25);
                

		//Coloca os campos relacionados a calça
		if (op == 1 || op == 10 ) {
                        labelTipoCalca.setBounds(30, 460, 150, 25);
                        valorTipoCalca.setBounds(180, 460, 180, 25);
                        labelCos.setBounds(30, 500, 150, 25);
                        valorCos.setBounds(180, 500, 180, 25);
                        labelLavagem.setBounds(30, 540, 150, 25);
                        valorLavagem.setBounds(180, 540, 180, 25);
			this.janela.add(labelTipoCalca);
			this.janela.add(valorTipoCalca);
                        this.janela.add(labelCos);
			this.janela.add(valorCos);
                        this.janela.add(labelLavagem);
			this.janela.add(valorLavagem);

		}

		//Coloca campos relacionados a camisa
		if (op == 2 || op == 11) {
                    
                        labelModelagem.setBounds(30, 460, 150, 25);
                        valorModelagem.setBounds(180, 460, 180, 25);
                        labelManga.setBounds(30, 500, 150, 25);
                        valorManga.setBounds(180, 500, 180, 25);
                        labelGola.setBounds(30, 540, 150, 25);
                        valorGola.setBounds(180, 540, 180, 25);
                        labelBotao.setBounds(30, 540, 150, 25);
                        valorBotao.setBounds(180, 540, 180, 25);

			this.janela.add(labelModelagem);
			this.janela.add(valorModelagem);
                        this.janela.add(labelManga);
			this.janela.add(valorManga);
                        this.janela.add(labelGola);
			this.janela.add(valorGola);
                        this.janela.add(labelBotao);
			this.janela.add(valorBotao);
                }
                
                //Coloca campos relacionados a camiseta
                
                if (op == 3 || op == 12 ) {
                    
                        labelModelagem.setBounds(30, 460, 150, 25);
                        valorModelagem.setBounds(180, 460, 180, 25);
                        labelDecote.setBounds(30, 500, 150, 25);
                        valorDecote.setBounds(180, 500, 180, 25);
			this.janela.add(labelModelagem);
			this.janela.add(valorModelagem);
                        this.janela.add(labelDecote);
			this.janela.add(valorDecote);
		}
                
                //Coloca campos relacionados a casaco
                if (op == 4 || op == 13 ) {
                        labelCapuz.setBounds(30, 460, 150, 25);
                        valorCapuz.setBounds(180, 460, 180, 25);
                        labelZiper.setBounds(30, 500, 150, 25);
                        valorZiper.setBounds(180, 500, 180, 25);
                        labelGola.setBounds(30, 540, 150, 25);
                        valorGola.setBounds(180, 540, 180, 25);
			this.janela.add(labelCapuz);
			this.janela.add(valorCapuz);
                        this.janela.add(labelZiper);
			this.janela.add(valorZiper);
                        this.janela.add(labelGola);
			this.janela.add(valorGola);
		}
                
                //Coloca campos relacionados a cinto
                if (op == 5 || op == 14 ) {
                    
                        labelOcasiao.setBounds(30, 460, 150, 25);
                        valorOcasiao.setBounds(180, 460, 180, 25);
                        labelLargura.setBounds(30, 460, 150, 25);
                        valorLargura.setBounds(180, 460, 180, 25);
			this.janela.add(labelOcasiao);
			this.janela.add(valorOcasiao);

		}
                
                //Coloca campos relacionados a cropped
                if (op == 6 || op == 15 ) {
                    
                        labelModelagem.setBounds(30, 460, 150, 25);
                        valorModelagem.setBounds(180, 460, 180, 25);
                        labelManga.setBounds(30, 500, 150, 25);
                        valorManga.setBounds(180, 500, 180, 25);
                        labelEstilo.setBounds(30, 540, 150, 25);
                        valorEstilo.setBounds(180, 540, 180, 25);
			this.janela.add(labelEstilo);
			this.janela.add(valorEstilo);
                        this.janela.add(labelModelagem);
			this.janela.add(valorModelagem);
                        this.janela.add(labelManga);
			this.janela.add(valorManga);
		}
                
                //Coloca campos relacionados a Macacão
                if (op == 7 || op == 16 ) {
                        labelModelagem.setBounds(30, 460, 150, 25);
                        valorModelagem.setBounds(180, 460, 180, 25);
                        labelLavagem.setBounds(30, 500, 150, 25);
                        valorLavagem.setBounds(180, 500, 180, 25);
			this.janela.add(labelLavagem);
			this.janela.add(valorLavagem);
                        this.janela.add(labelModelagem);
			this.janela.add(valorModelagem);

		}
                
                //Coloca campos relacionados a Saia
                if (op == 8 || op == 17 ) {
                        labelModelagem.setBounds(30, 460, 150, 25);
                        valorModelagem.setBounds(180, 460, 180, 25);
                        labelTipoCintura.setBounds(30, 500, 150, 25);
                        valorTipoCintura.setBounds(180, 500, 180, 25);
                        this.janela.add(labelModelagem);
			this.janela.add(valorModelagem);
                        this.janela.add(labelTipoCintura);
			this.janela.add(valorTipoCintura);

		}
                
                //Coloca campos relacionados a Short
                if (op == 9 || op == 18 ) {
                        labelTipoShort.setBounds(30, 460, 150, 25);
                        valorTipoShort.setBounds(180, 460, 180, 25);
                        labelTipoBoca.setBounds(30, 500, 150, 25);
                        valorTipoBoca.setBounds(180, 500, 180, 25);
                        this.janela.add(labelTipoShort);
			this.janela.add(valorTipoShort);
                        this.janela.add(labelTipoBoca);
			this.janela.add(valorTipoBoca);

		}


		//Coloca botoes de excluir e salvar
		if (op == 10 || op == 11 || op == 12 || op == 13 || op == 14 || op == 15 || op == 16 || op == 17 || op == 18) {
			botaoSalvar.setBounds(120, 580, 115, 30);
			botaoExcluir.setBounds(245, 580, 115, 30);
			this.janela.add(botaoExcluir);
		}
                
                
                this.janela.add(labelCodigo);
		this.janela.add(valorCodigo);
		this.janela.add(labelNome);
		this.janela.add(valorNome);
                this.janela.add(labelTamanho);
		this.janela.add(valorTamanho);
                this.janela.add(labelCor);
		this.janela.add(valorCor);
                this.janela.add(labelMaterial);
		this.janela.add(valorMaterial);
                this.janela.add(labelMarca);
		this.janela.add(valorMarca);
                this.janela.add(labelCategoria);
		this.janela.add(valorCategoria);
                this.janela.add(labelGenero);
		this.janela.add(valorGenero);
                this.janela.add(labelEstampa);
		this.janela.add(valorEstampa);
		this.janela.add(labelComprimento);
		this.janela.add(valorComprimento);
		this.janela.add(labelPreco);
		this.janela.add(valorPreco);
                
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
				if(opcao == 1){ //cadastro de novo calça
					novoDado[0] = Integer.toString(dados.getDados().getQtdCalca());
                                       
                                }
				else if (opcao == 2) // cadastro de novo prof
					novoDado[0] = Integer.toString(dados.getDados().getQtdCamisa());
                                else if (opcao == 3) // cadastro de novo prof
					novoDado[0] = Integer.toString(dados.getDados().getQtdCamiseta());
                                else if (opcao == 4) // cadastro de novo prof
					novoDado[0] = Integer.toString(dados.getDados().getQtdCasaco());
                                else if (opcao == 5) // cadastro de novo prof
					novoDado[0] = Integer.toString(dados.getDados().getQtdCinto());
                                else if (opcao == 6) // cadastro de novo prof
					novoDado[0] = Integer.toString(dados.getDados().getQtdCropped());
                                else if (opcao == 7) // cadastro de novo prof
					novoDado[0] = Integer.toString(dados.getDados().getQtdMacacao());
                                else if (opcao == 8) // cadastro de novo prof
					novoDado[0] = Integer.toString(dados.getDados().getQtdSaia());
                                else if (opcao == 9) // cadastro de novo prof
					novoDado[0] = Integer.toString(dados.getDados().getQtdShorte());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorCodigo.getText();
                                novoDado[2] =  valorNome.getText();
				
				novoDado[3] =  valorTamanho.getText();
                                novoDado[4] =  valorCor.getText();
				novoDado[5] =  valorMaterial.getText();
				novoDado[6] =  valorMarca.getText();
                                novoDado[7] =  valorCategoria.getText();
                                novoDado[8] =  valorGenero.getText();
                                novoDado[9] =  valorEstampa.getText();
                                novoDado[10] =  valorComprimento.getText();
                                novoDado[11] =  valorPreco.getText();
               
                               

				if (opcao == 1 || opcao == 10) {
                                    novoDado[12] =  valorTipoCalca.getText();
                                    novoDado[13] =  valorCos.getText();
                                    novoDado[14] =  valorLavagem.getText();
                                    res = dados.inserirEditarCalca(novoDado);
                                   
                                }else if (opcao == 2 || opcao == 11){
                                    novoDado[12] =  valorModelagem.getText();
                                    novoDado[13] =  valorManga.getText();
                                    novoDado[14] =  valorGola.getText();
                                    novoDado[15] =  valorBotao.getText();
                                    res = dados.inserirEditarCamisa(novoDado);
				}else if (opcao == 3 || opcao == 12){
                                    novoDado[12] =  valorModelagem.getText();
                                    novoDado[13] =  valorDecote.getText();

                                    res = dados.inserirEditarCamiseta(novoDado);
				}else if (opcao == 4 || opcao == 13){
                                    novoDado[12] =  valorCapuz.getText();
                                    novoDado[13] =  valorZiper.getText();
                                    novoDado[14] =  valorGola.getText();
                                    res = dados.inserirEditarCasaco(novoDado);
				}else if (opcao == 5 || opcao == 14){
                                    novoDado[12] =  valorOcasiao.getText();
                                    novoDado[13] =  valorCategoria.getText();
                                    res = dados.inserirEditarCinto(novoDado);
				}else if (opcao == 6 || opcao == 15){
                                    novoDado[12] =  valorEstilo.getText();
                                    novoDado[13] =  valorModelagem.getText();
                                    novoDado[14] =  valorManga.getText();
                                    res = dados.inserirEditarCropped(novoDado);
				}else if (opcao == 7 || opcao == 16){
                                    novoDado[12] =  valorLavagem.getText();
                                    novoDado[13] =  valorModelagem.getText();
                                    res = dados.inserirEditarMacacao(novoDado);
				}else if (opcao == 8 || opcao == 17){
                                    novoDado[12] =  valorModelagem.getText();
                                    novoDado[13] =  valorTipoCintura.getText();
                                    res = dados.inserirEditarSaia(novoDado);
				}else if (opcao == 9 || opcao == 18){
                                    novoDado[12] =  valorTipoShort.getText();
                                    novoDado[13] =  valorTipoBoca.getText();
                                    res = dados.inserirEditarShorte(novoDado);
				}

				if(res) {
                                    mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException | NumberFormatException exc1) {
				mensagemErroCadastro();
			} catch (ParseException ex) {
                        Logger.getLogger(TelaDetalhePessoa.class.getName()).log(Level.SEVERE, null, ex);
                            
                    }
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 10) {//exclui aluno
				res = dados.removerCalca(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
				
			if (opcao == 11){ //exclui professor
				res = dados.removerCamisa(posicao);
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
				+ "Verifique se o a roupa está presente \n"
				+ "em alguma venda. \n "
				, null, 
				JOptionPane.ERROR_MESSAGE);
	}
}

