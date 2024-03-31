/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.schumager.mypassword.view.table;

import com.schumager.mypassword.model.Registro;
import com.schumager.mypassword.model.components.RegistroComponent;
import com.schumager.mypassword.model.table.EditorTabla;
import com.schumager.mypassword.model.table.ModelTableRegistro;
import com.schumager.mypassword.model.table.RenderButtonTable;
import com.schumager.mypassword.view.PanelRegistro2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author Schumager
 */
public class TableRegistro extends javax.swing.JTable implements Serializable{

    /**
     * Creates new form TableRegistro
     */
    public TableRegistro() {
        //initComponents();
        settingTable();
    }
    
    public void settingTable(){
        lista  = new LinkedList<>();
        listSet = new HashSet<>();
        modelTableRegistro = new ModelTableRegistro(lista);
        this.setModel(modelTableRegistro); 
      
        this.setDefaultRenderer(JLabel.class,new RenderButtonTable());
        this.setDefaultEditor(JLabel.class,new EditorTabla());
        
        this.setDefaultRenderer(JButton.class,new RenderButtonTable());
        this.setDefaultEditor(JButton.class,new EditorTabla());
        
        this.setDefaultRenderer(JPasswordField.class,new RenderButtonTable());
        this.setDefaultEditor(JPasswordField.class,new EditorTabla());
        
        this.setDefaultRenderer(JCheckBox.class,new RenderButtonTable());
        this.setDefaultEditor(JCheckBox.class,new EditorTabla());

   
        this.setRowHeight(40);
       
                  
        this.getColumnModel().getColumn(0).setPreferredWidth(80);
        this.getColumnModel().getColumn(1).setPreferredWidth(150);
        this.getColumnModel().getColumn(2).setPreferredWidth(250);
        this.getColumnModel().getColumn(3).setPreferredWidth(150);
        this.getColumnModel().getColumn(4).setPreferredWidth(150);
        this.getColumnModel().getColumn(5).setPreferredWidth(50);
        this.getColumnModel().getColumn(6).setPreferredWidth(50);
        this.getColumnModel().getColumn(7).setPreferredWidth(50);
        this.getColumnModel().getColumn(8).setPreferredWidth(50);
        this.getColumnModel().getColumn(9).setPreferredWidth(50);
        this.getColumnModel().getColumn(10).setPreferredWidth(100);

        
    }
    public void addRegistro(Registro r){
        RegistroComponent rc = new RegistroComponent();
        rc.loadComponets(r);
        
        lista.add(rc);
        rc.buttonEliminarActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //lista.remove(rc);
                remover(rc);
            }

        });
        listSet.add(rc);
        this.setVisible(false);
        this.setVisible(true);
    }
    public void  remover(RegistroComponent rc){
        lista.remove(rc);
        this.setVisible(false);
        this.setVisible(true);
        
    }
    public void mostrar(){
        for(RegistroComponent rc:listSet){
            System.err.println(rc.getLabelNombre().getText()+"  "+rc.hashCode());
        }
        System.err.println("--------------------------o----------------");
    }

    public LinkedList<RegistroComponent> getLista() {
        return lista;
    }

    public void setLista(LinkedList<RegistroComponent> lista) {
        this.lista = lista;
    }

    public ModelTableRegistro getModelTableRegistro() {
        return modelTableRegistro;
    }

    public void setModelTableRegistro(ModelTableRegistro modelTableRegistro) {
        this.modelTableRegistro = modelTableRegistro;
    }
    public List<Registro> getList(){
        List<Registro> listRegistro = new ArrayList<>();
        for(RegistroComponent rc:lista){
            Registro r = rc.getRegistro();
            listRegistro.add(r);            
        }
        return listRegistro;
    }
    public void addListRegistro(List<Registro> listRegistro){
        lista.clear();
        for (Registro r : listRegistro) {
           /* RegistroComponent rc = new RegistroComponent();
            rc.loadComponets(r);
            rc.buttonEliminarActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remover(rc);
            }
            });
            lista.add(rc);*/
            addRegistro(r);
           
        }
    }
    public void update(Registro r){
        for(RegistroComponent rc: lista){
            Registro r1 = rc.getRegistro();
            if(r.getId().equals(r1.getId())){
                rc.loadComponets(r);
                this.setVisible(false);
                this.setVisible(true);
            }
        }
    }
    public void limpiar(){
        lista.clear();
        this.setVisible(false);
        this.setVisible(true);
    }
    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) { 
        System.out.println("Hola Eliminar");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    LinkedList<RegistroComponent> lista;
    HashSet<RegistroComponent> listSet;
    ModelTableRegistro modelTableRegistro;

}
