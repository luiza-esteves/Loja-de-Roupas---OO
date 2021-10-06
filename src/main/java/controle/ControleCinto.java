package controle;

import java.text.ParseException;
import modelo.Cinto;
import modelo.Dados;

public class ControleCinto {

    private Cinto[] cinto;
    private int qtdCinto;
    private Dados dados = new Dados();

    public ControleCinto(ControleDados d) {
        cinto = d.getCinto();
        qtdCinto = d.getQtdEstoque();
    }

    public String[] getNomesCinto() {
        String[] s = new String[qtdCinto];
        for (int i = 0; i < qtdCinto; i++) {
            s[i] = cinto[i].getNome();
        }

        return s;
    }

}
