package com.mycompany.trabajador1;

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       Trabajador1 T = new Trabajador1();
       
       String Nombre;
       double Salario;
       double HT;
       double PH;
    
        System.out.println("Introdusca nombre del empleado: ");
        Nombre=leer.nextLine();
        System.out.println("Introdusca el salario:");
        Salario=leer.nextDouble();
        System.out.println("Introdusca horas trabajadas en el mes:");
        HT=leer.nextDouble();
        System.out.println("Introdusca el  pago por hora:  ");
        PH=leer.nextDouble();
        
      T.setNombre(Nombre);
      T.setSalario(Salario);
      T.setHT(HT);
      T.setPH(PH);
      
     System.out.println("Nombre del empleado: "+T.getNombre());
        System.out.println("Salario Bruto del empleado: $"+T.slBr(T));
        System.out.println("Salario Liquido: $"+T.S_LQ(T));
        System.out.println("Rentencion del salario: $"+T.Renta());
    }
}
    

