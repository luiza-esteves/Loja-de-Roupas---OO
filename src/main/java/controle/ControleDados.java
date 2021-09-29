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
                                aux = dados.getVenda()[j].getCalca().getNome();
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
                                aux = dados.getVenda()[j].getCamiseta().getNome();
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
    
        public boolean inserirEditarCasaco(String[] dadosCasaco) throws ParseException {
		if(!dadosCasaco[3].matches("[0-9]+") || !dadosCasaco[5].matches("[0-9]+") || 
				  !dadosCasaco[6].matches("[0-9]+")) {
			return false;
		} else {
			Casaco c = new Casaco(dadosCasaco[12], dadosCasaco[13], dadosCasaco[14],Integer.parseInt(dadosCasaco[1]),
                                        dadosCasaco[2],dadosCasaco[3],dadosCasaco[4],dadosCasaco[5],dadosCasaco[6],
                                        dadosCasaco[7],dadosCasaco[8],dadosCasaco[9],Double.parseDouble(dadosCasaco[10]),Double.parseDouble(dadosCasaco[11]));
			dados.inserirEditarCasaco(c, Integer.parseInt(dadosCasaco[0]));
			return true;
		}
	}
       
        public boolean removerCasaco(int i) {
                        int qtdCasaco = dados.getQtdCasaco();
                        String casacoRemovida = dados.getCasaco()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdCasaco; j++) { 
                               aux = dados.getVenda()[j].getCasaco().getNome();
                                if(casacoRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdCasaco()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdCasaco(dados.getQtdCasaco() - 1);
			dados.getCasaco()[dados.getQtdCasaco()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getCasaco()[cont].getNome().compareTo(casacoRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdCasaco() - 1; j++) {
				dados.getCasaco()[j] = null;
				dados.getCasaco()[j] = dados.getCasaco()[j+1];
			}
			dados.getCasaco()[dados.getQtdCasaco()] = null;
			dados.setQtdCasaco(dados.getQtdCasaco() - 1);
			return true;
		}
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
                                aux = dados.getVenda()[j].getCinto().getNome();
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
        
        public boolean inserirEditarCropped(String[] dadosCropped) throws ParseException {
		if(!dadosCropped[3].matches("[0-9]+") || !dadosCropped[5].matches("[0-9]+") || 
				  !dadosCropped[6].matches("[0-9]+")) {
			return false;
		} else {
			Cropped c = new Cropped(dadosCropped[12], dadosCropped[13], dadosCropped[14],Integer.parseInt(dadosCropped[1]),
                                        dadosCropped[2],dadosCropped[3],dadosCropped[4],dadosCropped[5],dadosCropped[6],
                                        dadosCropped[7],dadosCropped[8],dadosCropped[9],Double.parseDouble(dadosCropped[10]),Double.parseDouble(dadosCropped[11]));
			dados.inserirEditarCropped(c, Integer.parseInt(dadosCropped[0]));
			return true;
		}
	}
       
        public boolean removerCropped(int i) {
                        int qtdCropped = dados.getQtdCropped();
                        String croppedRemovida = dados.getCropped()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdCropped; j++) { 
                                aux = dados.getVenda()[j].getCropped().getNome();
                                if(croppedRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdCropped()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdCropped(dados.getQtdCropped() - 1);
			dados.getCropped()[dados.getQtdCropped()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getCropped()[cont].getNome().compareTo(croppedRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdCropped() - 1; j++) {
				dados.getCropped()[j] = null;
				dados.getCropped()[j] = dados.getCropped()[j+1];
			}
			dados.getCropped()[dados.getQtdCropped()] = null;
			dados.setQtdCropped(dados.getQtdCropped() - 1);
			return true;
		}
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
        
        public boolean inserirEditarSaia(String[] dadosSaia) throws ParseException {
		if(!dadosSaia[3].matches("[0-9]+") || !dadosSaia[5].matches("[0-9]+") || 
				  !dadosSaia[6].matches("[0-9]+")) {
			return false;
		} else {
			Saia c = new Saia(dadosSaia[12], dadosSaia[13],Integer.parseInt(dadosSaia[1]),
                                        dadosSaia[2],dadosSaia[3],dadosSaia[4],dadosSaia[5],dadosSaia[6],
                                        dadosSaia[7],dadosSaia[8],dadosSaia[9],Double.parseDouble(dadosSaia[10]),Double.parseDouble(dadosSaia[11]));
			dados.inserirEditarSaia(c, Integer.parseInt(dadosSaia[0]));
			return true;
		}
	}
       
        public boolean removerSaia(int i) {
                        int qtdSaia = dados.getQtdSaia();
                        String saiaRemovida = dados.getSaia()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdSaia; j++) { 
                                aux = dados.getVenda()[j].getSaia().getNome();
                                if(saiaRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdSaia()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdSaia(dados.getQtdSaia() - 1);
			dados.getSaia()[dados.getQtdSaia()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getSaia()[cont].getNome().compareTo(saiaRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdSaia() - 1; j++) {
				dados.getSaia()[j] = null;
				dados.getSaia()[j] = dados.getSaia()[j+1];
			}
			dados.getSaia()[dados.getQtdSaia()] = null;
			dados.setQtdSaia(dados.getQtdSaia() - 1);
			return true;
		}
        }
        
        public boolean inserirEditarShorte(String[] dadosShorte) throws ParseException {
		if(!dadosShorte[3].matches("[0-9]+") || !dadosShorte[5].matches("[0-9]+") || 
				  !dadosShorte[6].matches("[0-9]+")) {
			return false;
		} else {
			Shorte c = new Shorte(dadosShorte[12], dadosShorte[13],Integer.parseInt(dadosShorte[1]),
                                        dadosShorte[2],dadosShorte[3],dadosShorte[4],dadosShorte[5],dadosShorte[6],
                                        dadosShorte[7],dadosShorte[8],dadosShorte[9],Double.parseDouble(dadosShorte[10]),Double.parseDouble(dadosShorte[11]));
			dados.inserirEditarShorte(c, Integer.parseInt(dadosShorte[0]));
			return true;
		}
	}
       
        public boolean removerShorte(int i) {
                        int qtdShorte = dados.getQtdShorte();
                        String shorteRemovida = dados.getShorte()[i].getNome();
                        String aux;
                        for (int j = 0; j < qtdShorte; j++) { 
                                aux = dados.getVenda()[j].getShorte().getNome();
                                if(shorteRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover a calça, pois ela está vinculada à uma venda
                        }
                        
                    if(i == (dados.getQtdShorte()- 1)) { // A calça a ser removido está no final do array
			dados.setQtdShorte(dados.getQtdShorte() - 1);
			dados.getShorte()[dados.getQtdShorte()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getShorte()[cont].getNome().compareTo(shorteRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdShorte() - 1; j++) {
				dados.getShorte()[j] = null;
				dados.getShorte()[j] = dados.getShorte()[j+1];
			}
			dados.getShorte()[dados.getQtdShorte()] = null;
			dados.setQtdShorte(dados.getQtdShorte() - 1);
			return true;
		}
        }
               public boolean inserirEditarEstoqueCalca(Calca dadosEstoque, int qtd) throws ParseException {
                
                        Estoque e = new Estoque(dadosEstoque,qtd,1);
                        dados.inserirEditarEstoque(e, qtd);                        
                  
			
			return true;
    }
    
        
       
    
}