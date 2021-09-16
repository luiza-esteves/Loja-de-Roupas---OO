package controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import modelo.*;

public class ControleEstoque {
    Estoque[] estoque;
    private int qtdEstoque;
    private Dados dados = new Dados();
    
     public ControleEstoque(ControleDados d) {
            estoque = d.getEstoques();
            qtdEstoque = d.getQtdEstoque();
    }
     
    public String[] getNomesEstoques() {
                    String[] s = new String[qtdEstoque];
                    for(int i = 0; i < qtdEstoque; i++) {
                            s[i] = estoque[i].getNomeRoupa();
                    }

                    return s;
    }
    
    
}
