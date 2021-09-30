package modelo;
import java.util.Date;

import java.util.Scanner;
public class Funcionario extends Pessoa {
    Scanner ler = new Scanner(System.in);
    
    private double salario;
    
    public Funcionario(){
        super();
    }
    
    public Funcionario(String n) {
    	this.nome = n;
    }
    
    public Funcionario(double salario,String n, int cp, Telefone t, Endereco e,String d) {
        this.salario = salario;
        this.nome = n;
        this.cpf = cp;
        this.telefone = t;
        this.endereco = e;
        this.dataNascimento = d;
    }
    
    @Override
        public String toString() {
		return "Nome:" + nome+
                        "Cpf:" + cpf+
                        "Telefone:" + telefone+
                        "Endereço:" + endereco+
                        "Data de nascimento:" + dataNascimento+
                        "Salário:" + salario;
	}
    
    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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