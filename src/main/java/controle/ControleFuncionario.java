package controle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.*;

public class ControleFuncionario {
    private SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy"); 
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
    
public boolean inserirEditarFuncionario(String[] dadosFuncionarios) throws ParseException {
		if(!dadosFuncionarios[3].matches("[0-9]+") || !dadosFuncionarios[5].matches("[0-9]+") || 
				  !dadosFuncionarios[6].matches("[0-9]+")) {
			return false;
		} else {
                    Date d = formato.parse(dadosFuncionarios[4]);
				Funcionario f = new Funcionario(Integer.parseInt(dadosFuncionarios[2]), dadosFuncionarios[1], Integer.parseInt(dadosFuncionarios[3]), 
					new Telefone(Integer.parseInt(dadosFuncionarios[5]),Integer.parseInt(dadosFuncionarios[6])), 
                                        new Endereco(dadosFuncionarios[9],dadosFuncionarios[10],dadosFuncionarios[7],Integer.parseInt(dadosFuncionarios[3]),
                                            Integer.parseInt(dadosFuncionarios[8]),Integer.parseInt(dadosFuncionarios[12]),Integer.parseInt(dadosFuncionarios[11])),
                                        d
								);
				dados.inserirEditarFuncionario(f, Integer.parseInt(dadosFuncionarios[0]));
				return true;
		}
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