/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;

/**
 *
 * @author aolmo
 */
public class Utilidades {

    public Utilidades() {
    }

    public static void cargarCertPub() {
        String fichero=  System.getProperty("user.dir") + File.separator + "cert" + File.separator + "AlmacenClienteSSL.jks";
        System.out.println("ruta "+fichero);
        System.setProperty("javax.net.ssl.trustStore", fichero);
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
    }

    public static int borrarUsuario(int idUsuario) {
        principal.Servicios_Service service = new principal.Servicios_Service();
        principal.Servicios port = service.getServiciosPort();
        return port.borrarUsuario(idUsuario);
    }

    public static int insertarUsuario(java.lang.String nombre, java.lang.String apellidos, int edad) {
        principal.Servicios_Service service = new principal.Servicios_Service();
        principal.Servicios port = service.getServiciosPort();
        return port.insertarUsuario(nombre, apellidos, edad);
    }

    public static int modificarUsuario(int idUsuario, java.lang.String nombre, java.lang.String apellidos, int edad) {
        principal.Servicios_Service service = new principal.Servicios_Service();
        principal.Servicios port = service.getServiciosPort();
        return port.modificarUsuario(idUsuario, nombre, apellidos, edad);
    }

    public static String consultaUsuario(int idUsuario) {
        principal.Servicios_Service service = new principal.Servicios_Service();
        principal.Servicios port = service.getServiciosPort();
        return port.consultaUsuario(idUsuario);
    }

}
