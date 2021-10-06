package modelo;

import java.util.Scanner;

public class Venda {

    Scanner ler = new Scanner(System.in);
    private Funcionario funcionario = new Funcionario();
    private Cliente cliente = new Cliente();
    private Calca calca = new Calca();
    private Camisa camisa = new Camisa();
    private Camiseta camiseta = new Camiseta();
    private Casaco casaco = new Casaco();
    private Cinto cinto = new Cinto();
    private Cropped cropped = new Cropped();
    private Macacao macacao = new Macacao();
    private Saia saia = new Saia();
    private Shorte shorte = new Shorte();

    private int codCompra;
    private double valorTotal;
    private String formaPagamento, nomeRoupa;

    public Venda() {

    }

    public Venda(int cod, double valorT, String formaPag, Funcionario func, Cliente c, String nomeRoupa) {
        this.codCompra = cod;
        this.valorTotal = valorT;
        this.formaPagamento = formaPag;
        this.funcionario = func;
        this.cliente = c;
        this.nomeRoupa = nomeRoupa;
    }

    @Override
    public String toString() {

        return ("Código da compra: \n" + codCompra
                + "Valor total: \n" + valorTotal
                + "Forma de pagamento: \n" + formaPagamento
                + "Vendedor: \n" + funcionario
                + "Cliente: \n" + cliente
                + "");

    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Calca getCalca() {
        return calca;
    }

    public void setCalca(Calca calca) {
        this.calca = calca;
    }

    public Camisa getCamisa() {
        return camisa;
    }

    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }

    public Camiseta getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(Camiseta camiseta) {
        this.camiseta = camiseta;
    }

    public Casaco getCasaco() {
        return casaco;
    }

    public void setCasaco(Casaco casaco) {
        this.casaco = casaco;
    }

    public Cinto getCinto() {
        return cinto;
    }

    public void setCinto(Cinto cinto) {
        this.cinto = cinto;
    }

    public Cropped getCropped() {
        return cropped;
    }

    public void setCropped(Cropped cropped) {
        this.cropped = cropped;
    }

    public Macacao getMacacao() {
        return macacao;
    }

    public void setMacacao(Macacao macacao) {
        this.macacao = macacao;
    }

    public Saia getSaia() {
        return saia;
    }

    public void setSaia(Saia saia) {
        this.saia = saia;
    }

    public Shorte getShorte() {
        return shorte;
    }

    public void setShorte(Shorte shorte) {
        this.shorte = shorte;
    }

    public Integer getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getNomeRoupa() {
        return nomeRoupa;
    }

    public void setNomeRoupa(String nomeRoupa) {
        this.nomeRoupa = nomeRoupa;
    }

}
