package com.mycompany.trabajador1;

import java.util.Scanner;

public class Recursos_H {
    private Scanner Teclado;
    private String Nombre;
    private String Direccion;
    private String N_Edi;
    private int Cargo_desempeña;
    private int Edad;
    private double Salario;
    private double Salario_F;
    private double Renta;
    private double AFP;
    private double ISSS;
    

    
   public void inicializar() {
        Teclado=new Scanner(System.in);
        System.out.print("Introdusca el nombre:");
        Nombre=Teclado.next();
        System.out.print("Intodusca la edad:");
        Edad=Teclado.nextInt();
        System.out.print("Ingrese el salario bruto:");
        Salario=Teclado.nextDouble();
        System.out.print("Ingrese 1 si su cargo es por servicio y 2 si es permanente:");
        Cargo_desempeña =Teclado.nextInt();
          System.out.print("Ingrese su direccion:");
        Direccion=Teclado.next();
          System.out.print("Ingrese Numero de edificio ");
        N_Edi=Teclado.next();
       System.out.println("");
    }

    public void imprimir() {
        System.out.println("Nombre:"+Nombre+"\n");
        System.out.println("Edad:"+Edad+"\n");
         System.out.println("direccion:"+Direccion+"\n");
         System.out.println("numero de edificio :"+N_Edi );
         System.out.println("");
    }
    public void cargo() {
        if (Cargo_desempeña==1) {
            Renta= (Salario * 0.10);
             Salario_F= (Salario-Renta);
             System.out.println("");
            System.out.print("su cargo es por servicio y su salario final es :"+ Salario_F);
             System.out.println("");
            
        } else if(Cargo_desempeña==2){
             Renta= (Salario * 0.10);
             ISSS= (Salario* 0.14);
             AFP= (Salario * 0.10);
             Salario_F= (Salario-Renta-ISSS-AFP);
             System.out.println("");
            System.out.print(" su cargo es permanente y su salario final es :"+Salario_F);
                    System.out.println("");
        }
        }
    public static void main(String[] args) {
        Edificio objeto= new Edificio();
       Recursos_H Dpersona1;
        Dpersona1=new Recursos_H();
        Dpersona1.inicializar();
        Dpersona1.imprimir();
        Dpersona1.cargo();
        
         System.out.println("");
         
        objeto.getUbicacion();
        objeto.getNombre();
        objeto.getC_Depar();
        objeto.getC_Pisos();
        
        System.out.println("");
         
         AREA codigo= new AREA();
         codigo.getCentro_Com();
         codigo.getBiblioteca();
         codigo.getZV();
         codigo.getLaboratorios();
         codigo.getCancha_Baq();
    }
}
    

