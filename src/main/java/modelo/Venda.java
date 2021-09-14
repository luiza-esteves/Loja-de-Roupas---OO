
package modelo;

import java.util.Scanner;

public class Venda {
    Scanner ler = new Scanner(System.in);
    private int codCompra, totalVendas;
    private double valorTotal;
    private String formaPagamento;
    private Funcionario funcionario;
    private Cliente cliente;
    private Estoque estoque;
    

    
    public Venda(){
        super();
    }

    public Venda(int codCompra, double valorTotal, String formaPagamento, Funcionario funcionario, Cliente cliente, Estoque estoque) {
        this.codCompra = codCompra;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.estoque = estoque;
        
    }


    
    public void cadastrarVenda(){
        int qtd;
        long func;
  
    }
    
    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }

    public int getCodCompra() {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
    
    
    
}
