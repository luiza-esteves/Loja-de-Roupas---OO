package view;

import controle.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.util.Collections.list;
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


public class TelaVenda {
    
    
    private JButton cadastroVendas ; 
    private JButton refreshVendas;
    
    private static final JFrame janela = new JFrame("Vendas");
    private JLabel titulo = new JLabel("Vendas");
    
    private static ControleDados dados;
    private JList<String> listaClientesCadastrados;
    private JList<String> listaVendedoresCadastrados;
    private JList<String> listaRoupasCadastrados;
    private JList<String> listaVendasCadastrados;
    
    private String[] listaNomes = new String[50];
    
    public void mostrarDados(ControleDados d, int op){
        dados = d;
        switch (op) {
           
                    case 1:// Mostrar dados de alunos cadastrados (JList)
                            listaNomes = new ControleVenda(dados).getCodigosCompras();
                            listaVendasCadastrados = new JList<String>(listaNomes);
                            System.out.println(listaVendasCadastrados);
                            
                            

                            titulo.setFont(new Font("Arial", Font.BOLD, 20));
                            titulo.setBounds(90, 10, 250, 30);              
//                            listaVendasCadastrados = new JList(listaNomes); //data has type Object[]
//                            listaVendasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//                            listaVendasCadastrados.setLayoutOrientation(JList.VERTICAL_WRAP);
//                            listaClientesCadastrados.setVisibleRowCount(-1);
//                           
//                            JScrollPane listScroller = new JScrollPane(listaClientesCadastrados);
//                            listScroller.setPreferredSize(new Dimension(250, 80));
//                            
                            
                            cadastroVendas = new JButton("Cadastrar");
                            refreshVendas = new JButton("Atualizar");
                            cadastroVendas.setBounds(70, 177, 100, 30);
                            refreshVendas.setBounds(200, 177, 100, 30);

                            janela.setLayout(null);

                            janela.add(titulo);
                            janela.add(listaVendasCadastrados);
                            janela.add(cadastroVendas);
                            janela.add(refreshVendas);

                            janela.setSize(400, 250);
                            janela.setVisible(true);

//                            cadastro.addActionListener(this);
//                            refreshCliente.addActionListener(this);
//                            listaClientesCadastrados.addListSelectionListener(this);

                            break;
        
    }
    
    
    
    
}
}
