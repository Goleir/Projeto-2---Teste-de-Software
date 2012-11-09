/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

public class Estacionamento {
    
    private ArrayList<Funcionario> listaFuncionarios;
    private Integer quantidadeVagas;

    public Estacionamento(){
        listaFuncionarios = new ArrayList<Funcionario>();
        
    }
    
    public void cadastraFuncionario(String nome, Integer cpf) {
        Funcionario func = new Funcionario(nome, cpf);
        listaFuncionarios.add(func);
    }

    public Integer getQtdeFuncionariosCadastrados() {
        return listaFuncionarios.size();
    }
    
}
