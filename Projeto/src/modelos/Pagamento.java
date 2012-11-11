/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Casa
 */
public class Pagamento {
    
    public static void pagar(Cliente cli, Integer horaSaida){
        
        Integer totalHoras = horaSaida - cli.getHorarioEntrada();
        Integer totalAPagar = 0;
        
        if(totalHoras >= 0 || totalHoras <= 2){
         
            totalAPagar += 8;
        
        }
        
        else if(totalHoras > 2 ){
            totalAPagar = 8+ ((totalHoras-2)*2);
        }
        
    }
    
}
