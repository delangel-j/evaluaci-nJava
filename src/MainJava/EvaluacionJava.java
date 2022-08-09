/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainJava;

import adivinarNumero.AdivinarNum;
import CalcularÁrea.Rectangulo;
import ListaMayús.ListaMayus;
import bucleTriangulo.bucleTriangulo;
import coincidenciaLista.coincidenciaLista;
import condicionales.Condicionales;
import listaPaises.listaPaises;
import operacionesListas.operacionLista;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import matrices.matrices;
import tiempovivido.tiempoVivido;

/**
 *
 * @author Jesus
 */
public class EvaluacionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opc=0;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Selecciona una opción");
        opc = escaner.nextInt();
                
                switch(opc){
                    case 1:{
                         //1 Área rectángulo
                         Rectangulo rectangulo = new Rectangulo(10, 10);
                         rectangulo.area();
                         System.out.println("El área del rectangulo es: " + rectangulo.getArea());
                        break; 
                    }
                    case 2: {
                        //2 Lista
                        ListaMayus listMayus = new ListaMayus();
                        listMayus.getNuevaLista();
                        break;
                    }
                    case 3: {
                        //3 Bucle triángulo  
                        bucleTriangulo bucleTri = new bucleTriangulo();
                        bucleTri.getTriangulo();
                        break;
                    }
                    case 4: {
                        //4 Calcular tiempo vídido
                        tiempoVivido tiempViv = new tiempoVivido();
                        tiempViv.calcularTiempoVivido("Jesús");
                        break;
                    }
                    case 5: {
                        //5 Operaciones con listas
                        operacionLista opLista = new operacionLista();
                        opLista.filtrarLista();
                        break;
                    }
                    case 6: {
                        //6 Operaciones con listas (países)
                        listaPaises listaPaises = new listaPaises();
                        listaPaises.filtrarPaises();
                        break;
                    }
                    case 7: {
                        //7 Adivinar número
                        AdivinarNum adiv = new AdivinarNum();
                        adiv.AdivinarNum();
                        break;
                    }
                    case 8: {
                        //8 condicionales
                        Condicionales cond = new Condicionales();
                        cond.ordenamiento();
                        break;
                    }
                    case 9: {
                        //9 Coincidencia listas
                        coincidenciaLista coincList = new coincidenciaLista();
                        coincList.coincidencias();
                        break;
                    }
                    case 10: {
                        //10 Multiplicación de matrices
                        matrices mat = new matrices();
                        mat.productoMatrices();
                        break;
                    }
                    default: {
                            System.out.println("Opción incorrecta");
                            }
                    
                }
             
    }
    
}
