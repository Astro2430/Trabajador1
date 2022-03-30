package com.mycompany.trabajador1;

public class Trabajador1 {

  double Salario;
    double HT;
    double PH;
    double Renta;
    String Nombre ;
    double S_bruto;
    double S_liquido;
    
public Trabajador1(double Salario, double HT, double PH, double Renta, String Nombre, double S_bruto, double S_liquido) {
        this.Salario = Salario;
        this.HT = HT;
        this.PH = PH;
        this.Renta = Renta;
        this.Nombre = Nombre;
        this.S_bruto = S_bruto;
        this.S_liquido = S_liquido;
    }    
    
    
    public Trabajador1() {
        
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public double getHT() {
        return HT;
    }

    public void setHT(double HT) {
        this.HT= HT;
    }

    public double getPH() {
        return PH;
    }

    public void setPH(double PH) {
        this.PH = PH;
    }

    public double getRenta() {
        return Renta;
    }

    public void setRenta(double Renta) {
        this.Renta = Renta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getS_bruto() {
        return S_bruto;
    }

    public void setS_bruto(double S_bruto) {
        this.S_bruto = S_bruto;
    }

    public double getS_liquido() {
        return S_liquido;
    }

    public void setS_liquido(double S_liquido) {
        this.S_liquido = S_liquido;
    }

     public double HorasT(){
       double he2,he3;
       double s_l=0.0;
       
       if(this.HT<=40){
           s_l=this.HT*this.PH;
       }else if(this.HT>40 &&this.HT<=48){
           he2=HT-PH;
           s_l=(40*this.HT)+(he2*this.PH*2);
       }else if (this.HT>48){
           he3=this.HT-48;
           s_l=(40*this.PH)+(8*this.PH*2)+(he3*this.PH*3);
       }
       return s_l;
   }
   
 public double slBr(Trabajador1 dato){
        
        double salarioB;
        double slbruto;
        
         salarioB = dato.HorasT();
         
       slbruto=(this.Salario+salarioB);
         
         return slbruto;
         
    }

    public double Renta(){
        double renta;
        
       renta=(this.Salario*10/100);
       return renta;
        
    }
    
    public double S_LQ(Trabajador1 dato){
        double sr;
        double sb;
        double sala_Liquido;
        
        sala_Liquido=dato.Renta();
        sb=dato.slBr(dato);       
        sr=sb-sala_Liquido;
        return sr;
    }
}
   
 
