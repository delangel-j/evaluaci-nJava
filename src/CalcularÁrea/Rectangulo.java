/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcularÁrea;

/**
 *
 * @author Jesus
 */
public class Rectangulo implements Forma{
    
    double base;
    double altura;
    double area;
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase(){
        return base;
    }
    
    public double getAltura(){
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getArea(){
        return area;
    }
    

    @Override
    public void area() {
        area = base*altura;
    }
    
    
    
    
    
}
