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

      public Estoque(Calca c, int qtd,int cod){
          this.calca = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = calca.getNome();
          this.codRoupa=1;
     }
      
      public Estoque(Camisa c, int qtd,int cod){
          this.camisa = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = camisa.getNome();
          this.codRoupa=2;
     }    
      public Estoque(Camiseta c, int qtd,int cod){
          this.camiseta = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = camiseta.getNome();
          this.codRoupa=3;
     }
      
    public Estoque(Casaco c, int qtd,int cod){
          this.casaco = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = casaco.getNome();
          this.codRoupa=4;
     }
           
     public Estoque(Cinto c, int qtd,int cod){
          this.cinto = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = cinto.getNome();
          this.codRoupa=5;
     }
     public Estoque(Cropped c, int qtd,int cod){
          this.cropped = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = cropped.getNome();
          this.codRoupa=6;
     }
     public Estoque(Macacao c, int qtd,int cod){
          this.macacao = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = macacao.getNome();
          this.codRoupa=7;
     }
     public Estoque(Saia c, int qtd,int cod){
          this.saia = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = saia.getNome();
          this.codRoupa=8;
     }
     public Estoque(Shorte c, int qtd,int cod){
          this.shorte = c;
          this.qtdDispobnivel=qtd;
          nomeRoupa = shorte.getNome();
          this.codRoupa=9;
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
