/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schumager.mypassword.model.util;

import com.schumager.mypassword.model.DatosDelRegistro;
import com.schumager.mypassword.view.table.TableRegistro;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Schumager
 */
public class DatosDelRegistroOutput {
    private   FileOutputStream file;
    private  ObjectOutputStream outPut;
    
   public DatosDelRegistroOutput(){
       
   }
 
   public void  abrir()throws IOException{
       file = new FileOutputStream("lista.ecs");
       outPut = new ObjectOutputStream(file);
   }
   public void cerrar () throws IOException{
       if(outPut!=null){
           outPut.close();
       }
   }
   public void guardar(DatosDelRegistro dr)throws IOException{
       if(outPut!=null){
           outPut.writeObject(dr);
           
        }
   }
}
