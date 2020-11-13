/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author jamil
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    {
       // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
       
         // declaro las variables
        int edad;
        double kilovatiohora;
        double mes;
        double multiplicacion;
        double descuento =(0.10);
        double resta;
        double diezporciento;
            
        
        
    // pido datos por teclado - entradas    
     System.out.println("Ingrese su edad ");
    edad = entrada.nextInt();
    System.out.println("Ingrese la costo por kilovatio/hora ");
    kilovatiohora= entrada.nextDouble();
    System.out.println("Ingrese el numero de cunsumo de kilovatio al mes ");
    mes= entrada.nextDouble();
    
    // proceso
    multiplicacion =  kilovatiohora * mes;
    resta = multiplicacion * descuento;
    diezporciento = multiplicacion - resta;
           
   //salida
   if (edad >65) {
   System.out.println("el valor a cancelar de la planilla de luz con el 10%% es:" +diezporciento);
   }else{
       System.out.println("el valor a cancelar de la planilla de luz es:" +multiplicacion);
      }
    }
  }
    
}
