/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.receiver;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public class USAServer implements IServer{

    @Override
    public void apagar() {
        System.out.println("Apagar server de USA");
    }

    @Override
    public void encender() {
        System.out.println("Encender server de USA");
    }

    @Override
    public void conectar() {
        System.out.println("Conectar server de USA");
    }

    @Override
    public void verificarConexion() {
        System.out.println("Verificar conexión en server de USA");
    }

    @Override
    public void guardarLog() {
        System.out.println("Guardar log en server de USA");
    }

    @Override
    public void cerrarConexion() {
        System.out.println("Cerrar conexión en server de USA");
    }

}
