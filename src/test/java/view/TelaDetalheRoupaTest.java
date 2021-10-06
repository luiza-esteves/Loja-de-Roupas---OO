/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controle.ControleDados;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luiza
 */
public class TelaDetalheRoupaTest {
    ControleDados dados = new ControleDados();
    TelaDetalheRoupa tela = new TelaDetalheRoupa();
    

    @Test
    public void testInserirCalca() {
       int op=1;
       int pos=0;
       
       this.tela.inserirEditar(op, dados, new TelaRoupa(dados), pos);
 
    }
    
    @Test
    public void testEditarCamisa() {
       int op=11;
       int pos=0;
       
       this.tela.inserirEditar(op, dados, new TelaRoupa(dados), pos);
 
    }

    
    
}
