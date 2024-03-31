/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schumager.mypassword.model.table;

//import com.schumager.model.color.MiColor;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Hos
 */
public class RenderButtonTable implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       JComponent c = (JComponent) table.getValueAt(row,column);
      
       //Para intercalar colores de las filas de la tabal 
       /*if(row %2==0)
           c.setBackground(MiColor.plomoSuabe);
       else
           c.setBackground(MiColor.white);*/
      
    /* if(isSelected){
           c.setBackground(table.getSelectionBackground());
                   
       }
       else{
           c.setBackground(Color.white);
       }*/

        return c;
    }
    
}
   