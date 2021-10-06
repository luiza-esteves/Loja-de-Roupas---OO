package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaPessoa implements ActionListener, ListSelectionListener {

    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroCliente;
    private JButton refreshCliente;
    private JButton cadastroVendedor;
    private JButton refreshVendedor;
    private JTextField filtroNomeCliente;
    private JButton botaoFiltroCliente = new JButton("Filtrar");
    private JTextField filtroNomeFuncionario;
    private JButton botaoFiltroFuncionario = new JButton("Filtrar");
    private static ControleDados dados;
    private JList<String> listaClientesCadastrados;
    private JList<String> listaVendedoresCadastrados;
    private String[] listaNomes = new String[50];

    public void mostrarDados(ControleDados d, int op) {
        //mostra lista de clientes ou funcionários, dependendo do parâmetro op passado
        dados = d;

        switch (op) {
            case 1:// Mostrar dados de alunos cadastrados (JList)
                listaNomes = new ControleCliente(dados).getNomesCliente();
                listaClientesCadastrados = new JList<String>(listaNomes);
                janela = new JFrame("Cliente");
                titulo = new JLabel("Clientes Cadastrados");
                cadastroCliente = new JButton("Cadastrar");
                refreshCliente = new JButton("Refresh");
                
                filtroNomeCliente = new JTextField("Pesquisar nome do cliente");
                botaoFiltroCliente = new JButton("Filtrar");
                botaoFiltroCliente.setBounds(200, 50, 100, 30);
                filtroNomeCliente.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaClientesCadastrados.setBounds(20, 100, 350, 120);
                listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaClientesCadastrados.setVisibleRowCount(10);

                cadastroCliente.setBounds(70, 300, 100, 30);
                refreshCliente.setBounds(200, 300, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(botaoFiltroCliente);
                janela.add(filtroNomeCliente);
                janela.add(listaClientesCadastrados);
                janela.add(cadastroCliente);
                janela.add(refreshCliente);

                janela.setSize(500, 500);
                janela.setVisible(true);

                cadastroCliente.addActionListener(this);
                refreshCliente.addActionListener(this);
                botaoFiltroCliente.addActionListener(this);
                listaClientesCadastrados.addListSelectionListener(this);

                break;

            case 2:// Mostrar dados de professores cadastrados (JList)
                listaNomes = new ControleFuncionario(dados).getNomefuncionario();
                listaVendedoresCadastrados = new JList<String>(listaNomes);
                janela = new JFrame("Funcionários");
                titulo = new JLabel("Funcionários Cadastrados");
                cadastroVendedor = new JButton("Cadastrar");
                refreshVendedor = new JButton("Refresh");
                
                filtroNomeFuncionario = new JTextField("Pesquisar nome do funcionário");
                botaoFiltroFuncionario = new JButton("Filtrar");
                botaoFiltroFuncionario.setBounds(200, 50, 100, 30);
                filtroNomeFuncionario.setBounds(20, 50, 150, 30);

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaVendedoresCadastrados.setBounds(20, 100, 350, 120);
                listaVendedoresCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaVendedoresCadastrados.setVisibleRowCount(10);

                cadastroVendedor.setBounds(70, 300, 100, 30);
                refreshVendedor.setBounds(200, 300, 100, 30);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(botaoFiltroFuncionario);
                janela.add(filtroNomeFuncionario);
                janela.add(listaVendedoresCadastrados);
                janela.add(cadastroVendedor);
                janela.add(refreshVendedor);

                janela.setSize(500, 500);
                janela.setVisible(true);

                cadastroVendedor.addActionListener(this);
                botaoFiltroFuncionario.addActionListener(this);
                refreshVendedor.addActionListener(this);
                listaVendedoresCadastrados.addListSelectionListener(this);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção não encontrada!", null,
                        JOptionPane.ERROR_MESSAGE);
        }

    }

    //Captura eventos relacionados aos botões da interface
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        //Cadastro de novo cliente
        if (src == cadastroCliente) {
            new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);
        }
        //Cadastro de novo professor
        if (src == cadastroVendedor) {
            new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);
        }
        // Atualiza a lista de nomes de clientes mostrada no JList
        if (src == refreshCliente) {
            listaClientesCadastrados.setListData(new ControleCliente(dados).getNomesCliente());
            listaClientesCadastrados.updateUI();
        }

        // Atualiza a lista de nomes de professores mostrada no JList
        if (src == refreshVendedor) {
            listaVendedoresCadastrados.setListData(new ControleFuncionario(dados).getNomefuncionario());
            listaVendedoresCadastrados.updateUI();
        }
        
        if (src == botaoFiltroCliente) {
           
            ControleCliente nomeEstoque = new ControleCliente(dados);          
            String nomeDig =filtroNomeCliente.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomesCliente()[x];
                if(nomeDig.equals(nome[0])){                             
                    listaClientesCadastrados.setListData(nome);
                    listaClientesCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomesCliente().length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }
        
        if (src == botaoFiltroFuncionario) {
           
            ControleFuncionario nomeEstoque = new ControleFuncionario(dados);          
            String nomeDig =filtroNomeFuncionario.getText();
            String[] nome = new String[1];
            boolean encontrar = false;
            int x=0;
            do{

                nome[0] = nomeEstoque.getNomefuncionario()[x];
                if(nomeDig.equals(nome[0])){                             
                    listaVendedoresCadastrados.setListData(nome);
                    listaVendedoresCadastrados.updateUI();
                    encontrar= true;
                    
                }
                x++;
            }while(encontrar==false && x<nomeEstoque.getNomefuncionario().length);
            if(!encontrar){
                mensagemErroBusca();
            }
           
        }

    }

    //Captura eventos relacionados ao JList
    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaClientesCadastrados) {
            new TelaDetalhePessoa().inserirEditar(3, dados, this,
                    listaClientesCadastrados.getSelectedIndex());
        }

        if (e.getValueIsAdjusting() && src == listaVendedoresCadastrados) {
            new TelaDetalhePessoa().inserirEditar(4, dados, this,
                    listaVendedoresCadastrados.getSelectedIndex());
        }
    }

    public JFrame getJanela() {
        return janela;
    }

    public void setJanela(JFrame janela) {
        this.janela = janela;
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }

    public JButton getCadastroCliente() {
        return cadastroCliente;
    }

    public void setCadastroCliente(JButton cadastroCliente) {
        this.cadastroCliente = cadastroCliente;
    }

    public JButton getRefreshCliente() {
        return refreshCliente;
    }

    public void setRefreshCliente(JButton refreshCliente) {
        this.refreshCliente = refreshCliente;
    }

    public JButton getCadastroVendedor() {
        return cadastroVendedor;
    }

    public void setCadastroVendedor(JButton cadastroVendedor) {
        this.cadastroVendedor = cadastroVendedor;
    }

    public JButton getRefreshVendedor() {
        return refreshVendedor;
    }

    public void setRefreshVendedor(JButton refreshVendedor) {
        this.refreshVendedor = refreshVendedor;
    }

    public static ControleDados getDados() {
        return dados;
    }

    public static void setDados(ControleDados dados) {
        TelaPessoa.dados = dados;
    }

    public JList<String> getListaClientesCadastrados() {
        return listaClientesCadastrados;
    }

    public void setListaClientesCadastrados(JList<String> listaClientesCadastrados) {
        this.listaClientesCadastrados = listaClientesCadastrados;
    }

    public JList<String> getListaVendedoresCadastrados() {
        return listaVendedoresCadastrados;
    }

    public void setListaVendedoresCadastrados(JList<String> listaVendedoresCadastrados) {
        this.listaVendedoresCadastrados = listaVendedoresCadastrados;
    }

    public String[] getListaNomes() {
        return listaNomes;
    }

    public void setListaNomes(String[] listaNomes) {
        this.listaNomes = listaNomes;
    }
    public void mensagemErroBusca() {
        JOptionPane.showMessageDialog(null, "Roupa não encontrada!.\n ", null,
                JOptionPane.ERROR_MESSAGE);
    }

}
