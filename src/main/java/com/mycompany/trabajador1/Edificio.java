package com.mycompany.trabajador1;

public class Edificio {
    String ubicacion;
    String Nombre;
    String C_Depar;
    String C_Pisos;
    public Edificio(String ubicacion, String  Nombre,String C_Depar, String C_Pisos) {
        this.ubicacion = ubicacion;
        this.Nombre = Nombre;
          this.C_Depar = C_Depar;
        this.C_Pisos = C_Pisos;
    }

    Edificio(){
      
    }

    public String getUbicacion() {
        System.out.println("Km 64 1/2 , desvio Hacienda el Nilo sobre autopista a Zacatecoluca y Usulutan ");        
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        
        this.ubicacion = ubicacion;
    }

    public String getNombre(){ 
        System.out.println("ITCA-FEPADE Edificio C");
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

     
    public String getC_Depar() {
        System.out.println("Cuatro Departamentos ");
        return C_Depar;
    }

    public void setC_Depar(String C_Depar) {
        this.C_Depar = C_Depar;
    }

    public String getC_Pisos() {
        System.out.println("Dos pisos en el B y tres pisos en el C");
        return C_Pisos;
    }

    public void setCantidadpisos(String C_Pisos) {
        this.C_Pisos = C_Pisos;
    }

}
