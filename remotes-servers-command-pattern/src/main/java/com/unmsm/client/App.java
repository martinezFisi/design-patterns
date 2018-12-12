/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.client;

import com.unmsm.command.ApagarServerCommand;
import com.unmsm.command.Command;
import com.unmsm.command.IniciarServerCommand;
import com.unmsm.invoker.Invoker;
import com.unmsm.receiver.ArgentinaServer;
import com.unmsm.receiver.IServer;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public class App {
    public static void main(String[] args) {
        //Receiver
        IServer iServer = new ArgentinaServer();
        //Command
        Command iniciarServerCommand = new IniciarServerCommand(iServer);
        Command apagarServerCommand = new ApagarServerCommand(iServer);
        //Invoker
        Invoker invoker = new Invoker();
        //Setear command
        invoker.setCommand(iniciarServerCommand);
        invoker.run();
        System.out.println();
        //Cambiar de command
        invoker.setCommand(apagarServerCommand);
        invoker.run();
    }
}
