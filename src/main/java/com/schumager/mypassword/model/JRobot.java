/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schumager.mypassword.model;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/**
 *
 * @author Schumager
 */
public class JRobot {
    
    byte charInicio = 33;
    byte charFin = 41;
    
    byte numberInicio =48;
    byte numberFin = 57;
    
    byte letrasMayusInicio = 65;
    byte letrasMayFin = 90;
    
    byte letrasMinInicio = 97;
    byte letrasMinFin = 122;
    
    public JRobot(){
        
    }
    public void keyPressed(char caracter){
        boolean mayuscula = false;
        if(Character.isLetter(caracter)){
            if(Character.isLowerCase(caracter)){
                //evt.setKeyChar((char)(((int)evt.getKeyChar()) - 32));
                caracter = ((char)(((int)caracter) - 32));
            }
            else
                mayuscula = true;
        }

        switch (caracter) {
            case '!':
            case '"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '(':
            case ')':
            caracter = ((char)(((int)caracter) + 16));
            mayuscula = true;break;
            
            case '/':
            caracter = '7' ;
            mayuscula = true; break;
            case '=':
            caracter = '8' ;
            mayuscula = true; break;
            case ':':
            caracter = '.' ;
            mayuscula = true; break;
            case ';':
            caracter = ',' ;
            mayuscula = true; break;
            case '_':
            caracter = '-' ;
            mayuscula = true; break;
           
            case '@':
            caracter = '@' ;
            mayuscula = true; break;
           // default:
             //   throw new AssertionError();
        }
        
        try {
            Robot robot = new Robot();
            if(caracter=='@'){
               robot.keyPress(KeyEvent.VK_ALT_GRAPH);
               robot.keyPress(KeyEvent.VK_Q);
               robot.keyRelease(KeyEvent.VK_Q);
               robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
               
              /* robot.keyPress(KeyEvent.VK_ALT);
               robot.keyPress(KeyEvent.VK_6);
               robot.keyRelease(KeyEvent.VK_6);
               robot.keyPress(KeyEvent.VK_4);
               robot.keyRelease(KeyEvent.VK_4);
               robot.keyRelease(KeyEvent.VK_ALT);*/
              
               return;
            }
            if(mayuscula)
                robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(caracter);
            robot.keyRelease(caracter);
            if(mayuscula)
                robot.keyRelease(KeyEvent.VK_SHIFT);
        }
        catch (AWTException | IllegalArgumentException ex) {
            System.err.println("Ocurrio un error");
        }
        
        
    }
    
}
