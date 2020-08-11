/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_emisora;

import java.util.Scanner;

/**
 *
 * @author PC-Admin
 */
public class Proyecto_Emisora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sintonizador sin = new Sintonizador();
        System.out.println("Ingrese Frecuencia inicial");
        Scanner in = new Scanner(System.in);
        double frecuencia = in.nextDouble();
        sin.setFrecuencia(frecuencia);
        sin.Up();
        sin.Up();
        sin.Up();
        sin.Display();
        sin.Down();
        sin.Down();
        sin.Display();
        
    }
    
}
