package controle;
import modelo.*;

public class ControleFuncionario {
        private Funcionario[] funcionario;
        private int qtdFuncionario;
        private Dados dados = new Dados();

        public ControleFuncionario(ControleDados d) {
            funcionario = d.getFuncionarios();
            qtdFuncionario = d.getQtdFuncionarios();
        }


        public String[] getNomefuncionario() {
                    String[] s = new String[qtdFuncionario];
                    for(int i = 0; i < qtdFuncionario; i++) {
                            s[i] = funcionario[i].getNome();
                    }

                    return s;
        }
        
        public int getQtd() {
                    return qtdFuncionario;
        }

        public void setQtd(int qtd) {
                    this.qtdFuncionario = qtd;
        }
        
        public String getNome(int i) {		
                    return funcionario[i].getNome();
        }

        public String getCPF(int i) {
                    String numCPF = String.valueOf(funcionario[i].getCpf());
                    return numCPF;
        }

	
	public Telefone getTelefone(int i) {
		return funcionario[i].getTelefone();
	}
        
        public Endereco getEndereco(int i) {
		return funcionario[i].getEndereco();
	}
        
        public String getDataNascimento(int i) {
            String dataNascimento = String.valueOf(funcionario[i].getDataNascimento());
            return dataNascimento;
        }

	public void setQtdFuncionario(int qtdFuncionario) {
		this.qtdFuncionario = qtdFuncionario;
	}
	
        public Funcionario[] getFuncionario() {
            return funcionario;
        }

        public void setFuncionario(Funcionario[] funcionario) {
            this.funcionario = funcionario;
        }

        public Dados getDados() {
            return dados;
        }

        public void setDados(Dados dados) {
            this.dados = dados;
        }

        public int getQtdFuncionario() {
            return qtdFuncionario;
        }
    
    
       public boolean inserirEditarFuncionario(String[] dadosFuncionario) {
		if(!dadosFuncionario[3].matches("[0-9]+") || !dadosFuncionario[4].matches("[0-9]+") || 
				!dadosFuncionario[5].matches("[0-9]+") || !dadosFuncionario[6].matches("[0-9]+")) {
			return false;
		} else {
				Funcionario f = new Funcionario(Integer.parseInt(dadosFuncionario[0]),dadosFuncionario[1], Integer.parseInt(dadosFuncionario[2]), 
						Integer.parseInt(dadosFuncionario[3]), Integer.parseInt(dadosFuncionario[4]),Integer.parseInt(dadosFuncionario[5]), 
						new Telefone((dadosFuncionario[5]), Integer.parseInt(dadosFuncionario[6])));
				dados.inserirEditarFuncionario(f, Integer.parseInt(dadosFuncionario[0]));
				return true;
		}
	}
	// a posicao 0 do vetor dadosFuncionario indica onde os dados devem ser inseridos
       
       	public boolean removerFuncionario(int i) {
		int qtdFuncionarios = dados.getQtdFuncionario();
		String funcionarioRemovido = dados.getFuncionario()[i].getNome();
		String aux;
		for (int j = 0; j < qtdFuncionario; j++) { 
			aux = dados.getVenda()[j].getFuncionario().getNome();
			if(funcionarioRemovido.compareTo(aux) == 0) 
				return false; //não é possível remover um cliente pois ele está associado a uma venda
		}
		
		if(i == (dados.getQtdFuncionario()- 1)) { // O cliente a ser removido está no final do array
			dados.setQtdFuncionario(dados.getQtdFuncionario()- 1);
			dados.getFuncionario()[dados.getQtdFuncionario()] = null;
			return true;
		} else { // o cliente a ser removido está no meio do array
			int cont = 0;
			while(dados.getFuncionario()[cont].getNome().compareTo(funcionarioRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdFuncionario()- 1; j++) {
				dados.getFuncionario()[j] = null;
				dados.getFuncionario()[j] = dados.getFuncionario()[j+1];
			}
			dados.getFuncionario()[dados.getQtdFuncionario()] = null;
			dados.setQtdFuncionario(dados.getQtdFuncionario() - 1);
                    return true;
		}
	}	    
}