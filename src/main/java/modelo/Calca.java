package modelo;
import java.util.Scanner;

public class Calca extends Roupa{
    Scanner ler = new Scanner(System.in);

    private String tipoCalca, cos, lavagem;
    
    public Calca(){
        super();
    }
    

    public Calca(String tipoCalca, String cos, String lavagem, int c, 
            String no, String t,String cor, String mat, String marca, String categ,
            String gen, String est, double comp, double pr){
        this.tipoCalca = tipoCalca;
        this.cos = cos;
        this.lavagem = lavagem;
        this.codigo = c;
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
                +"Tipo de Calça: "+tipoCalca
                +"Tipo de cós: "+cos
                +"Lavagem: "+lavagem              
        );
    }



    public String getTipoCalca() {
        return tipoCalca;
    }

    public void setTipoCalca(String tipoCalca) {
        this.tipoCalca = tipoCalca;
    }

    public String getCos() {
        return cos;
    }

    public void setCos(String cos) {
        this.cos = cos;
    }

    public String getLavagem() {
        return lavagem;
    }

    public void setLavagem(String lavagem) {
        this.lavagem = lavagem;
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