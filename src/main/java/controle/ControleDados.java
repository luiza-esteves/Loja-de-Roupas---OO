package controle;
import java.text.ParseException;
import modelo.*;

public class ControleDados {
    
    private Dados dados = new Dados();
    	
    public ControleDados() {
        dados.fillWithSomeData();
    }

    public Dados getDados() {
        return dados;
    }


    public void setDados(Dados dados) {
        this.dados = dados;
    }
    
    public Cliente[] getCliente() {
	return this.dados.getCliente();
    }
	
    public int getQtdCliente() {
	return this.dados.getQtdCliente();
    }
	
    public int getQtdFuncionarios() {
	return this.dados.getQtdFuncionario();
    }
	
    public Funcionario[] getFuncionarios() {
	return this.dados.getFuncionario();
    }
    
    public int getQtdEstoque() {
	return this.dados.getQtdEstoque();
    }
	
    public int getQtdVenda() {
    	return this.dados.getQtdVenda();
    }
    
    public Estoque[] getEstoques() {
	return this.dados.getEstoque();
    }
    
	
    public Calca[] getCalca() {
	return this.dados.getCalca();
    }
    
    public Camisa[] getCamisa() {
	return this.dados.getCamisa();
    }
    
    public Camiseta[] getCamiseta() {
	return this.dados.getCamiseta();
    }
    public Casaco[] getCasaco() {
	return this.dados.getCasaco();
    }
    public Cinto[] getCinto() {
	return this.dados.getCinto();
    }
    public Cropped[] getCropped() {
	return this.dados.getCropped();
    }
    public Macacao[] getMacacao() {
	return this.dados.getMacacao();
    }
    public Saia[] getSaia() {
	return this.dados.getSaia();
    }
    public Shorte[] getShorte() {
	return this.dados.getShorte();
    }
    
    public Venda[] getVenda() {
	return this.dados.getVenda();
    }
    
    
    
    	public boolean inserirEditarCliente(String[] dadosClientes){
           
		if(!dadosClientes[3].matches("[0-9]+") || !dadosClientes[5].matches("[0-9]+") || 
				  !dadosClientes[6].matches("[0-9]+")) {
                    
			return false;
		} else {
                    System.out.println("teste");
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
                        int qtdVendas = dados.getQtdVenda();
                        String clienteRemovido = dados.getCliente()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdVendas; j++) { 
                                aux = dados.getVenda()[j].getCliente().getNome();
                                if(clienteRemovido.compareTo(aux) == 0) 
                                        return false; //não é possível remover aluno pois ele está matriculado em um curso
                        }
                        
                    if(i == (dados.getQtdCliente() - 1)) { // O aluno a ser removido está no final do array
			dados.setQtdCliente(dados.getQtdCliente() - 1);
			dados.getCliente()[dados.getQtdCliente()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getCliente()[cont].getNome().compareTo(clienteRemovido) != 0) {
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
               
               
public boolean inserirEditarFuncionario(String[] dadosFuncionarios) throws ParseException {
		if(!dadosFuncionarios[3].matches("[0-9]+") || !dadosFuncionarios[5].matches("[0-9]+") || 
				  !dadosFuncionarios[6].matches("[0-9]+")) {
			return false;
		} else {
				Funcionario f = new Funcionario(Integer.parseInt(dadosFuncionarios[2]), dadosFuncionarios[1], Integer.parseInt(dadosFuncionarios[3]), 
					new Telefone(Integer.parseInt(dadosFuncionarios[5]),Integer.parseInt(dadosFuncionarios[6])), 
                                        new Endereco(dadosFuncionarios[9],dadosFuncionarios[10],dadosFuncionarios[7],Integer.parseInt(dadosFuncionarios[3]),
                                            Integer.parseInt(dadosFuncionarios[8]),Integer.parseInt(dadosFuncionarios[12]),Integer.parseInt(dadosFuncionarios[11])),
                                        dadosFuncionarios[4]
								);
				dados.inserirEditarFuncionario(f, Integer.parseInt(dadosFuncionarios[0]));
				return true;
		}
	}
       
       

       
       	public boolean removerFuncionario(int i) {
            int qtdVendas = dados.getQtdVenda();
              int qtdFuncionario = dados.getQtdFuncionario();
                        String funcionarioRemovido = dados.getFuncionario()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdVendas; j++) { 
                                aux = dados.getVenda()[j].getFuncionario().getNome();
                                if(funcionarioRemovido.compareTo(aux) == 0) 
                                        return false; //não é possível remover aluno pois ele está matriculado em um curso
                        }
                        
                    if(i == (qtdFuncionario - 1)) { // O aluno a ser removido está no final do array
			dados.setQtdFuncionario(dados.getQtdFuncionario() - 1);
			dados.getFuncionario()[dados.getQtdFuncionario()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getFuncionario()[cont].getNome().compareTo(funcionarioRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdFuncionario() - 1; j++) {
				dados.getFuncionario()[j] = null;
				dados.getFuncionario()[j] = dados.getFuncionario()[j+1];
			}
			dados.getFuncionario()[dados.getQtdFuncionario()] = null;
			dados.setQtdFuncionario(dados.getQtdFuncionario() - 1);
			return true;
		}
	}
    
    
}