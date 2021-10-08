package controle;

import java.text.ParseException;
import modelo.Macacao;
import modelo.Dados;

/**
 * Classe que auxilia na montagem da tela onde os macacões aparecem
 * @author Luíza Esteves
 */
public class ControleMacacao {

    private Macacao[] macacao;
    private int qtdMacacao;
    private Dados dados = new Dados();

    public ControleMacacao(ControleDados d) {
        macacao = d.getMacacao();
        qtdMacacao = d.getQtdEstoque();
    }

    /**
     * Método que junta todos os nomes de todos os macacões
     * @return um vetor de nomes
     */
    public String[] getNomesMacacao() {
        String[] s = new String[qtdMacacao];
        for (int i = 0; i < qtdMacacao; i++) {
            s[i] = macacao[i].getNome();
        }

        return s;
    }

}
