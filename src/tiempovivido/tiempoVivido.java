/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiempovivido;

import java.util.Scanner;

/**
 *
 * @author Jesús
 */
public class tiempoVivido {
    
    int edad;
    double calcularMeses;
    double calcularSemanas;
    double calcularDias;
    double calcularHoras;
    
    public void calcularTiempoVivido(String nombre){
        Scanner leerEdad = new Scanner(System.in);
        System.out.println("Ingresa tu edad; ");
        edad = leerEdad.nextInt();
        
        calcularMeses = edad * 12;
        calcularSemanas = calcularMeses * 4.34524;
        calcularDias = calcularSemanas * 7;
        calcularHoras = calcularDias * 24;
        
        StringBuilder strb = new StringBuilder(nombre);
        nombre = strb.reverse().toString();
        System.out.println("Hola " + nombre +" has vívido días: " + calcularDias + ", meses: " + calcularMeses + ", horas: " + calcularHoras);
      
    }
    
    
}
