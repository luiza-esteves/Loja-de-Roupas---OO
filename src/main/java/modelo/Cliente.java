package modelo;
import java.util.Date;

import java.util.Scanner;

public class Cliente extends Pessoa {
    Scanner ler = new Scanner(System.in);
    private int totalCompras;
    
    public Cliente(){
        super();
    }
    
    public Cliente(int totalCompras, String n, int cp, Telefone t, Endereco e,String d) {
        this.totalCompras = totalCompras;
        this.nome = n;
        this.cpf = cp;
        this.telefone = t;
        this.endereco = e;
        this.dataNascimento = d;
           
    }
    
    public void cadastrarVenda(){
        int qtd;
        totalCompras=this.totalCompras++;
    }
    
     @Override
        public String toString() {
		return "Nome:" + nome+
                        "Cpf:" + cpf+
                        "Telefone:" + telefone+
                        "Endereço:" + endereco+
                        "Data de nascimento:" + dataNascimento+
                        "Total de compras:" + totalCompras;
	}

    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }

    public int getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
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
