package com.mycompany.trabajador1;

public class AREA {
    String Centro_Com;
    String Biblioteca;
    String ZV;
    String Laboratorios;
    String Cancha_Baq;
public AREA(String Centro_Com, String Biblioteca, String ZV, String Laboratorios, String Cancha_Baq) {
        this.Centro_Com = Centro_Com;
        this.Biblioteca = Biblioteca;
        this.ZV= ZV;
        this.Laboratorios = Laboratorios;
        this.Cancha_Baq = Cancha_Baq;
    }

    public AREA() {
    }

    public String getCentro_Com() {
        System.out.println("el codigo de los computos es us01");
        return Centro_Com;
    }

    public void setCentro_Com(String Centro_Com) {
        this.Centro_Com = Centro_Com;
    }

    public String getBiblioteca() {
        System.out.println("el codigo de la biblioteca es 567");
        return Biblioteca;
    }

    public void setBiblioteca(String Biblioteca) {
        this.Biblioteca = Biblioteca;
    }

    public String getZV() {
        System.out.println("el codigo de la Zona Verde es v345");
        return ZV;
    }

    public void setZV(String ZV) {
        this.ZV = ZV;
    }

    public String getLaboratorios(){
        System.out.println("el codigo de Laboratorio es L098");
        return Laboratorios;
    }

    public void setLaboratorios(String Laboratorios) {
        this.Laboratorios = Laboratorios;
    }

    public String getCancha_Baq() {
        System.out.println("el codigo de la Cancha de Basquet es C865");
        return Cancha_Baq;
    }

    public void setCancha_Baq(String Cancha_Baq) {
        this.Cancha_Baq = Cancha_Baq;
    }

    
    
}
