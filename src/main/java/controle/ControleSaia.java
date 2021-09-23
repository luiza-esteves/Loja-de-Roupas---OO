/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.text.ParseException;
import modelo.Saia;
import modelo.Dados;

/**
 *
 * @author luiza
 */
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
                    for(int i = 0; i < qtdSaia; i++) {
                            s[i] = saia[i].getNome();
                    }

                    return s;
        }
        
        public boolean inserirEditarSaia(String[] dadosSaia) throws ParseException {
		if(!dadosSaia[3].matches("[0-9]+") || !dadosSaia[5].matches("[0-9]+") || 
				  !dadosSaia[6].matches("[0-9]+")) {
			return false;
		} else {
			Saia c = new Saia(dadosSaia[12], dadosSaia[13],Integer.parseInt(dadosSaia[1]),
                                        dadosSaia[2],dadosSaia[3],dadosSaia[4],dadosSaia[5],dadosSaia[6],
                                        dadosSaia[7],dadosSaia[8],dadosSaia[9],Double.parseDouble(dadosSaia[10]),Double.parseDouble(dadosSaia[11]));
			dados.inserirEditarSaia(c, Integer.parseInt(dadosSaia[0]));
			return true;
		}
	}
       
        public boolean removerSaia(int i) {
                        int qtdSaia = dados.getQtdSaia();
                        String saiaRemovida = dados.getSaia()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdSaia; j++) { 
                                aux = dados.getVenda()[j].getSaia().getNome();
                                if(saiaRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdSaia()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdSaia(dados.getQtdSaia() - 1);
			dados.getSaia()[dados.getQtdSaia()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getSaia()[cont].getNome().compareTo(saiaRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdSaia() - 1; j++) {
				dados.getSaia()[j] = null;
				dados.getSaia()[j] = dados.getSaia()[j+1];
			}
			dados.getSaia()[dados.getQtdSaia()] = null;
			dados.setQtdSaia(dados.getQtdSaia() - 1);
			return true;
		}
        }
    
    
}
