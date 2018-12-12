/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.command;

import com.unmsm.receiver.IServer;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public class IniciarServerCommand implements Command{

    private IServer iServer;
    
    public IniciarServerCommand(IServer iServer) {
        this.iServer = iServer;
    }
    
    @Override
    public void execute() {
        iServer.verificarConexion();
        iServer.conectar();
        iServer.encender();
        iServer.guardarLog();
        iServer.cerrarConexion();
    }

}
