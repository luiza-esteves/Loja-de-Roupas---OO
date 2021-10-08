package controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import modelo.*;

/**
 * Classe que auxilia na montagem da tela onde as vendas aparecem
 * @author Rafael Xavier
 */
public class ControleVenda {

    Venda[] v;
    Venda[] venda;
    private Dados dados = new Dados();
    private int qtdVenda;

    public ControleVenda(ControleDados d) {
        venda = d.getVenda();
        qtdVenda = d.getQtdVenda();

    }

    /**
     * Método que junta todos os códigos de todos as vendas
     * @return um vetor de códigos
     */
    public String[] getCodigosCompras() {
        String[] s = new String[qtdVenda];
        for (int i = 0; i < qtdVenda; i++) {
            s[i] = Integer.toString(venda[i].getCodCompra());
        }

        return s;
    }


}
