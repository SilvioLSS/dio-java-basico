package Desafio10;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
        .filter(numero -> numero % 5 == 0 && numero % 2 != 0|| numero % 3 == 0 && numero % 2 != 0 )
        .forEach(System.out::println);
    }
}
