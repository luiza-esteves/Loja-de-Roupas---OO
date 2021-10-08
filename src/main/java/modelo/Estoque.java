package modelo;

import java.util.Scanner;

/**
 * Classe que modela os estoques de todas as roupas
 * @author Luíza Esteves
 */
public class Estoque {

    Scanner ler = new Scanner(System.in);

    private int qtdDispobnivel, codRoupa;
    private String nomeRoupa;

    public Estoque() {
        super();
    }

    public Estoque(String nome, int qtd, int codRoupa, int codEstoque) {

        this.qtdDispobnivel = qtd;
        nomeRoupa = nome;
        this.codRoupa = 1;
    }

    public int getQtdDispobnivel() {
        return qtdDispobnivel;
    }

    public void setQtdDispobnivel(int qtdDispobnivel) {
        this.qtdDispobnivel = qtdDispobnivel;
    }

    public int getCodRoupa() {
        return codRoupa;
    }

    public void setCodRoupa(int codRoupa) {
        this.codRoupa = codRoupa;
    }

    public String getNomeRoupa() {
        return nomeRoupa;
    }

    public void setNomeRoupa(String nomeRoupa) {
        this.nomeRoupa = nomeRoupa;
    }

}
