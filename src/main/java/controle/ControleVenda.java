package controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import modelo.*;

public class ControleVenda {
	Venda[] venda;
	private Dados dados = new Dados();
	private int codCompra; 
	private double valorTotal;
	private String formaPagamento;
	
	public ControleVenda(ControleDados d) {
		venda = d.getVendas();
		codCompra = d.getCodCompra();
		valorTotal = d.getValorTotal();
		formaPagamento = d.getFormaPagamento() ;
	}
	
	public String[] getCodigosCompras() {
		String[] s = new String[codCompra];
		for(int i = 0; i < codCompra; i++) {
			s[i] = venda[i].getCodCompra();
    }
	return s;
		
		
	}
	
		
}
