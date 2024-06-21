package Desafio19;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaD35 = numeros.stream()
        .filter(numero -> numero % 3 == 0 && numero % 5 == 0)
        .mapToInt(Integer::intValue)
        .sum();

        System.out.println("A soma dos números da lista que são divisíveis por 3 ou 5 é: " + somaD35);
    }
}
