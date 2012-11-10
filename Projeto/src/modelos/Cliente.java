/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author 30973491
 */
public class Cliente {
    
    private final String placa;
    private final Integer horarioEntrada;
    private final String tipoCliente;

    public Cliente(String placa, Integer horarioEntrada, String tipoCliente) {
        this.placa = placa;
        this.horarioEntrada = horarioEntrada;
        this.tipoCliente = tipoCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public Integer getHorarioEntrada() {
        return horarioEntrada;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    
    
    
        
    
}
