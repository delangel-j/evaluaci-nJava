/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucleTriangulo;

import java.util.Scanner;

/**
 *
 * @author Jesús
 */
public class bucleTriangulo {
    
    int valor;
    Scanner lectura = new Scanner(System.in);
    
    public void getTriangulo(){
        System.out.println("Ingresa el valor del bucle: ");
        valor = lectura.nextInt();
        System.out.println("");
        int count =1;
        for(int i=0; i<=valor;i++){
            for(int j=1;j<=i; j++){
                System.out.print(count + " ");
                count++;  
            }
             System.out.println("");
        }
    
    
    }
}
