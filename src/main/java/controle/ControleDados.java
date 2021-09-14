
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
    
    
    
    
}
