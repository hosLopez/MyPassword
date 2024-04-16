/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schumager.mypassword.model;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Schumager
 */
public class DatosDelRegistro implements Serializable{
    private static final long serialVersionUID = -3940762653214188725L;
    private static boolean nuevo;
    private static boolean guardar;
    private static char []codigoClase;
    private static File direccion;

    private char []codigo;    
    private  List<Registro>  lista;
    private int entero;
    public DatosDelRegistro(){
        /*codigo = null;
        nuevo = false;
        guardar = false;*/
        codigo = null;
        lista = new ArrayList<>();
    }
     public static void nuevo() {
        codigoClase = null;
        nuevo = false;
        guardar = false;
        
    }
    public void addRegistro(Registro r){
        lista.add(r);
    }
    public Registro getRegistro(int index){
        return lista.get(index);
    }

    public static char [] getCodigoClase() {
        return codigoClase;
    }

    public static  void setCodigoClase(char []codigo) {
        DatosDelRegistro.codigoClase = codigo;
    }

    public List<Registro> getLista() {
        return lista;
    }

    public void setLista(List<Registro> lista) {
        this.lista = lista;
    }

    public static boolean isNuevo() {
        return nuevo;
    }

    public static void setNuevo(boolean nuevo) {
        DatosDelRegistro.nuevo = nuevo;
    }

    public static boolean isGuardar() {
        return guardar;
    }

    public static void setGuardar(boolean guardar) {
        DatosDelRegistro.guardar = guardar;
    }

    public static File getDireccion() {
        return direccion;
    }

    public static void setDireccion(File direccion) {
        DatosDelRegistro.direccion = direccion;
    }
    

    public char[] getCodigo() {
        return codigo;
    }

    public void setCodigo(char[] codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    
}
