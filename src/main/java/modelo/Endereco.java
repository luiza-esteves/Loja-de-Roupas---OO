package modelo;

public class Endereco {

    private String cidade, estado, bairro;
    private int cep, rua, quadra, lote;

    public Endereco(String cidade, String estado, String bairro, int cep, int rua, int quadra, int lote) {
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.cep = cep;
        this.rua = rua;
        this.quadra = quadra;
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Cidade: " + cidade
                + "Estado: " + estado
                + "Bairro: " + bairro
                + "CEP: " + cep
                + "Rua: " + rua
                + "Quadra: " + quadra
                + "Lote: " + lote;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCEP() {
        return cep;
    }

    public void setCEP(int CEP) {
        this.cep = CEP;
    }

    public int getRua() {
        return rua;
    }

    public void setRua(int rua) {
        this.rua = rua;
    }

    public int getQuadra() {
        return quadra;
    }

    public void setQuadra(int quadra) {
        this.quadra = quadra;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

}
