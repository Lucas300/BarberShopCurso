/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author novo
 */
public class Servico {
    private int Id;
    private String Descricao;
    private float Valor;

    //CONSTRUTOR
    public Servico(int Id, String Descricao, float Valor) {
        this.Id = Id;
        this.Descricao = Descricao;
        this.Valor = Valor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    
    
}
