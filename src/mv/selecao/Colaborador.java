/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mv.selecao;

/**
 *
 * @author emily
 */
public class Colaborador {
    String nome;
    String cpf;
    String cafeDaManha;

    public Colaborador(String nome, String cpf, String cafeDaManha) {
        this.nome = nome;
        this.cpf = cpf;
        this.cafeDaManha = cafeDaManha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCafeDaManha() {
        return cafeDaManha;
    }

    public void setCafeDaManha(String cafeDaManha) {
        this.cafeDaManha = cafeDaManha;
    }
    
    public void imprimir(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Colaborador{" + "nome=" + nome + ", cpf=" + cpf + ", cafeDaManha=" + cafeDaManha + '}';
    }
    
    
}
