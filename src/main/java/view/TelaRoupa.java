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
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TelaRoupa implements ActionListener, ListSelectionListener {

    private JFrame janela;
    private JLabel titulo = new JLabel("Menu de Roupas");
    private JButton cadastroCalca;
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
    
    private JTextField filtroCalca;
    private JTextField filtroCamisa;
    private JTextField filtroCamiseta;
    private JTextField filtroCasaco;
    private JTextField filtroCinto;
    private JTextField filtroCropped;
    private JTextField filtroMacacao;
    private JTextField filtroSaia;
    private JTextField filtroShorte;
    private JButton botaoFiltroCalca = new JButton("Filtrar");
    private JButton botaoFiltroCamisa = new JButton("Filtrar");
    private JButton botaoFiltroCamiseta = new JButton("Filtrar");
    private JButton botaoFiltroCasaco = new JButton("Filtrar");
    private JButton botaoFiltroCinto = new JButton("Filtrar");
    private JButton botaoFiltroCropped = new JButton("Filtrar");
    private JButton botaoFiltroMacacao = new JButton("Filtrar");
    private JButton botaoFiltroSaia = new JButton("Filtrar");
    private JButton botaoFiltroShorte = new JButton("Filtrar");

    private static final JFrame jan = new JFrame("Roupas");
    private static final JLabel tit = new JLabel("Roupas");
    private static JButton calca;
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

    public TelaRoupa(ControleDados d) {
        dados = d;

        calca = new JButton("Calça");
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
        dados = d;

        switch (op) {
            case 1:// Mostrar dados de alunos cadastrados (JList)

                listaNomes = new ControleCalca(dados).getNomesCalcas();

                listaCalcaCadastrados = new JList<String>(listaNomes);
                
                filtroCalca = new JTextField("Pesquisar nome da calça");
                botaoFiltroCalca = new JButton("Filtrar");
                botaoFiltroCalca.setBounds(200, 50, 100, 30);
                filtroCalca.setBounds(20, 50, 150, 30);
                janela = new JFrame("Calças");
                titulo = new JLabel("Calças Cadastrados");
                cadastroCalca = new JButton("Cadastrar");
                refreshCalca = new JButton("Refresh");

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaCalcaCadastrados.setBounds(20, 100, 350, 120);
                listaCalcaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaCalcaCadastrados.setVisibleRowCount(10);

                cadastroCalca.setBounds(70, 300, 100, 30);
                refreshCalca.setBounds(200, 300, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(filtroCalca);
                janela.add(botaoFiltroCalca);
                janela.add(listaCalcaCadastrados);
                janela.add(cadastroCalca);
                janela.add(refreshCalca);

                janela.setSize(600, 600);
                janela.setVisible(true);

                cadastroCalca.addActionListener(this);
                botaoFiltroCalca.addActionListener(this);
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
                
                filtroCamisa = new JTextField("Pesquisar nome da camisa");
                botaoFiltroCamisa = new JButton("Filtrar");
                botaoFiltroCamisa.setBounds(200, 50, 100, 30);
                filtroCamisa.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaCamisaCadastrados.setBounds(20, 100, 350, 120);
                listaCamisaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaCamisaCadastrados.setVisibleRowCount(10);

                cadastroCamisa.setBounds(70, 300, 100, 30);
                refreshCamisa.setBounds(200, 300, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(filtroCamisa);
                janela.add(botaoFiltroCamisa);
                janela.add(listaCamisaCadastrados);
                janela.add(cadastroCamisa);
                janela.add(refreshCamisa);

                janela.setSize(600, 600);
                janela.setVisible(true);

                cadastroCamisa.addActionListener(this);
                refreshCamisa.addActionListener(this);
                botaoFiltroCamisa.addActionListener(this);
                listaCamisaCadastrados.addListSelectionListener(this);

                break;
            case 3:// Mostrar dados de alunos cadastrados (JList)
                listaNomes = new ControleCamiseta(dados).getNomesCamiseta();
                listaCamisetaCadastrados = new JList<String>(listaNomes);
                janela = new JFrame("Camiseta");
                titulo = new JLabel("Camiseta Cadastrados");
                cadastroCamiseta = new JButton("Cadastrar");
                refreshCamiseta = new JButton("Refresh");
                
                filtroCamiseta = new JTextField("Pesquisar nome da calça");
                botaoFiltroCamiseta = new JButton("Filtrar");
                botaoFiltroCamiseta.setBounds(200, 50, 100, 30);
                filtroCamiseta.setBounds(20, 50, 150, 30);
                

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaCamisetaCadastrados.setBounds(20, 100, 350, 120);
                listaCamisetaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaCamisetaCadastrados.setVisibleRowCount(10);

                cadastroCamiseta.setBounds(70, 300, 100, 30);
                refreshCamiseta.setBounds(200, 300, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(filtroCamiseta);
                janela.add(botaoFiltroCamiseta);
                janela.add(listaCamisetaCadastrados);
                janela.add(cadastroCamiseta);
                janela.add(refreshCamiseta);

                janela.setSize(600, 600);
                janela.setVisible(true);

                cadastroCamiseta.addActionListener(this);
                botaoFiltroCamiseta.addActionListener(this);
                refreshCamiseta.addActionListener(this);
                listaCamisetaCadastrados.addListSelectionListener(this);

                break;

            case 4:// Mostrar dados de alunos cadastrados (JList)
                listaNomes = new ControleCasaco(dados).getNomesCasaco();
                listaCasacoCadastrados = new JList<String>(listaNomes);
                janela = new JFrame("Casaco");
                titulo = new JLabel("Casacos Cadastrados");
                cadastroCasaco = new JButton("Cadastrar");
                cadastroCasaco = new JButton("Refresh");
                
                filtroCasaco = new JTextField("Pesquisar nome da calça");
                botaoFiltroCasaco = new JButton("Filtrar");
                botaoFiltroCasaco.setBounds(200, 50, 100, 30);
                filtroCasaco.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaCasacoCadastrados.setBounds(20, 100, 350, 120);
                listaCasacoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaCasacoCadastrados.setVisibleRowCount(10);

                cadastroCasaco.setBounds(70, 300, 100, 30);
                refreshCasaco.setBounds(200, 300, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(filtroCasaco);
                janela.add(botaoFiltroCasaco);
                janela.add(listaCasacoCadastrados);
                janela.add(cadastroCasaco);
                janela.add(refreshCasaco);

                janela.setSize(600, 600);
                janela.setVisible(true);

                cadastroCasaco.addActionListener(this);
                refreshCasaco.addActionListener(this);
                botaoFiltroCasaco.addActionListener(this);
                listaCasacoCadastrados.addListSelectionListener(this);

                break;

            case 5:// Mostrar dados de alunos cadastrados (JList)
                listaNomes = new ControleCinto(dados).getNomesCinto();
                listaCintoCadastrados = new JList<String>(listaNomes);
                janela = new JFrame("Cinto");
                titulo = new JLabel("Cintos Cadastrados");
                cadastroCinto = new JButton("Cadastrar");
                refreshCinto = new JButton("Refresh");
                
                filtroCinto = new JTextField("Pesquisar nome da calça");
                botaoFiltroCinto = new JButton("Filtrar");
                botaoFiltroCinto.setBounds(200, 50, 100, 30);
                filtroCinto.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaCintoCadastrados.setBounds(20, 100, 350, 120);
                listaCintoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaCintoCadastrados.setVisibleRowCount(10);

                cadastroCinto.setBounds(70, 300, 100, 30);
                refreshCinto.setBounds(200, 300, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(filtroCinto);
                janela.add(botaoFiltroCinto);
                janela.add(listaCintoCadastrados);
                janela.add(cadastroCinto);
                janela.add(refreshCinto);

                janela.setSize(600, 600);
                janela.setVisible(true);

                cadastroCinto.addActionListener(this);
                botaoFiltroCinto.addActionListener(this);
                refreshCinto.addActionListener(this);
                listaCintoCadastrados.addListSelectionListener(this);

                break;

            case 6:// Mostrar dados de alunos cadastrados (JList)
                listaNomes = new ControleCropped(dados).getNomesCropped();
                listaCroppedCadastrados = new JList<String>(listaNomes);
                janela = new JFrame("Cropped");
                titulo = new JLabel("Cropped Cadastrados");
                cadastroCropped = new JButton("Cadastrar");
                refreshCropped = new JButton("Refresh");
                
                filtroCropped = new JTextField("Pesquisar nome da calça");
                botaoFiltroCropped = new JButton("Filtrar");
                botaoFiltroCropped.setBounds(200, 50, 100, 30);
                filtroCropped.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaCroppedCadastrados.setBounds(20, 100, 350, 120);
                listaCroppedCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaCroppedCadastrados.setVisibleRowCount(10);

                cadastroCropped.setBounds(70, 300, 100, 30);
                refreshCropped.setBounds(200, 300, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(filtroCropped);
                janela.add(botaoFiltroCropped);
                janela.add(listaCroppedCadastrados);
                janela.add(cadastroCropped);
                janela.add(refreshCropped);

                janela.setSize(600, 600);
                janela.setVisible(true);

                cadastroCropped.addActionListener(this);
                refreshCropped.addActionListener(this);
                botaoFiltroCropped.addActionListener(this);
                listaCroppedCadastrados.addListSelectionListener(this);

                break;

            case 7:// Mostrar dados de alunos cadastrados (JList)
                listaNomes = new ControleMacacao(dados).getNomesMacacao();
                listaMacacaoCadastrados = new JList<String>(listaNomes);
                janela = new JFrame("Macacão");
                titulo = new JLabel("Macacão Cadastrados");
                cadastroMacacao = new JButton("Cadastrar");
                refreshMacacao = new JButton("Refresh");
                
                filtroMacacao = new JTextField("Pesquisar nome da calça");
                botaoFiltroMacacao = new JButton("Filtrar");
                botaoFiltroMacacao.setBounds(200, 50, 100, 30);
                filtroMacacao.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaMacacaoCadastrados.setBounds(20, 100, 350, 120);
                listaMacacaoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaMacacaoCadastrados.setVisibleRowCount(10);

                cadastroMacacao.setBounds(70, 300, 100, 30);
                refreshMacacao.setBounds(200, 300, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(filtroMacacao);
                janela.add(botaoFiltroMacacao);
                janela.add(listaMacacaoCadastrados);
                janela.add(cadastroMacacao);
                janela.add(refreshMacacao);

                janela.setSize(600, 600);
                janela.setVisible(true);

                cadastroMacacao.addActionListener(this);
                refreshMacacao.addActionListener(this);
                botaoFiltroMacacao.addActionListener(this);
                listaMacacaoCadastrados.addListSelectionListener(this);

                break;

            case 8:// Mostrar dados de alunos cadastrados (JList)
                listaNomes = new ControleSaia(dados).getNomesSaia();
                listaSaiaCadastrados = new JList<String>(listaNomes);
                janela = new JFrame("Saia");
                titulo = new JLabel("Saias Cadastrados");
                cadastroSaia = new JButton("Cadastrar");
                refreshSaia = new JButton("Refresh");
                
                filtroSaia = new JTextField("Pesquisar nome da calça");
                botaoFiltroSaia = new JButton("Filtrar");
                botaoFiltroSaia.setBounds(200, 50, 100, 30);
                filtroSaia.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaSaiaCadastrados.setBounds(20, 100, 350, 120);
                listaSaiaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaSaiaCadastrados.setVisibleRowCount(10);

                cadastroSaia.setBounds(70, 300, 100, 30);
                refreshSaia.setBounds(200, 300, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(filtroSaia);
                janela.add(botaoFiltroSaia);
                janela.add(listaSaiaCadastrados);
                janela.add(cadastroSaia);
                janela.add(refreshSaia);

                janela.setSize(600, 600);
                janela.setVisible(true);

                cadastroSaia.addActionListener(this);
                refreshSaia.addActionListener(this);
                botaoFiltroSaia.addActionListener(this);
                listaSaiaCadastrados.addListSelectionListener(this);

                break;

            case 9:// Mostrar dados de alunos cadastrados (JList)
                listaNomes = new ControleShorte(dados).getNomesShorte();
                listaShorteCadastrados = new JList<String>(listaNomes);
                janela = new JFrame("Saia");
                titulo = new JLabel("Saias Cadastrados");
                cadastroShorte = new JButton("Cadastrar");
                refreshShorte = new JButton("Refresh");
                
                filtroShorte = new JTextField("Pesquisar nome da calça");
                botaoFiltroShorte = new JButton("Filtrar");
                botaoFiltroShorte.setBounds(200, 50, 100, 30);
                filtroShorte.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaShorteCadastrados.setBounds(20, 100, 350, 120);
                listaShorteCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaShorteCadastrados.setVisibleRowCount(10);

                cadastroShorte.setBounds(70, 300, 100, 30);
                refreshShorte.setBounds(200, 300, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(listaShorteCadastrados);
                janela.add(cadastroShorte);
                janela.add(refreshShorte);
                janela.add(filtroShorte);
                janela.add(botaoFiltroShorte);

                janela.setSize(600, 600);
                janela.setVisible(true);

                cadastroShorte.addActionListener(this);
                refreshShorte.addActionListener(this);
                botaoFiltroShorte.addActionListener(this);
                listaShorteCadastrados.addListSelectionListener(this);

                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção não encontrada!", null,
                        JOptionPane.ERROR_MESSAGE);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == calca) {
            new TelaRoupa(dados).mostrarDados(1, dados);
        }
        if (src == camisa) {
            new TelaRoupa(dados).mostrarDados(2, dados);
        }
        if (src == camiseta) {
            new TelaRoupa(dados).mostrarDados(3, dados);
        }
        if (src == casaco) {
            new TelaRoupa(dados).mostrarDados(4, dados);
        }
        if (src == cinto) {
            new TelaRoupa(dados).mostrarDados(5, dados);
        }
        if (src == cropped) {
            new TelaRoupa(dados).mostrarDados(6, dados);
        }
        if (src == macacao) {
            new TelaRoupa(dados).mostrarDados(7, dados);
        }
        if (src == saia) {
            new TelaRoupa(dados).mostrarDados(8, dados);
        }
        if (src == shorte) {
            new TelaRoupa(dados).mostrarDados(9, dados);
        }

        if (src == cadastroCalca) {
            new TelaDetalheRoupa().inserirEditar(1, dados, this, 0);
        }
        if (src == cadastroCamisa) {
            new TelaDetalheRoupa().inserirEditar(2, dados, this, 0);
        }
        if (src == cadastroCamiseta) {
            new TelaDetalheRoupa().inserirEditar(3, dados, this, 0);
        }
        if (src == cadastroCasaco) {
            new TelaDetalheRoupa().inserirEditar(4, dados, this, 0);
        }
        if (src == cadastroCinto) {
            new TelaDetalheRoupa().inserirEditar(5, dados, this, 0);
        }
        if (src == cadastroCropped) {
            new TelaDetalheRoupa().inserirEditar(6, dados, this, 0);
        }
        if (src == cadastroMacacao) {
            new TelaDetalheRoupa().inserirEditar(7, dados, this, 0);
        }
        if (src == cadastroSaia) {
            new TelaDetalheRoupa().inserirEditar(8, dados, this, 0);
        }
        if (src == cadastroShorte) {
            new TelaDetalheRoupa().inserirEditar(9, dados, this, 0);
        }

        if (src == refreshCalca) {
            listaCalcaCadastrados.setListData(new ControleCalca(dados).getNomesCalcas());
            listaCalcaCadastrados.updateUI();
        }
        if (src == refreshCamisa) {
            listaCamisaCadastrados.setListData(new ControleCamisa(dados).getNomesCamisa());
            listaCamisaCadastrados.updateUI();
        }
        if (src == refreshCamiseta) {
            listaCamisetaCadastrados.setListData(new ControleCamiseta(dados).getNomesCamiseta());
            listaCamisetaCadastrados.updateUI();
        }
        if (src == refreshCasaco) {
            listaCasacoCadastrados.setListData(new ControleCasaco(dados).getNomesCasaco());
            listaCasacoCadastrados.updateUI();
        }
        if (src == refreshCinto) {
            listaCintoCadastrados.setListData(new ControleCinto(dados).getNomesCinto());
            listaCintoCadastrados.updateUI();
        }
        if (src == refreshCropped) {
            listaCroppedCadastrados.setListData(new ControleCropped(dados).getNomesCropped());
            listaCroppedCadastrados.updateUI();
        }
        if (src == refreshMacacao) {
            listaMacacaoCadastrados.setListData(new ControleMacacao(dados).getNomesMacacao());
            listaMacacaoCadastrados.updateUI();
        }
        if (src == refreshSaia) {
            listaSaiaCadastrados.setListData(new ControleSaia(dados).getNomesSaia());
            listaSaiaCadastrados.updateUI();
        }
        if (src == refreshShorte) {
            listaShorteCadastrados.setListData(new ControleShorte(dados).getNomesShorte());
            listaShorteCadastrados.updateUI();
        }
        
        if (src == botaoFiltroCalca) {
           
            ControleCalca nomeEstoque = new ControleCalca(dados);          
            String nomeDig =filtroCalca.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesCalcas()[x];
                if(nomeDig.equals(nome[0])){                             
                    listaCalcaCadastrados.setListData(nome);
                    listaCalcaCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesCalcas().length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        
        if (src == botaoFiltroCamisa) {
           
            ControleCamisa nomeEstoque = new ControleCamisa(dados);          
            String nomeDig =filtroCamisa.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesCamisa()[x];
                if(nomeDig.equals(nome[0])){                             
                    listaCamisaCadastrados.setListData(nome);
                    listaCamisaCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesCamisa().length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroCamiseta) {
           
            ControleCamiseta nomeEstoque = new ControleCamiseta(dados);          
            String nomeDig =filtroCamiseta.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesCamiseta()[x];
                if(nomeDig.equals(nome[0])){                             
                    listaCamisetaCadastrados.setListData(nome);
                    listaCamisetaCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesCamiseta().length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroCasaco) {
           
            ControleCasaco nomeEstoque = new ControleCasaco(dados);          
            String nomeDig =filtroCasaco.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesCasaco()[x];
                if(nomeDig.equals(nome[0])){                             
                    listaCasacoCadastrados.setListData(nome);
                    listaCasacoCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesCasaco().length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroCinto) {
           
            ControleCinto nomeEstoque = new ControleCinto(dados);          
            String nomeDig =filtroCinto.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesCinto()[x];
                if(nomeDig.equals(nome[0])){                             
                    listaCintoCadastrados.setListData(nome);
                    listaCintoCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesCinto().length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroCropped) {
           
            ControleCropped nomeEstoque = new ControleCropped(dados);          
            String nomeDig =filtroCropped.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesCropped()[x];
                if(nomeDig.equals(nome[0])){                             
                    listaCroppedCadastrados.setListData(nome);
                    listaCroppedCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesCropped().length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroMacacao) {
           
            ControleMacacao nomeEstoque = new ControleMacacao(dados);          
            String nomeDig =filtroMacacao.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesMacacao()[x];
                if(nomeDig.equals(nome[0])){                             
                    listaMacacaoCadastrados.setListData(nome);
                    listaMacacaoCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesMacacao().length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroSaia) {
           
            ControleSaia nomeEstoque = new ControleSaia(dados);          
            String nomeDig =filtroSaia.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesSaia()[x];
                if(nomeDig.equals(nome[0])){                             
                    listaSaiaCadastrados.setListData(nome);
                    listaSaiaCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesSaia().length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        if (src == botaoFiltroShorte) {
           
            ControleShorte nomeEstoque = new ControleShorte(dados);          
            String nomeDig =filtroShorte.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesShorte()[x];
                if(nomeDig.equals(nome[0])){                             
                    listaShorteCadastrados.setListData(nome);
                    listaShorteCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesShorte().length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaCalcaCadastrados) {

            new TelaDetalheRoupa().inserirEditar(10, dados, this,
                    listaCalcaCadastrados.getSelectedIndex());

        }

        if (e.getValueIsAdjusting() && src == listaCamisaCadastrados) {
            new TelaDetalheRoupa().inserirEditar(11, dados, this,
                    listaCamisaCadastrados.getSelectedIndex());
        }

        if (e.getValueIsAdjusting() && src == listaCamisetaCadastrados) {
            new TelaDetalheRoupa().inserirEditar(12, dados, this,
                    listaCamisetaCadastrados.getSelectedIndex());
        }

        if (e.getValueIsAdjusting() && src == listaCasacoCadastrados) {
            new TelaDetalheRoupa().inserirEditar(13, dados, this,
                    listaCasacoCadastrados.getSelectedIndex());
        }

        if (e.getValueIsAdjusting() && src == listaCintoCadastrados) {
            new TelaDetalheRoupa().inserirEditar(14, dados, this,
                    listaCintoCadastrados.getSelectedIndex());
        }

        if (e.getValueIsAdjusting() && src == listaCroppedCadastrados) {
            new TelaDetalheRoupa().inserirEditar(15, dados, this,
                    listaCroppedCadastrados.getSelectedIndex());
        }

        if (e.getValueIsAdjusting() && src == listaMacacaoCadastrados) {
            new TelaDetalheRoupa().inserirEditar(16, dados, this,
                    listaMacacaoCadastrados.getSelectedIndex());
        }

        if (e.getValueIsAdjusting() && src == listaSaiaCadastrados) {
            new TelaDetalheRoupa().inserirEditar(17, dados, this,
                    listaSaiaCadastrados.getSelectedIndex());
        }

        if (e.getValueIsAdjusting() && src == listaShorteCadastrados) {
            new TelaDetalheRoupa().inserirEditar(18, dados, this,
                    listaShorteCadastrados.getSelectedIndex());
        }
    }

    public JList<String> getListaCalcasCadastrados() {
        return listaCalcaCadastrados;
    }

    public void setListaCalcaCadastrados(JList<String> listaCalcaCadastrados) {
        this.listaCalcaCadastrados = listaCalcaCadastrados;
    }

    public JList<String> getListaCamisaCadastrados() {
        return listaCamisaCadastrados;
    }

    public void setListaCamisaCadastrados(JList<String> listaCamisaCadastrados) {
        this.listaCamisaCadastrados = listaCamisaCadastrados;
    }

    public JList<String> getListaCamisetaCadastrados() {
        return listaCamisetaCadastrados;
    }

    public void setListaCamisetaCadastrados(JList<String> listaCamisetaCadastrados) {
        this.listaCamisetaCadastrados = listaCamisaCadastrados;
    }

    public JList<String> getListaCasacoCadastrados() {
        return listaCasacoCadastrados;
    }

    public void setListaCasacoCadastrados(JList<String> listaCasacoCadastrados) {
        this.listaCasacoCadastrados = listaCasacoCadastrados;
    }

    public JList<String> getListaCintoCadastrados() {
        return listaCintoCadastrados;
    }

    public void setListaCintoCadastrados(JList<String> listaCintoCadastrados) {
        this.listaCintoCadastrados = listaCintoCadastrados;
    }

    public JList<String> getListaCroppedCadastrados() {
        return listaCroppedCadastrados;
    }

    public void setListaCroppedCadastrados(JList<String> listaCroppedCadastrados) {
        this.listaCroppedCadastrados = listaCroppedCadastrados;
    }

    public JList<String> getListaMacacaoCadastrados() {
        return listaMacacaoCadastrados;
    }

    public void setListaMacacaoCadastrados(JList<String> listaMacacaoCadastrados) {
        this.listaMacacaoCadastrados = listaMacacaoCadastrados;
    }

    public JList<String> getListaSaiaCadastrados() {
        return listaSaiaCadastrados;
    }

    public void setListaSaiaCadastrados(JList<String> listaSaiaCadastrados) {
        this.listaSaiaCadastrados = listaSaiaCadastrados;
    }

    public JList<String> getListaShorteCadastrados() {
        return listaShorteCadastrados;
    }

    public void setListaShorteCadastrados(JList<String> listaShorteCadastrados) {
        this.listaShorteCadastrados = listaShorteCadastrados;
    }

     public void mensagemErroBusca() {
        JOptionPane.showMessageDialog(null, "Roupa não encontrada!.\n ", null,
                JOptionPane.ERROR_MESSAGE);
    }
}
