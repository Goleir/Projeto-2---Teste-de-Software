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

    public Estacionamento(){
        listaFuncionarios = new ArrayList<Funcionario>();
        listaClientes = new ArrayList<Cliente>();
        vagasLivre = 300;        
    }
    
    public void cadastraFuncionario(String nome, Integer cpf) {
        Funcionario func = new Funcionario(nome, cpf);
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
                listaFuncionarios.add(new Gerente(nome, cpf));
    
    }

    public void cadastraCaixa(String nome, Integer cpf) {
        listaFuncionarios.add(new Caixa(nome, cpf));
    }
    
    public void cadastraManobrista(String nome, Integer cpf){
        listaFuncionarios.add(new Manobrista(nome,cpf));
    }
      
}
