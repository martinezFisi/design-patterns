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
public interface IServer {
    void apagar();
    void encender();
    void conectar();
    void verificarConexion();
    void guardarLog();
    void cerrarConexion();
}
