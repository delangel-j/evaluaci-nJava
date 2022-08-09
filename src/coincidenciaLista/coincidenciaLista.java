/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coincidenciaLista;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Jesús
 */
public class coincidenciaLista {
    
    List<Integer> listaA = Arrays.asList(1,2,4,6,8,0,3,44,52,43,129);
    List<Integer> listaB = Arrays.asList(23,4,6,2,34,7,99,52,5,8);
    
    public void coincidencias(){
        System.out.println(listaA
                .stream()
                .filter(p -> listaB.contains(p))
                .collect(Collectors.toList()));
    }    
}
