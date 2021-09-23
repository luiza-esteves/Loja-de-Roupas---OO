package controle;

import java.text.ParseException;
import modelo.Macacao;
import modelo.Dados;

public class ControleMacacao {

        private Macacao[] macacao;
        private int qtdMacacao;
        private Dados dados = new Dados();

        public ControleMacacao(ControleDados d) {
            macacao = d.getMacacao();
            qtdMacacao = d.getQtdEstoque();
        }
        
        public String[] getNomesMacacao() {
                    String[] s = new String[qtdMacacao];
                    for(int i = 0; i < qtdMacacao; i++) {
                            s[i] = macacao[i].getNome();
                    }

                    return s;
        }
        
        public boolean inserirEditarMacacao(String[] dadosMacacao) throws ParseException {
		if(!dadosMacacao[3].matches("[0-9]+") || !dadosMacacao[5].matches("[0-9]+") || 
				  !dadosMacacao[6].matches("[0-9]+")) {
			return false;
		} else {
			Macacao c = new Macacao(dadosMacacao[12], dadosMacacao[13],Integer.parseInt(dadosMacacao[1]),
                                        dadosMacacao[2],dadosMacacao[3],dadosMacacao[4],dadosMacacao[5],dadosMacacao[6],
                                        dadosMacacao[7],dadosMacacao[8],dadosMacacao[9],Double.parseDouble(dadosMacacao[10]),Double.parseDouble(dadosMacacao[11]));
			dados.inserirEditarMacacao(c, Integer.parseInt(dadosMacacao[0]));
			return true;
		}
	}
       
        public boolean removerMacacao(int i) {
                        int qtdMacacao = dados.getQtdMacacao();
                        String macacaoRemovida = dados.getMacacao()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdMacacao; j++) { 
                                aux = dados.getVenda()[j].getMacacao().getNome();
                                if(macacaoRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdMacacao()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdMacacao(dados.getQtdMacacao() - 1);
			dados.getMacacao()[dados.getQtdMacacao()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getMacacao()[cont].getNome().compareTo(macacaoRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdMacacao() - 1; j++) {
				dados.getMacacao()[j] = null;
				dados.getMacacao()[j] = dados.getMacacao()[j+1];
			}
			dados.getMacacao()[dados.getQtdMacacao()] = null;
			dados.setQtdMacacao(dados.getQtdMacacao() - 1);
			return true;
		}
        }
    
}
