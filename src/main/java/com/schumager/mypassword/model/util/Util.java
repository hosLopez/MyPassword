/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schumager.mypassword.model.util;

/**
 *
 * @author Schumager
 */
public class Util {
    public static boolean comparar(char[]codigo1, char[]codigo2 ){
        
        if(codigo1.length==codigo2.length){
            System.err.println("Ese igual");
            for (int i = 0; i < codigo2.length; i++) {
                if(codigo1[i]!=codigo2[i]){
                    return false;
                }
            }
        }
        else{
            System.err.println("No es igual ");
            return false;
        }
            
        
        return true;
    }
    
}
