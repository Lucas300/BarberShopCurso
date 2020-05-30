/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

/**
 *
 * @author novo
 */
public class LoginController {

    private final Login view;
    //construtor > // adiciona a importação  // criar campo view 
    private LoginHelper helper;
    
    public LoginController(Login view) { 
        
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    public void entrarNoSistema(){
        //pegar um usuario da view 
        Usuario usuario = helper.oberterModelo();
        
        //pesquisar usuario no Banco 
        //e se o nome do usuario da view for o mesmo nome do usuario do banco , entao ir para menuPrincipal
        //Senão vou mostrar uma mensagem ao usuario "Usuario ou senha invalidos" 
    }
    
    //criando a função fizTarefa()
    public void fizTarefa(){
        System.out.println("Busquei algo no banco");
        
        //para que funcione é necessario criar um metodo la na view login
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
    
}
