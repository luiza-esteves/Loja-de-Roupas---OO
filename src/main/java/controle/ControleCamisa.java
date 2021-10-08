package controle;

import java.text.ParseException;
import modelo.Camisa;
import modelo.Dados;

/**
 * Classe que auxilia na montagem da tela onde as camisas aparecem
 * @author Luíza Esteves
 */
public class ControleCamisa {

    private Camisa[] c;
    private Camisa[] camisa;
    private int qtdCamisa;
    private Dados dados = new Dados();

    public ControleCamisa(ControleDados d) {
        camisa = d.getCamisa();
        qtdCamisa = d.getQtdEstoque();
    }
    
    /**
     * Método que junta todos os nomes de todas as camisas
     * @return um vetor de nomes
     */
    public String[] getNomesCamisa() {
        String[] s = new String[qtdCamisa];
        for (int i = 0; i < qtdCamisa; i++) {
            s[i] = camisa[i].getNome();
        }

        return s;
    }

}
