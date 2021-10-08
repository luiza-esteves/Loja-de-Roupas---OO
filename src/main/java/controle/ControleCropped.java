/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.text.ParseException;
import modelo.Cropped;
import modelo.Dados;

/**
 * Classe que auxilia na montagem da tela onde os croppeds aparecem
 * @author Luíza Esteves
 */
public class ControleCropped {

    private Cropped[] cropped;
    private int qtdCropped;
    private Dados dados = new Dados();

    public ControleCropped(ControleDados d) {
        cropped = d.getCropped();
        qtdCropped = d.getQtdEstoque();
    }

    /**
     * Método que junta todos os nomes de todos os croppeds
     * @return um vetor de nomes
     */
    public String[] getNomesCropped() {
        String[] s = new String[qtdCropped];
        for (int i = 0; i < qtdCropped; i++) {
            s[i] = cropped[i].getNome();
        }

        return s;
    }

}
