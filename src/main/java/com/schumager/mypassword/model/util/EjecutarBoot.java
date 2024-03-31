/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schumager.mypassword.model.util;

import com.schumager.mypassword.model.JRobot;
import com.schumager.mypassword.model.Registro;
import com.schumager.mypassword.view.PanelRegistro1;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Schumager
 */
public class EjecutarBoot {
    public static void ingresar(Registro r){
                // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "<html><h2>Esta seguro de Ejecutar?")==JOptionPane.OK_OPTION){
                    
            Robot robot;
                try {
                    boolean capsActivo = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
                    robot = new Robot();
                    if(capsActivo){
                        robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                        robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                    }

                    //Alt Tab cambio de pantalla a Pagina de CUPAD
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_ALT);

                    robot.delay(500);

                    ///Escribre Ci
                    //byte user [] = registro.getUser().getBytes();
                    JRobot jRobot = new JRobot();
                    if(r.isMailEnter()){
                        byte mail [] = r.getMail().getBytes();

                        for (int i = 0 ; i < mail.length ; i++) {

                        jRobot.keyPressed((char)mail[i]);

                        robot.delay(100);


                       }
                    }
                    if(r.isUserEnter()){
                        byte user [] = r.getUser().getBytes();

                        for (int i = 0 ; i < user.length ; i++) {

                            jRobot.keyPressed((char)user[i]);

                            robot.delay(100);

                        }
                    }
                    if(r.isEnter()){
                       robot.keyPress(KeyEvent.VK_ENTER);
                       robot.keyRelease(KeyEvent.VK_ENTER); 
                       robot.delay(3000);
                    }
                    else{
                        if(r.isMailEnter()||r.isUserEnter()){
                            if(r.isPasswordEnter()){
                                robot.keyPress(KeyEvent.VK_TAB);
                                robot.keyRelease(KeyEvent.VK_TAB);
                                robot.delay(100);
                            }
                        }

                    }
                    if(r.isPasswordEnter()){

                        byte password [] = r.getPassword().getBytes();
                        for (int i = 0 ; i < password.length ; i++) {

                            jRobot.keyPressed((char)password[i]);
                            robot.delay(100);
                        }
                    }
                    if(r.isEnter2()){
                        robot.keyPress(KeyEvent.VK_ENTER);
                        robot.keyRelease(KeyEvent.VK_ENTER);
                    }
                   } 
                  catch (AWTException  ex) {
                   Logger.getLogger(PanelRegistro1.class.getName()).log(Level.SEVERE, null, ex);
                }


        }
    }    
}
