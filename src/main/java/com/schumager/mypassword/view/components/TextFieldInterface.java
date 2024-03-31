/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.schumager.mypassword.view.components;

import java.awt.Color;
import java.beans.BeanProperty;

/**
 *
 * @author Schumager
 */
public interface TextFieldInterface {
    /*static final int NORMAL = 0; 
    static final int LETRAS =1;
    static final int NUMEROS =2;
    static final int NUMEROS_LETRAS = 3;
    static final int PASSWORD = 4;*/
    
    public String getTitle();
    public void setTitle(String title);
    public Color getColorTitle();
    public void setColorTitle(Color colorTitle);
    public int getCantidad();
    public void setCantidad(int cantidad);
    public int getTipoDeCaracteres();
    public void setTipoDeCaracteres(int tipo);
    public boolean isPasswordVisible();
    public void setPasswordVisible(boolean passwordVisible); 
    
}
