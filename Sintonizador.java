/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_emisora;

/**
 *
 * @author PC-Admin
 */
public class Sintonizador {
    private double frecuencia;
    Sintonizador(){}
    Sintonizador(double frecuencia){
        if(frecuencia<80){
            frecuencia=80;
            this.setFrecuencia(frecuencia);
        }else if(frecuencia>108){
            frecuencia=108;
            this.setFrecuencia(frecuencia);
        }else{
            this.setFrecuencia(frecuencia);
        }
         
    }
    
    public double Up(){
        frecuencia = frecuencia + 0.5;
        ComprobarRango();
        this.setFrecuencia(frecuencia);
        return this.getFrecuencia();
    }
    
    public double Down(){
        frecuencia=frecuencia-0.5;
        ComprobarRango();
        this.setFrecuencia(frecuencia);
        return this.getFrecuencia();
    }
    
    public void Display(){
        System.out.println("Sintonizado:" +this.getFrecuencia()+ " MHz");
    }
    
    private void ComprobarRango(){
        if(frecuencia <80){
            frecuencia = 108;
            this.setFrecuencia(frecuencia);
        }else if(frecuencia>108){
            frecuencia = 80;
            this.setFrecuencia(frecuencia);
        }
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

}
