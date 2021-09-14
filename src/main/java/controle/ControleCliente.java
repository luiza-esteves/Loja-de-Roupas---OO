package controle;
import modelo.*;

public class ControleCliente {
        private Cliente[] cliente;
        private int qtdCliente;
        private Dados dados = new Dados();

        public ControleCliente(ControleDados d) {
            cliente = d.getCliente();
            qtdCliente = d.getQtdCliente();
        }


        public String[] getNomeCliente() {
                    String[] s = new String[qtdCliente];
                    for(int i = 0; i < qtdCliente; i++) {
                            s[i] = cliente[i].getNome();
                    }

                    return s;
        }
        
        public int getQtd() {
                    return qtdCliente;
        }

        public void setQtd(int qtd) {
                    this.qtdCliente = qtd;
        }
        
        public String getTotalCompra(int i) {		
            return String.valueOf(cliente[i].getTotalCompras());
        }

        public String getNome(int i) {		
                    return cliente[i].getNome();
        }

        public String getCPF(int i) {
                    String numCPF = String.valueOf(cliente[i].getCpf());
                    return numCPF;
        }

	
	public Telefone getTelefone(int i) {
		return cliente[i].getTelefone();
	}
        
        public Endereco getEndereco(int i) {
		return cliente[i].getEndereco();
	}
        
        public String getDataNascimento(int i) {
            String dataNascimento = String.valueOf(cliente[i].getDataNascimento());
            return dataNascimento;
        }

	public void setQtdCliente(int qtdCliente) {
		this.qtdCliente = qtdCliente;
	}
	
        public Cliente[] getCliente() {
            return cliente;
        }

        public void setCliente(Cliente[] cliente) {
            this.cliente = cliente;
        }

        public Dados getDados() {
            return dados;
        }

        public void setDados(Dados dados) {
            this.dados = dados;
        }

        public int getQtdCliente() {
            return qtdCliente;
        }
    
    
       public boolean inserirEditarCliente(String[] dadosCliente) {
		if(!dadosCliente[3].matches("[0-9]+") || !dadosCliente[4].matches("[0-9]+") || 
				!dadosCliente[5].matches("[0-9]+") || !dadosCliente[6].matches("[0-9]+")) {
			return false;
		} else {
				Cliente c = new Cliente(Integer.parseInt(dadosCliente[0]),dadosCliente[1], Integer.parseInt(dadosCliente[2]), 
						Integer.parseInt(dadosCliente[3]), Integer.parseInt(dadosCliente[4]),Integer.parseInt(dadosCliente[5]), 
						new Telefone((dadosCliente[5]), Integer.parseInt(dadosCliente[6])));
				dados.inserirEditarCliente(c, Integer.parseInt(dadosCliente[0]));
				return true;
		}
	}
	// a posicao 0 do vetor dadosClientes indica onde os dados devem ser inseridos
       
       	public boolean removerCliente(int i) {
		int qtdClientes = dados.getQtdCliente();
		String clienteRemovido = dados.getCliente()[i].getNome();
		String aux;
		for (int j = 0; j < qtdClientes; j++) { 
			aux = dados.getVenda()[j].getCliente().getNome();
			if(clienteRemovido.compareTo(aux) == 0) 
				return false; //não é possível remover um cliente pois ele está associado a uma venda
		}
		
		if(i == (dados.getQtdCliente()- 1)) { // O cliente a ser removido está no final do array
			dados.setQtdCliente(dados.getQtdCliente() - 1);
			dados.getCliente()[dados.getQtdCliente()] = null;
			return true;
		} else { // o cliente a ser removido está no meio do array
			int cont = 0;
			while(dados.getCliente()[cont].getNome().compareTo(clienteRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdCliente()- 1; j++) {
				dados.getCliente()[j] = null;
				dados.getCliente()[j] = dados.getCliente()[j+1];
			}
			dados.getCliente()[dados.getQtdCliente()] = null;
			dados.setQtdCliente(dados.getQtdCliente() - 1);
                    return true;
		}
	}	    
}
