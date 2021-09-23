package controle;
import java.text.ParseException;
import modelo.*;

public class ControleCalca {

     private Calca[] calca;
        private int qtdCalca;
        private Dados dados = new Dados();

        public ControleCalca(ControleDados d) {
            calca = d.getCalca();
            qtdCalca = d.getQtdEstoque();
        }
        
        public String[] getNomesCalcas() {
                    String[] s = new String[qtdCalca];
                    for(int i = 0; i < qtdCalca; i++) {
                            s[i] = calca[i].getNome();
                    }

                    return s;
        }
        
        public boolean inserirEditarCalca(String[] dadosCalca) throws ParseException {
		if(!dadosCalca[3].matches("[0-9]+") || !dadosCalca[5].matches("[0-9]+") || 
				  !dadosCalca[6].matches("[0-9]+")) {
			return false;
		} else {
			Calca c = new Calca(dadosCalca[12], dadosCalca[13], dadosCalca[14],Integer.parseInt(dadosCalca[1]),
                                        dadosCalca[2],dadosCalca[3],dadosCalca[4],dadosCalca[5],dadosCalca[6],
                                        dadosCalca[7],dadosCalca[8],dadosCalca[9],Double.parseDouble(dadosCalca[10]),Double.parseDouble(dadosCalca[11]));
			dados.inserirEditarCalca(c, Integer.parseInt(dadosCalca[0]));
			return true;
		}
	}
       
        public boolean removerCalca(int i) {
                        int qtdCalca = dados.getQtdCalca();
                        String calcaRemovida = dados.getCalca()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdCalca; j++) { 
                                aux = dados.getVenda()[j].getEstoque().getNomeRoupa();
                                if(calcaRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdCalca()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdCalca(dados.getQtdCalca() - 1);
			dados.getCalca()[dados.getQtdCalca()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getCalca()[cont].getNome().compareTo(calcaRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdCalca() - 1; j++) {
				dados.getCalca()[j] = null;
				dados.getCalca()[j] = dados.getCalca()[j+1];
			}
			dados.getCalca()[dados.getQtdCalca()] = null;
			dados.setQtdCalca(dados.getQtdCalca() - 1);
			return true;
		}
        }
    
}
