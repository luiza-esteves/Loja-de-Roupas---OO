package modelo;

import java.util.Date;

import java.util.Scanner;

public class Cliente extends Pessoa {

    Scanner ler = new Scanner(System.in);
    private int totalCompras;

    public Cliente() {
        super();
    }

    public Cliente(String n) {
        this.nome = n;
    }

    public Cliente(int totalCompras, String n, int cp, Telefone t, Endereco e, String d) {
        this.totalCompras = totalCompras;
        this.nome = n;
        this.cpf = cp;
        this.telefone = t;
        this.endereco = e;
        this.dataNascimento = d;

    }

    public void cadastrarVenda() {
        int qtd;
        totalCompras = this.totalCompras++;
    }

    @Override
    public String toString() {
        return "Nome:" + nome
                + "Cpf:" + cpf
                + "Telefone:" + telefone
                + "Endere�o:" + endereco
                + "Data de nascimento:" + dataNascimento
                + "Total de compras:" + totalCompras;
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

    @Override
    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public long getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public Telefone getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
