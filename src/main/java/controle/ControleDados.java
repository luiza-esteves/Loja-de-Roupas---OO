
package controle;
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
    
     public Venda[] getVendas() {
	return this.dados.getVenda();
    }
    
    
    
    
}
