package controle;
import java.text.ParseException;
import modelo.*;

public class ControleCalca {
    private Calca[] c;
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
				Calca c = new Calca(dadosCalca[3], dadosCalca[1], Integer.parseInt(dadosCalca[3]), 
					new Telefone(Integer.parseInt(dadosCalca[5]),Integer.parseInt(dadosCalca[6])), 
                                        new Endereco(dadosCalca[9],dadosCalca[10],dadosCalca[7],Integer.parseInt(dadosCalca[8]),
                                            Integer.parseInt(dadosCalca[13]),Integer.parseInt(dadosCalca[12]),Integer.parseInt(dadosCalca[11])
                                        ),
                                        dadosCalca[4]
								);
				dados.inserirEditarCliente(c, Integer.parseInt(dadosCalca[0]));
				return true;
		}
	}
       
        public boolean removerCliente(int i) {
                        int qtdCliente = dados.getQtdCliente();
                        String alunoRemovido = dados.getCliente()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdCliente; j++) { 
                                aux = dados.getVenda()[j].getCliente().getNome();
                                if(alunoRemovido.compareTo(aux) == 0) 
                                        return false; //não é possível remover aluno pois ele está matriculado em um curso
                        }
                        
                    if(i == (dados.getQtdCliente() - 1)) { // O aluno a ser removido está no final do array
			dados.setQtdCliente(dados.getQtdCliente() - 1);
			dados.getCliente()[dados.getQtdCliente()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getCliente()[cont].getNome().compareTo(alunoRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdCliente() - 1; j++) {
				dados.getCliente()[j] = null;
				dados.getCliente()[j] = dados.getCliente()[j+1];
			}
			dados.getCliente()[dados.getQtdCliente()] = null;
			dados.setQtdCliente(dados.getQtdCliente() - 1);
			return true;
		}
        }
    
}
