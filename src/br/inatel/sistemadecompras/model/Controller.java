package br.inatel.sistemadecompras.model;

import br.inatel.sistemadecompras.view.Carrinho;
import br.inatel.sistemadecompras.view.Cliente;
import br.inatel.sistemadecompras.view.Gerente;
import br.inatel.sistemadecompras.view.LoginGerente;
import br.inatel.sistemadecompras.view.MenuInicial;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Controller {

    public void abrirLoginGerente() {
        LoginGerente lg = new LoginGerente();
        lg.setVisible(true); 
        
    }

    public void abrirMenu() {
        MenuInicial mi = new MenuInicial();
        mi.setVisible(true);
    }
    
    public void abrirCliente(){
        Cliente ic = new Cliente();
        ic.setVisible(true);
    }
    
    public void abrirCarrinho() throws FileNotFoundException, IOException{
        Carrinho ica = new Carrinho();
        ica.setVisible(true);
    }
    
    public void abrirGerente() throws FileNotFoundException {
        Gerente ig = new Gerente();
        ig.setVisible(true);
    }
}
