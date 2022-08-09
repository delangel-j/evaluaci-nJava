/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author Jesús
 */
public class matrices {
    
    int [][] matrizA = {
        {2, 0, 1},
        {3, 0, 0},
        {5, 1, 1}        
    };
    
    int[][] matrizB = {
        {1, 0, 1},
        {1, 2, 1}, 
        {1, 1, 0}
    };
    
    int[][] producto = new int[matrizB.length][matrizB[0].length];
    
    public void productoMatrices(){
        
        for(int i=0; i<matrizB[0].length;i++){
            for(int j=0; j<matrizA.length; j++){
                int suma = 0;
                for(int k=0; k<matrizA[0].length; k++){
                    suma += matrizA[j][k]* matrizB[k][i];
                }
                
                producto[j][i] = suma;
            }
        }
        
        System.out.println("Resultado:");
        for(int i=0; i<matrizB.length; i++){
            for(int j=0; j<matrizB[0].length; j++){
                System.out.printf("%d ", producto[i][j]);
            }
            
            System.out.println("");
        }
    }
    
}
