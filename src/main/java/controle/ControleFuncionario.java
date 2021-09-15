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
    
    
        public boolean inserirFuncionario(Funcionario dadosFuncionario) {
                boolean res = false;
		for (int j=0;j<qtdFuncionario;j++){
                    if(funcionario[j]==null){
                        funcionario[j]=dadosFuncionario;
                        res = true;
                    }
                }
                return res;
	}
       
       public boolean editarFuncionario(Funcionario dadosFuncionario, int cpf) {
                boolean res = false;
		for (int j=0;j<qtdFuncionario;j++){
                    if(funcionario[j].getCpf()==cpf){
                        funcionario[j]=null;
                        funcionario[j]=dadosFuncionario;
                        res = true;
                    }
                    
                }
                return res;
	}
       
       	public boolean removerFuncionario(int cpfFuncionario) {
            boolean res = false;
            for (int j=0;j<qtdFuncionario;j++){
                    if(funcionario[j].getCpf()==cpfFuncionario){
                        funcionario[j]=null;
                        res = true;
                    }
            }
            return res;
	}
}