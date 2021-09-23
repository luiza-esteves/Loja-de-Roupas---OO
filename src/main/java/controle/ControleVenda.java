package controle;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import modelo.*;

public class ControleVenda {
	Venda[] v;
	Venda[] venda;
	private Dados dados = new Dados();
	private int qtdVenda;
	
	public ControleVenda(ControleDados d) {
		venda = d.getVenda();
		qtdVenda = d.getQtdVenda();
	}
	
	
	public Integer[] getCodigosCompras() {
		Integer[] s = new Integer[qtdVenda];
		for(int i = 0; i < qtdVenda; i++) {
			s[i] = venda[i].getCodCompra();
		}
	return s;
	}

	public boolean inserirEditarVenda(String[] dadosVenda) {
		if(!dadosVenda[3].matches("[0-9]+") || !dadosVenda[5].matches("[0-9]+") || 
				  !dadosVenda[6].matches("[0-9]+")) {
			return false;
		} else {
			Venda v = new Venda(dadosCamiseta[12], dadosCamiseta[13],Integer.parseInt(dadosCamiseta[1]),
                                        dadosCamiseta[2],dadosCamiseta[3],dadosCamiseta[4],dadosCamiseta[5],dadosCamiseta[6],
                                        dadosCamiseta[7],dadosCamiseta[8],dadosCamiseta[9],Double.parseDouble(dadosCamiseta[10]),Double.parseDouble(dadosCamiseta[11]));
			dados.inserirEditarCamiseta(c, Integer.parseInt(dadosCamiseta[0]));
			return true;
		}
	}
	
    public boolean removerVenda(int i) {
        int qtdVenda = dados.getQtdVenda();
        int vendaRemovida = dados.getVenda()[i].getCodCompra();
        int aux;
        for (int j = 0; j < qtdVenda; j++) { 
                aux = dados.getVenda()[j];
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
