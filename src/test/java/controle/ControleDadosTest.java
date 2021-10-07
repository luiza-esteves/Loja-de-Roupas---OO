/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Dados;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luiza
 */
public class ControleDadosTest {
    Dados dados = new Dados();
    ControleDados controle = new ControleDados();
    ControleVenda v = new ControleVenda(controle);
    private final String[] cliente = {Integer.toString(dados.getQtdCliente()),"Luíza","6","678908654",
        "10/05/2002","061","999999999",
        "Bairro","709875432","Cidade","Estado","5","34","1"};
    private final String[] cliente2 = {Integer.toString(dados.getQtdCliente()),"Luíza",
        "orientação a objetos","j","10/05/2002","061","999999999",
        "Bairro","709875432","Cidade","Estado","5","34","1"};
    private final String[] cliente3 = {Integer.toString(dados.getQtdCliente()),"Luíza",
        "orientação a objetos","j","10/05/2002","061","999999999",
         "Bairro","709875432","Estado","5","34","1"};
    private final String[] venda ={Integer.toString(dados.getQtdVenda()),"789", "12","nome0","43", "cartão", 
        "Nome: 0", "nome0"};
    


    @Test
    public void testInserirCliente() {
        
        boolean valor = controle.inserirEditarCliente(cliente);
        assertEquals(true, valor);
        
    }
    
    @Test
    public void testInserirClienteErro() {  // passando letras em regiões que só aceitam números      
        boolean valor = controle.inserirEditarCliente(cliente2);
        assertEquals(false, valor);
    
        
    }
    
    @Test
    public void testInserirClienteCampoVazio() {  // passando campos vazios    
        boolean valor = controle.inserirEditarCliente(cliente3);
        assertEquals(false, valor);
    
        
    }
    
    @Test
    public void testRemoverClienteCompra() {  //passando cliente com histórico de compras 
        boolean resultado = controle.removerCliente(0);
        assertEquals(false, resultado);
        
    }
    
    @Test
    public void testRemoverCliente() {  //passando cliente com histórico de compras 
        boolean resultado = controle.removerCliente(4);
        assertEquals(false, resultado);
        
    }

    @Test
    public void testInserirEditarVenda() {
        
        
        boolean resultado = controle.inserirEditarVenda(venda);
        assertEquals(true, resultado);
    }

}
