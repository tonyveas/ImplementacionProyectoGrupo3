/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Persona.SuperAdministrador;

import Vistas.VistaSuperadministrador;
import java.awt.event.ActionEvent;

/**
 *
 * @author san_t
 */
public class ControlSuperAdministrador implements Controlador {
    
    private VistaSuperadministrador ventana;
    private SuperAdministrador SuperAdministrador;
 
    
    
    public ControlSuperAdministrador(SuperAdministrador SuperAdministrador)  {
        ventana = new VistaSuperadministrador();
        this.SuperAdministrador = SuperAdministrador;
        this.SuperAdministrador.setControl(this);
        ventana.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(ventana.botonBuscar==e.getSource()){
//            AdministrarUsuarios a=new AdministrarUsuarios();
            ventana.setVisible(false);
            
//        }if(administrarUsuarios.consultarUsuario==e.getSource()){
//             consultarUsuario.setVisible(true);
//             administrarUsuarios.setVisible(false);
        }
        
        
    }
    @Override
    public void presentarVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
