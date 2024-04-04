/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schumager.mypassword.model.util;

import com.schumager.mypassword.model.DatosDelRegistro;
import com.schumager.mypassword.view.table.TableRegistro;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Schumager
 */
public class DatosDelRegistroInput {
    
    private FileInputStream file;
    private ObjectInputStream input;
    public DatosDelRegistroInput(){
        
    }
    public void abrir(File file)throws IOException{
        this.file = new FileInputStream(file);
        input = new ObjectInputStream(this.file) ;
        
    }
    public void cerra()throws IOException{
        if(input!=null){
            input.close();
        }
    }
    public DatosDelRegistro leer()throws IOException, ClassNotFoundException{
        DatosDelRegistro dr = null;
        if(input!=null){
             dr = (DatosDelRegistro)input.readObject();
             DatosDelRegistro.setCodigoClase(dr.getCodigo());
        }
        return dr;
    }
    
}
