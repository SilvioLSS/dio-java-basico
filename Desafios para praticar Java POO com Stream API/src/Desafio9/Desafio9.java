package Desafio9;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Set<Integer> numerosUnicos = numeros.stream()
        .collect(Collectors.toSet());

        boolean todosDistintos = numeros.size() == numerosUnicos.size();

        if(todosDistintos){
            System.out.println("Todos os números da lista são distintos!");
        }else{
            System.out.println("A lista contém números repetidos!");
        }
    }
}
