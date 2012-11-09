/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

public class Funcionario {
    
    private String nome;
    private final Integer cpf;
    
    public Funcionario (String nome, Integer cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    
    
    
}
