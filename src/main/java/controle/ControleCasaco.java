/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.text.ParseException;
import modelo.Casaco;
import modelo.Dados;

/**
 * Classe que auxilia na montagem da tela onde os casacos aparecem
 * @author Luíza Esteves
 */
public class ControleCasaco {

    private Casaco[] c;
    private Casaco[] casaco;
    private int qtdCasaco;
    private Dados dados = new Dados();

    public ControleCasaco(ControleDados d) {
        casaco = d.getCasaco();
        qtdCasaco = d.getQtdEstoque();
    }

    /**
     * Método que junta todos os nomes de todos os casacos
     * @return um vetor de nomes
     */
    public String[] getNomesCasaco() {
        String[] s = new String[qtdCasaco];
        for (int i = 0; i < qtdCasaco; i++) {
            s[i] = casaco[i].getNome();
        }

        return s;
    }

}
