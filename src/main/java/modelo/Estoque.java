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
     
      public Estoque(Calca c, int qtd){
          this.calca = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = calca.getNome();
     }
      
      public Estoque(Camisa c, int qtd){
          this.camisa = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = camisa.getNome();
     }    
      public Estoque(Camiseta c, int qtd){
          this.camiseta = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = camiseta.getNome();
     }
      
    public Estoque(Casaco c, int qtd){
          this.casaco = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = casaco.getNome();
     }
           
     public Estoque(Cinto c, int qtd){
          this.cinto = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = cinto.getNome();
     }
     public Estoque(Cropped c, int qtd){
          this.cropped = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = cropped.getNome();
     }
     public Estoque(Macacao c, int qtd){
          this.macacao = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = macacao.getNome();
     }
     public Estoque(Saia c, int qtd){
          this.saia = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = saia.getNome();
     }
     public Estoque(Shorte c, int qtd){
          this.shorte = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = shorte.getNome();
     }
     
     
        

    public Calca getCalca() {
        return calca;
    }

    public void setCalca(Calca calca) {
        this.calca = calca;
    }

    public Camisa getCamisa() {
        return camisa;
    }

    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }

    public Camiseta getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(Camiseta camiseta) {
        this.camiseta = camiseta;
    }

    public Casaco getCasaco() {
        return casaco;
    }

    public void setCasaco(Casaco casaco) {
        this.casaco = casaco;
    }

    public Cinto getCinto() {
        return cinto;
    }

    public void setCinto(Cinto cinto) {
        this.cinto = cinto;
    }

    public Cropped getCropped() {
        return cropped;
    }

    public void setCropped(Cropped cropped) {
        this.cropped = cropped;
    }

    public Macacao getMacacao() {
        return macacao;
    }

    public void setMacacao(Macacao macacao) {
        this.macacao = macacao;
    }

    public Saia getSaia() {
        return saia;
    }

    public void setSaia(Saia saia) {
        this.saia = saia;
    }

    public Shorte getShorte() {
        return shorte;
    }

    public void setShorte(Shorte shorte) {
        this.shorte = shorte;
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
