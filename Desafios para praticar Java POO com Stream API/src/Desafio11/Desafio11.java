package Desafio11;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosQuadrados = numeros.stream()
        .mapToInt(numero -> numero * numero)
        .sum();

        System.out.println("A de todos os números da lista ao quadrado é: " + somaDosQuadrados);
    }   
}
