/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import modelos.Estacionamento;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 30973491
 */
public class EstacionamentoTeste {
    
    
    @Test
    public void TesteDeCadastroDeFuncionario(){
        
        Estacionamento parking = new Estacionamento();
        parking.cadastraFuncionario("Fernando", 12345);
        parking.cadastraFuncionario("Rafinha", 23456);
        parking.cadastraFuncionario("Caio",34567);
        
        Assert.assertEquals(Integer.valueOf(3), parking.getQtdeFuncionariosCadastrados());
        
    }
    @Test
    public void TesteDeRegistroDeEntrada(){
    }
    
    @Test
    public void TesteDeRegistroDeSaida(){
    }
    
    @Test
    public void TesteDeControleDeSituacaoDeVagas(){
    }
    


}
