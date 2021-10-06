/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.text.ParseException;
import modelo.Cropped;
import modelo.Dados;

public class ControleCropped {

    private Cropped[] cropped;
    private int qtdCropped;
    private Dados dados = new Dados();

    public ControleCropped(ControleDados d) {
        cropped = d.getCropped();
        qtdCropped = d.getQtdEstoque();
    }

    public String[] getNomesCropped() {
        String[] s = new String[qtdCropped];
        for (int i = 0; i < qtdCropped; i++) {
            s[i] = cropped[i].getNome();
        }

        return s;
    }

}
