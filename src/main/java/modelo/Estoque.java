package modelo;

import java.util.Scanner;


public class Estoque {
     Scanner ler = new Scanner(System.in);
     
     private  int qtdDispobnivel,codRoupa;
     
     public Estoque(){
         super();
     }

    public Estoque(int qtdDispobnivel, int codRoupa) {
        this.qtdDispobnivel = qtdDispobnivel;
        this.codRoupa = codRoupa;
    }
     
     public int venderEstoque(){
            int qtdTotal = this.qtdDispobnivel --;
            this.setQtdDispobnivel(qtdTotal);
            return qtdTotal;
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

    
     
     
     
}
