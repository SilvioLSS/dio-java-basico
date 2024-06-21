package Desafio4;

import java.util.List;
import java.util.Arrays;

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
        .filter( numerosImpares -> numerosImpares % 2 != 0)
        .forEach(System.out::println);
    }
}
