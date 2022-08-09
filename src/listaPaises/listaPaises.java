/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaPaises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Jesús
 */
public class listaPaises {
    
    List<String> paises = Arrays.asList("Rusia", "Estados Unidos", "Brasil", "Canada", "México");
    
    public void filtrarPaises(){
        List<String> nuevaLista = paises.stream()
                .map(p -> p.toUpperCase())
                .filter(p -> p.matches(".*[aeiouAEIOY]"))
                .collect(Collectors.toList());
        System.out.println(nuevaLista);
        
    }
    
}
