package controle;

import modelo.Camiseta;
import modelo.Dados;

/**
 * Classe que auxilia na montagem da tela onde as camisetas aparecem
 * @author Luíza Esteves
 */
public class ControleCamiseta {

    private Camiseta[] c;
    private Camiseta[] camiseta;
    private int qtdCamiseta;
    private Dados dados = new Dados();

    public ControleCamiseta(ControleDados d) {
        camiseta = d.getCamiseta();
        qtdCamiseta = d.getQtdEstoque();
    }
    
    /**
     * Método que junta todos os nomes de todas as camisetas
     * @return um vetor de nomes
     */
    public String[] getNomesCamiseta() {
        String[] s = new String[qtdCamiseta];
        for (int i = 0; i < qtdCamiseta; i++) {
            s[i] = camiseta[i].getNome();
        }

        return s;
    }

}
