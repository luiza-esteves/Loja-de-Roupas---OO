
package controle;

import java.text.ParseException;
import modelo.Dados;
import modelo.Shorte;


public class ControleShorte {
     private Shorte[] shorte;
        private int qtdShorte;
        private Dados dados = new Dados();

        public ControleShorte(ControleDados d) {
            shorte = d.getShorte();
            qtdShorte = d.getQtdEstoque();
        }
        
        public String[] getNomesShorte() {
                    String[] s = new String[qtdShorte];
                    for(int i = 0; i < qtdShorte; i++) {
                            s[i] = shorte[i].getNome();
                    }

                    return s;
        }
        
        public boolean inserirEditarShorte(String[] dadosShorte) throws ParseException {
		if(!dadosShorte[3].matches("[0-9]+") || !dadosShorte[5].matches("[0-9]+") || 
				  !dadosShorte[6].matches("[0-9]+")) {
			return false;
		} else {
			Shorte c = new Shorte(dadosShorte[12], dadosShorte[13],Integer.parseInt(dadosShorte[1]),
                                        dadosShorte[2],dadosShorte[3],dadosShorte[4],dadosShorte[5],dadosShorte[6],
                                        dadosShorte[7],dadosShorte[8],dadosShorte[9],Double.parseDouble(dadosShorte[10]),Double.parseDouble(dadosShorte[11]));
			dados.inserirEditarShorte(c, Integer.parseInt(dadosShorte[0]));
			return true;
		}
	}
       
        public boolean removerShorte(int i) {
                        int qtdShorte = dados.getQtdShorte();
                        String shorteRemovida = dados.getShorte()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdShorte; j++) { 
                                aux = dados.getVenda()[j].getEstoque().getNomeRoupa();
                                if(shorteRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdShorte()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdShorte(dados.getQtdShorte() - 1);
			dados.getShorte()[dados.getQtdShorte()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getShorte()[cont].getNome().compareTo(shorteRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdShorte() - 1; j++) {
				dados.getShorte()[j] = null;
				dados.getShorte()[j] = dados.getShorte()[j+1];
			}
			dados.getShorte()[dados.getQtdShorte()] = null;
			dados.setQtdShorte(dados.getQtdShorte() - 1);
			return true;
		}
        }
    
    
}
