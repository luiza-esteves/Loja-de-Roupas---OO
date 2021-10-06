package controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import modelo.*;

public class ControleVenda {

    Venda[] v;
    Venda[] venda;
    private Dados dados = new Dados();
    private int qtdVenda;

    public ControleVenda(ControleDados d) {
        venda = d.getVenda();
        qtdVenda = d.getQtdVenda();

    }

    public String[] getCodigosCompras() {
        String[] s = new String[qtdVenda];
        for (int i = 0; i < qtdVenda; i++) {
            s[i] = Integer.toString(venda[i].getCodCompra());
        }

        return s;
    }


}
