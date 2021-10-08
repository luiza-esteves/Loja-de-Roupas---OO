package modelo;

import java.util.Date;

/**
 * Classe abstrata que modela atributos comuns a todas as pessoas do sistema
 * @author Luíza Esteves
 */
public abstract class Pessoa {

    protected String dataNascimento;
    protected String nome;
    protected long cpf;
    protected Telefone telefone;
    protected Endereco endereco;
    
    /**
     * Construtor padrão
     */
    public Pessoa() {
        super();
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
