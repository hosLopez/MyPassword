/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.schumager.mypassword.view;

import com.schumager.mypassword.model.DatosDelRegistro;
import com.schumager.mypassword.model.JRobot;
import com.schumager.mypassword.model.Registro;
import com.schumager.mypassword.model.util.DatosDelRegistroInput;
import com.schumager.mypassword.model.util.DatosDelRegistroOutput;
import com.schumager.mypassword.model.util.EjecutarBoot;
import com.schumager.mypassword.view.components.TextFieldLabel;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Schumager
 */
public class PanelRegistro2 extends javax.swing.JPanel {

    /**
     * Creates new form PanelRegistro
     */
    public PanelRegistro2() {
        initComponents();
        registro = new Registro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        textFieldUrl = new com.schumager.mypassword.view.components.TextFieldLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jPanel2 = new javax.swing.JPanel();
        buttonInsertar = new javax.swing.JButton();
        buttonEjecutar = new javax.swing.JButton();
        panelNumeros1 = new com.schumager.mypassword.view.PanelNumeros();
        jPanel1 = new javax.swing.JPanel();
        textFieldNombre = new com.schumager.mypassword.view.components.TextFieldLabel();
        textFieldRecuperar = new com.schumager.mypassword.view.components.TextFieldLabel();
        textFieldMail = new com.schumager.mypassword.view.components.TextFieldLabel();
        textFieldUser = new com.schumager.mypassword.view.components.TextFieldLabel();
        textFieldPassword = new com.schumager.mypassword.view.components.TextFieldLabel();
        jPanel5 = new javax.swing.JPanel();
        toggleButtonPassword = new javax.swing.JToggleButton();
        toggleButtonMail = new javax.swing.JToggleButton();
        toggleButtonEnter = new javax.swing.JToggleButton();
        toggleButtonUser = new javax.swing.JToggleButton();
        toggleButtonEnter2 = new javax.swing.JToggleButton();
        toggleButtonTab = new javax.swing.JToggleButton();
        toggleButtonBrowser = new javax.swing.JToggleButton();
        buttonLimpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRegistro = new com.schumager.mypassword.view.table.TableRegistro();
        jPanel3 = new javax.swing.JPanel();
        buttonFacebook = new javax.swing.JButton();
        buttonGoogle = new javax.swing.JButton();
        buttonTwiter = new javax.swing.JButton();
        buttonTuCuate = new javax.swing.JButton();
        buttonBrowser = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);
        jToolBar1.setMinimumSize(new java.awt.Dimension(201, 40));
        jToolBar1.setPreferredSize(new java.awt.Dimension(418, 50));
        jToolBar1.add(jSeparator1);

        textFieldUrl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccio o url de la pagina para Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N
        textFieldUrl.setCantidad(1000);
        textFieldUrl.setPreferredSize(new java.awt.Dimension(260, 35));
        textFieldUrl.setTextLabel("Ir");
        textFieldUrl.setTitle("Inserte direccion de la pagina de login");
        jToolBar1.add(textFieldUrl);
        jToolBar1.add(jSeparator3);

        jButton1.setText("Abrir");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("Guardar");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setText("Nuevo");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator2);

        add(jToolBar1, java.awt.BorderLayout.NORTH);

        buttonInsertar.setText("Insertar");
        buttonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertarActionPerformed(evt);
            }
        });

        buttonEjecutar.setText("Ejecutar");
        buttonEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEjecutarActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        textFieldNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre de la pagina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N
        textFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textFieldNombre.setTextLabel("Copy");
        textFieldNombre.setTipoDeCaracteres(3);
        textFieldNombre.setTitle("Nombre de la Pagina");
        jPanel1.add(textFieldNombre);

        textFieldRecuperar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo o numero de recuperar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N
        textFieldRecuperar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textFieldRecuperar.setTextLabel("Copy");
        textFieldRecuperar.setTitle("Correo y/o numero de recuperar");
        jPanel1.add(textFieldRecuperar);

        textFieldMail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo Electronico numero de telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N
        textFieldMail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textFieldMail.setTextLabel("Copy");
        textFieldMail.setTitle("Correo Electronico o numero de telefono");
        jPanel1.add(textFieldMail);

        textFieldUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N
        textFieldUser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textFieldUser.setTextLabel("Copy");
        textFieldUser.setTitle("Insertar Usuario");
        jPanel1.add(textFieldUser);

        textFieldPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N
        textFieldPassword.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textFieldPassword.setTextLabel("Copy");
        textFieldPassword.setTipoDeCaracteres(4);
        textFieldPassword.setTitle("Inserte Contraseña");
        jPanel1.add(textFieldPassword);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Obciones que se ejecutaran", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N

        toggleButtonPassword.setText("Contraseña >");
        toggleButtonPassword.setMargin(new java.awt.Insets(2, 5, 3, 5));

        toggleButtonMail.setText("Correo >");
        toggleButtonMail.setMargin(new java.awt.Insets(2, 5, 3, 5));
        toggleButtonMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonMailActionPerformed(evt);
            }
        });

        toggleButtonEnter.setText("Enter >");
        toggleButtonEnter.setMargin(new java.awt.Insets(2, 5, 3, 5));

        toggleButtonUser.setText("Usuario >");
        toggleButtonUser.setMargin(new java.awt.Insets(2, 5, 3, 5));
        toggleButtonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonUserActionPerformed(evt);
            }
        });

        toggleButtonEnter2.setText("Enter >");
        toggleButtonEnter2.setMargin(new java.awt.Insets(2, 5, 3, 5));

        toggleButtonTab.setText("Tab >");
        toggleButtonTab.setMargin(new java.awt.Insets(2, 5, 3, 5));

        toggleButtonBrowser.setText("Navegador >");
        toggleButtonBrowser.setMargin(new java.awt.Insets(2, 5, 3, 5));
        toggleButtonBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonBrowserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(toggleButtonBrowser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toggleButtonMail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toggleButtonUser))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(toggleButtonEnter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toggleButtonTab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toggleButtonPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toggleButtonEnter2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toggleButtonMail)
                    .addComponent(toggleButtonUser)
                    .addComponent(toggleButtonBrowser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toggleButtonEnter2)
                    .addComponent(toggleButtonPassword)
                    .addComponent(toggleButtonEnter)
                    .addComponent(toggleButtonTab))
                .addContainerGap())
        );

        buttonLimpiar.setText("Limpiar");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonInsertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEjecutar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonLimpiar))
                            .addComponent(panelNumeros1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInsertar)
                    .addComponent(buttonEjecutar)
                    .addComponent(buttonLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelNumeros1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, java.awt.BorderLayout.WEST);

        jScrollPane1.setViewportView(tableRegistro);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
        );

        add(jPanel4, java.awt.BorderLayout.CENTER);

        buttonFacebook.setText("Facebook");
        buttonFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFacebookActionPerformed(evt);
            }
        });

        buttonGoogle.setText("Google");
        buttonGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGoogleActionPerformed(evt);
            }
        });

        buttonTwiter.setText("Twiter");
        buttonTwiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwiterActionPerformed(evt);
            }
        });

        buttonTuCuate.setText("Tu Cuate");
        buttonTuCuate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTuCuateActionPerformed(evt);
            }
        });

        buttonBrowser.setText("Browser");
        buttonBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBrowserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(379, Short.MAX_VALUE)
                .addComponent(buttonFacebook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonGoogle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTwiter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTuCuate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonBrowser))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFacebook)
                    .addComponent(buttonGoogle)
                    .addComponent(buttonTwiter)
                    .addComponent(buttonTuCuate)
                    .addComponent(buttonBrowser))
                .addContainerGap())
        );

        add(jPanel3, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertarActionPerformed
        // TODO add your handling code here:
        // registro = new Registro();
        if(isResgistro()){
            registro.setUrl(textFieldUrl.getText());
            registro.setNombre(textFieldNombre.getText());
            registro.setMailCelRecuperar(textFieldRecuperar.getText());
            registro.setMail(textFieldMail.getText());
            registro.setUser(textFieldUser.getText());
            registro.setPassword(textFieldPassword.getText());
            
            registro.setMailEnter(toggleButtonMail.isSelected());
            registro.setUserEnter(toggleButtonUser.isSelected());
            registro.setEnter(toggleButtonEnter.isSelected());
            registro.setPasswordEnter(toggleButtonPassword.isSelected());
            registro.setEnter2(toggleButtonEnter2.isSelected());
            if(registro.getId().equals("")){
                UUID uuid = UUID.randomUUID();
               
                registro.setId(uuid.toString());
                tableRegistro.addRegistro(registro);
                limpiar();
            }
            else{
                tableRegistro.update(registro);
                JOptionPane.showMessageDialog(this,"Datos se actualizaron correctamente");
                
            }  
                
            
            
        }
    }//GEN-LAST:event_buttonInsertarActionPerformed

    private void buttonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEjecutarActionPerformed
      EjecutarBoot.ingresar(registro);
    }//GEN-LAST:event_buttonEjecutarActionPerformed

    public boolean isResgistro(){
        if(textFieldUrl.getText().equals("")){
            textFieldUrl.requestFocus();
            return false;
        }
        else if(textFieldNombre.getText().equals("")){
            textFieldNombre.requestFocus();
            return false;
        }

        else if(textFieldMail.getText().equals("")){
            textFieldMail.requestFocus();
            return false;
        }

        if(textFieldPassword.getText().equals("")){
            textFieldPassword.requestFocus();
            return false;
        }
        return true;
    }
    private void toggleButtonMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonMailActionPerformed
        // TODO add your handling code here:
        if(toggleButtonUser.isSelected()){
            toggleButtonUser.setSelected(false);
        }
    }//GEN-LAST:event_toggleButtonMailActionPerformed

    private void toggleButtonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonUserActionPerformed
        // TODO add your handling code here:
        if(toggleButtonMail.isSelected()){
            toggleButtonMail.setSelected(false);
        }
    }//GEN-LAST:event_toggleButtonUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DatosDelRegistroInput ti = new DatosDelRegistroInput();
        try {
            ti.abrir();
            
            DatosDelRegistro dr = ti.leer();
            tableRegistro.addListRegistro(dr.getLista());
            ti.cerra();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PanelRegistro2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        limpiar();
        tableRegistro.limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void buttonFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFacebookActionPerformed
        // TODO add your handling code here:
        textFieldUrl.setText("www.facebook.com");
        textFieldNombre.setText("FACEBOOK");
        textFieldMail.setText("escuela.schumager@gmail.com");
        textFieldUser.setText("Faacebook");
        textFieldPassword.setText("Schum319461ageran");
        
        toggleButtonMail.setSelected(true);
        toggleButtonUser.setSelected(false);
        toggleButtonEnter.setSelected(false);
        toggleButtonPassword.setSelected(true);
        toggleButtonEnter2.setSelected(true);
    }//GEN-LAST:event_buttonFacebookActionPerformed

    private void buttonGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoogleActionPerformed
        // TODO add your handling code here:
        textFieldUrl.setText("www.gmail.com");
        textFieldNombre.setText("GMAIL");
        textFieldMail.setText("escuela.schumager@gmail.com");
        textFieldUser.setText("EscuelaSchumager");
        textFieldPassword.setText("chiqui11042016lina");
        
        toggleButtonMail.setSelected(true);
        toggleButtonUser.setSelected(false);
        toggleButtonEnter.setSelected(true);
        toggleButtonPassword.setSelected(true);
        toggleButtonEnter2.setSelected(true);
    }//GEN-LAST:event_buttonGoogleActionPerformed

    private void buttonTwiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwiterActionPerformed
        // TODO add your handling code here:
        textFieldUrl.setText("www.x.com");
        textFieldNombre.setText("TWITER");
        textFieldMail.setText("escuela.schumager@gmail.com");
        textFieldUser.setText("@EscuelaSchumager");
        textFieldPassword.setText("T319461ter");
        
        toggleButtonMail.setSelected(true);
        toggleButtonUser.setSelected(false);
        toggleButtonEnter.setSelected(true);
        toggleButtonPassword.setSelected(true);
        toggleButtonEnter2.setSelected(true);

    }//GEN-LAST:event_buttonTwiterActionPerformed

    private void buttonTuCuateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTuCuateActionPerformed
        // TODO add your handling code here:
        textFieldUrl.setText("www.tucuate.com");
        textFieldNombre.setText("TU CUATE");
        textFieldMail.setText("hos.fl700@gmail.com");
        textFieldUser.setText("71247983");
        textFieldPassword.setText("Tu6572175cuate");
       
        toggleButtonMail.setSelected(false);
        toggleButtonUser.setSelected(true);
        toggleButtonEnter.setSelected(false);
        toggleButtonPassword.setSelected(true);
        toggleButtonEnter2.setSelected(true);
    }//GEN-LAST:event_buttonTuCuateActionPerformed

    private void buttonBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBrowserActionPerformed
        /*try {
            // TODO add your handling code here:
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + textFieldUrl.getText());

        } catch (IOException ex) {
            Logger.getLogger(PanelRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        tableRegistro.mostrar();
        
    }//GEN-LAST:event_buttonBrowserActionPerformed

    private void toggleButtonBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonBrowserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toggleButtonBrowserActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DatosDelRegistroOutput tableOutput = new DatosDelRegistroOutput();
        DatosDelRegistro dr = new DatosDelRegistro();
        dr.setLista(tableRegistro.getList());
        
        try {
            tableOutput.abrir();
            tableOutput.guardar(dr);
            tableOutput.cerrar();
        } catch (IOException ex) {
            Logger.getLogger(PanelRegistro2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_buttonLimpiarActionPerformed
    
    public void loadComponets(Registro r){
        registro = r;
        textFieldUrl.setText(registro.getUrl());
        textFieldNombre.setText(registro.getNombre());
        textFieldRecuperar.setText(r.getMailCelRecuperar());
        textFieldMail.setText(registro.getMail());
        textFieldUser.setText(registro.getUser());
        textFieldPassword.setText(registro.getPassword());
        
        toggleButtonMail.setSelected(registro.isMailEnter());
        toggleButtonUser.setSelected(registro.isUserEnter());
        toggleButtonEnter.setSelected(registro.isEnter());
        toggleButtonPassword.setSelected(registro.isPasswordEnter());
        toggleButtonEnter2.setSelected(registro.isEnter2());
        
    }
    public void limpiar(){
        registro = new Registro();
        textFieldUrl.setText("");
        textFieldNombre.setText("");
        textFieldRecuperar.setText("");
        textFieldMail.setText("");
        textFieldUser.setText("");
        textFieldPassword.setText("");
        
        toggleButtonBrowser.setSelected(false);
        toggleButtonMail.setSelected(false);
        toggleButtonUser.setSelected(false);
        toggleButtonEnter.setSelected(false);
        toggleButtonTab.setSelected(false);
        toggleButtonPassword.setSelected(false);
        toggleButtonEnter2.setSelected(false);
        textFieldUrl.requestFocus();
        
    }

    public TextFieldLabel getTextFieldNombre() {
        return textFieldNombre;
    }

    public void setTextFieldNombre(TextFieldLabel textFieldNombre) {
        this.textFieldNombre = textFieldNombre;
    }
     Registro registro; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBrowser;
    private javax.swing.JButton buttonEjecutar;
    private javax.swing.JButton buttonFacebook;
    private javax.swing.JButton buttonGoogle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonInsertar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonTuCuate;
    private javax.swing.JButton buttonTwiter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private com.schumager.mypassword.view.PanelNumeros panelNumeros1;
    private com.schumager.mypassword.view.table.TableRegistro tableRegistro;
    private com.schumager.mypassword.view.components.TextFieldLabel textFieldMail;
    private com.schumager.mypassword.view.components.TextFieldLabel textFieldNombre;
    private com.schumager.mypassword.view.components.TextFieldLabel textFieldPassword;
    private com.schumager.mypassword.view.components.TextFieldLabel textFieldRecuperar;
    private com.schumager.mypassword.view.components.TextFieldLabel textFieldUrl;
    private com.schumager.mypassword.view.components.TextFieldLabel textFieldUser;
    private javax.swing.JToggleButton toggleButtonBrowser;
    private javax.swing.JToggleButton toggleButtonEnter;
    private javax.swing.JToggleButton toggleButtonEnter2;
    private javax.swing.JToggleButton toggleButtonMail;
    private javax.swing.JToggleButton toggleButtonPassword;
    private javax.swing.JToggleButton toggleButtonTab;
    private javax.swing.JToggleButton toggleButtonUser;
    // End of variables declaration//GEN-END:variables
}
