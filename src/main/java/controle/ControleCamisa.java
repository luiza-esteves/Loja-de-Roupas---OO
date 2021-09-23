package controle;

import java.text.ParseException;
import modelo.Camisa;
import modelo.Dados;


public class ControleCamisa {

    private Camisa[] c;
     private Camisa[] camisa;
        private int qtdCamisa;
        private Dados dados = new Dados();

        public ControleCamisa(ControleDados d) {
            camisa = d.getCamisa();
            qtdCamisa = d.getQtdEstoque();
        }
        
        public String[] getNomesCamisa() {
                    String[] s = new String[qtdCamisa];
                    for(int i = 0; i < qtdCamisa; i++) {
                            s[i] = camisa[i].getNome();
                    }

                    return s;
        }
        
        public boolean inserirEditarCamisa(String[] dadosCamisa) throws ParseException {
		if(!dadosCamisa[3].matches("[0-9]+") || !dadosCamisa[5].matches("[0-9]+") || 
				  !dadosCamisa[6].matches("[0-9]+")) {
			return false;
		} else {
			Camisa c = new Camisa(dadosCamisa[12], dadosCamisa[13], dadosCamisa[14],dadosCamisa[15],Integer.parseInt(dadosCamisa[1]),
                                        dadosCamisa[2],dadosCamisa[3],dadosCamisa[4],dadosCamisa[5],dadosCamisa[6],
                                        dadosCamisa[7],dadosCamisa[8],dadosCamisa[9],Double.parseDouble(dadosCamisa[10]),Double.parseDouble(dadosCamisa[11]));
			dados.inserirEditarCamisa(c, Integer.parseInt(dadosCamisa[0]));
			return true;
		}
	}
       
        public boolean removerCamisa(int i) {
                        int qtdCamisa = dados.getQtdCamisa();
                        String camisaRemovida = dados.getCamisa()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdCamisa; j++) { 
                                aux = dados.getVenda()[j].getCamisa().getNome();
                                if(camisaRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdCamisa()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdCamisa(dados.getQtdCamisa() - 1);
			dados.getCamisa()[dados.getQtdCamisa()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getCamisa()[cont].getNome().compareTo(camisaRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdCamisa() - 1; j++) {
				dados.getCamisa()[j] = null;
				dados.getCamisa()[j] = dados.getCamisa()[j+1];
			}
			dados.getCamisa()[dados.getQtdCamisa()] = null;
			dados.setQtdCamisa(dados.getQtdCamisa() - 1);
			return true;
		}
        }
    
}
