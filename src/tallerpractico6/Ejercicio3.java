/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpractico6;
import java.util.Scanner;

/**
 *
 * @author ASUS GAMER
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        //Declaracion de variables
        int num = 0, suma = 0, media = 0, Nvalores = 0, j = 0;
        
        System.out.println("Ingrese distintos valores");
        
        while (suma < 10000){
            System.out.println(j);
            if(j == 0){
                System.out.println("Ingresaste un valor mayor a 0");    
            }
            else{
                if(j > 10000){
                    System.out.println("Ingresaste un valor menor a 10000");
                }
            }
        suma = j + suma;
        Nvalores = Nvalores + 1;
        }
        
        media = suma / Nvalores;
        
        
        System.out.println("Ingresaste " +Nvalores+ "Numeros");
        System.out.println("La media es: " +media);
        System.out.println("La suma de los valores ingresados es: "+suma);
        
        
    }
    
}
