
package Class;

import Telas.UIcadastro;


public class CrudCliente {

  
    public static void main(String[] args) {
        
       // instanciar
        UIcadastro formulario = new UIcadastro();
        Cliente cliente = new Cliente(formulario.nome, formulario.cpf, formulario.endereco, formulario.cidade, formulario.estado);
    }
    
}
