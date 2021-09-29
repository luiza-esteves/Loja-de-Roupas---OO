package controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import modelo.*;

public class ControleEstoque {
    Estoque[] estoque = new Estoque[100];
    private int qtdEstoque;
    private Dados dados = new Dados();
    
   
     public ControleEstoque(ControleDados d) {
            estoque = d.getEstoques();
            qtdEstoque = d.getQtdEstoque();
    }
     
    public String[] getNomesEstoques(int op) {
      
                    String[] s = new String[qtdEstoque];
                    for(int i = 0; i < qtdEstoque; i++) {
                        if(estoque[i].getCodRoupa()==op){
                            s[i] = estoque[i].getNomeRoupa();
                        }
                    }

                    return s;
    }
    
    
    public boolean inserirEditarEstoqueCamisa(Camisa dadosEstoque, int qtd) throws ParseException {             
                        Estoque e = new Estoque(dadosEstoque,qtd,2);
                        dados.inserirEditarEstoque(e, qtd);                        
                  
			
			return true;
    }
    public boolean inserirEditarEstoqueCamiseta(Camiseta dadosEstoque, int qtd) throws ParseException {             
                        Estoque e = new Estoque(dadosEstoque,qtd,3);
                        dados.inserirEditarEstoque(e, qtd);                        
			return true;
    }
    public boolean inserirEditarEstoqueCasaco(Casaco dadosEstoque, int qtd) throws ParseException {             
                        Estoque e = new Estoque(dadosEstoque,qtd,4);
                        dados.inserirEditarEstoque(e, qtd);                        
			return true;
    }
    
    public boolean inserirEditarEstoqueCinto(Cinto dadosEstoque, int qtd) throws ParseException {             
                        Estoque e = new Estoque(dadosEstoque,qtd,5);
                        dados.inserirEditarEstoque(e, qtd);                        
			return true;
    }
    
    public boolean inserirEditarEstoqueCropped(Cropped dadosEstoque, int qtd) throws ParseException {             
                        Estoque e = new Estoque(dadosEstoque,qtd,6);
                        dados.inserirEditarEstoque(e, qtd);                        
			return true;
    }
    
    public boolean inserirEditarEstoqueMacacao(Macacao dadosEstoque, int qtd) throws ParseException {             
                        Estoque e = new Estoque(dadosEstoque,qtd,7);
                        dados.inserirEditarEstoque(e, qtd);                        
			return true;
    }
    
    public boolean inserirEditarEstoqueSaia(Saia dadosEstoque, int qtd) throws ParseException {             
                        Estoque e = new Estoque(dadosEstoque,qtd,8);
                        dados.inserirEditarEstoque(e, qtd);                        
			return true;
    }
    
    public boolean inserirEditarEstoqueShorte(Shorte dadosEstoque, int qtd) throws ParseException {             
                        Estoque e = new Estoque(dadosEstoque,qtd,9);
                        dados.inserirEditarEstoque(e, qtd);                        
			return true;
    }
	
    
    public boolean removerEstoqueCalca(int i) {
                        int qtdCalca = dados.getQtdCalca();
                        int qtdVendas = dados.getQtdVenda();
                        String calcaRemovida = dados.getEstoque()[i].getNomeRoupa();
                        String aux;
                        for (int j = 0; j < qtdVendas; j++) { 
                                aux = dados.getVenda()[j].getCalca().getNome();
                                if(calcaRemovida.compareTo(aux) == 0) 
                                        return false; //não é possível remover aluno pois ele está matriculado em um curso
                        }
                        
                    if(i == (dados.getQtdCalca() - 1)) { // O aluno a ser removido está no final do array
			dados.setQtdCalca(dados.getQtdCalca() - 1);
			dados.getEstoque()[dados.getQtdCalca()] = null;
			return true;
                    } else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(dados.getEstoque()[cont].getNomeRoupa().compareTo(calcaRemovida) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < dados.getQtdCalca()- 1; j++) {
				dados.getEstoque()[j] = null;
				dados.getEstoque()[j] = dados.getEstoque()[j+1];
			}
			dados.getEstoque()[dados.getQtdEstoque()] = null;
			dados.setQtdEstoque(dados.getQtdEstoque() - 1);
			return true;
		}
        }
}
