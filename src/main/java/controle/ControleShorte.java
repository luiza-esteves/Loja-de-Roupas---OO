package controle;

import java.text.ParseException;
import modelo.Dados;
import modelo.Shorte;

/**
 * Classe que auxilia na montagem da tela onde os shortes aparecem
 * @author Luíza Esteves
 */
public class ControleShorte {

    private Shorte[] shorte;
    private int qtdShorte;
    private Dados dados = new Dados();

    public ControleShorte(ControleDados d) {
        shorte = d.getShorte();
        qtdShorte = d.getQtdEstoque();
    }

    /**
     * Método que junta todos os nomes de todos os shortes
     * @return um vetor de nomes
     */
    public String[] getNomesShorte() {
        String[] s = new String[qtdShorte];
        for (int i = 0; i < qtdShorte; i++) {
            s[i] = shorte[i].getNome();
        }

        return s;
    }

}
