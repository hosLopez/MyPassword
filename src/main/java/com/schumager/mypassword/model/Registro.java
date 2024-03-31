/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schumager.mypassword.model;

import java.io.Serializable;
/**
 *
 * @author Schumager
 */
public class Registro implements Serializable{
    
    private String id;
    private String url;
    private String nombre;
    private String mailCelRecuperar;
    private String mail;
    private String user;
    private String password;
   
    private  boolean browser;
    private boolean mailEnter;
    private boolean userEnter;
    private boolean passwordEnter;
    private boolean tab;
    private boolean enter;
    private boolean enter2; 

    public Registro() {
        id="";
        url = "";
        nombre = "";
        mailCelRecuperar = "";
        mail = "";
        user = "";
        password = "";
        
        browser = false;
        mailEnter = false;
        userEnter = false;
        tab = false;
        passwordEnter  = false;
        enter2 = false;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isMailEnter() {
        return mailEnter;
    }

    public void setMailEnter(boolean mailEnter) {
        this.mailEnter = mailEnter;
    }

    public boolean isUserEnter() {
        return userEnter;
    }

    public void setUserEnter(boolean userEnter) {
        this.userEnter = userEnter;
    }

    public boolean isPasswordEnter() {
        return passwordEnter;
    }

    public void setPasswordEnter(boolean passwordEnter) {
        this.passwordEnter = passwordEnter;
    }

    public boolean isEnter() {
        return enter;
    }

    public void setEnter(boolean enter) {
        this.enter = enter;
    }
        
    public boolean isEnter2() {
        return enter2;
    }

    public void setEnter2(boolean enter) {
        this.enter2 = enter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMailCelRecuperar() {
        return mailCelRecuperar;
    }

    public void setMailCelRecuperar(String mailCelRecuperar) {
        this.mailCelRecuperar = mailCelRecuperar;
    }

    public boolean isBrowser() {
        return browser;
    }

    public void setBrowser(boolean browser) {
        this.browser = browser;
    }

    public boolean isTab() {
        return tab;
    }

    public void setTab(boolean tab) {
        this.tab = tab;
    }
    
    
}
