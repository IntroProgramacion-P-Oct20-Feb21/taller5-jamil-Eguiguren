/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author jamil
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    {
       // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
       
         // declaro las variables
      
        double valor;
        double cantidad;
        double multiplicacion;
        double descuento =(0.15);
        double resta;
        double quince;
            
        
        
    // pido datos por teclado - entradas    
  
    System.out.println("Ingrese el valor del producto ");
    valor= entrada.nextDouble();
    System.out.println("Ingrese la cantidad deseada");
    cantidad= entrada.nextDouble();
    
    // proceso
    multiplicacion =  cantidad * valor;
    resta = multiplicacion * descuento;
    quince = multiplicacion - resta;
           
   //salida
   if (cantidad >50) {
   System.out.println("el valor a cancelar del articulo con el 15%% es:" +quince);
   }else{
       System.out.println("el valor a cancelar del articulo es:" +multiplicacion);
      }
    }
  }
    
}
    

