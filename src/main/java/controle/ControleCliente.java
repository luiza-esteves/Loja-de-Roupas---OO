package controle;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import modelo.*;

public class ControleCliente {
       
        private Cliente[] cliente;
        private int qtdCliente;
        private Dados dados = new Dados();

        public ControleCliente(ControleDados d) {
            cliente = d.getCliente();
            qtdCliente = d.getQtdCliente();
        }

        public String[] getNomesCliente() {
                    String[] s = new String[qtdCliente];
                    for(int i = 0; i < qtdCliente; i++) {
                            s[i] = cliente[i].getNome();
                    }

                    return s;
        }
        
        public int getQtdCliente() {
                    return qtdCliente;
        }

        public void setQtdCliente(int qtd) {
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


    
    
	public boolean inserirEditarCliente(String[] dadosClientes) throws ParseException {
		if(!dadosClientes[3].matches("[0-9]+") || !dadosClientes[5].matches("[0-9]+") || 
				  !dadosClientes[6].matches("[0-9]+")) {
			return false;
		} else {
				Cliente c = new Cliente(Integer.parseInt(dadosClientes[2]), dadosClientes[1], Integer.parseInt(dadosClientes[3]), 
					new Telefone(Integer.parseInt(dadosClientes[5]),Integer.parseInt(dadosClientes[6])), 
                                        new Endereco(dadosClientes[9],dadosClientes[10],dadosClientes[7],Integer.parseInt(dadosClientes[8]),
                                            Integer.parseInt(dadosClientes[13]),Integer.parseInt(dadosClientes[12]),Integer.parseInt(dadosClientes[11])
                                        ),
                                        dadosClientes[4]
								);
				dados.inserirEditarCliente(c, Integer.parseInt(dadosClientes[0]));
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
