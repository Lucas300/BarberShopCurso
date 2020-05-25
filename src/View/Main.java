/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Lucas Daniel
 */
public class Main {
    public static void main(String[]args){
        String nome ="Lucas";
        System.out.println(nome);
        
        //tipo servico e varialvel servico , eu posso subistituir a variavel servico por qual eu quiser         
        Servico servico = new Servico(1,"barba",30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        
        Cliente cliente = new Cliente(1, "Lucas","itaquaquecetuba" , "0882312");
        
        //o get.Nome não existe na classe cliente , mas sim na classe pessoa
        System.out.println(cliente.getNome());
        /*
        podemos usar um breakpoint na linha de exibição
        e logo em seguida depurar o ariquivo 
        clicando com o botão direito no arquivo
        para ter certeza que os valores foram passados
        */
        //através do agendamento consigo acessar minhas propriedades Cliente e Usuario;
        Agendamento agendamento = new Agendamento(1,cliente,servico,30,"25/07/2020 09:15");
        System.out.println(agendamento.getCliente().getNome());
                
        Usuario usuario = new Usuario(1,"LUCAS", "SENHA2");
        System.out.println(usuario);
    }
}