package controle;
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



    public void setCalca(Calca[] calca) {
        this.calca = calca;
    }

    public String getLavagem(int i) {		
        return calca[i].getLavagem();
    }

    public String getTipoCalca(int i) {		
        return calca[i].getTipoCalca();
    }
    public String getCos(int i) {		
        return calca[i].getCos();
    }

    public String getNome(int i) {
        return calca[i].getNome();
    }
    public String getTamanho(int i) {
        return calca[i].getTamanho();
    }
    public String getCor(int i) {
        return calca[i].getCor();
    }
    public String getMaterial(int i) {
        return calca[i].getMaterial();
    }
    public String getMarca(int i) {
        return calca[i].getMarca();
    }
    public String getCategoria(int i) {
        return calca[i].getCategoria();
    }
    public String getGenero(int i) {
        return calca[i].getGenero();
    }
    public String getEstampa(int i) {
        return calca[i].getEstampa();
    }
    public String getComprimento(int i) {
        String compr = String.valueOf(calca[i].getComprimento());
        return compr;
    }
    public String getPreco(int i) {
        String compr = String.valueOf(calca[i].getPreco());
        return compr;
    }

    public int getQtdCalca() {
        return qtdCalca;
    }

    public void setQtdCalca(int qtdCalca) {
        this.qtdCalca = qtdCalca;
    }

    public Dados getDados() {
        return dados;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }

}
