/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaMayús;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jesús
 */
public class ListaMayus {
    

    List<String> lista = Arrays.asList("juan", "pedro", "jose", "maria", "sofia");
    

   
    
    public void getNuevaLista(){
        lista.forEach((nva) -> {
            System.out.println(nva.toUpperCase().charAt(0) + nva.substring(1));
        });
        
    }
    
        
        
        
       
    
}
