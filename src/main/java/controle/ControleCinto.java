
package controle;

import java.text.ParseException;
import modelo.Cinto;
import modelo.Dados;

public class ControleCinto {

     private Cinto[] cinto;
        private int qtdCinto;
        private Dados dados = new Dados();

        public ControleCinto(ControleDados d) {
            cinto = d.getCinto();
            qtdCinto = d.getQtdEstoque();
        }
        
        public String[] getNomesCinto() {
                    String[] s = new String[qtdCinto];
                    for(int i = 0; i < qtdCinto; i++) {
                            s[i] = cinto[i].getNome();
                    }

                    return s;
        }
        
        public boolean inserirEditarCinto(String[] dadosCinto) throws ParseException {
		if(!dadosCinto[3].matches("[0-9]+") || !dadosCinto[5].matches("[0-9]+") || 
				  !dadosCinto[6].matches("[0-9]+")) {
			return false;
		} else {
			Cinto c = new Cinto(dadosCinto[12], Double.parseDouble(dadosCinto[13]),Integer.parseInt(dadosCinto[1]),
                                        dadosCinto[2],dadosCinto[3],dadosCinto[4],dadosCinto[5],dadosCinto[6],
                                        dadosCinto[7],dadosCinto[8],dadosCinto[9],Double.parseDouble(dadosCinto[10]),Double.parseDouble(dadosCinto[11]));
			dados.inserirEditarCinto(c, Integer.parseInt(dadosCinto[0]));
			return true;
		}
	}
       
        public boolean removerCinto(int i) {
                        int qtdCinto = dados.getQtdCinto();
                        String cintoRemovida = dados.getCinto()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdCinto; j++) { 
                                aux = dados.getVenda()[j].getEstoque().getNomeRoupa();
                                if(cintoRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdCinto()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdCinto(dados.getQtdCinto() - 1);
			dados.getCinto()[dados.getQtdCinto()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getCinto()[cont].getNome().compareTo(cintoRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdCinto() - 1; j++) {
				dados.getCinto()[j] = null;
				dados.getCinto()[j] = dados.getCinto()[j+1];
			}
			dados.getCinto()[dados.getQtdCinto()] = null;
			dados.setQtdCinto(dados.getQtdCinto() - 1);
			return true;
		}
        }
    
}
