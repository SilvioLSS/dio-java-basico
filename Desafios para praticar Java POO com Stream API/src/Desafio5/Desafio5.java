package Desafio5;

import java.util.List;
import java.util.Arrays;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtra os números maiores que 5 e calcula a média
        double media = numeros.stream()
            .filter(numeroM5 -> numeroM5 > 5)
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0); 

        // Imprime a média
        System.out.println("A média dos números maiores que 5 é: " + media); 
    }
}
