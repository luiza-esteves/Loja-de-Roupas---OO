package controle;
import java.text.ParseException;
import modelo.*;

public class ControleCalca {

     private Calca[] calca;
        private int qtdCalca;
        private Dados dados = new Dados();

        public ControleCalca(ControleDados d) {
            calca = d.getCalca();
            qtdCalca = d.getQtdEstoque();
        }
        
        public String[] getNomesCalcas() {
                    String[] s = new String[qtdCalca];
                    for(int i = 0; i < qtdCalca; i++) {
                            s[i] = calca[i].getNome();
                    }

                    return s;
        }
        
        
}
