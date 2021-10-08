package controle;

import modelo.*;

/**
 * Classe que auxilia na montagem da tela onde as quantidades em estoque aparecem
 * @author Luíza Esteves
 */
public class ControleEstoque {

    Estoque[] estoque = new Estoque[100];
    private int qtdEstoque;

    public ControleEstoque(ControleDados d) {
        estoque = d.getEstoques();
        qtdEstoque = d.getQtdEstoque();
    }
    
    /**
     * Método que junta todos os nomes das roupas
     * @param op variável auxiliar que determina qual roupa está sendo
     * editada(se é uma calça, uma camisa, etc)
     * @return vetor de nomes
     */
    public String[] getNomesEstoques(int op) {

        String[] s = new String[qtdEstoque];
        for (int i = 0; i < qtdEstoque; i++) {
            if (estoque[i].getCodRoupa() == op) {
                s[i] = estoque[i].getNomeRoupa();
            }
        }

        return s;
    }
    
    /**
     * Método que altera as quantidades disponíveis em estoque
     * @param roupa uma peça de roupa
     * @return quantidade disponível
     */
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
    
    /**
     * Método que pega a quantidade disponível
     * @param roupa uma peça de roupa
     * @return quantidade disponível
     */
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
