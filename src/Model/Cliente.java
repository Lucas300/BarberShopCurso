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
import java.util.Date;

/**
 *
 * @author novo
 */
//Criando uma classe e definindo seus atributos
//usamos o extends para refencia a classe pai
public class Cliente extends Pessoa{
    
    private String endereco;
    private String cep; 

    //aqui foi criado um contrutor para usar todos os atributos da classe pai cliente 
    //construtor completo com todas as informações
    public Cliente(String endereco, String cep, int id, char sexo, String dataNascimento, String telefone, String email, String rg) {
        super(id, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }
    
    //contrutor com o minimo de informações necessarias 
    public Cliente(int id, String nome,String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }
    
    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
}
