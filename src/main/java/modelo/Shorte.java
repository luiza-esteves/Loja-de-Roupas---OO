package modelo;

import java.util.Scanner;

/**
 * Classe filha de Roupa que possui características exclusivas dos shortes
 * @author Luíza Esteves
 */
public class Shorte extends Roupa {

    Scanner ler = new Scanner(System.in);

    private String tipoShort, tipoBoca;

    public Shorte() {
        super();
    }

    public Shorte(String tipoShort, String tipoBoca, int c,
            String no, String t, String cor, String mat, String marca, String categ,
            String gen, String est, double comp, double pr) {

        this.tipoShort = tipoShort;
        this.tipoBoca = tipoBoca;
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
                + "Tipo de Short: " + tipoShort
                + "Tipo de boca: " + tipoBoca);
    }

    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }

    public String getTipoShort() {
        return tipoShort;
    }

    public void setTipoShort(String tipoShort) {
        this.tipoShort = tipoShort;
    }

    public String getTipoBoca() {
        return tipoBoca;
    }

    public void setTipoBoca(String tipoBoca) {
        this.tipoBoca = tipoBoca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
