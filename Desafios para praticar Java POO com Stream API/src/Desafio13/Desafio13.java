package Desafio13;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int limiteSuperior = 10;
        int limiteInferior = 5;

        numeros.stream()
        .filter(numero -> numero >= limiteInferior && numero <= limiteSuperior)
        .forEach(System.out::println);
    }
}
