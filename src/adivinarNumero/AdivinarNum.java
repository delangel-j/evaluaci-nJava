/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarNumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class AdivinarNum {
    
    int intentos = 5;
    Random rand = new Random();
    int randomNum = rand.nextInt(100);
    int valor;
    

    public String AdivinarNum() {
        //System.out.println(randomNum);
         while(intentos>0 || valor == randomNum){   
             System.out.println("Ingresa un número: ");
            Scanner valorNum = new Scanner(System.in);

            valor = valorNum.nextInt();
             
            if(valor == randomNum){
                System.out.println("Adivinaste el valor");
                break;
            }else if(valor <= randomNum){
                intentos--;
                System.out.println("El valor ingresado es menor");
            }else if(valor >= randomNum){
                intentos--;
                System.out.println("El valor ingresado es mayor");
        }
        }
        return "Adivinaste el valor";
        
        
        
    }
    
    

    
    
    
    
      
    
}
