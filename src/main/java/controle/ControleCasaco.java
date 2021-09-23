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
 *
 * @author luiza
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
        
        public String[] getNomesCasaco() {
                    String[] s = new String[qtdCasaco];
                    for(int i = 0; i < qtdCasaco; i++) {
                            s[i] = casaco[i].getNome();
                    }

                    return s;
        }
        
        public boolean inserirEditarCasaco(String[] dadosCasaco) throws ParseException {
		if(!dadosCasaco[3].matches("[0-9]+") || !dadosCasaco[5].matches("[0-9]+") || 
				  !dadosCasaco[6].matches("[0-9]+")) {
			return false;
		} else {
			Casaco c = new Casaco(dadosCasaco[12], dadosCasaco[13], dadosCasaco[14],Integer.parseInt(dadosCasaco[1]),
                                        dadosCasaco[2],dadosCasaco[3],dadosCasaco[4],dadosCasaco[5],dadosCasaco[6],
                                        dadosCasaco[7],dadosCasaco[8],dadosCasaco[9],Double.parseDouble(dadosCasaco[10]),Double.parseDouble(dadosCasaco[11]));
			dados.inserirEditarCasaco(c, Integer.parseInt(dadosCasaco[0]));
			return true;
		}
	}
       
        public boolean removerCasaco(int i) {
                        int qtdCasaco = dados.getQtdCasaco();
                        String casacoRemovida = dados.getCasaco()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdCasaco; j++) { 
                                aux = dados.getVenda()[j].getEstoque().getNomeRoupa();
                                if(casacoRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdCasaco()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdCasaco(dados.getQtdCasaco() - 1);
			dados.getCasaco()[dados.getQtdCasaco()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getCasaco()[cont].getNome().compareTo(casacoRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdCasaco() - 1; j++) {
				dados.getCasaco()[j] = null;
				dados.getCasaco()[j] = dados.getCasaco()[j+1];
			}
			dados.getCasaco()[dados.getQtdCasaco()] = null;
			dados.setQtdCasaco(dados.getQtdCasaco() - 1);
			return true;
		}
        }
    
}
