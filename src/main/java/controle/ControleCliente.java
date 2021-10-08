package controle;

import modelo.*;

/**
 * Classe que auxilia na montagem da tela onde os clientes aparecem
 * @author Luíza Esteves
 */
public class ControleCliente {

    private Cliente[] cliente;
    private int qtdCliente;
    private Dados dados = new Dados();

    public ControleCliente(ControleDados d) {
        cliente = d.getCliente();
        qtdCliente = d.getQtdCliente();
    }
    
    /**
     * Método que junta todos os nomes de todos os clientes
     * @return um vetor de nomes
     */
    public String[] getNomesCliente() {
        String[] s = new String[qtdCliente];
        for (int i = 0; i < qtdCliente; i++) {
            s[i] = cliente[i].getNome();
            
        }

        return s;
    }
    
    /**
     * Método que retorna um cliente através de seu nome
     * @return cliente
     */
    public Cliente getCliente(String nome) {
        Cliente c = null;
        for (int i = 0; i < qtdCliente; i++) {
            if (nome.equals(cliente[i].getNome())) {
                c = cliente[i];
            }

        }
        return c;
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

}
