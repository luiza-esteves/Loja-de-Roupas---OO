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
 *
 * @author luiza
 */
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
                    for(int i = 0; i < qtdCropped; i++) {
                            s[i] = cropped[i].getNome();
                    }

                    return s;
        }
        
        public boolean inserirEditarCropped(String[] dadosCropped) throws ParseException {
		if(!dadosCropped[3].matches("[0-9]+") || !dadosCropped[5].matches("[0-9]+") || 
				  !dadosCropped[6].matches("[0-9]+")) {
			return false;
		} else {
			Cropped c = new Cropped(dadosCropped[12], dadosCropped[13], dadosCropped[14],Integer.parseInt(dadosCropped[1]),
                                        dadosCropped[2],dadosCropped[3],dadosCropped[4],dadosCropped[5],dadosCropped[6],
                                        dadosCropped[7],dadosCropped[8],dadosCropped[9],Double.parseDouble(dadosCropped[10]),Double.parseDouble(dadosCropped[11]));
			dados.inserirEditarCropped(c, Integer.parseInt(dadosCropped[0]));
			return true;
		}
	}
       
        public boolean removerCropped(int i) {
                        int qtdCropped = dados.getQtdCropped();
                        String croppedRemovida = dados.getCropped()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdCropped; j++) { 
                                aux = dados.getVenda()[j].getCropped().getNome();
                                if(croppedRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdCropped()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdCropped(dados.getQtdCropped() - 1);
			dados.getCropped()[dados.getQtdCropped()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getCropped()[cont].getNome().compareTo(croppedRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdCropped() - 1; j++) {
				dados.getCropped()[j] = null;
				dados.getCropped()[j] = dados.getCropped()[j+1];
			}
			dados.getCropped()[dados.getQtdCropped()] = null;
			dados.setQtdCropped(dados.getQtdCropped() - 1);
			return true;
		}
        }
    
}
