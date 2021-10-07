package controle;

import modelo.*;

public class ControleEstoque {

    Estoque[] estoque = new Estoque[100];
    private int qtdEstoque;

    public ControleEstoque(ControleDados d) {
        estoque = d.getEstoques();
        qtdEstoque = d.getQtdEstoque();
    }

    public String[] getNomesEstoques(int op) {

        String[] s = new String[qtdEstoque];
        for (int i = 0; i < qtdEstoque; i++) {
            if (estoque[i].getCodRoupa() == op) {
                s[i] = estoque[i].getNomeRoupa();
            }
        }

        return s;
    }

    public int alterarEstoque(String roupa) {
        int qtd = 0;
        for (int i = 0; i < qtdEstoque; i++) {
            if (estoque[i].getNomeRoupa() == roupa) {
                estoque[i].setQtdDispobnivel(estoque[i].getQtdDispobnivel() - 1);
                qtd = estoque[i].getQtdDispobnivel();
            }
        }

        return qtd;
    }

    public int qtdEstoque(String roupa) {
        int qtd = 0;

        for (int i = 0; i < qtdEstoque; i++) {
            if (estoque[i].getNomeRoupa().equals(roupa)) {
                qtd = estoque[i].getQtdDispobnivel();
            }
        }
        return qtd;
    }
}
