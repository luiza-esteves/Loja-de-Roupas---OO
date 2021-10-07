/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Cliente;
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
    private final String[] cliente = {Integer.toString(dados.getQtdCliente()),"Luíza","6","678908654","10/05/2002","061","999999999",
                                 "Bairro","709875432","Cidade","Estado","5","34","1"};
    private final String[] cliente2 = {Integer.toString(dados.getQtdCliente()),"Luíza","orientação a objetos","j","10/05/2002","061","999999999",
                                 "Bairro","709875432","Cidade","Estado","5","34","1"};
    private final String[] cliente3 = {Integer.toString(dados.getQtdCliente()),"Luíza","orientação a objetos","j","10/05/2002","061","999999999",
                                 "Bairro","709875432","Estado","5","34","1"};
    

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

//    @Test
//    public void testInserirEditarFuncionario() throws Exception {
//    }
//
//    @Test
//    public void testRemoverFuncionario() {
//    }
//
//    @Test
//    public void testInserirEditarVenda() {
//    }
//
//    @Test
//    public void testRemoverVenda() {
//    }
//
//    @Test
//    public void testGetNomesCalcas() {
//    }
//
//    @Test
//    public void testInserirEditarCalca() throws Exception {
//    }
//
//    @Test
//    public void testRemoverCalca() {
//    }
//
//    @Test
//    public void testInserirEditarCamisa() throws Exception {
//    }
//
//    @Test
//    public void testRemoverCamisa() {
//    }
//
//    @Test
//    public void testInserirEditarCamiseta() {
//    }
//
//    @Test
//    public void testRemoverCamiseta() {
//    }
//
//    @Test
//    public void testInserirEditarCasaco() throws Exception {
//    }
//
//    @Test
//    public void testRemoverCasaco() {
//    }
//
//    @Test
//    public void testInserirEditarCinto() throws Exception {
//    }
//
//    @Test
//    public void testRemoverCinto() {
//    }
//
//    @Test
//    public void testInserirEditarCropped() throws Exception {
//    }
//
//    @Test
//    public void testRemoverCropped() {
//    }
//
//    @Test
//    public void testInserirEditarMacacao() throws Exception {
//    }
//
//    @Test
//    public void testRemoverMacacao() {
//    }
//
//    @Test
//    public void testInserirEditarSaia() throws Exception {
//    }
//
//    @Test
//    public void testRemoverSaia() {
//    }
//
//    @Test
//    public void testInserirEditarShorte() throws Exception {
//    }
//
//    @Test
//    public void testRemoverShorte() {
//    }
//
//    @Test
//    public void testInserirEditarEstoqueCalca() throws Exception {
//    }
//
//    @Test
//    public void testInserirEditarEstoqueCamisa() throws Exception {
//    }
//
//    @Test
//    public void testInserirEditarEstoqueCamiseta() throws Exception {
//    }
//
//    @Test
//    public void testInserirEditarEstoqueCasaco() throws Exception {
//    }
//
//    @Test
//    public void testInserirEditarEstoqueCinto() throws Exception {
//    }
//
//    @Test
//    public void testInserirEditarEstoqueCropped() throws Exception {
//    }
//
//    @Test
//    public void testInserirEditarEstoqueMacacao() throws Exception {
//    }
//
//    @Test
//    public void testInserirEditarEstoqueSaia() throws Exception {
//    }
//
//    @Test
//    public void testInserirEditarEstoqueShorte() throws Exception {
//    }
//
//    @Test
//    public void testRemoverEstoqueCalca() {
//    }
//
//    @Test
//    public void testRemoverEstoqueCamisa() {
//    }
//
//    @Test
//    public void testRemoverEstoqueCamiseta() {
//    }
//
//    @Test
//    public void testRemoverEstoqueCasaco() {
//    }
//
//    @Test
//    public void testRemoverEstoqueCinto() {
//    }
//
//    @Test
//    public void testRemoverEstoqueCropped() {
//    }
//
//    @Test
//    public void testRemoverEstoqueMacacao() {
//    }
//
//    @Test
//    public void testRemoverEstoqueSaia() {
//    }
//
//    @Test
//    public void testRemoverEstoqueShorte() {
//    }
    
}
