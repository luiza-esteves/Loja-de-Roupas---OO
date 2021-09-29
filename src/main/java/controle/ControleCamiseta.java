
package controle;
        
import java.text.ParseException;
import modelo.Camiseta;
import modelo.Dados;
        
public class ControleCamiseta{

    private Camiseta[] c;
    private Camiseta[] camiseta;
    private int qtdCamiseta;
    private Dados dados = new Dados();

    public ControleCamiseta(ControleDados d) {
            camiseta = d.getCamiseta();
            qtdCamiseta = d.getQtdEstoque();
    }
        
        public String[] getNomesCamiseta() {
                    String[] s = new String[qtdCamiseta];
                    for(int i = 0; i < qtdCamiseta; i++) {
                            s[i] = camiseta[i].getNome();
                    }

                    return s;
        }
        
       
}


