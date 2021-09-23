
package controle;
        
import java.text.ParseException;
import modelo.Camiseta;
import modelo.Dados;
        
public class ControleCamiseta{

    private Camiseta[] c;
    private Camiseta[] camiseta;
    private int qtdCamiseta;
    private Dados dados = new Dados();

    public ControleCamiseta(ControleDados d) {
            camiseta = d.getCamiseta();
            qtdCamiseta = d.getQtdEstoque();
    }
        
        public String[] getNomesCamiseta() {
                    String[] s = new String[qtdCamiseta];
                    for(int i = 0; i < qtdCamiseta; i++) {
                            s[i] = camiseta[i].getNome();
                    }

                    return s;
        }
        
        public boolean inserirEditarCamiseta(String[] dadosCamiseta) {
		if(!dadosCamiseta[3].matches("[0-9]+") || !dadosCamiseta[5].matches("[0-9]+") || 
				  !dadosCamiseta[6].matches("[0-9]+")) {
			return false;
		} else {
			Camiseta c = new Camiseta(dadosCamiseta[12], dadosCamiseta[13],Integer.parseInt(dadosCamiseta[1]),
                                        dadosCamiseta[2],dadosCamiseta[3],dadosCamiseta[4],dadosCamiseta[5],dadosCamiseta[6],
                                        dadosCamiseta[7],dadosCamiseta[8],dadosCamiseta[9],Double.parseDouble(dadosCamiseta[10]),Double.parseDouble(dadosCamiseta[11]));
			dados.inserirEditarCamiseta(c, Integer.parseInt(dadosCamiseta[0]));
			return true;
		}
	}
       
        public boolean removerCamiseta(int i) {
                        int qtdCamiseta = dados.getQtdCamiseta();
                        String camisetaRemovida = dados.getCamiseta()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdCamiseta; j++) { 
                                aux = dados.getVenda()[j].getEstoque().getNomeRoupa();
                                if(camisetaRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdCamiseta()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdCamiseta(dados.getQtdCamiseta() - 1);
			dados.getCamiseta()[dados.getQtdCamiseta()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getCamiseta()[cont].getNome().compareTo(camisetaRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdCamiseta() - 1; j++) {
				dados.getCamiseta()[j] = null;
				dados.getCamiseta()[j] = dados.getCamiseta()[j+1];
			}
			dados.getCamiseta()[dados.getQtdCamiseta()] = null;
			dados.setQtdCamiseta(dados.getQtdCamiseta() - 1);
			return true;
		}
        }
}


