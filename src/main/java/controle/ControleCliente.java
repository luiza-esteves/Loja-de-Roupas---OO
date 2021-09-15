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


    
    
       public boolean inserirCliente(Cliente dadosCliente) {
                boolean res = false;
		for (int j=0;j<qtdCliente;j++){
                    if(cliente[j]==null){
                        cliente[j]=dadosCliente;
                        res = true;
                    }
                }
                return res;
	}
       
       public boolean editarCliente(Cliente dadosCliente, int cpf) {
                boolean res = false;
		for (int j=0;j<qtdCliente;j++){
                    if(cliente[j].getCpf()==cpf){
                        cliente[j]=null;
                        cliente[j]=dadosCliente;
                        res = true;
                    }
                    
                }
                return res;
	}
       
       	public boolean removerCliente(int cpfCliente) {
            boolean res = false;
            for (int j=0;j<qtdCliente;j++){
                    if(cliente[j].getCpf()==cpfCliente){
                        cliente[j]=null;
                        res = true;
                    }
            }
            return res;
	}	    
}
