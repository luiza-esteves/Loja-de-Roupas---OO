package modelo;

import java.util.Scanner;

/**
 * Classe filha de Roupa que possui características exclusivas dos cintos
 * @author Luíza Esteves
 */
public class Cinto extends Roupa {
    Scanner ler = new Scanner(System.in);

    private String ocasiao;
    private double largura;
    
    public Cinto(){
        super();
    }
    
    public Cinto(String n) {
    	this.nome = n;
    }

    public Cinto(String ocasiao, double largura, int c, 
            String no, String t,String cor, String mat, String marca, String categ,
            String gen, String est, double comp, double pr) {
        this.ocasiao = ocasiao;
        this.largura = largura;
        this.codigo = c;
        this.nome = no;
        this.tamanho =t; 
        this.cor=cor;
        this.material= mat;
        this.marca=marca;
        this.categoria=categ;
        this.genero=gen;
        this.estampa=est;
        this.comprimento=comp;
        this.preco=pr;
    }
    
    @Override
    public String toString() {
        return("Nome: /n"+nome
                +"Código: /n"+codigo
                +"Tamanho: /n"+tamanho
                +"Cor: /n"+cor
                +"Material: "+material
                +"Marca: "+marca
                +"Categoria: "+categoria
                +"Gênero: "+genero
                +"Estampa: "+estampa
                +"Comprimento: "+comprimento
                +"Preço: "+preco
                +"Ocasião: "+ocasiao
                +"Largura: "+largura
                      
        );
    }
    

    public String getOcasiao() {
        return ocasiao;
    }

    public void setOcasiao(String ocasiao) {
        this.ocasiao = ocasiao;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstampa() {
        return estampa;
    }

    public void setEstampa(String estampa) {
        this.estampa = estampa;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
  
}
