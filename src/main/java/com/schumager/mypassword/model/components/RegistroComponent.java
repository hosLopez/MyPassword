/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schumager.mypassword.model.components;

import com.schumager.mypassword.model.Registro;
import com.schumager.mypassword.model.util.EjecutarBoot;
import com.schumager.mypassword.view.PanelRegistro2;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author Schumager
 */

public class RegistroComponent implements  Serializable{
    private Registro registro;
    JButton butttonEdit;
    JButton buttonEliminar;
    
    JLabel labelNombre;
    JLabel labelMail;
    JLabel labelUser;
    JPasswordField passwordField;
    
    JCheckBox checkBoxMail;
    JCheckBox checkBoxUser;
    JCheckBox checkBoxEnter;
    JCheckBox checkBoxPassword;
    JCheckBox checkBoxEnterDos;
    
    JButton   buttonIngresar;

    public RegistroComponent() {
        registro = new Registro();
        
        butttonEdit = new JButton ("Editar");
        butttonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonEditActionPerformed(e);
            }
        });
        
        buttonEliminar = new JButton ("Eliminar");
        buttonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonEliminarActionPerformed(e);
            }
        });
        
        
        labelNombre = new JLabel();
        labelMail = new JLabel();
        labelUser = new JLabel();
        passwordField = new JPasswordField();
        passwordField .setEditable(false);
        
        checkBoxMail = new JCheckBox();
        checkBoxUser = new JCheckBox();
        checkBoxEnter = new JCheckBox();
        checkBoxPassword = new JCheckBox();
        checkBoxEnterDos = new JCheckBox();
        
        buttonIngresar = new JButton("Ingresar");
        
        buttonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonIngresarActionPerformed(e);
            }
        });
        
        
    }
    public void loadComponets(Registro registro){
        this.registro = registro;
        labelNombre.setText(registro.getNombre());
        labelMail.setText("<html><a>"+registro.getMail()+"</a></html>");
        labelUser.setText(registro.getUser());
        
        passwordField.setText(registro.getPassword());
        
        checkBoxMail.setSelected(registro.isMailEnter());
        checkBoxUser.setSelected(registro.isUserEnter());
        checkBoxEnter.setSelected(registro.isEnter());
        checkBoxPassword.setSelected(registro.isPasswordEnter());
        checkBoxEnterDos.setSelected(registro.isEnter2());
        
    }
    private void buttonIngresarActionPerformed(java.awt.event.ActionEvent evt) { 
        EjecutarBoot.ingresar(registro);
    }
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) { 
        PanelRegistro2 pp = (PanelRegistro2) butttonEdit.getParent().getParent().getParent().getParent().getParent().getParent().getComponent(0);
        
        pp.loadComponets(registro);
        butttonEdit.setFocusable(false);
    }
      public void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt){
        //buttonEliminar.addActionListener( evt);
        PanelRegistro2 pp = (PanelRegistro2) buttonEliminar.getParent().getParent().getParent().getParent().getParent().getParent().getComponent(0);
        buttonEliminar.setFocusable(false);
        pp.getTableRegistro().remover(registro);
        
    }
    

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public JButton getButttonEdit() {
        return butttonEdit;
    }

    public void setButttonEdit(JButton butttonEdit) {
        this.butttonEdit = butttonEdit;
    }

    public JLabel getLabelNombre() {
        return labelNombre;
    }

    public void setLabelNombre(JLabel labelNombre) {
        this.labelNombre = labelNombre;
    }

    public JLabel getLabelMail() {
        return labelMail;
    }

    public void setLabelMail(JLabel labelMail) {
        this.labelMail = labelMail;
    }

    public JLabel getLabelUser() {
        return labelUser;
    }

    public void setLabelUser(JLabel labelUser) {
        this.labelUser = labelUser;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JCheckBox getCheckBoxMail() {
        return checkBoxMail;
    }

    public void setCheckBoxMail(JCheckBox checkBoxMail) {
        this.checkBoxMail = checkBoxMail;
    }

    public JCheckBox getCheckBoxUser() {
        return checkBoxUser;
    }

    public void setCheckBoxUser(JCheckBox checkBoxUser) {
        this.checkBoxUser = checkBoxUser;
    }

    public JCheckBox getCheckBoxEnter() {
        return checkBoxEnter;
    }

    public void setCheckBoxEnter(JCheckBox checkBoxEnter) {
        this.checkBoxEnter = checkBoxEnter;
    }

    public JCheckBox getCheckBoxPassword() {
        return checkBoxPassword;
    }

    public void setCheckBoxPassword(JCheckBox checkBoxPassword) {
        this.checkBoxPassword = checkBoxPassword;
    }

    public JCheckBox getCheckBoxEnterDos() {
        return checkBoxEnterDos;
    }

    public void setCheckBoxEnterDos(JCheckBox checkBoxEnterDos) {
        this.checkBoxEnterDos = checkBoxEnterDos;
    }

    public JButton getButtonIngresar() {
        return buttonIngresar;
    }

    public void setButtonIngresar(JButton buttonIngresar) {
        this.buttonIngresar = buttonIngresar;
    }

    public JButton getButtonEliminar() {
        return buttonEliminar;
    }

    public void setButtonEliminar(JButton buttonEliminar) {
        this.buttonEliminar = buttonEliminar;
    }
    
    
    
    
    
}
