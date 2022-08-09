/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionesListas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Jesús
 */
public class operacionLista {
    
    List<Integer> lista = Arrays.asList(1,8,5,2,33,54,22,6,88,13);
    
    public void filtrarLista(){
        System.out.println(lista.stream().filter( x -> x%2==0).collect(Collectors.toList()));
        
        
    }
    
}
