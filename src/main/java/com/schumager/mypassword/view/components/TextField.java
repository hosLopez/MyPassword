/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.schumager.mypassword.view.components;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.beans.BeanProperty;
import javax.swing.border.Border;

/**
 *
 * @author Schumager
 */
public class TextField extends javax.swing.JTextField implements TextFieldInterface{

    /**
     * Creates new form TextField
     */
    public TextField() {
        colorTitle = new Color(153,153,153);
        cantidad = 100;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        if(super.getText().equals(title)){
            super.setText("");
            super.setForeground(Color.BLACK);
           // border = super.getBorder();
            //super.setBorder(javax.swing.BorderFactory.createTitledBorder(null, title, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        }
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
        if(super.getText().trim().equals("")){
            super.setText(title);
            super.setForeground(colorTitle);
           // super.setBorder(border);
            
        }
    }//GEN-LAST:event_formFocusLost

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
        if(getText().length()>=cantidad){
            getToolkit().beep();
            evt.consume();
        }
        
        if(tipoDeCarecteres ==  TextField.NORMAL){
            return;
        }
        char c = evt.getKeyChar();
        if(tipoDeCarecteres == TextField.LETRAS){
            
            if (c==' '){
                return;
            }
                                      
            if (!Character.isLetter(c)){
                getToolkit().beep();
                evt.consume();
                return;
            }          
            
            if (Character.isLowerCase(c)){
                evt.setKeyChar((char)(((int)evt.getKeyChar()) - 32));
            }
            return;
        }
        if(tipoDeCarecteres == TextField.NUMEROS_LETRAS){
            
            if (Character.isLowerCase(c)){
                evt.setKeyChar((char)(((int)evt.getKeyChar()) - 32));
            }
            return;
        }
        
        if(tipoDeCarecteres  == TextField.NUMEROS){
            if (!Character.isDigit(c)){
                getToolkit().beep();
                evt.consume();
            }
           return;
        }
        
        //Empíeza codigo si la configuacion es PASSWORD
        if(tipoDeCarecteres == TextField.PASSWORD){
            int start = this.getSelectionStart();
            int end = this.getSelectionEnd();
            int leng = super.getText().length();
            
           if(c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE){

                //return;
               if(leng==0){
                   if(textPassword.length()>0){
                       textPassword.delete(0,textPassword.length());
                   }
                   return;  
                }
                if(leng == end){
                    if(leng == start){
                        System.err.println("Selection start "+this.getSelectionStart());
                        System.err.println("Selection end "+this.getSelectionEnd());
                        System.err.println("Lengt "+super.getText().length());
                        if(c==KeyEvent.VK_BACK_SPACE)
                            textPassword.deleteCharAt(textPassword.length()-1);
                        System.err.println("Lengt Text "+textPassword.length());
                        
                        if(leng<textPassword.length()){
                          super.setText("");
                          textPassword.delete(0,textPassword.length());
                        }
                        return; 
                    }
                 
                }
                
                if(leng>end){
                   super.setText("");
                   textPassword.delete(0,textPassword.length());
                   return;
                }
                
                return;
            }
          /* if(c==KeyEvent.VK_DELETE){
               if(leng==0){
                   if(textPassword.length()>0){
                       textPassword.delete(0,textPassword.length());
                   }
                   return;  
                }
           }*/           
           
           //Aqui codigo que empieza si el caracter es espacio
            if(c==' '){
                getToolkit().beep();
                evt.consume();
                return;
            }
            
            
            /*System.err.println("Selection start "+this.getSelectionStart());
            System.err.println("Selection end "+this.getSelectionEnd());
            System.err.println("Lengt ggoog"+super.getText().length());*/
          
            //Aqui empieza el codigo di el caracter es diferente de espacio y backSpace
            if(leng == end){
                if(leng == start){
                  textPassword.append(c);
                  if(passwordVisible)
                       evt.setKeyChar(c);
                  else
                       evt.setKeyChar('*'); 
                  return;
                }
                if(leng>start){
                    
                    textPassword.delete(start, end);
                    textPassword.append(c);
                    if(passwordVisible)
                       evt.setKeyChar(c);
                    else
                       evt.setKeyChar('*');
                    return;
                }
            }
            if(leng > end){
                if(end == start){
                    textPassword.insert(start, c);
                    if(passwordVisible)
                       evt.setKeyChar(c);
                    else
                       evt.setKeyChar('*');
                    return;
                }
                else{
                    textPassword.delete(start, end);
                    textPassword.insert(start, c);
                    if(passwordVisible)
                       evt.setKeyChar(c);
                    else
                       evt.setKeyChar('*');
                    return;
                }
            }


        }
        
    }//GEN-LAST:event_formKeyTyped

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
       //  System.err.println("Presiono "+evt.getKeyText(evt.getKeyCode()));
        
    }//GEN-LAST:event_formKeyReleased

   @Override
    public void setText(String text){
        if(text==null)
            return;
        if(text.equals("")){
          
          super.setText(title);
          this.setForeground(colorTitle);
          if(tipoDeCarecteres==TextField.PASSWORD){
              textPassword = new StringBuilder();
          }
          return;
        }
        else{
            super.setText(text);
            if(tipoDeCarecteres==TextField.PASSWORD){
                if(super.getText().equals(title)){
                    textPassword = new StringBuilder();
                    return;
                }
                else{
                   textPassword = new StringBuilder();
                   textPassword.append(text);
                }
                
                
            }
            this.setForeground(Color.BLACK);
        }

    }
   @Override
    public String getText(){
        if(super.getText().equals(title)){
            return "";
        }
        if(tipoDeCarecteres==TextField.PASSWORD){            
           return textPassword.toString();  
        }
            
        return super.getText();
    }
    
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
        this.setText(title);
        this.setForeground(colorTitle);
    } 

    @Override
    public Color getColorTitle() {
        return colorTitle;
    }

    @Override
    public void setColorTitle(Color colorTitle) {
        this.colorTitle = colorTitle;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public int getTipoDeCaracteres() {
        return tipoDeCarecteres;
    }
    @Override
    @BeanProperty(preferred = true, enumerationValues = {
             "TextField.NORMAL",
             "TextField.LETRAS",
             "TextField.NUMEROS",
             "TextField.NUMEROS_LETRAS"}, description
             = "Set the field alignment to LETRAS, NUMEROS, NUMEROS_LETRAS,(the default) or NORMAL")
    public void setTipoDeCaracteres(int tipo) {
        this.tipoDeCarecteres = tipo;
        if(this.tipoDeCarecteres==TextField.PASSWORD)
           textPassword = new StringBuilder();
    }
   @Override
    public boolean isPasswordVisible() {
        return passwordVisible;
    }
    @Override
    public void setPasswordVisible(boolean passwordVisible) {
      if(this.getTipoDeCaracteres()==TextField.PASSWORD){
           this.passwordVisible = passwordVisible;
           if(passwordVisible){
               this.setText(this.getText());
           }
           else{
               String asterisco="";
               for(int i = 0;  i<this.getText().length();i++){
                   asterisco +="*";
               }
               this.setText(asterisco);
           }

           }
     
    }       
    
    int tipoDeCarecteres;
    int cantidad;
    Color colorTitle;
    private String title;    
    private StringBuilder textPassword;
    boolean passwordVisible;
    
    static final int NORMAL = 0; 
    static final int LETRAS =1;
    static final int NUMEROS =2;
    static final int NUMEROS_LETRAS = 3;
    static final int PASSWORD = 4;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
