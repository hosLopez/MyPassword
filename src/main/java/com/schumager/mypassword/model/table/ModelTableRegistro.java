/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schumager.mypassword.model.table;

import com.schumager.mypassword.model.components.RegistroComponent;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Schumager
 */
public class ModelTableRegistro extends  AbstractTableModel implements TableModel{
    List<RegistroComponent> list;

    public ModelTableRegistro(List<RegistroComponent> list) {
        this.list = list;
    }

   @Override
    public int getRowCount() {
       return list.size();
    }

    @Override
    public int getColumnCount() {
        return 12;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RegistroComponent rc = list.get(rowIndex);
  
        switch(columnIndex){
            case 0:return rc.getButttonEdit();    
            case 1:return rc.getLabelNombre().getText();
            case 2:return rc.getLabelMail().getText();
            case 3:return rc.getLabelUser().getText();
            case 4:return rc.getPasswordField().getPassword();    
            case 5:return rc.getCheckBoxMail().isSelected();
            case 6:return rc.getCheckBoxUser().isSelected();
            case 7:return rc.getCheckBoxEnter().isSelected();
            case 8:return rc.getCheckBoxPassword().isSelected();    
            case 9:return rc.getCheckBoxEnterDos().isSelected();
            case 10:return rc.getButtonIngresar();
            case 11:return rc.getButtonEliminar();


        }
         return "";
    }
    public RegistroComponent getRegistro(int row){
        return list.get(row);
    }
    public void addDetalle(RegistroComponent rc){
        list.add(rc);
    } 
     @Override
    public String getColumnName(int col) {
        
        switch(col){
            case 0 -> {
                 return "EDITAR";
            }
            case 1 -> {
                return "NOMBRE";
            }
            case 2 -> {
                return "MAIL";
            }
            case 3 -> {
                return "USUARIO";
            }
            case 4 -> {
                return "CONTRASEÑA";
            }
            case 5 -> {
                return "mail";
            }
            case 6 -> {
                return "user";
            }
            case 7 -> {
                return "enter";
            }
            case 8 -> {
                return "contraseña";
            }
            case 9 -> {
                return "enter";
            }
            case 10 -> {
                return "INGRESAR";
            }
            case 11 -> {
                return "ELIMINAR";
            }

        }
        return ""; 
    }
     @Override
    public Class getColumnClass(int c) {
        return getValueAt(0,c).getClass();
    }
        @Override
    public boolean isCellEditable(int row, int col) {
        
        return col ==0||col==10||col==11||col==12;
    }
     @Override
    public void setValueAt(Object aValue, int row, int column) {
      if(list.size()<=row){
          System.err.println("Size de lista es Menor que Fila");
          return;
      }  
      RegistroComponent r = list.get(row);
                  
    }
    public void delete(RegistroComponent rc){
        list.remove(rc);
    }


}
