package controle;

import java.text.ParseException;
import modelo.Camisa;
import modelo.Dados;


public class ControleCamisa {

    private Camisa[] c;
     private Camisa[] camisa;
        private int qtdCamisa;
        private Dados dados = new Dados();

        public ControleCamisa(ControleDados d) {
            camisa = d.getCamisa();
            qtdCamisa = d.getQtdEstoque();
        }
        
        public String[] getNomesCamisa() {
                    String[] s = new String[qtdCamisa];
                    for(int i = 0; i < qtdCamisa; i++) {
                            s[i] = camisa[i].getNome();
                    }

                    return s;
        }
        
        
    
}
