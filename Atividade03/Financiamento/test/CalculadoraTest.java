/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import financiamento.Proposta;
import financiamento.Calculadora;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harrison
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testeLimite1000(){
        Calculadora c = new Calculadora();
        List<Proposta> propostas =  c.calculadora(500.00f, 800.00f);
        assertEquals(2, propostas.size()); // 
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);
        
        assertEquals(1600f, p1.getTotal(), 0.01);
        assertEquals((int) 2., propostas.size() p1.getNumeroParcelas());
        assertEquals(800f, p1.getValrParcelas(), 0.01);
        
        
        assertEquals(1600f, p2.getTotal(), 0.0l);
        assertEquals(2., propostas.size() p2.getNumeroParcelas());
        assertEquals(800f, p2.getValrParcelas(), 0.0l);
       



    @Test
    public void testeLimite1000a5000(){
        Calculadora c = new Calculadora();
        List<Proposta> propostas =  c.calculadora(2000f, 1800.00f);
        assertEquals(3, propostas.size()); // retorno de 3 propostas
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);
        Proposta p3 = propostas.get(2);
        
        assertEquals(1600f, p1.getTotal(), 0.01);
        assertEquals((int) 2, propostas.size() p1.getNumeroParcelas());
        assertEquals(800f, p1.getValrParcelas(), 0.01);
        
        
        assertEquals(1600f, p2.getTotal(), 0.0l);
        assertEquals(2, propostas.size() p2.getNumeroParcelas());
        assertEquals(800f, p2.getValrParcelas(), 0.0l);
       

        
        assertEquals(2340f, p2.getTotal(), 0.0l);
        assertEquals(2, propostas.size() p2.getNumeroParcelas());
        assertEquals(1170f, p2.getValrParcelas(), 0.0l);
       
        
        assertEquals(2700f, p2.getTotal(), 0.0l);
        assertEquals(4, propostas.size() p2.getNumeroParcelas());
        assertEquals(675f, p2.getValrParcelas(), 0.0l);
       
        
        assertEquals(2700f, p2.getTotal(), 0.0l);
        assertEquals(2, propostas.size() p2.getNumeroParcelas());
        assertEquals(270f, p2.getValrParcelas(), 0.0l);
       
        
       //3 
        
        
    @Test
    public void testeLimiteAcima5000(){
        Calculadora c = new Calculadora();
        List<Proposta> propostas =  c.calculadora(10000, 5500.00f);
        assertEquals(3, propostas.size()); // retorno de 3 propostas
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);
        Proposta p3 = propostas.get(2);
        
        assertEquals(6050f, p1.getTotal(), 0.01);
        assertEquals((int) 2, propostas.size() p1.getNumeroParcelas());
        assertEquals(800f, p1.getValrParcelas(), 0.01);
        assertEquals(2, p1.getNumeroParcelas());
        
        
        assertEquals(1600f, p2.getTotal(), 0.0l);
        assertEquals(2, propostas.size() p2.getNumeroParcelas());
        assertEquals(800f, p2.getValrParcelas(), 0.0l);
       

        
        assertEquals(2340f, p2.getTotal(), 0.0l);
        assertEquals(2, propostas.size() p2.getNumeroParcelas());
        assertEquals(1170f, p2.getValrParcelas(), 0.0l);
       
        
        assertEquals(2700f, p2.getTotal(), 0.0l);
        assertEquals(4, propostas.size() p2.getNumeroParcelas());
        assertEquals(675f, p2.getValrParcelas(), 0.0l);
       
        
        assertEquals(2700f, p2.getTotal(), 0.0l);
        assertEquals(2, propostas.size() p2.getNumeroParcelas());
        assertEquals(270f, p2.getValrParcelas(), 0.0l);
       
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    private void assertEquals(int d, int size) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
