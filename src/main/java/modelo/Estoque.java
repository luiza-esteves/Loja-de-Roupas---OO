package modelo;

import java.util.Scanner;

    
public class Estoque {
     Scanner ler = new Scanner(System.in);
     
     private Calca calca = new Calca();
     private Camisa camisa = new Camisa();
     private Camiseta camiseta = new Camiseta();
     private Casaco casaco = new Casaco();
     private Cinto cinto = new Cinto();
     private Cropped cropped = new Cropped();
     private Macacao macacao = new Macacao();
     private Saia saia = new Saia();
     private Shorte shorte = new Shorte();
     
     
     private  int qtdDispobnivel,codRoupa;
     private String nomeRoupa;
     
     public Estoque(){
         super();
     }

      public Estoque(String nome, int qtd,int codRoupa, int codEstoque){
          
          this.qtdDispobnivel=qtd;
          nomeRoupa = nome;
          this.codRoupa=1; 
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
