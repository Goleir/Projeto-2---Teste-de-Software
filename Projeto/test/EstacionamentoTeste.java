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
        parking.cadastraGerente("Fernando", 12345);
        parking.cadastraCaixa("Rafinha", 23456);
        parking.cadastraManobrista("Caio",34567);
        
        Assert.assertEquals(Integer.valueOf(3), parking.getQtdeFuncionariosCadastrados());
        
    }
    @Test
    public void TesteDeRegistroDeEntrada(){
        Estacionamento parking = new Estacionamento();
        
        parking.cadastraGerente("Fernando", 12345);
        parking.registraEntrada("EJA-8312", Integer.valueOf(12), "Carro");
        parking.registraEntrada("EJB-3131", Integer.valueOf(14), "Moto");
        
        Assert.assertEquals(Integer.valueOf(2), parking.getQtdeClientes());
        
    }
    
    @Test
    public void TesteDeRegistroDeSaida(){
        Estacionamento parking = new Estacionamento();
        
        parking.cadastraCaixa("Fernando", 12345);
        parking.registraEntrada("EJA-8312", Integer.valueOf(12), "Carro");
        parking.registraEntrada("EJB-3131", Integer.valueOf(14), "Moto");
        parking.registraSaida("EJA-8312", Integer.valueOf(2));
        
        Assert.assertEquals(Integer.valueOf(1), parking.getQtdeClientes());
    }
    
    @Test
    public void TesteDeControleDeSituacaoDeVagas(){
        Estacionamento parking = new Estacionamento();
        
        parking.cadastraCaixa("Fernando", 12345);
        parking.registraEntrada("EJA-8312", Integer.valueOf(12), "Carro");
        parking.registraEntrada("EJB-3131", Integer.valueOf(14), "Moto");
        
        Assert.assertEquals(Integer.valueOf(298), parking.getVagasLivre());
        
    }
    


}
