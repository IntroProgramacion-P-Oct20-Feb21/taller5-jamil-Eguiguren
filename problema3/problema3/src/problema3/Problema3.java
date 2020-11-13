/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author jamil
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    {
       // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
       
         // declaro las variables
      
        String marca;
        String origen;
        double precio;
        double descuento1 =(0.20);
        double descuento2 =(0.30);
        double descuento3 =(0.15);
        double descuento4 =(0.08);
        double multiplicacion;
        double resta1;
        double resta2;
        double resta3;
        double resta4;
        double veinteporciento;
        double treintaporciento;
        double quinceporciento;
        double ochoporciento;    
        
        
    // pido datos por teclado - entradas    
  
    System.out.println("Ingrese la marca del carro ");
    marca= entrada.nextLine();
    System.out.println("Ingrese el origen del carro");
    origen= entrada.nextLine();
    System.out.println("Ingrese el precio del carro");
    precio= entrada.nextDouble();
    
    // proceso
   resta1 = precio * descuento1;
   veinteporciento = precio - resta1;
   resta2 = precio * descuento2;
   treintaporciento = precio - resta2;
   resta3 = precio * descuento3;
   quinceporciento = precio - resta3;
   resta4 = precio * descuento4;
   ochoporciento = precio - resta4;
           
   //salida
   if (origen.equals("Alemania")) {
    System.out.printf("Marca del carro: %s\nValor del impuesto: %.3f\nValor de precio de venta: %.3f\n",
            marca,
            resta1,
            veinteporciento);
    }else{
       if (origen.equals("Japon")) {
          System.out.printf("Marca del carro: %s\nValor del impuesto: %.3f\nValor de precio de venta: %.3f\n",
            marca,
            resta2,
            treintaporciento);
       }else{
          if (origen.equals("Italia")) {
           System.out.printf("Marca del carro: %s\nValor del impuesto: %.3f\nValor de precio de venta: %.3f\n",
             marca,
             resta3,
             quinceporciento);
         }else{
              if (origen.equals("USA")) {
              System.out.printf("Marca del carro: %s\nValor del impuesto: %.3f\nValor de precio de venta: %.3f\n",
                marca,
                resta4,
                ochoporciento);
      }
     }
    }
   }
  }    
 }
}
