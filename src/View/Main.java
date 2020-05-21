/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author novo
 */
public class Main {
    public static void main(String[]args){
        String nome ="Lucas";
        System.out.println(nome);
        
        //tipo servico e varialvel servico , eu posso subistituir a variavel servico por qual eu quiser         
        Servico servico = new Servico(1,"barba",30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        //eu posso passar a data como String mas usarei o metodo 
        //Date para mais funcionalidades futuras 
        Cliente cliente = new Cliente(1, "Lucas" , 'M' , "966601064","rua piraí 190");
        
        System.out.println(cliente);
        /*
        podemos usar um breakpoint na linha de exibição
        e logo em seguida depurar o ariquivo 
        clicando com o botão direito no arquivo
        para ter certeza que os valores foram passados
        */
        
        Usuario usuario = new Usuario(1,"Barbeiro", "Senha");
        System.out.println(usuario);
    }
}