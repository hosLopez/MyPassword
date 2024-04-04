/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schumager.mypassword.model.util;

import com.schumager.mypassword.model.DatosDelRegistro;
import com.schumager.mypassword.view.table.TableRegistro;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
 
   public void  abrir(File file)throws IOException{
       FileWriter fileWriter = new FileWriter(file+".ecs");
       
       this.file = new FileOutputStream(file+".ecs");
       
       outPut = new ObjectOutputStream(this.file);
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
