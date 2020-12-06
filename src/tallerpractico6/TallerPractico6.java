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
public class TallerPractico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables 
        int limite = 100;
        boolean multiplo = false;
        
        //Ciclo for 
        
        for (int i = 0; i<= limite; i++){
            if( i % 5 == 0){
                System.out.println(i);    
            }    
        }
        
        //Ciclo do - while
        int j = 0;
        
        do{
            if(j % 5 == 0){
                System.out.println(j);
            }
            j = j + 1;
            
        } while(j <=limite );
          
            
        
            
        
    }
    
}
