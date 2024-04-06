/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.schumager.mypassword.view.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseListener;
import javax.swing.Action;
import javax.swing.JOptionPane;

/**
 *
 * @author Hos
 */
public class TextFieldLabel extends javax.swing.JPanel implements TextFieldInterface{

    /**
     * Creates new form TextFieldLabel
     */
    public TextFieldLabel() {
        posicionLabel = true;
        initComponents();
        setPosicionLabel(posicionLabel);        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        textField = new com.schumager.mypassword.view.components.TextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("B");
        label.setOpaque(true);
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMouseExited(evt);
            }
        });

        textField.setBorder(null);
        textField.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addMouseListenerLabel(MouseListener evt){
        label.addMouseListener(evt);
    }
    private void labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseEntered
        // TODO add your handling code here:
        label.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_labelMouseEntered

    private void labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseExited
        // TODO add your handling code here:
        label.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_labelMouseExited

    private void labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseClicked
        // TODO add your handling code here:
        if(textField.getTipoDeCaracteres()==textField.PASSWORD){
            if(!textField.getText().equals("")){
                setPasswordVisible(!textField.isPasswordVisible());
            }
            return;
        }
        
        if(!this.getText().equals("")){
            String copy  = this.getText();
            StringSelection copySelecction = new StringSelection(copy);
            Toolkit tool = Toolkit.getDefaultToolkit();
            Clipboard clip = tool.getSystemClipboard();
            clip.setContents(copySelecction,null);

            JOptionPane.showMessageDialog(this,copy);
        }
        
    }//GEN-LAST:event_labelMouseClicked

    
    
    @Override
    public String getTitle() {
        return textField.getTitle();
    }

    @Override
    public void setTitle(String title) {
        textField.setTitle(title);
    }

    @Override
    public Color getColorTitle() {
        return textField.getColorTitle();
    }

    @Override
    public void setColorTitle(Color colorTitle) {
        textField.setColorTitle(colorTitle);
    }

    @Override
    public int getCantidad() {
      return  textField.getCantidad();
    }

    @Override
    public void setCantidad(int cantidad) {
        textField.setCantidad(cantidad);
    }

    @Override
    public int getTipoDeCaracteres() {
        return  textField.getTipoDeCaracteres();
    }

    @Override
    public void setTipoDeCaracteres(int tipo) {
        textField.setTipoDeCaracteres(tipo);
    }

    @Override
    public boolean isPasswordVisible() {
        return textField.isPasswordVisible();
    }

    @Override
    public void setPasswordVisible(boolean passwordVisible) {
        textField.setPasswordVisible(passwordVisible);
    }
    @Override
    public void setFont(Font font){
        if(textField==null)
            return;
        if(label==null)
            return;
        super.setFont(font);
        textField.setFont(font);
        label.setFont(font); 
    }    
    @Override
    public void setBackground(Color bg){
        //this.setBackground(bg);
        if(textField==null)
            return;
        if(label==null)
            return;
        super.setBackground(bg);
        textField.setBackground(bg);
        label.setBackground(bg);                
    }
    //@Override
    public void setEditable(boolean editable){
        textField.setEnabled(editable);
        //textField.setEditable(editable);
        label.setEnabled(editable);
        
    }
    @Override
    public void setEnabled(boolean enabled){
      super.setEnabled(enabled);
      textField.setEnabled(enabled);
      label.setEnabled(enabled);
    }
            
   /* @Override
    public Color getBackground(){
        return this.getBackground();
    }*/
    public void setText(String text){
        textField.setText(text);
    }
    public String getText(){
        return textField.getText();
    }
    public void setTextLabel(String text){
        label.setText(text);
    }
    public String getTextLabel(){
        return label.getText();
    }

    public void setPosicionLabel(boolean posicionLabel){
        this.posicionLabel = posicionLabel;
        if(posicionLabel){
            //label.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(153, 153, 153)));
            //textField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(153, 153, 153)));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addGap(0, 0, 0)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            
        }
        else{
            
           // label.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(153, 153, 153)));
            //textField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(153, 153, 153)));
             javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
             this.setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE , 48,  javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
        }
    }
    public boolean getPosicionLable(){
        return posicionLabel;
    }
    public void requestFocus(){
        if(textField==null)
          super.requestFocus();
        else
         textField.requestFocus();
    }
    private boolean posicionLabel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label;
    private com.schumager.mypassword.view.components.TextField textField;
    // End of variables declaration//GEN-END:variables

}
