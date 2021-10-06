package modelo;

import java.util.Scanner;

public class Cropped extends Roupa {

    Scanner ler = new Scanner(System.in);

    private String estilo, modelagem, manga;

    public Cropped() {
        super();
    }

    public Cropped(String estilo, String modelagem, String manga, int c,
            String no, String t, String cor, String mat, String marca, String categ,
            String gen, String est, double comp, double pr) {
        this.estilo = estilo;
        this.modelagem = modelagem;
        this.manga = manga;
        this.codigo = c;
        this.nome = no;
        this.tamanho = t;
        this.cor = cor;
        this.material = mat;
        this.marca = marca;
        this.categoria = categ;
        this.genero = gen;
        this.estampa = est;
        this.comprimento = comp;
        this.preco = pr;
    }

    @Override
    public String toString() {
        return ("Nome: /n" + nome
                + "Código: /n" + codigo
                + "Tamanho: /n" + tamanho
                + "Cor: /n" + cor
                + "Material: " + material
                + "Marca: " + marca
                + "Categoria: " + categoria
                + "Gênero: " + genero
                + "Estampa: " + estampa
                + "Comprimento: " + comprimento
                + "Preço: " + preco
                + "Estilo: " + estilo
                + "Modelagem: " + modelagem
                + "Manga: " + manga);
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getModelagem() {
        return modelagem;
    }

    public void setModelagem(String modelagem) {
        this.modelagem = modelagem;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
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

    @Override
    public String getTamanho() {
        return tamanho;
    }

    @Override
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String getEstampa() {
        return estampa;
    }

    @Override
    public void setEstampa(String estampa) {
        this.estampa = estampa;
    }

    @Override
    public double getComprimento() {
        return comprimento;
    }

    @Override
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
