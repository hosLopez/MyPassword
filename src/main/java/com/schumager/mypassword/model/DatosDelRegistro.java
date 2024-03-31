/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schumager.mypassword.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Schumager
 */
public class DatosDelRegistro implements Serializable{
    static int codigo;
    static boolean nuevo;
    static boolean guardar;
    List<Registro>  lista;
    
    public DatosDelRegistro(){
        codigo = 0;
        lista = new ArrayList<>();
    }
    public void addRegistro(Registro r){
        lista.add(r);
    }
    public Registro getRegistro(int index){
        return lista.get(index);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
    
    
}
