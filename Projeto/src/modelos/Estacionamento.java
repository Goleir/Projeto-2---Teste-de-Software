/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

public class Estacionamento {
    
    private ArrayList<Funcionario> listaFuncionarios;
    private ArrayList<Cliente> listaClientes;
    private Integer vagasLivre;
    private Integer vagasMoto;
    private Integer vagasAuto;
    private Integer vagasDefi;
    public Gerente gerente;

    public Estacionamento(){
        listaFuncionarios = new ArrayList<Funcionario>();
        listaClientes = new ArrayList<Cliente>();
        vagasMoto = 20;
        vagasDefi = 30;
        vagasAuto = 250;
        vagasLivre = vagasAuto + vagasDefi + vagasMoto;        
    }
    
    public void cadastraFuncionario(Funcionario func) {
        listaFuncionarios.add(func);
    }

    public Integer getQtdeFuncionariosCadastrados() {
        return listaFuncionarios.size();
    }
    
    public Integer getQtdeClientes(){
        return listaClientes.size();
    }

    public void registraEntrada(String placa, Integer hora, String tipoCliente) {
        
        if(vagasLivre == 0){
            System.out.println("Estacionamento Lotado!\n\n");
        }
        else{
            Cliente cliente = new Cliente(placa, hora, tipoCliente);
            listaClientes.add(cliente);
            vagasLivre--;
          
        }       
        
    }

   
    
    
    public Integer getVagasLivre() {
        return vagasLivre;
    }

    public void cadastraGerente(String nome, Integer cpf) {
        
        
        Gerente gerente = new Gerente(nome, cpf);
        listaFuncionarios.add(gerente);
    
        if(this.gerente == null){
            this.gerente = gerente;
        }
             
        
    }
    
    public void cadastraCaixa(String nome, Integer cpf) {
        listaFuncionarios.add(new Caixa(nome, cpf));
    }
    
    public void cadastraManobrista(String nome, Integer cpf){
        listaFuncionarios.add(new Manobrista(nome,cpf));
    }

    public void registraSaida(String placa, Integer horaSaida) {
        
        for(Cliente cli : listaClientes){
            if(placa.equals(cli.getPlaca())){
                Pagamento.pagar(cli, horaSaida);
                listaClientes.remove(cli);
                vagasLivre++;
            }
        }
        
    }
      
}
