/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import main.BlueprintData;

/**
 *
 * @author dhafa
 */
public class Data implements BlueprintData {
    private String email;
    private String uName;
    private String pass;
    private String namaL;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNamaL() {
        return namaL;
    }

    public void setNamaL(String namaL) {
        this.namaL = namaL;
    }
    
}
