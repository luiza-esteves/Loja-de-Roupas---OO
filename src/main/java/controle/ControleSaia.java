/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.text.ParseException;
import modelo.Saia;
import modelo.Dados;

public class ControleSaia {

    private Saia[] saia;
    private int qtdSaia;
    private Dados dados = new Dados();

    public ControleSaia(ControleDados d) {
        saia = d.getSaia();
        qtdSaia = d.getQtdEstoque();
    }

    public String[] getNomesSaia() {
        String[] s = new String[qtdSaia];
        for (int i = 0; i < qtdSaia; i++) {
            s[i] = saia[i].getNome();
        }

        return s;
    }

}
