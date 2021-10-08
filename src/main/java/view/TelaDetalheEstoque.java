package view;

import controle.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.util.ArrayList;
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

/**
 * Classe responável pela tela que exibe as informações sobre o estoque de uma peça de roupa
 * @author Luíza Esteves
 * @version 1.0 (Out 2021) 
 */
public class TelaDetalheEstoque implements ActionListener, MouseListener, ListSelectionListener {

    private JFrame janela;
    ControleDados dados = new ControleDados();

    ControleEstoque e;
    private String[] roupa;
    private JFrame j;
    private JLabel t;

    private int posicao, indice;
    private int opcao;
    private String s;
    private JList<String> listaRoupasCadastrados;

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
    private String nome;
    
    /**
     * Método responsável pelo cadastro/edição dos dados de estoque de uma roupa
     * @param d objeto do tipo ControleDados, responsável por passar os dados das roupas
     * @param op variável inteira que através de um switch determina se será exibida 
     * a tela para cadastrar/editar um estoque
     * @param pos variável inteira que funciona como índice, determina em qual 
     * posição do vetor está o estoque a ser alterado
     */
    public void inserirEditar(int op, ControleDados d,
            TelaEstoque p, int pos) {
        opcao = op;
        posicao = pos;
        dados = d;

        if (op == 1) {
            s = "Estoque de Calça";
        }
        if (op == 2) {
            s = "Estoque de Camisa";
        }
        if (op == 3) {
            s = "Estoque de Camiseta";
        }
        if (op == 4) {
            s = "Estoque de Casaco";
        }
        if (op == 5) {
            s = "Estoque de Cinto";
        }
        if (op == 6) {
            s = "Estoque de Cropped";
        }
        if (op == 7) {
            s = "Estoque de Macacão";
        }
        if (op == 8) {
            s = "Estoque de Saia";
        }
        if (op == 9) {
            s = "Estoque de Short";
        }
        if (op == 10) {
            s = "Detalhe de Estoque de Calça";
        }
        if (op == 11) {
            s = "Detalhe de Estoque de Camisa";
        }
        if (op == 12) {
            s = "Detalhe de Estoque de Camiseta";
        }
        if (op == 13) {
            s = "Detalhe de Estoque de Casaco";
        }
        if (op == 14) {
            s = "Detalhe de Estoque de Cinto";
        }
        if (op == 15) {
            s = "Detalhe de Estoque de Cropped";
        }
        if (op == 16) {
            s = "Detalhe de Estoque de Macacão";
        }
        if (op == 17) {
            s = "Detalhe de Estoque de Saia";
        }
        if (op == 18) {
            s = "Detalhe de Estoque de Short";
        }

        janela = new JFrame(s);

        if (op == 10) {
            String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
            String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
            valorCodigo = new JTextField(cod, 200);
            valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
            valorQtdEstoque = new JTextField(qtdDisp, 200);
        } else if (op == 11) {
            String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
            String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
            valorCodigo = new JTextField(cod, 200);
            valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
            valorQtdEstoque = new JTextField(qtdDisp, 200);
        } else if (op == 12) {
            String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
            String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
            valorCodigo = new JTextField(cod, 200);
            valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
            valorQtdEstoque = new JTextField(qtdDisp, 200);
        } else if (op == 13) {
            String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
            String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
            valorCodigo = new JTextField(cod, 200);
            valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
            valorQtdEstoque = new JTextField(qtdDisp, 200);
        } else if (op == 14) {
            String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
            String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
            valorCodigo = new JTextField(cod, 200);
            valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
            valorQtdEstoque = new JTextField(qtdDisp, 200);
        } else if (op == 15) {
            String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
            String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
            valorCodigo = new JTextField(cod, 200);
            valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
            valorQtdEstoque = new JTextField(qtdDisp, 200);
        } else if (op == 16) {
            String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
            String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
            valorCodigo = new JTextField(cod, 200);
            valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
            valorQtdEstoque = new JTextField(qtdDisp, 200);
        } else if (op == 17) {
            String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
            String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
            valorCodigo = new JTextField(cod, 200);
            valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
            valorQtdEstoque = new JTextField(qtdDisp, 200);
        } else if (op == 18) {
            String qtdDisp = String.valueOf(dados.getEstoques()[pos].getQtdDispobnivel());
            String cod = String.valueOf(dados.getEstoques()[pos].getCodRoupa());
            valorCodigo = new JTextField(cod, 200);
            valorNome = new JTextField(dados.getEstoques()[pos].getNomeRoupa(), 200);
            valorQtdEstoque = new JTextField(qtdDisp, 200);
        } else {
            valorNome = new JTextField(200);
            valorCodigo = new JTextField(200);
            valorQtdEstoque = new JTextField(200);
            botaoSalvar.setBounds(245, 580, 115, 30);

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
        valorNome.setBounds(180, 70, 180, 25);
        labelQtdEstoque.setBounds(30, 250, 150, 25);
        valorQtdEstoque.setBounds(180, 250, 180, 25);

        this.janela.add(labelNome);
        this.janela.add(valorNome);
        this.janela.add(labelCodigo);
        this.janela.add(valorCodigo);

        this.janela.add(labelQtdEstoque);
        this.janela.add(valorQtdEstoque);

        this.janela.add(botaoSalvar);

        this.janela.setLayout(null);

        this.janela.setSize(400, 800);
        this.janela.setVisible(true);

        valorNome.addMouseListener(this);

        botaoSalvar.addActionListener(this);
        botaoExcluir.addActionListener(this);
    }
    
    /**
     * Método que faz com que a ação do botão selecionado seja executada, portanto 
     * faz com que os novos dados sejam colocados em seus devidos lugares, através dos botões de salvar ou excluir.
     * @param e é um objeto do tipo ActionEvent que carrega a opção escolhida pelo usuário
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        Object src = e.getSource();
        if (src == botaoSalvar) {

            try {
                boolean res = false;

                novoDado[0] = Integer.toString(dados.getDados().getQtdEstoque());

                novoDado[1] = valorCodigo.getText();
                novoDado[2] = valorNome.getText();
                novoDado[3] = valorQtdEstoque.getText();
                int qtd = Integer.parseInt(novoDado[3]);
                if (opcao == 1 || opcao == 10) {
                    res = dados.inserirEditarEstoqueCalca(novoDado);
                } else if (opcao == 2 || opcao == 11) {
                    res = dados.inserirEditarEstoqueCamisa(novoDado);
                } else if (opcao == 3 || opcao == 12) {
                    res = dados.inserirEditarEstoqueCamiseta(novoDado);
                } else if (opcao == 4 || opcao == 13) {
                    res = dados.inserirEditarEstoqueCasaco(novoDado);
                } else if (opcao == 5 || opcao == 14) {
                    res = dados.inserirEditarEstoqueCinto(novoDado);
                } else if (opcao == 6 || opcao == 15) {
                    res = dados.inserirEditarEstoqueCropped(novoDado);
                } else if (opcao == 7 || opcao == 16) {
                    res = dados.inserirEditarEstoqueMacacao(novoDado);
                } else if (opcao == 8 || opcao == 17) {
                    res = dados.inserirEditarEstoqueSaia(novoDado);
                } else if (opcao == 9 || opcao == 18) {
                    res = dados.inserirEditarEstoqueShorte(novoDado);
                }
                if (res) {
                    mensagemSucessoCadastro();
                } else {
                    mensagemErroCadastro();
                }

            } catch (NullPointerException | NumberFormatException exc1) {
                mensagemErroCadastro();
            } catch (ParseException ex) {
                Logger.getLogger(TelaDetalheEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (src == botaoExcluir) {

            boolean res = false;

            if (opcao == 10) {//exclui aluno
                res = dados.removerEstoqueCalca(posicao);
                if (res) {
                    mensagemSucessoExclusao();
                } else {
                    mensagemErroExclusaoAluno();
                }
            }

            if (opcao == 11) { //exclui professor
                res = dados.removerEstoqueCamisa(posicao);
                if (res) {
                    mensagemSucessoExclusao();
                } else {
                    mensagemErroExclusaoProf();
                }
            }

            if (opcao == 12) {//exclui aluno
                res = dados.removerEstoqueCamiseta(posicao);
                if (res) {
                    mensagemSucessoExclusao();
                } else {
                    mensagemErroExclusaoAluno();
                }
            }

            if (opcao == 13) {//exclui aluno
                res = dados.removerEstoqueCasaco(posicao);
                if (res) {
                    mensagemSucessoExclusao();
                } else {
                    mensagemErroExclusaoAluno();
                }
            }

            if (opcao == 14) {//exclui aluno
                res = dados.removerEstoqueCinto(posicao);
                if (res) {
                    mensagemSucessoExclusao();
                } else {
                    mensagemErroExclusaoAluno();
                }
            }

            if (opcao == 15) {//exclui aluno
                res = dados.removerEstoqueCropped(posicao);
                if (res) {
                    mensagemSucessoExclusao();
                } else {
                    mensagemErroExclusaoAluno();
                }
            }

            if (opcao == 16) {//exclui aluno
                res = dados.removerEstoqueMacacao(posicao);
                if (res) {
                    mensagemSucessoExclusao();
                } else {
                    mensagemErroExclusaoAluno();
                }
            }

            if (opcao == 17) {//exclui aluno
                res = dados.removerEstoqueSaia(posicao);
                if (res) {
                    mensagemSucessoExclusao();
                } else {
                    mensagemErroExclusaoAluno();
                }
            }

            if (opcao == 18) {//exclui aluno
                res = dados.removerEstoqueShorte(posicao);
                if (res) {
                    mensagemSucessoExclusao();
                } else {
                    mensagemErroExclusaoAluno();
                }
            }

        }
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();
        if (src != listaRoupasCadastrados) {
            
            indice = listaNome.getSelectedIndex();
            nome = roupa[indice];
        }

        if (src == listaRoupasCadastrados) {
            String r = listaRoupasCadastrados.getSelectedValue();
            valorNome.setText(r);
            this.j.dispose();

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
        JOptionPane.showMessageDialog(null, "ERRO AO SALVAR OS DADOS!\n "
                + "Pode ter ocorrido um dos dois erros a seguir:  \n"
                + "1. Nem todos os campos foram preenchidos \n"
                + "2. código não contém apenas números", null,
                JOptionPane.ERROR_MESSAGE);
    }

    public void mensagemErroExclusaoAluno() {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n ", null,
                JOptionPane.ERROR_MESSAGE);
    }

    public void mensagemErroExclusaoProf() {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n ", null,
                JOptionPane.ERROR_MESSAGE);
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Object src = e.getSource();
        if (src == valorNome) {
            j = new JFrame("Opções roupa");
            t = new JLabel("Opções roupa");
            ArrayList<String> todasRoupas = new ArrayList();

            ControleCalca cal = new ControleCalca(dados);
            ControleCamisa cam = new ControleCamisa(dados);
            ControleCamiseta cami = new ControleCamiseta(dados);
            ControleCasaco cas = new ControleCasaco(dados);
            ControleCinto cin = new ControleCinto(dados);
            ControleCropped cro = new ControleCropped(dados);
            ControleMacacao mac = new ControleMacacao(dados);
            ControleSaia sai = new ControleSaia(dados);
            ControleShorte sho = new ControleShorte(dados);

            for (int x = 0; x < cal.getNomesCalcas().length; x++) {
                todasRoupas.add(cal.getNomesCalcas()[x]);

            }
            for (int x = 0; x < cam.getNomesCamisa().length; x++) {
                todasRoupas.add(cam.getNomesCamisa()[x]);
            }
            for (int x = 0; x < cami.getNomesCamiseta().length; x++) {
                todasRoupas.add(cami.getNomesCamiseta()[x]);
            }
            for (int x = 0; x < cas.getNomesCasaco().length; x++) {
                todasRoupas.add(cas.getNomesCasaco()[x]);
            }
            for (int x = 0; x < cin.getNomesCinto().length; x++) {
                todasRoupas.add(cin.getNomesCinto()[x]);
            }
            for (int x = 0; x < cro.getNomesCropped().length; x++) {
                todasRoupas.add(cro.getNomesCropped()[x]);
            }
            for (int x = 0; x < mac.getNomesMacacao().length; x++) {
                todasRoupas.add(mac.getNomesMacacao()[x]);
            }
            for (int x = 0; x < sai.getNomesSaia().length; x++) {
                todasRoupas.add(sai.getNomesSaia()[x]);
            }
            for (int x = 0; x < sho.getNomesShorte().length; x++) {
                todasRoupas.add(sho.getNomesShorte()[x]);
            }
            String z[] = new String[todasRoupas.size()];
            for (int cont = 0; cont < todasRoupas.size(); cont++) {
                z[cont] = todasRoupas.get(cont);
            }
            listaRoupasCadastrados = new JList<>(z);
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

}
