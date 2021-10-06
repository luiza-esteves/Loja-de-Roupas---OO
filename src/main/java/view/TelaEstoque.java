package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaEstoque implements ActionListener, ListSelectionListener {

    private static JFrame janela;

    private JLabel titulo = new JLabel("Menu de Roupas");
    private JButton estoqueCalca;
    private JButton refreshCalca;
    private JButton estoqueCamisa;
    private JButton refreshCamisa;
    private JButton estoqueCamiseta;
    private JButton refreshCamiseta;
    private JButton estoqueCasaco;
    private JButton refreshCasaco;
    private JButton estoqueCinto;
    private JButton refreshCinto;
    private JButton estoqueCropped;
    private JButton refreshCropped;
    private JButton estoqueMacacao;
    private JButton refreshMacacao;
    private JButton estoqueSaia;
    private JButton refreshSaia;
    private JButton estoqueShorte;
    private JButton refreshShorte;
    private JTextField filtroCodCalca;
    private JTextField filtroCodCamisa;
    private JTextField filtroCodCamiseta;
    private JTextField filtroCodCasaco;
    private JTextField filtroCodCinto;
    private JTextField filtroCodCropped;
    private JTextField filtroCodMacacao;
    private JTextField filtroCodSaia;
    private JTextField filtroCodShorte;
    private JButton botaoFiltroCalca = new JButton("Filtrar");
    private JButton botaoFiltroCamisa = new JButton("Filtrar");
    private JButton botaoFiltroCamiseta = new JButton("Filtrar");
    private JButton botaoFiltroCasaco = new JButton("Filtrar");
    private JButton botaoFiltroCinto = new JButton("Filtrar");
    private JButton botaoFiltroCropped = new JButton("Filtrar");
    private JButton botaoFiltroMacacao = new JButton("Filtrar");
    private JButton botaoFiltroSaia = new JButton("Filtrar");
    private JButton botaoFiltroShorte = new JButton("Filtrar");
    
    
    private static final JButton calca = new JButton("Calça");
    private static final JButton camisa = new JButton("Camisa");
    private static final JButton camiseta = new JButton("Camiseta");
    private static final JButton casaco = new JButton("Casaco");
    private static final JButton cinto = new JButton("Cinto");
    private static final JButton cropped = new JButton("Cropped");
    private static final JButton macacao = new JButton("Macacao");
    private static final JButton saia = new JButton("Saia");
    private static final JButton shorte = new JButton("Short");
    private static final JFrame jan = new JFrame("Estoque");
    private static final JLabel tit = new JLabel("Estoque");

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

    public TelaEstoque(ControleDados d) {
        dados = d;

        tit.setFont(new Font("Arial", Font.BOLD, 20));
        tit.setBounds(100, 10, 200, 30);
        calca.setBounds(140, 50, 100, 30);
        camisa.setBounds(140, 100, 100, 30);
        camiseta.setBounds(140, 150, 100, 30);
        casaco.setBounds(140, 200, 100, 30);
        cinto.setBounds(140, 250, 100, 30);
        cropped.setBounds(140, 300, 100, 30);
        macacao.setBounds(140, 350, 100, 30);
        saia.setBounds(140, 400, 100, 30);
        shorte.setBounds(140, 450, 100, 30);

        jan.setSize(500, 600);
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
        jan.setLayout(null);
        jan.setVisible(true);

        calca.addActionListener(this);
        camisa.addActionListener(this);
        camiseta.addActionListener(this);
        casaco.addActionListener(this);
        cinto.addActionListener(this);
        cropped.addActionListener(this);
        macacao.addActionListener(this);
        saia.addActionListener(this);
        shorte.addActionListener(this);

    }

    public void mostrarDados(int op, ControleDados d) {
        switch (op) {
            case 1:
                listaNomes = new ControleEstoque(dados).getNomesEstoques(1);
                listaCalcaCadastrados = new JList<String>(listaNomes);
                
                filtroCodCalca = new JTextField("Pesquisar nome da calça");
                botaoFiltroCalca = new JButton("Filtrar");
                botaoFiltroCalca.setBounds(200, 50, 100, 30);
                filtroCodCalca.setBounds(20, 50, 150, 30);
                estoqueCalca = new JButton("Cadastrar");
                refreshCalca = new JButton("Refresh");
  
                janela = new JFrame("Calças em estoque");
                titulo = new JLabel("Calças em estoque");            
                
                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                estoqueCalca.setBounds(70, 300, 100, 30);
                refreshCalca.setBounds(200, 300, 100, 30);
                listaCalcaCadastrados.setBounds(20, 150, 350, 120);
                listaCalcaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

                janela.setLayout(null);
                janela.add(botaoFiltroCalca);
                janela.add(filtroCodCalca);
                janela.add(listaCalcaCadastrados);
                janela.add(estoqueCalca);
                janela.add(refreshCalca);
                janela.add(titulo);

                janela.setSize(600, 600);
                janela.setVisible(true);
                botaoFiltroCalca.addActionListener(this);
                listaCalcaCadastrados.addListSelectionListener(this);
                estoqueCalca.addActionListener(this);
                refreshCalca.addActionListener(this);
                break;
            case 2:
                listaNomes = new ControleEstoque(dados).getNomesEstoques(2);
                listaCamisaCadastrados = new JList<String>(listaNomes);
                estoqueCamisa = new JButton("Cadastrar");
                refreshCamisa = new JButton("Refresh");

                janela = new JFrame("Camisas em estoque");
                titulo = new JLabel("Camisas em estoque");
                
                filtroCodCamisa = new JTextField("Pesquisar nome da camisa");
                botaoFiltroCamisa = new JButton("Filtrar");
                botaoFiltroCamisa.setBounds(200, 50, 100, 30);
                filtroCodCamisa.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                estoqueCamisa.setBounds(70, 300, 100, 30);
                refreshCamisa.setBounds(200, 300, 100, 30);
                listaCamisaCadastrados.setBounds(20, 150, 350, 120);
                listaCamisaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

                janela.setLayout(null);
                janela.add(listaCamisaCadastrados);
                janela.add(botaoFiltroCamisa);
                janela.add(filtroCodCamisa);
                janela.add(estoqueCamisa);
                janela.add(refreshCamisa);
                janela.add(titulo);

                janela.setSize(600, 600);
                janela.setVisible(true);
                botaoFiltroCamisa.addActionListener(this);
                estoqueCamisa.addActionListener(this);
                refreshCamisa.addActionListener(this);
                listaCamisaCadastrados.addListSelectionListener(this);
                break;

            case 3:
                listaNomes = new ControleEstoque(dados).getNomesEstoques(3);
                listaCamisetaCadastrados = new JList<String>(listaNomes);
                estoqueCamiseta = new JButton("Cadastrar");
                refreshCamiseta = new JButton("Refresh");

                janela = new JFrame("Camisetas em estoque");
                titulo = new JLabel("Camisetas em estoque");
                
                filtroCodCamiseta = new JTextField("Pesquisar nome da camiseta");
                botaoFiltroCamiseta = new JButton("Filtrar");
                botaoFiltroCamiseta.setBounds(200, 50, 100, 30);
                filtroCodCamiseta.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                estoqueCamiseta.setBounds(70, 300, 100, 30);
                refreshCamiseta.setBounds(200, 300, 100, 30);
                listaCamisetaCadastrados.setBounds(20, 150, 350, 120);
                listaCamisetaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

                janela.setLayout(null);
                janela.add(listaCamisetaCadastrados);
                janela.add(estoqueCamiseta);
                janela.add(refreshCamiseta);
                janela.add(botaoFiltroCamiseta);
                janela.add(filtroCodCamiseta);
                janela.add(titulo);

                estoqueCamiseta.addActionListener(this);
                botaoFiltroCamiseta.addActionListener(this);
                refreshCamiseta.addActionListener(this);
                listaCamisetaCadastrados.addListSelectionListener(this);
                janela.setSize(600, 600);
                janela.setVisible(true);

                break;
            case 4:
                listaNomes = new ControleEstoque(dados).getNomesEstoques(4);
                listaCasacoCadastrados = new JList<String>(listaNomes);
                estoqueCasaco = new JButton("Cadastrar");
                refreshCasaco = new JButton("Refresh");

                janela = new JFrame("Casaco em estoque");
                titulo = new JLabel("Casaco em estoque");
                
                filtroCodCasaco = new JTextField("Pesquisar nome da calça");
                botaoFiltroCasaco = new JButton("Filtrar");
                botaoFiltroCasaco.setBounds(200, 50, 100, 30);
                filtroCodCasaco.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                estoqueCasaco.setBounds(70, 300, 100, 30);
                refreshCasaco.setBounds(200, 300, 100, 30);
                listaCasacoCadastrados.setBounds(20, 150, 350, 120);
                listaCasacoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

                janela.setLayout(null);
                janela.add(listaCasacoCadastrados);
                janela.add(estoqueCasaco);
                janela.add(refreshCasaco);
                janela.add(botaoFiltroCasaco);
                janela.add(filtroCodCasaco);
                janela.add(titulo);

                estoqueCasaco.addActionListener(this);
                refreshCasaco.addActionListener(this);
                listaCasacoCadastrados.addListSelectionListener(this);
                botaoFiltroCasaco.addActionListener(this);
                janela.setSize(600, 600);
                janela.setVisible(true);
                break;
            case 5:
                listaNomes = new ControleEstoque(dados).getNomesEstoques(5);
                listaCintoCadastrados = new JList<String>(listaNomes);
                estoqueCinto = new JButton("Cadastrar");
                refreshCinto = new JButton("Refresh");

                janela = new JFrame("Cinto em estoque");
                titulo = new JLabel("Cinto em estoque");
                
                filtroCodCinto = new JTextField("Pesquisar nome da calça");
                botaoFiltroCinto = new JButton("Filtrar");
                botaoFiltroCinto.setBounds(200, 50, 100, 30);
                filtroCodCinto.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                estoqueCinto.setBounds(70, 300, 100, 30);
                refreshCinto.setBounds(200, 300, 100, 30);
                listaCintoCadastrados.setBounds(20, 150, 350, 120);
                listaCintoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

                janela.setLayout(null);
                janela.add(listaCintoCadastrados);
                janela.add(estoqueCinto);
                janela.add(refreshCinto);
                janela.add(botaoFiltroCinto);
                janela.add(filtroCodCinto);
                janela.add(titulo);

                estoqueCinto.addActionListener(this);
                refreshCinto.addActionListener(this);
                botaoFiltroCinto.addActionListener(this);
                listaCintoCadastrados.addListSelectionListener(this);

                janela.setSize(600, 600);
                janela.setVisible(true);
                break;
            case 6:
                listaNomes = new ControleEstoque(dados).getNomesEstoques(6);
                listaCroppedCadastrados = new JList<String>(listaNomes);
                estoqueCropped = new JButton("Cadastrar");
                refreshCropped = new JButton("Refresh");
                janela = new JFrame("Cropped em estoque");
                titulo = new JLabel("Cropped em estoque");

                filtroCodCropped = new JTextField("Pesquisar nome da calça");
                botaoFiltroCropped = new JButton("Filtrar");
                botaoFiltroCropped.setBounds(200, 50, 100, 30);
                filtroCodCropped.setBounds(20, 50, 150, 30);
                
                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                estoqueCropped.setBounds(70, 300, 100, 30);
                refreshCropped.setBounds(200, 300, 100, 30);
                listaCroppedCadastrados.setBounds(20, 150, 350, 120);
                listaCroppedCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

                janela.setLayout(null);
                janela.add(listaCroppedCadastrados);
                janela.add(estoqueCropped);
                janela.add(refreshCropped);
                janela.add(botaoFiltroCropped);
                janela.add(filtroCodCropped);
                janela.add(titulo);

                estoqueCropped.addActionListener(this);
                refreshCropped.addActionListener(this);
                listaCroppedCadastrados.addListSelectionListener(this);
                botaoFiltroCropped.addActionListener(this);

                janela.setSize(600, 600);
                janela.setVisible(true);
                break;
            case 7:
                listaNomes = new ControleEstoque(dados).getNomesEstoques(7);
                listaMacacaoCadastrados = new JList<String>(listaNomes);
                estoqueMacacao = new JButton("Cadastrar");
                refreshMacacao = new JButton("Refresh");
                janela = new JFrame("Macacao em estoque");
                titulo = new JLabel("Macacao em estoque");
                
                filtroCodMacacao = new JTextField("Pesquisar nome da calça");
                botaoFiltroMacacao = new JButton("Filtrar");
                botaoFiltroMacacao.setBounds(200, 50, 100, 30);
                filtroCodMacacao.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                estoqueMacacao.setBounds(70, 300, 100, 30);
                refreshMacacao.setBounds(200, 300, 100, 30);
                listaMacacaoCadastrados.setBounds(20, 150, 350, 120);
                listaMacacaoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

                janela.setLayout(null);
                janela.add(listaMacacaoCadastrados);
                janela.add(estoqueMacacao);
                janela.add(refreshMacacao);
                janela.add(botaoFiltroMacacao);
                janela.add(filtroCodMacacao);
                janela.add(titulo);

                estoqueMacacao.addActionListener(this);
                refreshMacacao.addActionListener(this);
                listaMacacaoCadastrados.addListSelectionListener(this);
                botaoFiltroMacacao.addActionListener(this);

                janela.setSize(600, 600);
                janela.setVisible(true);
                break;

            case 8:
                listaNomes = new ControleEstoque(dados).getNomesEstoques(8);
                listaSaiaCadastrados = new JList<String>(listaNomes);
                estoqueSaia = new JButton("Cadastrar");
                refreshSaia = new JButton("Refresh");
                janela = new JFrame("Saia em estoque");
                titulo = new JLabel("Saia em estoque");
                
                filtroCodSaia = new JTextField("Pesquisar nome da calça");
                botaoFiltroSaia = new JButton("Filtrar");
                botaoFiltroSaia.setBounds(200, 50, 100, 30);
                filtroCodSaia.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                estoqueSaia.setBounds(70, 300, 100, 30);
                refreshSaia.setBounds(200, 300, 100, 30);
                listaSaiaCadastrados.setBounds(20, 150, 350, 120);
                listaSaiaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

                janela.setLayout(null);
                janela.add(listaSaiaCadastrados);
                janela.add(estoqueSaia);
                janela.add(refreshSaia);
                janela.add(botaoFiltroSaia);
                janela.add(filtroCodSaia);
                janela.add(titulo);

                estoqueSaia.addActionListener(this);
                refreshSaia.addActionListener(this);
                listaSaiaCadastrados.addListSelectionListener(this);
                botaoFiltroSaia.addActionListener(this);

                janela.setSize(600, 600);
                janela.setVisible(true);
                break;
            case 9:
                listaNomes = new ControleEstoque(dados).getNomesEstoques(9);
                listaShorteCadastrados = new JList<String>(listaNomes);
                estoqueShorte = new JButton("Cadastrar");
                refreshShorte = new JButton("Refresh");
                titulo = new JLabel("Short em estoque");
                
                filtroCodShorte = new JTextField("Pesquisar nome da calça");
                botaoFiltroShorte = new JButton("Filtrar");
                botaoFiltroShorte.setBounds(200, 50, 100, 30);
                filtroCodShorte.setBounds(20, 50, 150, 30);
                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                estoqueShorte.setBounds(70, 300, 100, 30);
                refreshShorte.setBounds(200, 300, 100, 30);
                listaShorteCadastrados.setBounds(20, 150, 350, 120);
                listaShorteCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                janela = new JFrame("Short em estoque");

                janela.setLayout(null);
                janela.add(listaShorteCadastrados);
                janela.add(estoqueShorte);
                janela.add(refreshShorte);
                janela.add(botaoFiltroShorte);
                janela.add(filtroCodShorte);
                janela.add(titulo);

                estoqueShorte.addActionListener(this);
                refreshShorte.addActionListener(this);
                listaShorteCadastrados.addListSelectionListener(this);
                botaoFiltroShorte.addActionListener(this);
                janela.setSize(600, 600);
                janela.setVisible(true);
                break;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == calca) {
            new TelaEstoque(dados).mostrarDados(1, dados);
        }
        if (src == camisa) {
            new TelaEstoque(dados).mostrarDados(2, dados);
        }
        if (src == camiseta) {
            new TelaEstoque(dados).mostrarDados(3, dados);
        }
        if (src == casaco) {
            new TelaEstoque(dados).mostrarDados(4, dados);
        }
        if (src == cinto) {
            new TelaEstoque(dados).mostrarDados(5, dados);
        }
        if (src == cropped) {
            new TelaEstoque(dados).mostrarDados(6, dados);
        }
        if (src == macacao) {
            new TelaEstoque(dados).mostrarDados(7, dados);
        }
        if (src == saia) {
            new TelaEstoque(dados).mostrarDados(8, dados);
        }
        if (src == shorte) {
            new TelaEstoque(dados).mostrarDados(9, dados);
        }
        if (src == estoqueCalca) {
            new TelaDetalheEstoque().inserirEditar(1, dados, this, 0);
        }
        if (src == estoqueCamisa) {
            new TelaDetalheEstoque().inserirEditar(2, dados, this, 0);
        }
        if (src == estoqueCamiseta) {
            new TelaDetalheEstoque().inserirEditar(3, dados, this, 0);
        }
        if (src == estoqueCasaco) {
            new TelaDetalheEstoque().inserirEditar(4, dados, this, 0);
        }
        if (src == estoqueCinto) {
            new TelaDetalheEstoque().inserirEditar(5, dados, this, 0);
        }
        if (src == estoqueCropped) {
            new TelaDetalheEstoque().inserirEditar(6, dados, this, 0);
        }
        if (src == estoqueMacacao) {
            new TelaDetalheEstoque().inserirEditar(7, dados, this, 0);
        }
        if (src == estoqueSaia) {
            new TelaDetalheEstoque().inserirEditar(8, dados, this, 0);
        }
        if (src == estoqueShorte) {
            new TelaDetalheEstoque().inserirEditar(9, dados, this, 0);
        }

        if (src == refreshCalca) {
            listaCalcaCadastrados.setListData(new ControleEstoque(dados).getNomesEstoques(1));
            listaCalcaCadastrados.updateUI();
        } else if (src == refreshCamisa) {
            listaCamisaCadastrados.setListData(new ControleEstoque(dados).getNomesEstoques(2));
            listaCamisaCadastrados.updateUI();
        } else if (src == refreshCamiseta) {
            listaCamisetaCadastrados.setListData(new ControleEstoque(dados).getNomesEstoques(3));
            listaCamisetaCadastrados.updateUI();
        } else if (src == refreshCasaco) {
            listaCasacoCadastrados.setListData(new ControleEstoque(dados).getNomesEstoques(4));
            listaCasacoCadastrados.updateUI();
        } else if (src == refreshCinto) {
            listaCintoCadastrados.setListData(new ControleEstoque(dados).getNomesEstoques(5));
            listaCintoCadastrados.updateUI();
        } else if (src == refreshCropped) {
            listaCroppedCadastrados.setListData(new ControleEstoque(dados).getNomesEstoques(6));
            listaCroppedCadastrados.updateUI();
        } else if (src == refreshMacacao) {
            listaMacacaoCadastrados.setListData(new ControleEstoque(dados).getNomesEstoques(7));
            listaMacacaoCadastrados.updateUI();
        } else if (src == refreshSaia) {
            listaSaiaCadastrados.setListData(new ControleEstoque(dados).getNomesEstoques(8));
            listaSaiaCadastrados.updateUI();
        } else if (src == refreshShorte) {
            listaShorteCadastrados.setListData(new ControleEstoque(dados).getNomesEstoques(9));
            listaShorteCadastrados.updateUI();
        }
        
        if (src == botaoFiltroCalca) {
           
            ControleEstoque nomeEstoque = new ControleEstoque(dados);          
            String nomeDig =filtroCodCalca.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesEstoques(1)[x];
                if(nomeDig.equals(nome[0])){                             
                    listaCalcaCadastrados.setListData(nome);
                    listaCalcaCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesEstoques(1).length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        
        if (src == botaoFiltroCamisa) {
           
            ControleEstoque nomeEstoque = new ControleEstoque(dados);          
            String nomeDig =filtroCodCamisa.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesEstoques(2)[x];
                if(nomeDig.equals(nome[0])){                             
                    listaCamisaCadastrados.setListData(nome);
                    listaCamisaCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesEstoques(2).length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroCamiseta) {
           
            ControleEstoque nomeEstoque = new ControleEstoque(dados);          
            String nomeDig =filtroCodCamiseta.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesEstoques(3)[x];
                if(nomeDig.equals(nome[0])){                             
                    listaCamisetaCadastrados.setListData(nome);
                    listaCamisetaCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesEstoques(3).length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroCasaco) {
           
            ControleEstoque nomeEstoque = new ControleEstoque(dados);          
            String nomeDig =filtroCodCasaco.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesEstoques(4)[x];
                if(nomeDig.equals(nome[0])){                             
                    listaCasacoCadastrados.setListData(nome);
                    listaCasacoCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesEstoques(4).length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroCinto) {
           
            ControleEstoque nomeEstoque = new ControleEstoque(dados);          
            String nomeDig =filtroCodCinto.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesEstoques(5)[x];
                if(nomeDig.equals(nome[0])){                             
                    listaCintoCadastrados.setListData(nome);
                    listaCintoCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesEstoques(5).length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroCropped) {
           
            ControleEstoque nomeEstoque = new ControleEstoque(dados);          
            String nomeDig =filtroCodCropped.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesEstoques(6)[x];
                if(nomeDig.equals(nome[0])){                             
                    listaCroppedCadastrados.setListData(nome);
                    listaCroppedCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesEstoques(6).length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroMacacao) {
           
            ControleEstoque nomeEstoque = new ControleEstoque(dados);          
            String nomeDig =filtroCodMacacao.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesEstoques(7)[x];
                if(nomeDig.equals(nome[0])){                             
                    listaMacacaoCadastrados.setListData(nome);
                    listaMacacaoCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesEstoques(7).length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroSaia) {
           
            ControleEstoque nomeEstoque = new ControleEstoque(dados);          
            String nomeDig =filtroCodSaia.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesEstoques(8)[x];
                if(nomeDig.equals(nome[0])){                             
                    listaSaiaCadastrados.setListData(nome);
                    listaSaiaCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesEstoques(8).length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroShorte) {
           
            ControleEstoque nomeEstoque = new ControleEstoque(dados);          
            String nomeDig =filtroCodShorte.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesEstoques(9)[x];
                if(nomeDig.equals(nome[0])){                             
                    listaShorteCadastrados.setListData(nome);
                    listaShorteCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesEstoques(9).length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }

    }

    //Captura eventos relacionados ao JList
    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaCalcaCadastrados) {
            new TelaDetalheEstoque().inserirEditar(10, dados, this,
                    listaCalcaCadastrados.getSelectedIndex());
        }

        if (e.getValueIsAdjusting() && src == listaCamisaCadastrados) {
            new TelaDetalheEstoque().inserirEditar(11, dados, this,
                    listaCamisaCadastrados.getSelectedIndex());
        }
        if (e.getValueIsAdjusting() && src == listaCamisetaCadastrados) {
            new TelaDetalheEstoque().inserirEditar(12, dados, this,
                    listaCamisetaCadastrados.getSelectedIndex());
        }
        if (e.getValueIsAdjusting() && src == listaCasacoCadastrados) {
            new TelaDetalheEstoque().inserirEditar(13, dados, this,
                    listaCasacoCadastrados.getSelectedIndex());
        }
        if (e.getValueIsAdjusting() && src == listaCintoCadastrados) {
            new TelaDetalheEstoque().inserirEditar(14, dados, this,
                    listaCintoCadastrados.getSelectedIndex());
        }
        if (e.getValueIsAdjusting() && src == listaCroppedCadastrados) {
            new TelaDetalheEstoque().inserirEditar(15, dados, this,
                    listaCroppedCadastrados.getSelectedIndex());
        }
        if (e.getValueIsAdjusting() && src == listaMacacaoCadastrados) {
            new TelaDetalheEstoque().inserirEditar(16, dados, this,
                    listaMacacaoCadastrados.getSelectedIndex());
        }
        if (e.getValueIsAdjusting() && src == listaSaiaCadastrados) {
            new TelaDetalheEstoque().inserirEditar(17, dados, this,
                    listaSaiaCadastrados.getSelectedIndex());
        }
        if (e.getValueIsAdjusting() && src == listaShorteCadastrados) {
            new TelaDetalheEstoque().inserirEditar(18, dados, this,
                    listaShorteCadastrados.getSelectedIndex());
        }
    }
    
    public void mensagemErroBusca() {
        JOptionPane.showMessageDialog(null, "Roupa não encontrada!.\n ", null,
                JOptionPane.ERROR_MESSAGE);
    }

}
