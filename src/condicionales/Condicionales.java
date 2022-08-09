/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

public class Condicionales {
    
    int a;
    int b;
    int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void ordenamiento() {
        
        int a = 0,b = 0,c = 0;
        Scanner opA = new Scanner(System.in);
        Scanner opB = new Scanner(System.in);
        Scanner opC = new Scanner(System.in);
        
        System.out.println("Ingresa el primer valor: ");
        a = opA.nextInt();
        System.out.println("Ingresa el segundo valor: ");
        b = opB.nextInt();
        System.out.println("Ingresa el tercer valor: ");
        c = opC.nextInt();
        
        if(a>=b && b>=c){
            System.out.println(a +" " + b + " " + c);
        }else if(a>=c && c>=b){
            System.out.println(a + " " + c + " " + b);
        }else if(b>=a && a>=c){
            System.out.println(b + " " + a + " " + c);
        }else if(b>=c && c>=a){
            System.out.println(b + " " + c + " " + a);
        }else if(c>=a && a>=b){
            System.out.println(c + " " + a + " " + b);
        }else {
            System.out.println(c + " " + b + " " + a);
        }
    }
    
    
    
    
    
}
